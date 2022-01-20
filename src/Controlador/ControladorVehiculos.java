
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
    
    public ControladorVehiculos(Cliente user) {
        this.user = user;
        this.vista = new frmVehiculos();
        
        this.vista.btnOrdenarPlaca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getCuenta().ordenarVehiculosXPlaca();
                llenarTabla();
            }
        });
        
        this.vista.btnOrdenarAño.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getCuenta().ordenarVehiculosXAño();
                llenarTabla();
            }
        });
        
        this.vista.btnOrdenarEjes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getCuenta().ordenarVehiculosXEjes();
                llenarTabla();
            }
        });
        
        this.vista.btnOrdenarPeso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getCuenta().ordenarVehiculosXPesoBruto();
                llenarTabla();
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
                String placa = vista.jTable1.getValueAt(filaSeleccionada,0).toString();
                
                if(filaSeleccionada>=0){
                    user.getCuenta().eliminarVehiculo(placa);
                    JOptionPane.showMessageDialog(null, "Vehículo eliminado.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un vehículo.");
                }
                llenarTabla();
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
    
    public void llenarTabla(){
        DefaultTableModel TablaUser = new DefaultTableModel();
        String informacion[] = new String[8];
        for(Object o : Modelo.Configuracion.datosVehiculos){
            TablaUser.addColumn(o);
        }
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
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        llenarTabla();
    }
}
