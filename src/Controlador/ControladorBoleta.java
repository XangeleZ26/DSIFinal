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
    
    public ControladorBoleta(Cliente cliente){
        this.vistaBoleta = new frmBoleta();
        this.cliente = cliente;
        this.vistaBoleta.btnOKBoleta.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frmPaginaPrincipal fPrincipal = new frmPaginaPrincipal();
                ControladorPrincipal ctrlPrincipal = new ControladorPrincipal(fPrincipal);
                ctrlPrincipal.iniciar();
                vistaBoleta.dispose();
            }
        });
    }
                
    public void iniciarBoleta(){
        Date fechaActual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        vistaBoleta.lblBoletaPago.setVisible(true);
        vistaBoleta.lblBoletaRecarga.setVisible(false);
        vistaBoleta.lblBoletaConsumo.setVisible(false);
        vistaBoleta.lblEstacion.setVisible(false);
        vistaBoleta.lblVehiculo.setVisible(false);
        vistaBoleta.txtEstacion.setVisible(false);
        vistaBoleta.txtVehiculo.setVisible(false);
        vistaBoleta.txtUsuario.setText(cliente.getNombres()+ " "
                                       +cliente.getApPaterno()+ " "
                                       +cliente.getApMaterno());
        vistaBoleta.txtNumDoc.setText(cliente.getNumDocumento());
        vistaBoleta.txtMonto.setText(String.valueOf(cliente.getCuenta().getSaldoTotal()+8));
        vistaBoleta.txtFecha.setText(sdf.format(fechaActual));
        vistaBoleta.setLocationRelativeTo(null);
        vistaBoleta.setVisible(true);
    }
}
