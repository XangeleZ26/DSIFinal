
package Controlador;

import Modelo.Cliente;
import Modelo.Configuracion;
import Vista.frmRecarga;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class ControladorRecarga {
    private frmRecarga vista;
    //private Cliente user;
    private int indiceCliente;
    
    public ControladorRecarga(int indiceCliente){
        this.vista=new frmRecarga();
        //this.user=user;
        this.indiceCliente = indiceCliente;
        
        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(indiceCliente);
                ctrlOpcionesIngreso.iniciar();
                vista.dispose();
            }
        });
        
        this.vista.btnPagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isValido()){
                    if(vista.txtCVV.getText().equals(Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getTarjeta().getCvv())){
                        if(Float.parseFloat(vista.txtMonto.getText())>0){
                            SimpleDateFormat sdfPago = new SimpleDateFormat("yyyy/MM"); //doy formato
                            String fechaPago = sdfPago.format(vista.dcFechaPago.getDate()); //indico a q cosa quiero dar formato y lo almaceno
                    
                            //Aún no se contempla el "boleta y factura" en el codigo. Esperando acuerdo grupal xd
                            /*switch(vista.getOpcionComprobante()){
                                case 1: Configuracion.arrClientes.getArregloClientes(this.indiceCliente).getCuenta().recargar(Float.parseFloat(vista.txtMonto.getText()),vista.txtCVV.getText(),fechaPago);
                                case 2: Configuracion.arrClientes.getArregloClientes(this.indiceCliente).getCuenta().recargar(Float.parseFloat(vista.txtMonto.getText()),vista.txtCVV.getText(),fechaPago);
                            }*/ 
                            Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().recargar(Float.parseFloat(vista.txtMonto.getText()),vista.txtCVV.getText(),fechaPago);
                            JOptionPane.showMessageDialog(null,"Recarga realizada con éxito."); 
                            ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(indiceCliente);
                            ctrlOpcionesIngreso.iniciar();
                            vista.dispose();
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"No puede recargar un monto negativo!");  
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"CVV incorrecto!"); 
                    }
                }
                else{
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
        vista.lblTarjeta.setText(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getTarjeta().getMedioPago());
        vista.lblNumberT.setText(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getTarjeta().getNumTarjeta());
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
