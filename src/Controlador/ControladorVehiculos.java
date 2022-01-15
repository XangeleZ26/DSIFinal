
package Controlador;

import Modelo.Cliente;
import Modelo.ArregloClientes;
import Modelo.Cuenta;
import Modelo.Vehiculo;
import Modelo.Configuracion;
import Vista.frmVehiculos;
import Vista.AppPeaje;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorVehiculos {
    //private Cliente usuario1;
    private frmVehiculos vista;
    private int indiceCliente;
    private String OrdenadoPor = new String(); //Esta variable sirve para cómo están ordenados los vehículos
    
    public ControladorVehiculos(int indiceCliente) {
        //this.usuario1 = usuario;
        this.indiceCliente = indiceCliente;
        this.vista = new frmVehiculos();
        
        this.vista.btnOrdenarPlaca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().ordenarVehiculosXPlaca();
                OrdenadoPor = "Placa";
                llenarTablaOrdenada();
            }
        });
        
        this.vista.btnOrdenarAño.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().ordenarVehiculosXAño();
                OrdenadoPor = "Año";
                llenarTablaOrdenada();
            }
        });
        
        this.vista.btnOrdenarEjes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().ordenarVehiculosXEjes();
                OrdenadoPor = "Ejes";
                llenarTablaOrdenada();
            }
        });
        
        this.vista.btnOrdenarPeso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().ordenarVehiculosXPesoBruto();
                OrdenadoPor = "Peso";
                llenarTablaOrdenada();
            }
        });
        
        this.vista.btnAñadirVehiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorRegistroVehiculo ctrlRegistroVehiculo = new ControladorRegistroVehiculo(indiceCliente);
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
                        Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().eliminarVehiculo(filaSeleccionada);
                        JOptionPane.showMessageDialog(null, "Vehículo eliminado.");
                    }
                    else{
                        int orden; //En esta variable se guardará el orden en el arreglo del vehículo a eliminar
                        orden = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().buscarOrdenVehiculo(
                        Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getVehiculosOrdenados(filaSeleccionada).getPlaca());
                        if(orden>=0){
                            Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().eliminarVehiculo(orden);
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
                ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(indiceCliente);
                ctrlOpcionesIngreso.iniciar();
                vista.dispose();
            }
        });
    }
    
    public void llenarTablaNormal(){
        DefaultTableModel user = new DefaultTableModel();
        String informacion[] = new String[8];
        user.addColumn("Placa");
        user.addColumn("Marca");
        user.addColumn("Modelo");
        user.addColumn("Categoría");
        user.addColumn("Ejes");
        user.addColumn("Uso");
        user.addColumn("Peso");
        user.addColumn("Año");
        this.vista.jTable1.setModel(user);
        
        for(int i=0;i<Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getNv();i++){
            informacion[0] = Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getVehiculos(i).getPlaca();
            informacion[1] = Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getVehiculos(i).getMarca();
            informacion[2] = Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getVehiculos(i).getModelo();
            informacion[3] = Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getVehiculos(i).getCategoria();
            informacion[4] = String.valueOf(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getVehiculos(i).getEjes());
            informacion[5] = Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getVehiculos(i).getTipoUso();
            informacion[6] = String.valueOf(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getVehiculos(i).getPesoBruto());
            informacion[7] = String.valueOf(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getVehiculos(i).getAño());   
            user.addRow(informacion);
        }
        OrdenadoPor = "Ingreso";
    }
    
    public void llenarTablaOrdenada(){
        DefaultTableModel user = new DefaultTableModel();
        String informacion[] = new String[8];
        user.addColumn("Placa");
        user.addColumn("Marca");
        user.addColumn("Modelo");
        user.addColumn("Categoría");
        user.addColumn("Ejes");
        user.addColumn("Uso");
        user.addColumn("Peso");
        user.addColumn("Año");
        this.vista.jTable1.setModel(user);
        
        for(int i=0;i<Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getNv();i++){
            informacion[0] = Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getVehiculosOrdenados(i).getPlaca();
            informacion[1] = Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getVehiculosOrdenados(i).getMarca();
            informacion[2] = Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getVehiculosOrdenados(i).getModelo();
            informacion[3] = Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getVehiculosOrdenados(i).getCategoria();
            informacion[4] = String.valueOf(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getVehiculosOrdenados(i).getEjes());
            informacion[5] = Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getVehiculosOrdenados(i).getTipoUso();
            informacion[6] = String.valueOf(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getVehiculosOrdenados(i).getPesoBruto());
            informacion[7] = String.valueOf(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getVehiculosOrdenados(i).getAño());   
            user.addRow(informacion);
        }
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        llenarTablaNormal();
    }
}
