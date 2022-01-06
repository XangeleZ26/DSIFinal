package Controlador;


import Controlador.ControladorOpcionesIngreso;
import Vista.frmSaldo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorSaldo {
    private frmSaldo vista;
    
    public ControladorSaldo(){
        this.vista=new frmSaldo();
        
         this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorOpcionesIngreso controller = new ControladorOpcionesIngreso();
                controller.iniciar();
                vista.dispose();
            }
        });
         this.vista.btnRecargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorRecarga controller=new ControladorRecarga();
                controller.iniciar();
                vista.dispose();
            }
        });
    }
    //crear un método que imprima el saldo del cliente al momento de invocar este controlador
    
    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
}
