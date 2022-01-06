package Controlador;

import Modelo.ArregloClientes;
import Modelo.Cliente;
import Modelo.Configuracion;
import Vista.frmLogin;
import Vista.frmPaginaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorLogin {

    private frmLogin vista;
    private ArregloClientes clientes;

    public ControladorLogin() {  //controlador, todos los botones se hacen dentro del controlador
        this.vista = new frmLogin();
        this.clientes = Configuracion.arrClientes;
        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorPrincipal controller = new ControladorPrincipal(new frmPaginaPrincipal());
                controller.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isValido()) {
                    try {
                        String contrasena = String.valueOf(vista.txtContrasena.getPassword());
                        Cliente clientela = Configuracion.arrClientes.buscarCliente(vista.txtUsuarioLogin.getText(), String.valueOf(vista.txtContrasena.getPassword()));
                        ControladorOpcionesIngreso controller = new ControladorOpcionesIngreso(clientela);
                        controller.iniciar();
                        vista.dispose();
                        System.out.println(contrasena);
                    } catch (ArrayIndexOutOfBoundsException z) {
                        JOptionPane.showMessageDialog(null, "Datos incorrectos.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos!");
                }
            }
        });

    }

    private boolean isValido() {
        return (this.vista.txtUsuarioLogin.getText().trim().length() != 0
                && String.valueOf(this.vista.txtContrasena.getPassword()).trim().length() != 0);
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
