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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControladorLogin {
    //MODIFICACION DE XAVIER
    private frmLogin vista;
    private Cliente cliente;
    private ArregloClientes clientes;

    public ControladorLogin() {  //controlador, todos los botones se hacen dentro del controlador
        this.vista = new frmLogin();
        this.clientes = Configuracion.arrClientes;
        
        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorPrincipal ctrlPrincipal = new ControladorPrincipal(new frmPaginaPrincipal());
                ctrlPrincipal.iniciar();
                vista.dispose();
            }
        });
        
        this.vista.btnIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isValido()) {
                    try {
                        String contrasena = String.valueOf(vista.txtContrasena.getPassword());
                        /*Primero se busca el cliente con sus credenciales. Si se encuentra, se guarda en el atributo cliente,
                        luego se busca el índice en el arreglo que ocupa ese cliente, ese índice se guarda. Si el índice
                        es diferente a -1 (valor de inicio), se puede abrir la vista de Opciones de ingreso, y ese índice 
                        se pasa como argumento a siguiente controlador, ese índice nos ayudará a ubicar el cliente que queremos
                        modificar en el arreglo estático de la clase Configuración*/
                        //Cliente cliente = Configuracion.arrClientes.buscarCliente(vista.txtUsuarioLogin.getText(), contrasena);
                        /*if(cliente!=null){
                            this.indiceCliente = Configuracion.arrClientes.buscarOrdenCliente(vista.txtUsuarioLogin.getText(), contrasena);
                        }*/
                        ArregloClientes extra=(ArregloClientes)Configuracion.serial.deserializar("archivoUser.txt");
                        Configuracion.arrClientes=extra;
                        cliente = Configuracion.arrClientes.buscarCliente(vista.txtUsuarioLogin.getText(), contrasena);
                        System.out.println(Configuracion.arrClientes);
                            ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(cliente);
                            ctrlOpcionesIngreso.iniciar();
                            vista.dispose();
                            
                        
                    } catch (Exception z) {
                        JOptionPane.showMessageDialog(null, "Datos incorrectos y/o usuario no registrado");
                    }
                } 
                else {
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
//                 try {
//                      
//                        ArregloClientes prueba=(ArregloClientes)Configuracion.serial.deserializar("archivoUser.txt");
//                        System.out.println(prueba);
//                    } catch (Exception z) {
//                        
//                    }
        vista.OjoCerrado.setVisible(false);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
