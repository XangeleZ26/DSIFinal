
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.Cuenta;
import Modelo.Cliente;
import Modelo.Tarjeta;
import Modelo.Configuracion;
import Modelo.ArregloClientes;
import Vista.frmRecargaOpcional;
import Vista.frmPaginaPrincipal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ControladorRecargaOpc{
    //private ArregloClientes modeloClientes = new ArregloClientes(); 
    //private Cuenta modeloCuenta;
    private Tarjeta TarjetaPotencial;
    private frmRecargaOpcional vistaRecargaOpc;
    //Cliente mCliente = new Cliente();
    //private Cliente ClientePotencial;
    
    public ControladorRecargaOpc(Cliente ClientePotencial){
        //this.modeloCuenta = modeloCuenta;
        //this.modeloTarjeta = modeloTarjeta;
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
        /*
        FALTA DEFINIR QUÉ PAPEL JUGARÁ EL RUC EN EL PROGRAMA
        this.vistaRecargaOpc.btnFactura.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(datosLlenosRecargaOpc()){
                    ControladorRUCPago ctrlRUC = new ControladorRUCPago(mCliente);
                    ctrlRUC.iniciarRUCPago();
                    vistaRecargaOpc.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(vistaRecargaOpc, "CVV no válido. Digite nuevamente.");
                }
            }
        });*/
        
        
        /*PUEDE FALLAR DEBIDO A QUE LA TARJETA POTENCIAL AÚN NO SE HA INICIALIZADO
        REVISAR LA VALIDEZ DE LA FECHA DE VENCIMIENTO ANTES DE REGISTRAR UNA TARJETA*/
        this.vistaRecargaOpc.btnFinalizar.addActionListener(new ActionListener(){ //HACER REGISTRO DEL CLIENTE AQUÍ
            @Override 
            public void actionPerformed(ActionEvent e){
                if(datosLlenosRecargaOpc()){
                    int añoVencimiento = vistaRecargaOpc.jycAñoVencimiento.getYear();
                    int mesVencimiento = vistaRecargaOpc.jmcMesVencimiento.getMonth();
                    SimpleDateFormat sdfVencimiento = new SimpleDateFormat("yyyy/MM/dd");
                    Date fechaVencimiento = new Date(añoVencimiento, mesVencimiento, 00);

                    //if(modeloTarjeta.verificarVigenciaTarjeta(sdfVencimiento.format(fechaVencimiento))){
                        if(TarjetaPotencial.verificarValidezTajeta(vistaRecargaOpc.txtNumeroTarjeta.getText(),
                           vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString())){
                            
                            if(TarjetaPotencial.verificarValidezCVV(vistaRecargaOpc.txtCVV.getText(),
                               vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString())){
                                
                                TarjetaPotencial = new Tarjeta(
                                                vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString(),
                                                vistaRecargaOpc.txtNumeroTarjeta.getText(),
                                                sdfVencimiento.format(fechaVencimiento),
                                                vistaRecargaOpc.txtCVV.getText());
                                //Registrar la Tarjeta Potencial en el Cliente Potencial
                                ClientePotencial.getCuenta().setTarjeta(TarjetaPotencial);
                                
                                //modeloClientes.getArregloCliente(modeloClientes.getOc()).crearCuenta(tarjeta);   
                                Date fechaActual = new Date();
                                SimpleDateFormat sdfActual = new SimpleDateFormat("yyyy/MM/dd");
                                ClientePotencial.getCuenta().recargar(Float.parseFloat(vistaRecargaOpc.txtMontoOpcional.getText()) + 12, 
                                                                          TarjetaPotencial, sdfActual.format(fechaActual));
                                
                                //Registramos en el arrClientes al Cliente Potencial 
                                if(Configuracion.arrClientes.agregarCliente(ClientePotencial)){
                                    JOptionPane.showMessageDialog(vistaRecargaOpc, "Ustede ha sido registrado en el PEX!");
                                }
                                frmPaginaPrincipal fPrincipal = new frmPaginaPrincipal();
                                ControladorPrincipal ctrlPrincipal = new ControladorPrincipal(fPrincipal);
                                vistaRecargaOpc.dispose();
                                ctrlPrincipal.iniciar();
                                
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
                
                
                /*
                int añoVencimiento = vistaRecargaOpc.jycAñoVencimiento.getYear();
                int mesVencimiento = vistaRecargaOpc.jmcMesVencimiento.getMonth();
                SimpleDateFormat sdfVencimiento = new SimpleDateFormat("yyyy/MM/dd");
                Date fechaVencimiento = new Date(añoVencimiento, mesVencimiento, 00);
                
                //if(modeloTarjeta.verificarVigenciaTarjeta(sdfVencimiento.format(fechaVencimiento))){
                    if(modeloTarjeta.verificarValidezTajeta(vistaRecargaOpc.txtNumeroTarjeta.getText(),
                       vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString())){
                        
                        if(modeloTarjeta.verificarValidezCVV(vistaRecargaOpc.txtCVV.getText(),
                           vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString())){
                            
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
                //}*/
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