package Controlador;

import CarpetaDesign.AdministrarMostradores;
import Modelo.Cliente;
import Modelo.Configuracion;
import Modelo.Estacion;
import Modelo.Peaje;
import Modelo.Cuenta;
import Modelo.Vehiculo;
import Vista.frmMovimientos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ControladorMovimientos {

    private Cliente user;
    private frmMovimientos vista;
    private AdministrarMostradores managerButtons;
    
    public ControladorMovimientos(Cliente user) {
        this.vista = new frmMovimientos();
        this.user = user;
        this.managerButtons=new AdministrarMostradores();
        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(user);
                ctrlOpcionesIngreso.iniciar();
                vista.dispose();
            }
        });

        this.vista.btnAZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerButtons.OrderMode1(user.getCuenta().getMovimientos(), vista); 
            }
        });

        this.vista.btnZA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                managerButtons.OrderMode2(user.getCuenta().getMovimientos(), vista);
               
            }
        });

    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
        DefaultTableModel TablaUser;
        TablaUser = new DefaultTableModel(user.getCuenta().getMovimientos().datosMovimientosAZ(), user.getCuenta().getMovimientos().cabecera());
        this.vista.jMovimientos.setModel(TablaUser);

    }

}
