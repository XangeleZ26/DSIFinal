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

public class ControladorConfiguracion {

    //private Cliente user;
    private frmConfiguracion vista;
    private int indiceCliente;

    public ControladorConfiguracion(int indiceCliente) {
        //this.user=user;
        this.indiceCliente = indiceCliente;
        this.vista = new frmConfiguracion(Configuracion.arrClientes.getArregloCliente(indiceCliente));

        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(indiceCliente);
                ctrlOpcionesIngreso.iniciar();
                vista.dispose();
            }
        });

        this.vista.btnCambioContrasena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorConfigCambiarContra ctrlConfigCambiarContra = new ControladorConfigCambiarContra(indiceCliente);
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
                ControladorConfigCambiarCorreo ctrlConfigCambiarCorreo = new ControladorConfigCambiarCorreo(indiceCliente);
                ctrlConfigCambiarCorreo.iniciar();
                vista.dispose();
            }
        });

        this.vista.btnCambioTarjet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorConfigCambiarTarjeta ctrlConfigCambiarTarjeta = new ControladorConfigCambiarTarjeta(indiceCliente);
                ctrlConfigCambiarTarjeta.iniciar();
                vista.dispose();
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
                vista.txtContrasena.setText(Configuracion.arrClientes.getArregloCliente(indiceCliente).getCredencial().getContraseña());
            }
        });

    }

    //metodos
    public void llenarDatos() {
        this.vista.txtUsuario.setText(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getNombres() + " "
                + Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getApPaterno() + " "
                + Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getApMaterno());
        this.vista.txtTipoDoc.setText(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getTipoDocumento());
        this.vista.txtNumDoc.setText(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getNumDocumento());
        this.vista.txtCorreo.setText(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCredencial().getCorreo());
        this.vista.txtTarjeta.setText(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getTarjeta().getMedioPago());
        this.vista.txtNumTarjeta.setText(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getTarjeta().getNumTarjeta());
        this.vista.txtRazon.setText(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getRazonSocial());
    }

    public void ocultar() {
        String contraOculta = "•";
        for (int i = 1; i < 4; i++) {
            contraOculta += "•";
        }
        vista.txtContrasena.setText(contraOculta);
    }

    public void comprobarTipoUser() {
        if (Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getTipoDocumento().equals("RUC")) {
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
