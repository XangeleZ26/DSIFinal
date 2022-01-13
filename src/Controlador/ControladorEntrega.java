package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Direccion;
import Modelo.Tarjeta;
import Modelo.Cuenta;
import Modelo.Cliente;
import Vista.frmEntrega;
import Modelo.ArregloClientes;
import javax.swing.JOptionPane;

public class ControladorEntrega{
    private Direccion modeloDireccion;
    private frmEntrega vistaEntrega;
    //private Cliente ClientePotencial;
    //Tarjeta mTarjeta = new Tarjeta();
    //Cuenta mCuenta = new Cuenta(mTarjeta);
    //private ArregloClientes modeloCliente = new ArregloClientes();
    
    public ControladorEntrega(Cliente ClientePotencial){
        //this.modeloDireccion = modeloDireccion;
        //this.vistaEntrega = new frmEntrega();
        //this.modeloCliente = modeloCliente;
        this.vistaEntrega = new frmEntrega();
        //this.ClientePotencial = ClientePotencial;
        
        this.vistaEntrega.btnSiguiente3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                if(vistaEntrega.cbxDistrito.getSelectedItem().toString().compareTo("") == 0){
                    if(datosLlenosDireccion()){
                        ClientePotencial.registrarDireccion(vistaEntrega.txtDepartamento.getText(),
                                                                 vistaEntrega.txtProvincia.getText(),
                                                                 vistaEntrega.txtDistrito.getText(),
                                                                 vistaEntrega.txtAvenida.getText(),
                                                                 Integer.parseInt(vistaEntrega.txtNumero.getText()),
                                                                 vistaEntrega.txtReferencia.getText(),
                                                                 vistaEntrega.txtTelefono.getText());
                        
                        ControladorRecargaOpc ctrlRecargaOpc = new ControladorRecargaOpc(ClientePotencial);
                        ctrlRecargaOpc.iniciarRecargaOpc();
                        vistaEntrega.dispose();
                        
                        /*modeloCliente.getArregloCliente(modeloCliente.getOc()).registrarDireccion(
                                        vistaEntrega.txtDepartamento.getText(),
                                        vistaEntrega.txtProvincia.getText(),
                                        vistaEntrega.txtDistrito.getText(),
                                        vistaEntrega.txtAvenida.getText(),
                                        Integer.parseInt(vistaEntrega.txtNumero.getText()),
                                        vistaEntrega.txtReferencia.getText(),
                                        vistaEntrega.txtTelefono.getText());*/
                        //JOptionPane.showMessageDialog(null, "Datos de entrega registrados, puede continuar con su registro.");  
                                      
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Debe llenar todos los campos, por favor.");
                    }
                }
                else{
                    if(datosLlenosDireccionLima()){
                        ClientePotencial.registrarDireccion(vistaEntrega.txtDepartamento.getText(),
                                                                 vistaEntrega.txtProvincia.getText(),
                                                                 vistaEntrega.cbxDistrito.getSelectedItem().toString(),
                                                                 vistaEntrega.txtAvenida.getText(),
                                                                 Integer.parseInt(vistaEntrega.txtNumero.getText()),
                                                                 vistaEntrega.txtReferencia.getText(),
                                                                 vistaEntrega.txtTelefono.getText());
                        
                        ControladorRecargaOpc ctrlRecargaOpc = new ControladorRecargaOpc(ClientePotencial);
                        ctrlRecargaOpc.iniciarRecargaOpc();
                        vistaEntrega.dispose();
                        
                        /*modeloCliente.getArregloCliente(modeloCliente.getOc()).registrarDireccion(
                                        vistaEntrega.txtDepartamento.getText(),
                                        vistaEntrega.txtProvincia.getText(),
                                        vistaEntrega.cbxDistrito.getSelectedItem().toString(),
                                        vistaEntrega.txtAvenida.getText(),
                                        Integer.parseInt(vistaEntrega.txtNumero.getText()),
                                        vistaEntrega.txtReferencia.getText(),
                                        vistaEntrega.txtTelefono.getText());*/
                        //JOptionPane.showMessageDialog(null, "Datos de entrega registrados, puede continuar con su registro."); 
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Debe llenar todos los campos, por favor.");
                    }
                }
                
            }
        });
        
        /*
        this.vistaEntrega.btnRegistrarDireccion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(vistaEntrega.cbxDistrito.getSelectedItem().toString().compareTo("") == 0){
                    if(datosLlenosDireccion()){
                        modeloCliente.getArregloCliente(modeloCliente.getOc()).registrarDireccion(
                                        vistaEntrega.txtDepartamento.getText(),
                                        vistaEntrega.txtProvincia.getText(),
                                        vistaEntrega.txtDistrito.getText(),
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
                    if(datosLlenosDireccionLima()){
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
            }
        });*/
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
