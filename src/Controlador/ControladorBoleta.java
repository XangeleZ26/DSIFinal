package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import Modelo.Cliente;
import Modelo.Tarjeta;
import Vista.frmBoleta;
import Vista.frmPaginaPrincipal;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import net.sourceforge.jbarcodebean.BarcodeException;
import net.sourceforge.jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.Interleaved25;
import java.awt.Color;
import java.util.Random;

public class ControladorBoleta {

    private Cliente cliente;
    private frmBoleta vistaBoleta;
    private String monto; //Es el monto previo que se digitó para recargar/pagar y/o consumir
//    private int condicionComprobante; //1 si es Pago , 2 si es recarga , 3 para pagar peaje
    JBarcodeBean barcode = new JBarcodeBean();   
    public static BufferedImage imagen = null;
    
    public ControladorBoleta(Cliente cliente) {
        this.vistaBoleta = new frmBoleta();
        this.cliente = cliente;
        this.monto = "";
//        this.condicionComprobante=condicionComprobante;

//        this.vistaBoleta.btnOKBoleta.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
////                frmPaginaPrincipal fPrincipal = new frmPaginaPrincipal();
////                ControladorPrincipal ctrlPrincipal = new ControladorPrincipal(fPrincipal);
////                ctrlPrincipal.iniciar();
//                vistaBoleta.dispose();
//            }
//        });
    }

    public ControladorBoleta(Cliente cliente, String monto) {
        this.vistaBoleta = new frmBoleta();
        this.cliente = cliente;
        this.monto = monto;
    }

    public void iniciarParaConsumo(String peaje,String estacion,String vehiculo,String fecha) {
        vistaBoleta.lblBoletaPago.setVisible(false);
        vistaBoleta.lblBoletaRecarga.setVisible(false);
        vistaBoleta.lblBoletaConsumo.setVisible(true);
        vistaBoleta.txtUsuario.setText(cliente.getNombres()+ " "
                                       +cliente.getApPaterno());  
        vistaBoleta.txtNumDoc.setText(cliente.getNumDocumento());
        vistaBoleta.txtMonto.setText(String.valueOf(this.monto));
        vistaBoleta.txtFecha.setText(fecha);
         vistaBoleta.txtRazon.setText(cliente.getRazonSocial());
         vistaBoleta.txtEstacion.setText(estacion);
        vistaBoleta.txtVehiculo.setText(vehiculo);
        vistaBoleta.txtPeaje.setText(peaje);
        comprobarTipoUser();
        vistaBoleta.setLocationRelativeTo(null);
        vistaBoleta.setVisible(true);
        generarBarrasPeaje();
    }

    public void iniciarParaRecarga(String fecha) {
       
        vistaBoleta.lblBoletaPago.setVisible(false);
        vistaBoleta.lblBoletaRecarga.setVisible(true);
        vistaBoleta.lblBoletaConsumo.setVisible(false);
        vistaBoleta.lblEstacion.setVisible(false);
        vistaBoleta.lblPeaje.setVisible(false);
        vistaBoleta.lblVehiculo.setVisible(false);
        vistaBoleta.txtEstacion.setVisible(false);
        vistaBoleta.txtVehiculo.setVisible(false);
        vistaBoleta.txtPeaje.setVisible(false);
        vistaBoleta.txtUsuario.setText(cliente.getNombres() + " "
                + cliente.getApPaterno());

        vistaBoleta.txtNumDoc.setText(cliente.getNumDocumento());

        vistaBoleta.txtMonto.setText(this.monto);
        vistaBoleta.txtFecha.setText(fecha);
        vistaBoleta.txtRazon.setText(cliente.getRazonSocial());
        comprobarTipoUser();
        vistaBoleta.setLocationRelativeTo(null);
        vistaBoleta.setVisible(true);
        generarBarras();
    }

    public void iniciarParaOpc() {
        Date fechaActual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        vistaBoleta.lblBoletaPago.setVisible(true);
        vistaBoleta.lblBoletaRecarga.setVisible(false);
        vistaBoleta.lblBoletaConsumo.setVisible(false);
        vistaBoleta.lblEstacion.setVisible(false);
         vistaBoleta.lblPeaje.setVisible(false);
        vistaBoleta.lblVehiculo.setVisible(false);
        vistaBoleta.txtEstacion.setVisible(false);
        vistaBoleta.txtVehiculo.setVisible(false);
         vistaBoleta.txtPeaje.setVisible(false);
         
        vistaBoleta.txtUsuario.setText(cliente.getNombres() + " "
                + cliente.getApPaterno());
        vistaBoleta.txtNumDoc.setText(cliente.getNumDocumento());
        //Esto va para pagar en RecargaOPC
        vistaBoleta.txtMonto.setText(String.valueOf(cliente.getCuenta().getSaldoTotal() + 8));
        vistaBoleta.txtFecha.setText(sdf.format(fechaActual));
        vistaBoleta.txtRazon.setText(cliente.getRazonSocial());
        comprobarTipoUser();
        vistaBoleta.setLocationRelativeTo(null);
        vistaBoleta.setVisible(true);
        generarBarras();
    }

    public void comprobarTipoUser() {
        if (this.cliente.getTipoDocumento().equals("RUC")) {
            vistaBoleta.lblUsuario.setVisible(false);
            vistaBoleta.txtUsuario.setVisible(false);
            vistaBoleta.lblNumDoc.setVisible(false);
            vistaBoleta.txtNumDoc.setVisible(false);
            vistaBoleta.txtTipoComprobante.setText("Factura");
        } else {
            vistaBoleta.lblRazon.setVisible(false);
            vistaBoleta.txtRazon.setVisible(false);
            vistaBoleta.txtTipoComprobante.setText("Boleta");
        }
    }

    public frmBoleta getVistaBoleta() {
        return vistaBoleta;
    }

    public void setVistaBoleta(frmBoleta vistaBoleta) {
        this.vistaBoleta = vistaBoleta;
    }
    
    public void generarBarras(){
        int aleatorio = 0;
        Random r = new Random();
        aleatorio = (int)(r.nextInt());
        int codigoPosi = Math.abs(aleatorio);
        String codigoCadena = String.valueOf(codigoPosi);
        barcode.setCodeType(new Interleaved25());
        barcode.setCode(codigoCadena);
        barcode.setCheckDigit(true);
        barcode.setBackground(new Color(121, 127, 139));
        barcode.setBarcodeBackground(new Color(121, 127, 139));
        imagen = barcode.draw(new BufferedImage(180, 230, BufferedImage.TYPE_INT_RGB));
         
        ImageIcon barras = new ImageIcon(imagen);
        vistaBoleta.lblCodigoBarras.setIcon(barras);
    }
    
    public void generarBarrasPeaje(){
        int aleatorio = 0;
        Random r = new Random();
        aleatorio = (int)(r.nextInt());
        int codigoPosi = Math.abs(aleatorio);
        String codigoCadena = String.valueOf(codigoPosi);
        barcode.setCodeType(new Interleaved25());
        barcode.setCode(codigoCadena);
        barcode.setCheckDigit(true);
        barcode.setBackground(new Color(121, 127, 139));
        barcode.setBarcodeBackground(new Color(121, 127, 139));
        imagen = barcode.draw(new BufferedImage(160, 300, BufferedImage.TYPE_INT_RGB));
         
        ImageIcon barras = new ImageIcon(imagen);
        vistaBoleta.lblCodigoBarrasP.setIcon(barras);
    }
}
