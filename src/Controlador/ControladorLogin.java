package Controlador;

import Vista.frmLogin;
import Vista.frmPaginaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorLogin {

    private frmLogin vista;
    
    public ControladorLogin(){  //controlador, todos los botones se hacen dentro del controlador
        this.vista=new frmLogin();
        
        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ControladorPrincipal controller=new ControladorPrincipal(new frmPaginaPrincipal());
               controller.iniciar();
               vista.dispose();
            }
        });
        this.vista.btnIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //aqui tenemos que poner una condición de "Si el nombre escrito es igual a nombre registrado, accede
               
                ControladorOpcionesIngreso controller=new ControladorOpcionesIngreso();
               controller.iniciar();
               vista.dispose();
            }
        });
        
    }
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
