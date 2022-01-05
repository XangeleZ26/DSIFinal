package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.Cuenta;
import Modelo.Tarjeta;
import Vista.frmRecargaOpcional;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ControladorRecargaOpc implements ActionListener{
    private Cuenta modeloCuenta;
    private Tarjeta modeloTarjeta;
    private frmRecargaOpcional vistaRecargaOpc;
    
    public ControladorRecargaOpc(Cuenta modeloCuenta, Tarjeta modeloTarjeta, frmRecargaOpcional vistaRecargaOpc){
        this.modeloCuenta = modeloCuenta;
        this.modeloTarjeta = modeloTarjeta;
        this.vistaRecargaOpc = vistaRecargaOpc;
        this.vistaRecargaOpc.btnCalcular.addActionListener(this);
        this.vistaRecargaOpc.btnFinalizar.addActionListener(this);
    }
    
    public void iniciarRecargaOpc(){
        vistaRecargaOpc.setTitle("Recarga Opcional");
        vistaRecargaOpc.setLocationRelativeTo(null);
        vistaRecargaOpc.setVisible(true);
    }
    
    public void limpiarRecargaOpc(){
        vistaRecargaOpc.txtMontoOpcional.setText(null);
        vistaRecargaOpc.cbxComprobantePago.setSelectedIndex(-1);
        vistaRecargaOpc.cbxMedioPago.setSelectedIndex(-1);
        vistaRecargaOpc.txtNumeroTarjeta.setText(null);
        vistaRecargaOpc.txtMontoRecarga.setText(null);
        vistaRecargaOpc.txtTotal.setText(null);
        vistaRecargaOpc.dcFechaVencimiento.setDate(null);
        vistaRecargaOpc.txtCVV.setText(null);       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistaRecargaOpc.btnCalcular){
            vistaRecargaOpc.txtMontoRecarga.setText(vistaRecargaOpc.txtMontoOpcional.getText());
            vistaRecargaOpc.cbxComprobantePago.getSelectedItem().toString();
            
            float total;
            total = Float.parseFloat(vistaRecargaOpc.txtMontoOpcional.getText()) + 20;
            String totalVal = Float.toString(total);
            vistaRecargaOpc.txtTotal.setText(totalVal);
            
        }
        else if(e.getSource() == vistaRecargaOpc.btnFinalizar){
            SimpleDateFormat sdfVencimiento = new SimpleDateFormat("yyyy/MM");
            String fechaVencimiento = sdfVencimiento.format(vistaRecargaOpc.dcFechaVencimiento.getDate());
            if(modeloTarjeta.verificarVigenciaTarjeta(fechaVencimiento)){
                Tarjeta tarjeta = new Tarjeta(
                                vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString(),
                                vistaRecargaOpc.txtNumeroTarjeta.getText(),
                                fechaVencimiento,
                                vistaRecargaOpc.txtCVV.getText());
                Date fechaActual = new Date();
                SimpleDateFormat sdfActual = new SimpleDateFormat("dd/MM/yyyy");
                modeloCuenta.recargar(Float.parseFloat(vistaRecargaOpc.txtMontoOpcional.getText()), 
                                tarjeta, sdfActual.format(fechaActual));
                
                limpiarRecargaOpc();
            }
            else{
                JOptionPane.showMessageDialog(vistaRecargaOpc, "Tarjeta caducada. Ingrese otra tarjeta.");
            }
        }
    }
}
