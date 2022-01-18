
package Controlador;

import Modelo.Cliente;
import Modelo.ArregloClientes;
import Modelo.Cuenta;
import Modelo.Vehiculo;
import Modelo.Configuracion;
import Vista.frmVehiculos;
import Vista.AppPeaje;
import Vista.frmRegistroVehiculo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorVehiculos {
    private Cliente user;
    private frmVehiculos vista;
    private String OrdenadoPor = new String(); //Esta variable sirve para cómo están ordenados los vehículos
    
    public ControladorVehiculos(Cliente user) {
        this.user = user;
        this.vista = new frmVehiculos();
        
        this.vista.btnOrdenarPlaca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getCuenta().ordenarVehiculosXPlaca();
                OrdenadoPor = "Placa";
                llenarTablaOrdenada();
            }
        });
        
        this.vista.btnOrdenarAño.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getCuenta().ordenarVehiculosXAño();
                OrdenadoPor = "Año";
                llenarTablaOrdenada();
            }
        });
        
        this.vista.btnOrdenarEjes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getCuenta().ordenarVehiculosXEjes();
                OrdenadoPor = "Ejes";
                llenarTablaOrdenada();
            }
        });
        
        this.vista.btnOrdenarPeso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getCuenta().ordenarVehiculosXPesoBruto();
                OrdenadoPor = "Peso";
                llenarTablaOrdenada();
            }
        });
        
        this.vista.btnAñadirVehiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorRegistroVehiculo ctrlRegistroVehiculo = new ControladorRegistroVehiculo(user,new frmRegistroVehiculo());
                ctrlRegistroVehiculo.iniciarVehiculo();
                vista.dispose();
            }
        });
        
        this.vista.btnEliminarVehiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = vista.jTable1.getSelectedRow(); //Guardo el orden de la fila seleccionada
                
                if(filaSeleccionada>=0){
                    if(OrdenadoPor.equals("Ingreso")){
                        user.getCuenta().eliminarVehiculo(filaSeleccionada);
                        JOptionPane.showMessageDialog(null, "Vehículo eliminado.");
                    }
                    else{
                        int orden; //En esta variable se guardará el orden en el arreglo del vehículo a eliminar
                        orden = user.getCuenta().buscarOrdenVehiculo(
                        user.getCuenta().getVehiculosOrdenados(filaSeleccionada).getPlaca());
                        if(orden>=0){
                            user.getCuenta().eliminarVehiculo(orden);
                            JOptionPane.showMessageDialog(null, "Vehículo eliminado.");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "No se pudo eliminar el vehículo.");
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un vehículo.");
                }
                llenarTablaNormal();
            }
        });
        
        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(user);
                ctrlOpcionesIngreso.iniciar();
                vista.dispose();
            }
        });
    }
    
    public void llenarTablaNormal(){
        DefaultTableModel TablaUser = new DefaultTableModel();
        String informacion[] = new String[8];
        TablaUser.addColumn("Placa");
        TablaUser.addColumn("Marca");
        TablaUser.addColumn("Modelo");
        TablaUser.addColumn("Categoría");
        TablaUser.addColumn("Ejes");
        TablaUser.addColumn("Uso");
        TablaUser.addColumn("Peso");
        TablaUser.addColumn("Año");
        this.vista.jTable1.setModel(TablaUser);
        
        for(int i=0;i<user.getCuenta().getNv();i++){
            informacion[0] = user.getCuenta().getVehiculos(i).getPlaca();
            informacion[1] = user.getCuenta().getVehiculos(i).getMarca();
            informacion[2] = user.getCuenta().getVehiculos(i).getModelo();
            informacion[3] = user.getCuenta().getVehiculos(i).getCategoria();
            informacion[4] = String.valueOf(user.getCuenta().getVehiculos(i).getEjes());
            informacion[5] = user.getCuenta().getVehiculos(i).getTipoUso();
            informacion[6] = String.valueOf(user.getCuenta().getVehiculos(i).getPesoBruto());
            informacion[7] = String.valueOf(user.getCuenta().getVehiculos(i).getAño());   
            TablaUser.addRow(informacion);
        }
        OrdenadoPor = "Ingreso";
    }
    
    public void llenarTablaOrdenada(){
        DefaultTableModel Tablauser = new DefaultTableModel();
        String informacion[] = new String[8];
        Tablauser.addColumn("Placa");
        Tablauser.addColumn("Marca");
        Tablauser.addColumn("Modelo");
        Tablauser.addColumn("Categoría");
        Tablauser.addColumn("Ejes");
        Tablauser.addColumn("Uso");
        Tablauser.addColumn("Peso");
        Tablauser.addColumn("Año");
        this.vista.jTable1.setModel(Tablauser);
        
        for(int i=0;i<user.getCuenta().getNv();i++){
            informacion[0] = user.getCuenta().getVehiculosOrdenados(i).getPlaca();
            informacion[1] = user.getCuenta().getVehiculosOrdenados(i).getMarca();
            informacion[2] = user.getCuenta().getVehiculosOrdenados(i).getModelo();
            informacion[3] = user.getCuenta().getVehiculosOrdenados(i).getCategoria();
            informacion[4] = String.valueOf(user.getCuenta().getVehiculosOrdenados(i).getEjes());
            informacion[5] = user.getCuenta().getVehiculosOrdenados(i).getTipoUso();
            informacion[6] = String.valueOf(user.getCuenta().getVehiculosOrdenados(i).getPesoBruto());
            informacion[7] = String.valueOf(user.getCuenta().getVehiculosOrdenados(i).getAño());   
            Tablauser.addRow(informacion);
        }
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        llenarTablaNormal();
    }
}
