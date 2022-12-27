package Controlador;

import CarpetaDesign.AdministrarMostradores;
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
    private AdministrarMostradores managerButtons;
    
    public ControladorVehiculos(Cliente user) {
        this.user = user;
        this.vista = new frmVehiculos();
        this.managerButtons=new AdministrarMostradores();
        
        this.vista.btnAZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerButtons.OrderMode1(user.getCuenta().getVehiculos(), vista);
            }
        });
        
        this.vista.btnZA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerButtons.OrderMode2(user.getCuenta().getVehiculos(), vista);
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

        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(user);
                ctrlOpcionesIngreso.iniciar();
                vista.dispose();
            }
        });
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
        Object nombresColumnas[] = new Object[8];
        nombresColumnas = Modelo.Configuracion.datosVehiculos;
        DefaultTableModel TablaUser = new DefaultTableModel(this.user.getCuenta().getVehiculos().datosVehiculosAZ(),nombresColumnas);
        vista.tblTabla.setModel(TablaUser);
    }
}
