
package Controlador;

import Modelo.Cliente;
import Vista.ConfigCambiarTarjeta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorConfigCambiarTarjeta {
    private ConfigCambiarTarjeta vista;
    private Cliente user;
    public ControladorConfigCambiarTarjeta(Cliente user){
        this.vista=new ConfigCambiarTarjeta();
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
                
                //aqui colocar todo lo referente a cambio de tarjeta
                
                ControladorConfiguracion controller = new ControladorConfiguracion(user);
                controller.iniciar();
                vista.dispose();   
            }
        });
    }
      public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
