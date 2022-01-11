package Controlador;

import Modelo.ArregloClientes;
import Modelo.Cliente;
import Modelo.Configuracion;
import Vista.frmLogin;
import Vista.frmPaginaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorListener;

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
       this.vista.OjoCerrado.addMouseListener(new MouseAdapter() {
       @Override
       public void mouseClicked(MouseEvent e){
           vista.OjoAbierto.setVisible(true);
        vista.OjoCerrado.setVisible(false);
    vista.txtContrasena.setEchoChar('•');
       }
       
       });
       this.vista.OjoAbierto.addMouseListener(new MouseAdapter() {
       @Override
       public void mouseClicked(MouseEvent e){
           vista.OjoAbierto.setVisible(false);
        vista.OjoCerrado.setVisible(true);
        vista.txtContrasena.setEchoChar((char) 0);
       }
       
       });
    }

    private boolean isValido() {
        return (this.vista.txtUsuarioLogin.getText().trim().length() != 0
                && String.valueOf(this.vista.txtContrasena.getPassword()).trim().length() != 0);
    }

    public void iniciar() {
         vista.OjoCerrado.setVisible(false);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
