
package Controlador;

import Modelo.Cliente;
import Vista.frmRecarga;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class ControladorRecarga {
    private frmRecarga vista;
    private Cliente user;
    public ControladorRecarga(Cliente user){
        this.vista=new frmRecarga();
        this.user=user;
        
        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorOpcionesIngreso controller = new ControladorOpcionesIngreso(user);
                controller.iniciar();
                vista.dispose();
            }
        });
       this.vista.btnPagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isValido()){
                if(vista.txtCVV.getText().equals(user.getCuenta().getTarjeta().getCvv())){
                   if(Float.parseFloat(vista.txtMonto.getText())>0){
                    SimpleDateFormat sdfPago = new SimpleDateFormat("yyyy/MM"); //doy formato
                    String fechaPago = sdfPago.format(vista.dcFechaPago.getDate()); //indico a q cosa quiero dar formato y lo almaceno
                    
                    //Aún no se contempla el "boleta y factura" en el codigo. Esperando acuerdo grupal xd
                    switch(vista.getOpcionComprobante()){
                        case 1: user.getCuenta().recargar(Float.parseFloat(vista.txtMonto.getText()),vista.txtCVV.getText(),fechaPago);
                        case 2:user.getCuenta().recargar(Float.parseFloat(vista.txtMonto.getText()),vista.txtCVV.getText(),fechaPago);
                    }  
                    JOptionPane.showMessageDialog(null,"Recarga realizada con éxito."); 
                ControladorOpcionesIngreso controller = new ControladorOpcionesIngreso(user);
                controller.iniciar();
                vista.dispose();
                   }else{
                       JOptionPane.showMessageDialog(null,"No puede recargar un monto negativo!");  
                   }
                }else{
                    JOptionPane.showMessageDialog(null,"CVV incorrecto!"); 
                }
                }else{
                    JOptionPane.showMessageDialog(null,"Debe llenar todos los campos!"); 
                }
            }
        });
    }
         private boolean isValido() {
        return (this.vista.txtCVV.getText().trim().length() != 0
                && this.vista.dcFechaPago.getDate() != null
                && this.vista.txtMonto.getText().trim().length() != 0
                && this.vista.getOpcionComprobante()!=0);
    }
       public void iniciar() {
        vista.lblTarjeta.setText(user.getCuenta().getTarjeta().getMedioPago());
        vista.lblNumberT.setText(user.getCuenta().getTarjeta().getNumTarjeta());
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
