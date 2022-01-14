package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import Modelo.Cliente;
import Modelo.Configuracion;
import Modelo.ArregloClientes; 
import Vista.frmCliente;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
 
public class ControladorCliente{
    private frmCliente vistaCliente;
    private Cliente ClientePotencial; 
    
    /*En este atributo se guardarán los datos del cliente que 
    posiblemente se registre. El registro se realizará en la clase Controlador Recarga Opcional*/
    public ControladorCliente(){
        this.vistaCliente = new frmCliente();
        this.ClientePotencial = new Cliente();
        
        this.vistaCliente.btnOpcionRUC.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               ControladorRUC ctrlRUC = new ControladorRUC(ClientePotencial); //Se coloca como argumento al ClientePotencial
               ctrlRUC.iniciarRUC();
               vistaCliente.dispose(); 
           }
        });
        
        this.vistaCliente.btnSiguiente1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(datosLlenosCliente()){                  
                    if(!Configuracion.arrClientes.verificarExistenciaCliente(
                    vistaCliente.cbxTipoDocumento.getSelectedItem().toString(),
                    vistaCliente.txtNumeroDocumento.getText())){
                        if(!Configuracion.arrClientes.verificarExistenciaCorreo(vistaCliente.txtEmail.getText())){
                            String contra = String.valueOf(vistaCliente.txtContrasena.getPassword());
                            String contraVerif = String.valueOf(vistaCliente.txtVerifContrasena.getPassword());    
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            if(contra != null && contraVerif !=null){
                                if(contra.compareTo(contraVerif) == 0){
                                    ClientePotencial = new Cliente(
                                                    vistaCliente.cbxTipoDocumento.getSelectedItem().toString(),
                                                    vistaCliente.txtNumeroDocumento.getText(),
                                                    vistaCliente.txtNombres.getText(),
                                                    vistaCliente.txtApPaterno.getText(),
                                                    vistaCliente.txtApMaterno.getText(),
                                                    vistaCliente.cbxSexo.getSelectedItem().toString(),
                                                    sdf.format(vistaCliente.dcFechaNacimiento.getDate()),
                                                    vistaCliente.txtEmail.getText(),
                                                    vistaCliente.txtContrasena.getPassword().toString());
                                    //esta agregacion es solo de prueba
                                    Configuracion.arrClientes.agregarCliente(ClientePotencial);
                                    JOptionPane.showMessageDialog(vistaCliente, "Datos del cliente registrados, puede continuar con su registro.");
                                                    ControladorRegistroVehiculo ctrlRegistroVehiculo = new ControladorRegistroVehiculo(ClientePotencial);
                                                    ctrlRegistroVehiculo.iniciarVehiculo();
                                                    vistaCliente.dispose(); 
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Verificación de contraseña incorrecta.");
                                }
                            }
                            else{
                                ClientePotencial = new Cliente(
                                                vistaCliente.cbxTipoDocumento.getSelectedItem().toString(),
                                                vistaCliente.txtNumeroDocumento.getText(),
                                                vistaCliente.txtNombres.getText(),
                                                vistaCliente.txtApPaterno.getText(),
                                                vistaCliente.txtApMaterno.getText(),
                                                vistaCliente.cbxSexo.getSelectedItem().toString(),
                                                sdf.format(vistaCliente.dcFechaNacimiento.getDate()),
                                                vistaCliente.txtEmail.getText(),
                                                vistaCliente.txtNumeroDocumento.getText());
                                //esta agregacion es solo de prueba
                                Configuracion.arrClientes.agregarCliente(ClientePotencial);
                                    JOptionPane.showMessageDialog(vistaCliente, "Datos del cliente registrados, puede continuar con su registro.");        
                                                ControladorRegistroVehiculo ctrlRegistroVehiculo = new ControladorRegistroVehiculo(ClientePotencial);
                                                ctrlRegistroVehiculo.iniciarVehiculo();
                                                vistaCliente.dispose(); 
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(vistaCliente, "Correo ya registrado. Ingrese otra dirección de correo.");
                            vistaCliente.txtEmail.setText(null);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(vistaCliente, "Cliente ya registrado. Ingrese nuevos datos.");
                        limpiarDatosCliente();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos, por favor.");
                }   
           }
        });
        
        this.vistaCliente.lblOjoCerrado1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                vistaCliente.lblOjoAbierto1.setVisible(true);
                vistaCliente.lblOjoCerrado1.setVisible(false);
                vistaCliente.txtContrasena.setEchoChar('•');
            }
        });
        
        this.vistaCliente.lblOjoAbierto1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                vistaCliente.lblOjoAbierto1.setVisible(false);
                vistaCliente.lblOjoCerrado1.setVisible(true);
                vistaCliente.txtContrasena.setEchoChar((char) 0);
            }
        });
        
        this.vistaCliente.lblOjoCerrado2.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                vistaCliente.lblOjoAbierto2.setVisible(true);
                vistaCliente.lblOjoCerrado2.setVisible(false);
                vistaCliente.txtVerifContrasena.setEchoChar('•');
            }
        });
        
        this.vistaCliente.lblOjoAbierto2.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                vistaCliente.lblOjoAbierto2.setVisible(false);
                vistaCliente.lblOjoCerrado2.setVisible(true);
                vistaCliente.txtVerifContrasena.setEchoChar((char) 0);
            }
        });
    }
    
    public void iniciarCliente(){
        vistaCliente.setTitle("Datos Cliente");
        vistaCliente.lblOjoCerrado1.setVisible(false);
        vistaCliente.lblOjoCerrado2.setVisible(false);
        vistaCliente.setLocationRelativeTo(null);
        vistaCliente.setVisible(true);
        
        DefaultComboBoxModel tipoDocComboBox = new DefaultComboBoxModel();
        for(Object o : Modelo.Configuracion.tipoDocumentos){
            tipoDocComboBox.addElement(o);
        }
        vistaCliente.cbxTipoDocumento.setModel(tipoDocComboBox);
        
        DefaultComboBoxModel sexoComboBox = new DefaultComboBoxModel();
        for(Object o : Modelo.Configuracion.sexo){
            sexoComboBox.addElement(o);
        }
        vistaCliente.cbxSexo.setModel(sexoComboBox);
        
    }
    
    public void limpiarDatosCliente(){
        vistaCliente.cbxTipoDocumento.setSelectedIndex(-1);
        vistaCliente.txtNumeroDocumento.setText(null);
        vistaCliente.txtNombres.setText(null);
        vistaCliente.txtApPaterno.setText(null);
        vistaCliente.txtApMaterno.setText(null);
        vistaCliente.cbxSexo.setSelectedIndex(-1);
        vistaCliente.txtEmail.setText(null);
        vistaCliente.dcFechaNacimiento.setDate(null); 
    }
    
    public boolean datosLlenosCliente(){
        return (this.vistaCliente.cbxTipoDocumento.getSelectedItem().toString().trim().length() != 0
                && this.vistaCliente.txtNumeroDocumento.getText().trim().length() != 0
                && this.vistaCliente.txtNombres.getText().trim().length() != 0
                && this.vistaCliente.txtApPaterno.getText().trim().length() != 0
                && this.vistaCliente.txtApMaterno.getText().trim().length() != 0
                && this.vistaCliente.cbxSexo.getSelectedItem().toString().trim().length() != 0
                && this.vistaCliente.dcFechaNacimiento.getDate() != null
                && this.vistaCliente.txtEmail.getText().trim().length() != 0);
    }  
}

