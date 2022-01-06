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

    public ControladorConfiguracion(Cliente user) {
        this.user=user;
        this.vista = new frmConfiguracion(user);

        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorOpcionesIngreso controller = new ControladorOpcionesIngreso(user);
                controller.iniciar();
                vista.dispose();
            }
        });

        this.vista.btnCambioContrasena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorConfigCambiarContra controller = new ControladorConfigCambiarContra(user);
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

        this.vista.btnCambioCorreo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorConfigCambiarCorreo controller=new ControladorConfigCambiarCorreo(user);
               controller.iniciar();
               vista.dispose();
            }
        });
        this.vista.btnCambioTarjet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              ControladorConfigCambiarTarjeta controller=new ControladorConfigCambiarTarjeta(user);
               controller.iniciar();
               vista.dispose();
            }
        });
    }

    //metodos
    public void llenarDatos() {
        this.vista.txtUsuario.setText(user.getNombres()+" "+user.getApPaterno()+" "+user.getApMaterno());
        this.vista.txtTipoDoc.setText(user.getTipoDocumento());
        this.vista.txtNumDoc.setText(user.getNumDocumento());
        this.vista.txtCorreo.setText(user.getCorreo());
        this.vista.txtTarjeta.setText(user.getCuenta().getTarjeta().getMedioPago());
        this.vista.txtNumTarjeta.setText(user.getCuenta().getTarjeta().getNumTarjeta());

    }

    public void iniciar() {
        this.llenarDatos();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
