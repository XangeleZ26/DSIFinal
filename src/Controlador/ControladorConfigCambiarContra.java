/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.ConfigCambiarContra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorConfigCambiarContra {

    private ConfigCambiarContra vista;

    public ControladorConfigCambiarContra() {
        this.vista = new ConfigCambiarContra();

        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorConfiguracion controller = new ControladorConfiguracion();
                controller.iniciar();
                vista.dispose();
               
            }
        });
        this.vista.btnCambiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                switch (cliente.cambioContrasena(vista.txtContrasena.getPassword().toString(), vista.txtNovoContrasena.getPassword().toString(), vista.txtVerifContrasena.getPassword().toString())) {
//                    case 0: {
//                            JOptionPane.showMessageDialog(null,"Cambios registrados.");
//                        ControladorConfiguracion controller = new ControladorConfiguracion();
//                        controller.iniciar();
//                        vista.dispose();
//                    }
//                    case 1:
//                    JOptionPane.showMessageDialog(null,"Contraseña de cuenta incorrecta");
//                    case 2:
//                        JOptionPane.showMessageDialog(null,"Tu nueva contraseña no coincide");
//                    case 3:
//                JOptionPane.showMessageDialog(null,"1. Contraseña de cuenta incorrecta\n2. Tu nueva contraseña no coincide ");
//                }

            }
        });
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
