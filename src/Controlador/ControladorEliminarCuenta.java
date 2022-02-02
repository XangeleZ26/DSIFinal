
package Controlador;

import Modelo.Cliente;
import Vista.frmEliminarCuenta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorEliminarCuenta {
    private Cliente user;
    private frmEliminarCuenta vista;
    
    public ControladorEliminarCuenta(Cliente user){
        this.user=user;
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
             vista.dispose();
            }
        });
    }
    
   
}
