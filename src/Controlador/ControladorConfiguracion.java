package Controlador;

import Modelo.Cliente;
import Modelo.Configuracion;
import Vista.frmConfiguracion;
import Vista.frmOpcionesIngreso;
import Vista.frmPaginaPrincipal;
import Modelo.Configuracion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class ControladorConfiguracion {


    private frmConfiguracion vista;
    private Cliente user;

    public ControladorConfiguracion(Cliente user) {

        this.user = user;
        this.vista = new frmConfiguracion();

        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(user);
                ctrlOpcionesIngreso.iniciar();
                vista.dispose();
            }
        });

        this.vista.btnCambioContrasena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorConfigCambiarContra ctrlConfigCambiarContra = new ControladorConfigCambiarContra(user);
                ctrlConfigCambiarContra.iniciar();
                vista.dispose();
            }
        });

        this.vista.btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorPrincipal ctrlPrincipal = new ControladorPrincipal(new frmPaginaPrincipal());
                ctrlPrincipal.iniciar();
                vista.dispose();
            }
        });

        this.vista.btnCambioCorreo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorConfigCambiarCorreo ctrlConfigCambiarCorreo = new ControladorConfigCambiarCorreo(user);
                ctrlConfigCambiarCorreo.iniciar();
                vista.dispose();
            }
        });

        this.vista.btnCambioTarjet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorConfigCambiarTarjeta ctrlConfigCambiarTarjeta = new ControladorConfigCambiarTarjeta(user);
                ctrlConfigCambiarTarjeta.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnEliminarCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorEliminarCuenta controller = new ControladorEliminarCuenta(user,vista);
                controller.iniciar();
            }
        });
        this.vista.OjoCerrado.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vista.OjoAbierto.setVisible(true);
                vista.OjoCerrado.setVisible(false);
                ocultar();
            }
        });

        this.vista.OjoAbierto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vista.OjoAbierto.setVisible(false);
                vista.OjoCerrado.setVisible(true);
                vista.txtContrasena.setText(user.getCredencial().getContraseña());
            }
        });

    }

    //metodos
    public void llenarDatos() {
        this.vista.txtUsuario.setText(user.getNombres() + " "
                + user.getApPaterno() + " "
                + user.getApMaterno());
        this.vista.txtTipoDoc.setText(user.getTipoDocumento());
        this.vista.txtNumDoc.setText(user.getNumDocumento());
        this.vista.txtCorreo.setText(user.getCredencial().getCorreo());
        this.vista.txtTarjeta.setText(user.getCuenta().getTarjeta().getMedioPago());
        this.vista.txtNumTarjeta.setText(user.getCuenta().getTarjeta().getNumTarjeta());
        this.vista.txtRazon.setText(user.getRazonSocial());
    }

    public void ocultar() {
        String contraOculta = "•";
        for (int i = 1; i <user.getCredencial().getContraseña().length(); i++) {
            contraOculta += "•";
        }
        vista.txtContrasena.setText(contraOculta);
    }
    //xd
    public void comprobarTipoUser() {
        if (user.getTipoDocumento().equals("RUC")) {
            vista.lblUsuario.setVisible(false);
            vista.lblTipoDoc.setVisible(false);
            vista.lblNumDoc.setVisible(false);
            vista.txtUsuario.setVisible(false);
            vista.txtNumDoc.setVisible(false);
            vista.txtTipoDoc.setVisible(false);
        } else {
            vista.lblRazon.setVisible(false);
            vista.txtRazon.setVisible(false);
        }
    }

    public void iniciar() {
        llenarDatos();
        comprobarTipoUser();
        ocultar();
        vista.OjoCerrado.setVisible(false);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
