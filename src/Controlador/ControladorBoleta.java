package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import Modelo.Cliente;
import Modelo.Tarjeta;
import Vista.frmBoleta;
import Vista.frmPaginaPrincipal;

public class ControladorBoleta {

    private Cliente cliente;
    private frmBoleta vistaBoleta;
    private String monto; //Es el monto previo que se digitó para recargar/pagar y/o consumir
//    private int condicionComprobante; //1 si es Pago , 2 si es recarga , 3 para pagar peaje

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

    public void iniciarParaConsumo() {
//        Date fechaActual = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//     
        vistaBoleta.lblBoletaPago.setVisible(false);
        vistaBoleta.lblBoletaRecarga.setVisible(false);
        vistaBoleta.lblBoletaConsumo.setVisible(true);
//        vistaBoleta.txtUsuario.setText(cliente.getNombres()+ " "
//                                       +cliente.getApPaterno());
//        
//        vistaBoleta.txtNumDoc.setText(cliente.getNumDocumento());
//
//        vistaBoleta.txtMonto.setText(String.valueOf(this.monto));
//        vistaBoleta.txtFecha.setText(sdf.format(fechaActual));
//         vistaBoleta.txtRazon.setText(cliente.getRazonSocial());
        comprobarTipoUser();
        vistaBoleta.setLocationRelativeTo(null);
        vistaBoleta.setVisible(true);
    
    }

    public void iniciarParaRecarga() {
        Date fechaActual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        vistaBoleta.lblBoletaPago.setVisible(false);
        vistaBoleta.lblBoletaRecarga.setVisible(true);
        vistaBoleta.lblBoletaConsumo.setVisible(false);
        vistaBoleta.lblEstacion.setVisible(false);
        vistaBoleta.lblVehiculo.setVisible(false);
        vistaBoleta.txtEstacion.setVisible(false);
        vistaBoleta.txtVehiculo.setVisible(false);

        vistaBoleta.txtUsuario.setText(cliente.getNombres() + " "
                + cliente.getApPaterno());

        vistaBoleta.txtNumDoc.setText(cliente.getNumDocumento());

        vistaBoleta.txtMonto.setText(this.monto);
        vistaBoleta.txtFecha.setText(sdf.format(fechaActual));
        vistaBoleta.txtRazon.setText(cliente.getRazonSocial());
        comprobarTipoUser();
        vistaBoleta.setLocationRelativeTo(null);
        vistaBoleta.setVisible(true);

    }

    public void iniciarParaOpc() {
        Date fechaActual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        vistaBoleta.lblBoletaPago.setVisible(true);
        vistaBoleta.lblBoletaRecarga.setVisible(false);
        vistaBoleta.lblBoletaConsumo.setVisible(false);
        vistaBoleta.lblEstacion.setVisible(false);
        vistaBoleta.lblVehiculo.setVisible(false);
        vistaBoleta.txtEstacion.setVisible(false);
        vistaBoleta.txtVehiculo.setVisible(false);

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

    }

    public void comprobarTipoUser() {
        if (this.cliente.getTipoDocumento().equals("RUC")) {
            vistaBoleta.lblUsuario.setVisible(false);
            vistaBoleta.txtUsuario.setVisible(false);
            vistaBoleta.lblNumDoc.setVisible(false);
            vistaBoleta.txtNumDoc.setVisible(false);
        } else {
            vistaBoleta.lblRazon.setVisible(false);
            vistaBoleta.txtRazon.setVisible(false);
        }
    }

    public frmBoleta getVistaBoleta() {
        return vistaBoleta;
    }

    public void setVistaBoleta(frmBoleta vistaBoleta) {
        this.vistaBoleta = vistaBoleta;
    }

}
