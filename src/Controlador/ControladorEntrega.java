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
                    if(vistaEntrega.cbxDepartamento.getSelectedItem().toString().equalsIgnoreCase("LIMA")){
                        if(vistaEntrega.cbxProvinciaLima.getSelectedItem().toString().equalsIgnoreCase("LIMA")){
                            if(datosLlenosDireccionLima()){
                                ClientePotencial.registrarDireccion(vistaEntrega.cbxDepartamento.getSelectedItem().toString(),
                                                                vistaEntrega.cbxProvinciaLima.getSelectedItem().toString(),
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
                        else{
                            if(datosLlenosProvinciaLima()){
                                ClientePotencial.registrarDireccion(vistaEntrega.cbxDepartamento.getSelectedItem().toString(),
                                                                vistaEntrega.cbxProvinciaLima.getSelectedItem().toString(),
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
                    }
                    else{
                        if(datosLlenosDireccion()){
                            ClientePotencial.registrarDireccion(vistaEntrega.cbxDepartamento.getSelectedItem().toString(),
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
            }
        });
        this.vistaEntrega.cbxDepartamento.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(vistaEntrega.cbxDepartamento.getSelectedItem().toString().trim().length() != 0){
                    if(vistaEntrega.cbxDepartamento.getSelectedIndex()>0){
                        if(vistaEntrega.cbxDepartamento.getSelectedItem().toString().equalsIgnoreCase("LIMA")){
                            vistaEntrega.cbxProvinciaLima.setVisible(true);
                            vistaEntrega.txtProvincia.setVisible(false);
                        }
                        else{
                            vistaEntrega.cbxProvinciaLima.setVisible(false);
                            vistaEntrega.txtProvincia.setVisible(true);
                            vistaEntrega.cbxDistrito.setVisible(false);
                            vistaEntrega.txtDistrito.setVisible(true);
                        }
                    }
                }
            }
        });
        this.vistaEntrega.cbxProvinciaLima.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(vistaEntrega.cbxProvinciaLima.getSelectedItem().toString().trim().length() != 0){
                    if(vistaEntrega.cbxProvinciaLima.getSelectedIndex()>0){
                        if(vistaEntrega.cbxProvinciaLima.getSelectedItem().toString().equalsIgnoreCase("LIMA")){
                            vistaEntrega.cbxDistrito.setVisible(true);
                            vistaEntrega.txtDistrito.setVisible(false);
                        }
                        else{
                            vistaEntrega.cbxDistrito.setVisible(false);
                            vistaEntrega.txtDistrito.setVisible(true);
                        }
                    }
                }
            }
        });
    }
        
    public void iniciarEntrega(){
        vistaEntrega.setTitle("Datos de Entrega");
        vistaEntrega.setLocationRelativeTo(null);
        vistaEntrega.setVisible(true);
        vistaEntrega.txtDistrito.setVisible(false);
        vistaEntrega.txtProvincia.setVisible(false);
        
        DefaultComboBoxModel departamentoComboBox = new DefaultComboBoxModel();
        for(Object o : Modelo.Configuracion.departamentosPeru){
            departamentoComboBox.addElement(o);
        }
        vistaEntrega.cbxDepartamento.setModel(departamentoComboBox);
        
        DefaultComboBoxModel provinciaComboBox = new DefaultComboBoxModel();
        for(Object o : Modelo.Configuracion.provinciasLima){
            provinciaComboBox.addElement(o);
        }
        vistaEntrega.cbxProvinciaLima.setModel(provinciaComboBox);
        
        DefaultComboBoxModel distritoComboBox = new DefaultComboBoxModel();
        for(Object o : Modelo.Configuracion.distritosLima){
            distritoComboBox.addElement(o);
        }
        vistaEntrega.cbxDistrito.setModel(distritoComboBox);
    }
    
    public void limpiarEntregaLima(){
        vistaEntrega.cbxDepartamento.setSelectedIndex(-1);
        vistaEntrega.cbxProvinciaLima.setSelectedIndex(-1);
        vistaEntrega.txtAvenida.setText(null);
        vistaEntrega.cbxDistrito.setSelectedIndex(-1);
        vistaEntrega.txtNumero.setText(null);
        vistaEntrega.txtTelefono.setText(null);
        vistaEntrega.txtReferencia.setText(null);
    }
    
    public boolean datosLlenosDireccionLima(){
        return (this.vistaEntrega.cbxDepartamento.getSelectedItem().toString().trim().length() != 0
                && this.vistaEntrega.cbxProvinciaLima.getSelectedItem().toString().trim().length() != 0
                && this.vistaEntrega.txtAvenida.getText().trim().length() != 0
                && this.vistaEntrega.cbxDistrito.getSelectedItem().toString().trim().length() != 0
                && this.vistaEntrega.txtNumero.getText().trim().length() != 0
                && this.vistaEntrega.txtTelefono.getText().trim().length() != 0
                && this.vistaEntrega.txtReferencia.getText().trim().length() != 0);
    }
    public boolean datosLlenosProvinciaLima(){
        return (this.vistaEntrega.cbxDepartamento.getSelectedItem().toString().trim().length() != 0
                && this.vistaEntrega.cbxProvinciaLima.getSelectedItem().toString().trim().length() != 0
                && this.vistaEntrega.txtAvenida.getText().trim().length() != 0
                && this.vistaEntrega.txtDistrito.getText().trim().length() != 0
                && this.vistaEntrega.txtNumero.getText().trim().length() != 0
                && this.vistaEntrega.txtTelefono.getText().trim().length() != 0
                && this.vistaEntrega.txtReferencia.getText().trim().length() != 0);
    }
    
    public boolean datosLlenosDireccion(){
        return (this.vistaEntrega.cbxDepartamento.getSelectedItem().toString().trim().length() != 0
                && this.vistaEntrega.txtProvincia.getText().trim().length() != 0
                && this.vistaEntrega.txtAvenida.getText().trim().length() != 0
                && this.vistaEntrega.txtDistrito.getText().trim().length() != 0
                && this.vistaEntrega.txtNumero.getText().trim().length() != 0
                && this.vistaEntrega.txtTelefono.getText().trim().length() != 0
                && this.vistaEntrega.txtReferencia.getText().trim().length() != 0);
    }
}