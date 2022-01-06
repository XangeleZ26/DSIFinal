
package Controlador;

import Vista.ConfigCambiarTarjeta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorConfigCambiarTarjeta {
    private ConfigCambiarTarjeta vista;
    
    public ControladorConfigCambiarTarjeta(){
        this.vista=new ConfigCambiarTarjeta();
        
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
                
                //aqui colocar todo lo referente a cambio de tarjeta
                
                ControladorConfiguracion controller = new ControladorConfiguracion();
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
