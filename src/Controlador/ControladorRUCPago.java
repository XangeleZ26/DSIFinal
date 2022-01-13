package Controlador;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.frmRUCPago;
import Modelo.Tarjeta;
import Modelo.Cuenta;
import Modelo.Cliente;
import Modelo.ArregloClientes;

public class ControladorRUCPago {
    private frmRUCPago vistaRUCPago;
    //Tarjeta mTarjeta = new Tarjeta();
    //Cuenta mCuenta = new Cuenta(mTarjeta);
    //private ArregloClientes modeloClientes = new ArregloClientes(); 
    //private Cliente user;
    
    /*
    //public ControladorRUCPago(Cliente user){
    public ControladorRUCPago(Cliente ClientePotencial){
        this.vistaRUCPago = new frmRUCPago();
        //this.user = user;
        //this.indiceCliente = indiceCliente;
        this.vistaRUCPago.btnVolverRecargaOpc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ControladorRecargaOpc ctrlRecargaOpc = new ControladorRecargaOpc(ClientePotencial);
                ctrlRecargaOpc.iniciarRecargaOpc();
                vistaRUCPago.dispose();
            }
        });
        
        this.vistaRUCPago.btnOK.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(datosLlenosRUCPago()){
                    if(user.verificarValidezRUC(vistaRUCPago.txtRUC.getText())){
                        ControladorRecargaOpc ctrlRecargaOpc = new ControladorRecargaOpc(ClientePotencial);
                        ctrlRecargaOpc.iniciarRecargaOpc();
                        vistaRUCPago.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(vistaRUCPago, "RUC inválido, digite nuevamente.");
                        vistaRUCPago.txtRUC.setText(null);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos, por favor.");
                }
            }
        });
    }
    */
    public void iniciarRUCPago(){
        vistaRUCPago.setTitle("Datos RUC");
        vistaRUCPago.setLocationRelativeTo(null);
        vistaRUCPago.setVisible(true);
    }
    
    public boolean datosLlenosRUCPago(){
        return (this.vistaRUCPago.txtRUC.getText().trim().length() != 0
                && this.vistaRUCPago.txtRazonSocial.getText().trim().length() != 0);
    }
}
