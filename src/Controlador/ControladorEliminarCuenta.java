
package Controlador;

import Modelo.Cliente;
import Modelo.Configuracion;
import Vista.frmConfiguracion;
import Vista.frmEliminarCuenta;
import Vista.frmPaginaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControladorEliminarCuenta {
    private Cliente user;
    private frmEliminarCuenta vista;
    private frmConfiguracion vista2;
    public ControladorEliminarCuenta(Cliente user,frmConfiguracion vista2){
        this.user=user;
        this.vista2=vista2;
        this.vista=new frmEliminarCuenta();
        
       this.vista.ojoCerrado.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e){
            vista.OjoAbierto.setVisible(true);
            vista.ojoCerrado.setVisible(false);
            vista.JPassword.setEchoChar('•');
        }
        });
        
        this.vista.OjoAbierto.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e){
            vista.OjoAbierto.setVisible(false);
            vista.ojoCerrado.setVisible(true);
            vista.JPassword.setEchoChar((char) 0);
        }
        });
        this.vista.btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             vista.dispose();
            }
        });
        this.vista.btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             if(String.valueOf(vista.JPassword.getPassword()).equals(String.valueOf(user.getCredencial().getContraseña()))){
                 System.out.println(String.valueOf(user.getCredencial().getContraseña()));
                 System.out.println(String.valueOf(vista.JPassword.getPassword()));
                 Configuracion.arrClientes.eliminarCliente(user);
                 try {
                     Configuracion.serial.serializar("archivoUser.txt",Configuracion.arrClientes);
                      vista.dispose();
                     JOptionPane.showMessageDialog(null,"Cuenta eliminada con éxito.");
                      ControladorPrincipal controller=new ControladorPrincipal(new frmPaginaPrincipal());
                      controller.iniciar();
                      vista2.dispose();
                 } catch (Exception ex) {
                     JOptionPane.showMessageDialog(null,"Fallo en el guardado de archivo");
                 }
             }else{
                 JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
             }
            }
        });
    }
    public void iniciar(){
        vista.ojoCerrado.setVisible(false);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
   
}
