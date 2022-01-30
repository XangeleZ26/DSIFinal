package Controlador;

import Modelo.Cliente;
import Modelo.Configuracion;
import Vista.frmRecarga;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class ControladorRecarga {

    private frmRecarga vista;
    private Cliente user;
//    private int condicionComprobante; //1 si es Pago inicial, 2 si es recarga , 3 para pagar peaje

    public ControladorRecarga(Cliente user) {
        this.vista = new frmRecarga();
        this.user = user;
//        this.condicionComprobante = 0;
        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(user);
                ctrlOpcionesIngreso.iniciar();
                vista.dispose();
            }
        });

        this.vista.btnPagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isValido()) {

                    if (vista.txtCVV.getText().equals(user.getCuenta().getTarjeta().getCvv())) {
                        try{
                            if (Float.parseFloat(vista.txtMonto.getText()) > 0) {
                                SimpleDateFormat sdfPago = new SimpleDateFormat("dd/MM/yyyy"); //doy formato
                                String fechaPago = sdfPago.format(vista.dcFechaPago.getDate()); //indico a q cosa quiero dar formato y lo almaceno

                                //Aún no se contempla el "boleta y factura" en el codigo. Esperando acuerdo grupal xd
                                /*switch(vista.getOpcionComprobante()){
                                    case 1: user.getCuenta().recargar(Float.parseFloat(vista.txtMonto.getText()),vista.txtCVV.getText(),fechaPago);
                                    case 2: user.getCuenta().recargar(Float.parseFloat(vista.txtMonto.getText()),vista.txtCVV.getText(),fechaPago);
                                }*/
                                user.getCuenta().recargar(Float.parseFloat(vista.txtMonto.getText()), vista.txtCVV.getText(), fechaPago);
                                user.getCuenta().getMovimientos().mostrarMovimientos();

                                try {
                                    Configuracion.serial.serializar("archivoUser.txt", Configuracion.arrClientes);
                                    JOptionPane.showMessageDialog(null, "Recarga realizada con éxito.");
                                } catch (Exception ex) {
                                    JOptionPane.showMessageDialog(null, "Fallo en el guardado de archivo");
                                }



    //                            condicionComprobante = 2;
                                //PARA MOSTRAR COMPROBANTE
                                ControladorBoleta comprobante = new ControladorBoleta(user, vista.txtMonto.getText());
                                comprobante.iniciarParaRecarga(fechaPago);
    //                            vista.dispose();

                                //PARA CERRAR COMPROBANTE
                                comprobante.getVistaBoleta().btnOKBoleta.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(user);
                                        ctrlOpcionesIngreso.iniciar();
                                        comprobante.getVistaBoleta().dispose();
                                        vista.dispose();
                                    }
                                });

                            } else {
                                JOptionPane.showMessageDialog(null, "No puede recargar un monto negativo!");
                            }
                        }catch(NumberFormatException a){
                            JOptionPane.showMessageDialog(null, "Solo se permiten números!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "CVV incorrecto!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos!");
                }
            }
        });
        
        this.vista.txtMonto.addKeyListener(new KeyAdapter(){
           @Override
           public void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
                if(((c<'0')||(c>'9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.' || vista.txtMonto.getText().contains("."))){
                    e.consume();
                }  
           }
        });
        
        this.vista.txtCVV.addKeyListener(new KeyAdapter(){
           @Override
           public void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
               if(c<'0' || c>'9') e.consume();
           }
        });
    }

    private boolean isValido() {
        return (this.vista.txtCVV.getText().trim().length() != 0
                && this.vista.dcFechaPago.getDate() != null
                && this.vista.txtMonto.getText().trim().length() != 0);
    }

    public void iniciar() {
        if (!user.getTipoDocumento().equals("RUC")) {
            vista.medioPago.setText("Boleta");
        } else {
            vista.medioPago.setText("Factura");
        }

        vista.lblTarjeta.setText(user.getCuenta().getTarjeta().getMedioPago());
        vista.lblNumberT.setText(user.getCuenta().getTarjeta().getNumTarjeta());
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
