package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorRecargaOpc {
    //MODIFICACION DE XAVIER
    
    private Tarjeta TarjetaPotencial;
    private frmRecargaOpcional vistaRecargaOpc;
    private Cliente ClientePotencial;
    private int verificarBtnCalcular = 0;
//    private int condicionComprobante; //1 si es Pago Inicial , 2 si es recarga , 3 para pagar peaje
    //private ArregloClientes clientes;

    public ControladorRecargaOpc(Cliente ClientePotencial) {
        //this.modeloCuenta = modeloCuenta;
        //this.modeloTarjeta = modeloTarjeta;
        this.vistaRecargaOpc = new frmRecargaOpcional();
        this.ClientePotencial = ClientePotencial;
//        this.condicionComprobante = 0;

        //this.clientes = Configuracion.arrClientes;
        this.vistaRecargaOpc.btnCalcular.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vistaRecargaOpc.btnCalcular.setBackground(new Color(64, 103, 105));
                verificarBtnCalcular = 1;
            }
        });

        this.vistaRecargaOpc.btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float total = 20;
                if (vistaRecargaOpc.txtMontoOpcional.getText().equals("")) {
                    vistaRecargaOpc.txtMontoRecarga.setText("0");
                    vistaRecargaOpc.txtTotal.setText(String.valueOf(total));
                } else {
                    vistaRecargaOpc.txtMontoRecarga.setText(vistaRecargaOpc.txtMontoOpcional.getText());
                    total += Float.parseFloat(vistaRecargaOpc.txtMontoRecarga.getText());
                    vistaRecargaOpc.txtTotal.setText(String.valueOf(total));
                }
            }
        });
        this.vistaRecargaOpc.btnAtras.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ControladorEntrega ctrlEntrega = new ControladorEntrega(ClientePotencial);
                ctrlEntrega.iniciarEntrega();
                vistaRecargaOpc.dispose(); 
            }
        });
        
        this.vistaRecargaOpc.btnFinalizar.addActionListener(new ActionListener() { //HACER REGISTRO DEL CLIENTE AQUÍ
            @Override
            public void actionPerformed(ActionEvent e) {
                if (verificarBtnCalcular != 0) {
                    if (datosLlenosRecargaOpc()) {
                        int añoVencimiento = vistaRecargaOpc.jycAñoVencimiento.getYear();
                        int mesVencimiento = vistaRecargaOpc.jmcMesVencimiento.getMonth();
                        SimpleDateFormat sdfVencimiento = new SimpleDateFormat("MM/yyyy");
                        Date fechaVencimiento = new Date(añoVencimiento, mesVencimiento, 00);
                        sdfVencimiento.format(fechaVencimiento);
                           
                        TarjetaPotencial = new Tarjeta(
                                vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString(),
                                vistaRecargaOpc.txtNumeroTarjeta.getText(),
                                sdfVencimiento.format(fechaVencimiento),
                                vistaRecargaOpc.txtCVV.getText());
                        if (verificarVigenciaTarjeta()) {
                            if (TarjetaPotencial.verificarValidezTajeta(vistaRecargaOpc.txtNumeroTarjeta.getText(),
                                    vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString())) {
                                if (TarjetaPotencial.verificarValidezCVV(vistaRecargaOpc.txtCVV.getText(),
                                        vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString())) {

                                    //Registrar la Tarjeta Potencial en el Cliente Potencial
                                    ClientePotencial.getCuenta().setTarjeta(TarjetaPotencial);

                                    Date fechaActual = new Date();
                                    SimpleDateFormat sdfActual = new SimpleDateFormat("dd/MM/yyyy");
                                    ClientePotencial.getCuenta().recargar(Float.parseFloat(vistaRecargaOpc.txtMontoOpcional.getText()),
                                            TarjetaPotencial, sdfActual.format(fechaActual));
                                            //se registra al cliente
//                                               try {
//                                            ArregloClientes extra=(ArregloClientes)Configuracion.serial.deserializar("archivoUser.txt");
//                                           Configuracion.arrClientes=extra;
//                                        } catch (Exception ex) {
//                                             System.out.println("archivo vacio, primer guardado y/o archivo inexistente");
//                                        }
                                                
                                    if (Configuracion.arrClientes.agregarCliente(ClientePotencial)) {
                                        
                   
                                        try {
                                            Configuracion.serial.serializar("archivoUser.txt",Configuracion.arrClientes);
                                            JOptionPane.showMessageDialog(vistaRecargaOpc, "Usted ha sido registrado en el PEX!");
                                        } catch (Exception ex) {
                                            JOptionPane.showMessageDialog(null,"Fallo en el guardado de archivo");
                                        }
                                        
                                 
                                        Configuracion.getArrClientes().mostrarClientes();
                                        ControladorBoleta ctrlComprobante = new ControladorBoleta(ClientePotencial);
                                        ctrlComprobante.iniciarParaOpc();

                                        //PARA CERRAR COMPROBANTE
                                        ctrlComprobante.getVistaBoleta().btnOKBoleta.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                frmPaginaPrincipal fPrincipal = new frmPaginaPrincipal();
                                                ControladorPrincipal ctrlPrincipal = new ControladorPrincipal(fPrincipal);
                                                ctrlPrincipal.iniciar();
                                                ctrlComprobante.getVistaBoleta().dispose();
                                                vistaRecargaOpc.dispose();
                                            }
                                        });
                                    } else {
                                        JOptionPane.showMessageDialog(vistaRecargaOpc, "Registro no procesado.");
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(vistaRecargaOpc, "CVV no válido. Digite nuevamente.");
                                    vistaRecargaOpc.txtCVV.setText(null);
                                }
                            } else {
                                JOptionPane.showMessageDialog(vistaRecargaOpc, "Número de tarjeta no válida. Digite nuevamente.");
                                vistaRecargaOpc.txtNumeroTarjeta.setText(null);
                            }
                        } else {
                            JOptionPane.showMessageDialog(vistaRecargaOpc, "Tarjeta caducada. Ingrese otra tarjeta.");
                            limpiarDatosTarjeta();
                        }
                    } else {
                        JOptionPane.showMessageDialog(vistaRecargaOpc, "Debe rellenar todos los campos, por favor.");
                    }
                } else {
                    JOptionPane.showMessageDialog(vistaRecargaOpc, "Aún no calcula em monto final!");
                }
            }
        });
        this.vistaRecargaOpc.txtMontoOpcional.addKeyListener(new KeyAdapter(){
           @Override
           public void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
                if(((c<'0')||(c>'9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.' || vistaRecargaOpc.txtMontoOpcional.getText().contains("."))){
                    e.consume();
                }   
           }
        });
        this.vistaRecargaOpc.txtNumeroTarjeta.addKeyListener(new KeyAdapter(){
           @Override
           public void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
               if(c<'0' || c>'9') e.consume();
           }
        });
        this.vistaRecargaOpc.txtCVV.addKeyListener(new KeyAdapter(){
           @Override
           public void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
               if(c<'0' || c>'9') e.consume();
           }
        });
    }
    
    public boolean verificarVigenciaTarjeta() {
        boolean result = false;
        int mesTarjet=vistaRecargaOpc.jmcMesVencimiento.getMonth(); 
        int anioTarjet=vistaRecargaOpc.jycAñoVencimiento.getYear();
        Date fechaActual = new Date();
        SimpleDateFormat fechaMesActual = new SimpleDateFormat("MM");
        SimpleDateFormat fechaAnioActual=new SimpleDateFormat("yyyy");
        int mesActual=((Integer.parseInt(fechaMesActual.format(fechaActual)))-1);
        int anioActual=Integer.parseInt(fechaAnioActual.format(fechaActual));
        
        if (anioTarjet==anioActual) {
            if(mesTarjet>mesActual){
                result=true;
            }
            if(mesTarjet<=mesActual){
                result=false;
            }
        }else{
            if(anioTarjet>anioActual){
                    result=true; 
            }
            if(anioTarjet<anioActual){
                result=false;
            }
        }

        return result;
    }
    
    public void iniciarRecargaOpc() {
        vistaRecargaOpc.setTitle("Recarga Opcional");
        vistaRecargaOpc.setLocationRelativeTo(null);
        vistaRecargaOpc.setVisible(true);
        if (ClientePotencial.getTipoDocumento().compareTo("RUC") == 0) {
            vistaRecargaOpc.btnFactura.setVisible(true);
            vistaRecargaOpc.btnBoleta.setVisible(false);
        } else {
            vistaRecargaOpc.btnFactura.setVisible(false);
            vistaRecargaOpc.btnBoleta.setVisible(true);
        }
        DefaultComboBoxModel medioPagoComboBox = new DefaultComboBoxModel();
        for (Object o : Modelo.Configuracion.medioPago) {
            medioPagoComboBox.addElement(o);
        }
        vistaRecargaOpc.cbxMedioPago.setModel(medioPagoComboBox);
    }

    public void limpiarDatosTarjeta() {
        vistaRecargaOpc.cbxMedioPago.setSelectedIndex(-1);
        vistaRecargaOpc.txtNumeroTarjeta.setText(null);
        vistaRecargaOpc.txtCVV.setText(null);
        vistaRecargaOpc.jmcMesVencimiento.setMonth(-1);;
    }

    public void limpiarRecargaOpc() {
        vistaRecargaOpc.txtCVV.setText(null);
        vistaRecargaOpc.cbxMedioPago.setSelectedIndex(-1);
        vistaRecargaOpc.txtNumeroTarjeta.setText(null);
        vistaRecargaOpc.txtMontoRecarga.setText(null);
        vistaRecargaOpc.txtTotal.setText(null);
        vistaRecargaOpc.txtCVV.setText(null);
        vistaRecargaOpc.jycAñoVencimiento.setYear(-1);
        vistaRecargaOpc.jmcMesVencimiento.setMonth(-1);;
    }

    public boolean datosLlenosRecargaOpc() {
        return (this.vistaRecargaOpc.cbxMedioPago.getSelectedItem().toString().trim().length() != 0
                && this.vistaRecargaOpc.txtNumeroTarjeta.getText().trim().length() != 0
                && this.vistaRecargaOpc.txtTotal.getText().trim().length() != 0
                && this.vistaRecargaOpc.txtCVV.getText().trim().length() != 0);
    }
}
