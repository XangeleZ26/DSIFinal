
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.Cuenta;
import Modelo.Cliente;
import Modelo.Tarjeta;
import Modelo.ArregloClientes;
import Vista.frmRecargaOpcional;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ControladorRecargaOpc{
    private ArregloClientes modeloClientes = new ArregloClientes(); 
    private Cuenta modeloCuenta;
    private Tarjeta modeloTarjeta;
    private frmRecargaOpcional vistaRecargaOpc;
    Cliente mCliente = new Cliente();
    
    public ControladorRecargaOpc(Cuenta modeloCuenta, Tarjeta modeloTarjeta){
        this.modeloCuenta = modeloCuenta;
        this.modeloTarjeta = modeloTarjeta;
        this.vistaRecargaOpc = new frmRecargaOpcional();
        
        this.vistaRecargaOpc.btnCalcular.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                float total=20;
                if(vistaRecargaOpc.txtMontoOpcional.getText().compareTo("")==0){    
                    vistaRecargaOpc.txtMontoOpcional.setText("0");
                    vistaRecargaOpc.txtMontoRecarga.setText("0");
                    vistaRecargaOpc.txtTotal.setText(String.valueOf(total));
                }
                else{
                    vistaRecargaOpc.txtMontoRecarga.setText(vistaRecargaOpc.txtMontoOpcional.getText());
                    total += Float.parseFloat(vistaRecargaOpc.txtMontoRecarga.getText());
                    vistaRecargaOpc.txtTotal.setText(String.valueOf(total));
                }
            }
        });
        
        this.vistaRecargaOpc.btnFactura.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ControladorRUCPago ctrlRUC = new ControladorRUCPago(mCliente);
                ctrlRUC.iniciarRUCPago();
                vistaRecargaOpc.dispose(); 
            }
        });
        
        this.vistaRecargaOpc.btnFinalizar.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent e){
                if(datosLlenosRecargaOpc()){
                    int añoVencimiento = vistaRecargaOpc.jycAñoVencimiento.getYear();
                    int mesVencimiento = vistaRecargaOpc.jmcMesVencimiento.getMonth();
                    SimpleDateFormat sdfVencimiento = new SimpleDateFormat("yyyy/MM/dd");
                    Date fechaVencimiento = new Date(añoVencimiento, mesVencimiento, 00);

                    //if(modeloTarjeta.verificarVigenciaTarjeta(sdfVencimiento.format(fechaVencimiento))){
                        if(modeloTarjeta.verificarValidezTajeta(vistaRecargaOpc.txtNumeroTarjeta.getText(), vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString())){
                            if(modeloTarjeta.verificarValidezCVV(vistaRecargaOpc.txtCVV.getText(), vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString())){
                                Tarjeta tarjeta = new Tarjeta(
                                                vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString(),
                                                vistaRecargaOpc.txtNumeroTarjeta.getText(),
                                                sdfVencimiento.format(fechaVencimiento),
                                                vistaRecargaOpc.txtCVV.getText());
                                modeloClientes.getArregloCliente(modeloClientes.getOc()).crearCuenta(tarjeta);   
                                Date fechaActual = new Date();
                                SimpleDateFormat sdfActual = new SimpleDateFormat("yyyy/MM/dd");
                                modeloCuenta.recargar(Float.parseFloat(vistaRecargaOpc.txtMontoOpcional.getText()) + 12, 
                                                tarjeta, sdfActual.format(fechaActual));

                            }
                            else{
                                vistaRecargaOpc.txtCVV.setText(null);
                                JOptionPane.showMessageDialog(vistaRecargaOpc, "CVV no válido. Digite nuevamente.");
                            }
                        }
                        else{
                            vistaRecargaOpc.txtNumeroTarjeta.setText(null);
                            JOptionPane.showMessageDialog(vistaRecargaOpc, "Número de tarjeta no válida. Digite nuevamente.");  
                        }
                    //}  
                    //else{
                      //  limpiarDatosTarjeta();
                      //  JOptionPane.showMessageDialog(vistaRecargaOpc, "Tarjeta caducada. Ingrese otra tarjeta.");  
                    //}
                }
                else{
                    JOptionPane.showMessageDialog(vistaRecargaOpc, "Debe rellenar todos los campos, por favor.");  
                }
                int añoVencimiento = vistaRecargaOpc.jycAñoVencimiento.getYear();
                int mesVencimiento = vistaRecargaOpc.jmcMesVencimiento.getMonth();
                SimpleDateFormat sdfVencimiento = new SimpleDateFormat("yyyy/MM/dd");
                Date fechaVencimiento = new Date(añoVencimiento, mesVencimiento, 00);
                
                //if(modeloTarjeta.verificarVigenciaTarjeta(sdfVencimiento.format(fechaVencimiento))){
                    if(modeloTarjeta.verificarValidezTajeta(vistaRecargaOpc.txtNumeroTarjeta.getText(), vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString())){
                        if(modeloTarjeta.verificarValidezCVV(vistaRecargaOpc.txtCVV.getText(), vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString())){
                            Tarjeta tarjeta = new Tarjeta(
                                            vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString(),
                                            vistaRecargaOpc.txtNumeroTarjeta.getText(),
                                            sdfVencimiento.format(fechaVencimiento),
                                            vistaRecargaOpc.txtCVV.getText());
                            modeloClientes.getArregloCliente(modeloClientes.getOc()).crearCuenta(tarjeta);   
                            Date fechaActual = new Date();
                            SimpleDateFormat sdfActual = new SimpleDateFormat("yyyy/MM/dd");
                            modeloCuenta.recargar(Float.parseFloat(vistaRecargaOpc.txtMontoOpcional.getText()) + 12, 
                                            tarjeta, sdfActual.format(fechaActual));
                            
                        }
                        else{
                            vistaRecargaOpc.txtCVV.setText(null);
                            JOptionPane.showMessageDialog(vistaRecargaOpc, "CVV no válido. Digite nuevamente.");
                        }
                    }
                    else{
                        vistaRecargaOpc.txtNumeroTarjeta.setText(null);
                        JOptionPane.showMessageDialog(vistaRecargaOpc, "Número de tarjeta no válida. Digite nuevamente.");  
                    }
                //}  
                //else{
                  //  limpiarDatosTarjeta();
                  //  JOptionPane.showMessageDialog(vistaRecargaOpc, "Tarjeta caducada. Ingrese otra tarjeta.");  
                //}
            }
        });
        
    }
    
    public void iniciarRecargaOpc(){
        vistaRecargaOpc.setTitle("Recarga Opcional");
        vistaRecargaOpc.setLocationRelativeTo(null);
        vistaRecargaOpc.setVisible(true);
    }
    
    public void limpiarRecargaOpc(){
        vistaRecargaOpc.txtMontoOpcional.setText(null);
        vistaRecargaOpc.cbxMedioPago.setSelectedIndex(-1);
        vistaRecargaOpc.txtNumeroTarjeta.setText(null);
        vistaRecargaOpc.txtMontoRecarga.setText(null);
        vistaRecargaOpc.txtTotal.setText(null);
        vistaRecargaOpc.jycAñoVencimiento.setYear(-1);
        vistaRecargaOpc.jmcMesVencimiento.setMonth(-1);
        vistaRecargaOpc.txtCVV.setText(null);       
    }
    
    public boolean datosLlenosRecargaOpc(){
        return (this.vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString().trim().length() != 0
                && this.vistaRecargaOpc.txtNumeroTarjeta.getText().trim().length() != 0
                && this.vistaRecargaOpc.txtTotal.getText().trim().length() != 0
                //&& this.vistaRecargaOpc.jycAñoVencimiento.getYear().trim().length() != 0
                //&& this.vistaRecargaOpc.jmcMesVencimiento.getMonth().trim().length() != 0
                && this.vistaRecargaOpc.txtCVV.getText().trim().length() != 0
                && this.vistaRecargaOpc.getOpcionComprobantePago()!=0);
    }
}