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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
                if (isValido()) {
                    switch (user.cambioContrasena(String.valueOf(vista.txtContrasena.getPassword()), String.valueOf(vista.txtNovoContrasena.getPassword()), String.valueOf(vista.txtVerifContrasena.getPassword()))) {
                        case 0: {
                            user.getCredencial().cambiarContraseña(String.valueOf(vista.txtNovoContrasena.getPassword()));
                            JOptionPane.showMessageDialog(null, "Cambios registrados.");
                            ControladorConfiguracion controller = new ControladorConfiguracion(user);
                            controller.iniciar();
                            vista.dispose();
                            break;
                        }
                        case 1:
                            JOptionPane.showMessageDialog(null, "Contraseña de cuenta incorrecta");
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Tu nueva contraseña no coincide");
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "1. Contraseña de cuenta incorrecta\n2. Tu nueva contraseña no coincide ");
                            break;
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
        this.vista.OjoAbierto2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vista.OjoAbierto2.setVisible(false);
                vista.OjoCerrado2.setVisible(true);
                vista.txtNovoContrasena.setEchoChar((char) 0);
                vista.txtVerifContrasena.setEchoChar((char) 0);
            }
        });
        this.vista.OjoCerrado2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vista.OjoAbierto2.setVisible(true);
                vista.OjoCerrado2.setVisible(false);
                vista.txtNovoContrasena.setEchoChar('•');
                vista.txtVerifContrasena.setEchoChar('•');
            }
        });
    }

    private boolean isValido() {
        return (String.valueOf(this.vista.txtContrasena.getPassword()).trim().length() != 0
                && String.valueOf(this.vista.txtNovoContrasena.getPassword()).trim().length() != 0
                && String.valueOf(this.vista.txtVerifContrasena.getPassword()).trim().length() != 0);
    }

    public void iniciar() {
        vista.OjoCerrado1.setVisible(false);
        vista.OjoCerrado2.setVisible(false);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
