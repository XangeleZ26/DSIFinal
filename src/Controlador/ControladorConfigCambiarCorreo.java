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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class ControladorConfigCambiarCorreo {

    private ConfigCambiarCorreo vista;
    private Cliente user;

    public ControladorConfigCambiarCorreo(Cliente user) {
        this.vista = new ConfigCambiarCorreo();
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
                if (isValido()) {
                    if ((String.valueOf(vista.txtContrasena.getPassword())).equals(user.getCredencial().getContraseña())) {
                        JOptionPane.showMessageDialog(null, "Cambios registrados.");
                        user.getCredencial().cambiarCorreo(vista.txtCorreo.getText());
                        ControladorConfiguracion controller = new ControladorConfiguracion(user);
                        controller.iniciar();
                        vista.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Contraseña de cuenta incorrecta.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos!");
                }
            }
        });
        this.vista.OjoCerrado1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vista.OjoAbierto1.setVisible(true);
                vista.OjoCerrado1.setVisible(false);
                vista.txtContrasena.setEchoChar('•');
            }
        });
        this.vista.OjoAbierto1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vista.OjoAbierto1.setVisible(false);
                vista.OjoCerrado1.setVisible(true);
                vista.txtContrasena.setEchoChar((char) 0);
            }
        });
    }

    private boolean isValido() {
        return (this.vista.txtCorreo.getText().trim().length() != 0
                && String.valueOf(this.vista.txtContrasena.getPassword()).trim().length() != 0);
    }

    public void iniciar() {
        vista.OjoCerrado1.setVisible(false);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
