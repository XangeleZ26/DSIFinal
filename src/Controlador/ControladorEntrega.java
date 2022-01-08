package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Direccion;
import Modelo.Tarjeta;
import Modelo.Cuenta;
import Vista.frmEntrega;
import Modelo.ArregloClientes;
import javax.swing.JOptionPane;

public class ControladorEntrega{
    private Direccion modeloDireccion;
    private frmEntrega vistaEntrega;
    Tarjeta mTarjeta = new Tarjeta();
    Cuenta mCuenta = new Cuenta(mTarjeta);
    private ArregloClientes modeloCliente = new ArregloClientes();
    
    public ControladorEntrega(ArregloClientes modeloCliente){
        this.modeloDireccion = modeloDireccion;
        this.vistaEntrega = vistaEntrega;
        this.modeloCliente = modeloCliente;
        this.vistaEntrega = new frmEntrega();
        this.vistaEntrega.btnSiguiente3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ControladorRecargaOpc ctrlRecargaOpc = new ControladorRecargaOpc(mCuenta, mTarjeta);
                ctrlRecargaOpc.iniciarRecargaOpc();
                vistaEntrega.dispose();
            }
        });
        
        this.vistaEntrega.btnRegistrarDireccion.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               if(vistaEntrega.cbxDistrito.getSelectedItem().toString() != null){
                   if( datosLlenosDireccionLima()){
                        modeloCliente.getArregloCliente(modeloCliente.getOc()).registrarDireccion(
                                        vistaEntrega.txtDepartamento.getText(),
                                        vistaEntrega.txtProvincia.getText(),
                                        vistaEntrega.cbxDistrito.getSelectedItem().toString(),
                                        vistaEntrega.txtAvenida.getText(),
                                        Integer.parseInt(vistaEntrega.txtNumero.getText()),
                                        vistaEntrega.txtReferencia.getText(),
                                        vistaEntrega.txtTelefono.getText());
                        JOptionPane.showMessageDialog(null, "Datos de entrega registrados, puede continuar con su registro.");                
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "Debe llenar todos los campos, por favor.");
                   }
               }
               else{
                   if(datosLlenosDireccion()){
                       modeloCliente.getArregloCliente(modeloCliente.getOc()).registrarDireccion(
                                        vistaEntrega.txtDepartamento.getText(),
                                        vistaEntrega.txtProvincia.getText(),
                                        vistaEntrega.txtDistrito.getText(),
                                        vistaEntrega.txtAvenida.getText(),
                                        Integer.parseInt(vistaEntrega.txtNumero.getText()),
                                        vistaEntrega.txtReferencia.getText(),
                                        vistaEntrega.txtTelefono.getText());
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "Debe llenar todos los campos, por favor.");
                   }
               }
           }
        });
    }
    
    public void iniciarEntrega(){
        vistaEntrega.setTitle("Datos de Entrega");
        vistaEntrega.setLocationRelativeTo(null);
        vistaEntrega.setVisible(true);
    }
    
    public void limpiarEntregaLima(){
        vistaEntrega.txtDepartamento.setText(null);
        vistaEntrega.txtProvincia.setText(null);
        vistaEntrega.txtAvenida.setText(null);
        vistaEntrega.cbxDistrito.setSelectedIndex(-1);
        vistaEntrega.txtNumero.setText(null);
        vistaEntrega.txtTelefono.setText(null);
        vistaEntrega.txtReferencia.setText(null);
    }
    
    public boolean datosLlenosDireccionLima(){
        return (this.vistaEntrega.txtDepartamento.getText().trim().length() != 0
                && this.vistaEntrega.txtProvincia.getText().trim().length() != 0
                && this.vistaEntrega.txtAvenida.getText().trim().length() != 0
                && this.vistaEntrega.cbxDistrito.getSelectedItem().toString().trim().length() != 0
                && this.vistaEntrega.txtNumero.getText().trim().length() != 0
                && this.vistaEntrega.txtTelefono.getText().trim().length() != 0
                && this.vistaEntrega.txtReferencia.getText().trim().length() != 0);
    }
    
    public boolean datosLlenosDireccion(){
        return (this.vistaEntrega.txtDepartamento.getText().trim().length() != 0
                && this.vistaEntrega.txtProvincia.getText().trim().length() != 0
                && this.vistaEntrega.txtAvenida.getText().trim().length() != 0
                && this.vistaEntrega.txtDistrito.getText().trim().length() != 0
                && this.vistaEntrega.txtNumero.getText().trim().length() != 0
                && this.vistaEntrega.txtTelefono.getText().trim().length() != 0
                && this.vistaEntrega.txtReferencia.getText().trim().length() != 0);
    }
}
