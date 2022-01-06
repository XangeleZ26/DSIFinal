/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Vista.frmConfiguracion;
import Vista.frmOpcionesIngreso;
import Vista.frmPaginaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorConfiguracion {

    private Cliente user;
    private frmConfiguracion vista;

    public ControladorConfiguracion(/*Cliente user*/) {
//        this.user=user;
        this.vista = new frmConfiguracion();

        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorOpcionesIngreso controller = new ControladorOpcionesIngreso();
                controller.iniciar();
                vista.dispose();
            }
        });

        this.vista.btnCambioContrasena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorConfigCambiarContra controller = new ControladorConfigCambiarContra();
                controller.iniciar();
                vista.dispose();
            }
        });

        this.vista.btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorPrincipal controller=new ControladorPrincipal(new frmPaginaPrincipal());
               controller.iniciar();
               vista.dispose();
            }
        });

        this.vista.btnCambioTarjet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

//               controller.iniciar();
//               vista.dispose();
            }
        });
        this.vista.btnCambioCorreo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorConfigCambiarCorreo controller=new ControladorConfigCambiarCorreo();
               controller.iniciar();
               vista.dispose();
            }
        });
        this.vista.btnCambioTarjet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              ControladorConfigCambiarTarjeta controller=new ControladorConfigCambiarTarjeta();
               controller.iniciar();
               vista.dispose();
            }
        });
    }

    //metodos
    public void llenarDatos() {
        this.vista.txtUsuario.setText("Xavi villa prueba");
        this.vista.txtTipoDoc.setText("DNI");
        this.vista.txtNumDoc.setText("12345678");
        this.vista.txtCorreo.setText("xd@gmail.com");
        this.vista.txtTarjeta.setText("Interbank");
        this.vista.txtNumTarjeta.setText("12345534432323");

    }

    public void iniciar() {
        this.llenarDatos();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
