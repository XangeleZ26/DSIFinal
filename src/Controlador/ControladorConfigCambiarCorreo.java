/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Vista.ConfigCambiarCorreo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorConfigCambiarCorreo {
    private ConfigCambiarCorreo vista;
    private Cliente user;
    public ControladorConfigCambiarCorreo(Cliente user){
        this.vista=new ConfigCambiarCorreo();
        this.user=user;
        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorConfiguracion controller = new ControladorConfiguracion(user);
                controller.iniciar();
                vista.dispose();   
            }
        });
        this.vista.btnCambiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(vista.txtContrasena.getPassword().equals("XDDD")){
                 JOptionPane.showMessageDialog(null,"Cambios registrados.");
                 //meter code donde cambiamos el email
                 
                ControladorConfiguracion controller = new ControladorConfiguracion(user);
                controller.iniciar();
                vista.dispose();   
                }
                else{
                    JOptionPane.showMessageDialog(null,"Contraseña de cuenta incorrecta.");
                }
            }
        });
    }
        public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
