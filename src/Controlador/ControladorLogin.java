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
                //aqui tenemos que poner una condición de "Si el nombre escrito es igual a nombre registrado, accede
                try {
                    Cliente clientela=Configuracion.arrClientes.buscarCliente(vista.txtUsuarioLogin.getText(), vista.txtContraseñaLogin.getText());
                    ControladorOpcionesIngreso controller = new ControladorOpcionesIngreso(clientela);
                    controller.iniciar();
                    vista.dispose();

                } catch (ArrayIndexOutOfBoundsException z) {
                    JOptionPane.showMessageDialog(null, "Datos incorrectos.");
                }

            }
        });

    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
