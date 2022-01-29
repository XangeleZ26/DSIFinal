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
                llenarTablaAZ();
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
                llenarTablaAZ();
            }
        });

        this.vista.btnOrdenarAño.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getCuenta().ordenarVehiculosXAño();
                llenarTablaAZ();
            }
        });

        this.vista.btnOrdenarEjes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getCuenta().ordenarVehiculosXEjes();
                llenarTablaAZ();
            }
        });

        this.vista.btnOrdenarPeso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getCuenta().ordenarVehiculosXPesoBruto();
                llenarTablaAZ();
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
                llenarTablaAZ();
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

    public void llenarTablaAZ() { //De menor a mayor
        
        Object nombresColumnas[] = new Object[8];
        nombresColumnas = Modelo.Configuracion.datosVehiculos;
        
        /*El primer parámetro es para pasar los datos de la tabla, el segundo parámetro es 
        para los nombres de las columnas*/
        DefaultTableModel TablaUser = new DefaultTableModel(this.user.getCuenta().datosVehiculosAZ(),
                                                            nombresColumnas);
        
        /*String informacion[] = new String[8];
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
        }*/
    }
    
    public void llenarTablaZA() { //De mayor a menor
        Object nombresColumnas[] = new Object[8];
        nombresColumnas = Modelo.Configuracion.datosVehiculos;
        DefaultTableModel TablaUser = new DefaultTableModel(this.user.getCuenta().datosVehiculosZA(),
                                                            nombresColumnas);
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        llenarTablaAZ();
    }
}
