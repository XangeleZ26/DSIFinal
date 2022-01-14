package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseEvent;
import Modelo.Direccion;
import Modelo.Tarjeta;
import Modelo.Cuenta;
import Modelo.Cliente;
import Vista.frmEntrega;
import Modelo.ArregloClientes;
import Modelo.Configuracion;
import javax.swing.JOptionPane;

public class ControladorEntrega{
    private Direccion modeloDireccion;
    private frmEntrega vistaEntrega;
    private Cliente ClientePotencial;
 
    public ControladorEntrega(Cliente ClientePotencial){
        this.vistaEntrega = new frmEntrega();
        this.ClientePotencial = ClientePotencial;
        
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
                        JOptionPane.showMessageDialog(null, "Datos de entrega registrados, puede continuar con su registro.");
                        ControladorRecargaOpc ctrlRecargaOpc = new ControladorRecargaOpc(ClientePotencial);
                        ctrlRecargaOpc.iniciarRecargaOpc();
                        vistaEntrega.dispose();
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
                        JOptionPane.showMessageDialog(null, "Datos de entrega registrados, puede continuar con su registro."); 
                        ControladorRecargaOpc ctrlRecargaOpc = new ControladorRecargaOpc(ClientePotencial);
                        ctrlRecargaOpc.iniciarRecargaOpc();
                        vistaEntrega.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Debe llenar todos los campos, por favor.");
                    }
                }
                
            }
        });
        
        this.vistaEntrega.cbxDistrito.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(vistaEntrega.txtDepartamento.getText().compareTo("Lima") == 0 && vistaEntrega.txtProvincia.getText().compareTo("Lima") == 0){
                    vistaEntrega.cbxDistrito.setVisible(true);
                    vistaEntrega.jSeparator2.setVisible(true);
                    vistaEntrega.txtDistrito.setVisible(false);
                    vistaEntrega.jSeparator7.setVisible(false);
                }
                else{
                    vistaEntrega.cbxDistrito.setVisible(false);
                    vistaEntrega.jSeparator2.setVisible(false);
                    vistaEntrega.txtDistrito.setVisible(true);
                    vistaEntrega.jSeparator7.setVisible(true);
                }
            }
        });
        
        this.vistaEntrega.txtDistrito.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(vistaEntrega.txtDepartamento.getText().compareTo("Lima") == 0 && vistaEntrega.txtProvincia.getText().compareTo("Lima") == 0){
                    vistaEntrega.cbxDistrito.setVisible(true);
                    vistaEntrega.jSeparator2.setVisible(true);
                    vistaEntrega.txtDistrito.setVisible(false);
                    vistaEntrega.jSeparator7.setVisible(false);
                }
                else{
                    vistaEntrega.cbxDistrito.setVisible(false);
                    vistaEntrega.jSeparator2.setVisible(false);
                    vistaEntrega.txtDistrito.setVisible(true);
                    vistaEntrega.jSeparator7.setVisible(true);
                }
            }
        });
        
    }
    
    public void iniciarEntrega(){
        vistaEntrega.setTitle("Datos de Entrega");
        vistaEntrega.setLocationRelativeTo(null);
        vistaEntrega.setVisible(true);
        vistaEntrega.txtDistrito.setVisible(false);
        DefaultComboBoxModel distritoComboBox = new DefaultComboBoxModel();
        for(Object o : Modelo.Configuracion.distritosLima){
            distritoComboBox.addElement(o);
        }
        vistaEntrega.cbxDistrito.setModel(distritoComboBox);
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
