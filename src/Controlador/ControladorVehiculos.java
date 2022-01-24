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

        this.vista.btnAZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                llenarTabla();
            }
        });
        
        this.vista.btnZA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                llenarTablaZA();
            }
        });
        
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
                ControladorRegistroVehiculo ctrlRegistroVehiculo = new ControladorRegistroVehiculo(user, new frmRegistroVehiculo());
                ctrlRegistroVehiculo.iniciarVehiculo();
                vista.dispose();
            }
        });

        this.vista.btnEliminarVehiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = -1;
                filaSeleccionada = vista.tblTabla.getSelectedRow();//Guardo el orden de la fila seleccionada

                if (filaSeleccionada >= 0) {
                    String placa = vista.tblTabla.getValueAt(filaSeleccionada, 0).toString();
                    user.getCuenta().eliminarVehiculo(placa);
                    try {
                        Configuracion.serial.serializar("archivoUser.txt", Configuracion.arrClientes);
                        JOptionPane.showMessageDialog(null, "Vehículo eliminado.");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Fallo en el guardado de archivo");
                    }

                } else {
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

    public void llenarTabla() { //De menor a mayor
        DefaultTableModel TablaUser = new DefaultTableModel();
        String informacion[] = new String[8];
        for (Object o : Modelo.Configuracion.datosVehiculos) {
            TablaUser.addColumn(o);
        }
        this.vista.tblTabla.setModel(TablaUser);

        for (int i = 0; i < user.getCuenta().getNv(); i++) {
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
    
    public void llenarTablaZA() { //De mayor a menor
        DefaultTableModel TablaUser = new DefaultTableModel();
        String informacion[] = new String[8];
        for (Object o : Modelo.Configuracion.datosVehiculos) {
            TablaUser.addColumn(o);
        }
        this.vista.tblTabla.setModel(TablaUser);

        for (int i = user.getCuenta().getNv()-1; i >=0; i--) {
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
