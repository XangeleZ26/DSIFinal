/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Vista.ConfigCambiarContra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorConfigCambiarContra {

    private ConfigCambiarContra vista;
    private Cliente user;

    public ControladorConfigCambiarContra(Cliente user) {
        this.vista = new ConfigCambiarContra();
        this.user = user;
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
                if(isValido()){
                switch (user.cambioContrasena(String.valueOf(vista.txtContrasena.getPassword()), String.valueOf(vista.txtNovoContrasena.getPassword()), String.valueOf(vista.txtVerifContrasena.getPassword()))) {
                    case 0: {
                        user.cambiarContraseña(String.valueOf(vista.txtNovoContrasena.getPassword()));
                        JOptionPane.showMessageDialog(null, "Cambios registrados.");
                        ControladorConfiguracion controller = new ControladorConfiguracion(user);
                        controller.iniciar();
                        vista.dispose();break;
                    }
                    case 1:
                        JOptionPane.showMessageDialog(null, "Contraseña de cuenta incorrecta");break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Tu nueva contraseña no coincide");break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "1. Contraseña de cuenta incorrecta\n2. Tu nueva contraseña no coincide ");break;
                }
            }else{
                       JOptionPane.showMessageDialog(null,"Debe llenar todos los campos!"); 
                }
            }
        });
    }

    private boolean isValido() {
        return (String.valueOf(this.vista.txtContrasena.getPassword()).trim().length() != 0
                && String.valueOf(this.vista.txtNovoContrasena.getPassword()).trim().length() != 0
                && String.valueOf(this.vista.txtVerifContrasena.getPassword()).trim().length() != 0);
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
