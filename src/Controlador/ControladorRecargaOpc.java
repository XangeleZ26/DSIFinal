
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Modelo.Cuenta;
import Modelo.Cliente;
import Modelo.Tarjeta;
import Modelo.Configuracion;
import Modelo.ArregloClientes;
import Vista.frmRecargaOpcional;
import Vista.frmPaginaPrincipal;
import Vista.frmBoleta;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Color;

public class ControladorRecargaOpc{
    private Tarjeta TarjetaPotencial;
    private frmRecargaOpcional vistaRecargaOpc;
    private Cliente ClientePotencial;
    private int verificarBtnCalcular = 0;
    //private ArregloClientes clientes;
    
    public ControladorRecargaOpc(Cliente ClientePotencial){
        //this.modeloCuenta = modeloCuenta;
        //this.modeloTarjeta = modeloTarjeta;
        this.vistaRecargaOpc = new frmRecargaOpcional();
        this.ClientePotencial = ClientePotencial;
        //this.clientes = Configuracion.arrClientes;
        this.vistaRecargaOpc.btnCalcular.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                vistaRecargaOpc.btnCalcular.setBackground(new Color(64,103,105));    
                verificarBtnCalcular = 1;
            }
        });
        
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
        /*PUEDE FALLAR DEBIDO A QUE LA TARJETA POTENCIAL AÚN NO SE HA INICIALIZADO
        REVISAR LA VALIDEZ DE LA FECHA DE VENCIMIENTO ANTES DE REGISTRAR UNA TARJETA*/
        this.vistaRecargaOpc.btnFinalizar.addActionListener(new ActionListener(){ //HACER REGISTRO DEL CLIENTE AQUÍ
            @Override 
            public void actionPerformed(ActionEvent e){
                if(verificarBtnCalcular != 0){
                    if(datosLlenosRecargaOpc()){
                        int añoVencimiento = vistaRecargaOpc.jycAñoVencimiento.getYear();
                        int mesVencimiento = vistaRecargaOpc.jmcMesVencimiento.getMonth();
                        SimpleDateFormat sdfVencimiento = new SimpleDateFormat("yyyy/MM/dd");
                        Date fechaVencimiento = new Date(añoVencimiento, mesVencimiento, 00);
                        TarjetaPotencial = new Tarjeta(
                                               vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString(),
                                               vistaRecargaOpc.txtNumeroTarjeta.getText(),
                                               sdfVencimiento.format(fechaVencimiento),
                                               vistaRecargaOpc.txtCVV.getText());
                            if(TarjetaPotencial.verificarVigenciaTarjeta(sdfVencimiento.format(fechaVencimiento))){
                                if(TarjetaPotencial.verificarValidezTajeta(vistaRecargaOpc.txtNumeroTarjeta.getText(),
                                   vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString())){        
                                    if(TarjetaPotencial.verificarValidezCVV(vistaRecargaOpc.txtCVV.getText(),
                                       vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString())){                                
                                        
                                        //Registrar la Tarjeta Potencial en el Cliente Potencial
                                        ClientePotencial.getCuenta().setTarjeta(TarjetaPotencial);

                                        Date fechaActual = new Date();
                                        SimpleDateFormat sdfActual = new SimpleDateFormat("yyyy/MM/dd");
                                        ClientePotencial.getCuenta().recargar(Float.parseFloat(vistaRecargaOpc.txtMontoOpcional.getText()) + 12, 
                                                                                  TarjetaPotencial, sdfActual.format(fechaActual));
                                     
                                        if(Configuracion.arrClientes.agregarCliente(ClientePotencial)){
                                            JOptionPane.showMessageDialog(vistaRecargaOpc, "Usted ha sido registrado en el PEX!");
                                            Configuracion.getArrClientes().mostrarClientes();
                                            
                                            ControladorBoleta ctrlBoleta = new ControladorBoleta(ClientePotencial);
                                            ctrlBoleta.iniciarBoleta();
                                            vistaRecargaOpc.dispose();
                                            //frmPaginaPrincipal fPrincipal = new frmPaginaPrincipal();
                                            //ControladorPrincipal ctrlPrincipal = new ControladorPrincipal(fPrincipal);
                                            //ctrlPrincipal.iniciar();
                                            //vistaRecargaOpc.dispose();
                                        }
                                        else{
                                            JOptionPane.showMessageDialog(vistaRecargaOpc, "Registro no procesado.");
                                        }

                                    }
                                    else{
                                        JOptionPane.showMessageDialog(vistaRecargaOpc, "CVV no válido. Digite nuevamente.");
                                        vistaRecargaOpc.txtCVV.setText(null);
                                    }
                                }
                                else{
                                    JOptionPane.showMessageDialog(vistaRecargaOpc, "Número de tarjeta no válida. Digite nuevamente.");  
                                    vistaRecargaOpc.txtNumeroTarjeta.setText(null);
                                }
                            }  
                            else{
                                JOptionPane.showMessageDialog(vistaRecargaOpc, "Tarjeta caducada. Ingrese otra tarjeta.");  
                                limpiarDatosTarjeta();
                            }
                        }  
                    else{
                        JOptionPane.showMessageDialog(vistaRecargaOpc, "Debe rellenar todos los campos, por favor.");  
                    }
                }
                else{
                        JOptionPane.showMessageDialog(vistaRecargaOpc, "Aún no calcula em monto final!");  
                }    
            }
        });
        
    }
    
    public void iniciarRecargaOpc(){
        vistaRecargaOpc.setTitle("Recarga Opcional");
        vistaRecargaOpc.setLocationRelativeTo(null);
        vistaRecargaOpc.setVisible(true);
        if(ClientePotencial.getTipoDocumento().compareTo("RUC")==0){
            vistaRecargaOpc.btnFactura.setVisible(true);
            vistaRecargaOpc.btnBoleta.setVisible(false);
        }
        else{
            vistaRecargaOpc.btnFactura.setVisible(false);
            vistaRecargaOpc.btnBoleta.setVisible(true);
        }
        DefaultComboBoxModel medioPagoComboBox = new DefaultComboBoxModel();
        for(Object o : Modelo.Configuracion.medioPago){
            medioPagoComboBox.addElement(o);
        }
        vistaRecargaOpc.cbxMedioPago.setModel(medioPagoComboBox);
    }
    
    public void limpiarDatosTarjeta(){
        vistaRecargaOpc.cbxMedioPago.setSelectedIndex(-1);
        vistaRecargaOpc.txtNumeroTarjeta.setText(null);
        vistaRecargaOpc.jycAñoVencimiento.setYear(-1);
        vistaRecargaOpc.jmcMesVencimiento.setMonth(-1);
        vistaRecargaOpc.txtCVV.setText(null);    
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
                //&& this.vistaRecargaOpc.jycAñoVencimiento.getYear() != 0
                //&& this.vistaRecargaOpc.jmcMesVencimiento.getMonth() != 0
                && this.vistaRecargaOpc.txtCVV.getText().trim().length() != 0);
    }
}