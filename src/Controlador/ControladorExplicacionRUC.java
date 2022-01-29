package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.frmExplicacion;
import Modelo.Cliente;

public class ControladorExplicacionRUC implements ActionListener{
    private frmExplicacion vistaExplicacionRUC;
    private Cliente ClientePotencial;
    
     public ControladorExplicacionRUC(frmExplicacion vistaExplicacionRUC, Cliente ClientePotencial){
        this.vistaExplicacionRUC = new frmExplicacion();
        this.ClientePotencial = ClientePotencial;
        this.vistaExplicacionRUC.btnOK.addActionListener(this);
    }
    
    public void iniciar(){
        vistaExplicacionRUC.setLocationRelativeTo(null);
        vistaExplicacionRUC.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistaExplicacionRUC.btnOK){
            ControladorRUC ctrlRUC = new ControladorRUC(ClientePotencial); 
            ctrlRUC.iniciarRUC();
            vistaExplicacionRUC.dispose(); 
        }
    }
}
