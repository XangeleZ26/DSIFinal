
package Controlador;

import Modelo.Cliente;
import Modelo.Configuracion;
import Vista.ConfigCambiarTarjeta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class ControladorConfigCambiarTarjeta {
    private ConfigCambiarTarjeta vista;
    //private Cliente user;
    //private int indiceCliente;
    
    public ControladorConfigCambiarTarjeta(int indiceCliente){
        this.vista=new ConfigCambiarTarjeta();
        //this.user=user;
        //this.indiceCliente = indiceCliente;
        
        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorConfiguracion ctrlConfiguracion = new ControladorConfiguracion(indiceCliente);
                ctrlConfiguracion.iniciar();
                vista.dispose();   
            }
        });
        
        this.vista.btnCambiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isValido()){
                /*Falta implementar la validación para la nueva tarjeta que se va a registrar*/
                /*Verificar también que esta no sea igual a la tarjeta anterior*/
                Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getTarjeta().setMedioPago(vista.cbxMedioPago.getSelectedItem().toString());
                Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getTarjeta().setNumTarjeta(vista.txtNumTarjet.getText());
                Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getTarjeta().setCvv(vista.txtCvv.getText());
                
                SimpleDateFormat sdfVencimiento = new SimpleDateFormat("yyyy/MM");
                String fechaVencimiento = sdfVencimiento.format(vista.dcFechaVencimiento.getDate());
                Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getTarjeta().setFechaVencimiento(fechaVencimiento);
                JOptionPane.showMessageDialog(null,"Cambios registrados.");
                ControladorConfiguracion ctrlConfiguracion = new ControladorConfiguracion(indiceCliente);
                ctrlConfiguracion.iniciar();
                vista.dispose();   
                }
                else{
                   JOptionPane.showMessageDialog(null,"Debe llenar todos los campos!"); 
                }
            }
        });
    }
    
    private boolean isValido() {
        return (this.vista.cbxMedioPago.getSelectedItem().toString().trim().length() != 0
                && this.vista.txtNumTarjet.getText().trim().length() != 0
                && this.vista.txtCvv.getText().trim().length() != 0
                && this.vista.dcFechaVencimiento.getDate()!=null);
    }
     
    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}