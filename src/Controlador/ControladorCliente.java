package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import Modelo.Cliente;
import Modelo.Configuracion;
import Modelo.ArregloClientes; 
import Vista.frmCliente;
import Vista.frmPaginaPrincipal;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class ControladorCliente{
    private frmCliente vistaCliente;
    private Cliente ClientePotencial; 
    frmPaginaPrincipal fPrincipal = new frmPaginaPrincipal();
    
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
                        
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
                        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                                          + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
                        Matcher mather = pattern.matcher(vistaCliente.txtEmail.getText());
                        
                        if(mather.find() == true){ //Validación del Email    
                            
                            if(!Configuracion.arrClientes.verificarExistenciaCorreo(vistaCliente.txtEmail.getText())){

                                if(ClientePotencial.verificarEdad(sdf.format(vistaCliente.dcFechaNacimiento.getDate()))){
                                String contra = String.valueOf(vistaCliente.txtContrasena.getPassword());
                                String contraVerif = String.valueOf(vistaCliente.txtVerifContrasena.getPassword());    

                                    if(vistaCliente.cbxTipoDocumento.getSelectedItem().toString().equalsIgnoreCase("DNI")){

                                        if(ClientePotencial.verificarValidezDNI(vistaCliente.txtNumeroDocumento.getText())){

                                            if(contra != null && contraVerif !=null){

                                                if(contra.equalsIgnoreCase(contraVerif)){

                                                    ClientePotencial = new Cliente(
                                                                    vistaCliente.cbxTipoDocumento.getSelectedItem().toString(),
                                                                    vistaCliente.txtNumeroDocumento.getText(),
                                                                    vistaCliente.txtNombres.getText(),
                                                                    vistaCliente.txtApPaterno.getText(),
                                                                    vistaCliente.txtApMaterno.getText(),
                                                                    vistaCliente.cbxSexo.getSelectedItem().toString(),
                                                                    sdf.format(vistaCliente.dcFechaNacimiento.getDate()),
                                                                    vistaCliente.txtEmail.getText(),
                                                                    contra);

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

                                                    JOptionPane.showMessageDialog(vistaCliente, "Datos del cliente registrados, puede continuar con su registro.");        
                                                                ControladorRegistroVehiculo ctrlRegistroVehiculo = new ControladorRegistroVehiculo(ClientePotencial);
                                                                ctrlRegistroVehiculo.iniciarVehiculo();
                                                                vistaCliente.dispose(); 
                                            }
                                        }//Validez DNI
                                        else{
                                            JOptionPane.showMessageDialog(vistaCliente, "Número de DNI inválido.");
                                            vistaCliente.txtNumeroDocumento.setText(null);
                                        }
                                    }//DNI
                                    else if(vistaCliente.cbxTipoDocumento.getSelectedItem().toString().equalsIgnoreCase("Carnet Extranjería")){
                                        if(ClientePotencial.verificarValidezExtranjeria(vistaCliente.txtNumeroDocumento.getText())){
                                            if(contra != null && contraVerif !=null){
                                                if(contra.equalsIgnoreCase(contraVerif)){
                                                    ClientePotencial = new Cliente(
                                                                    vistaCliente.cbxTipoDocumento.getSelectedItem().toString(),
                                                                    vistaCliente.txtNumeroDocumento.getText(),
                                                                    vistaCliente.txtNombres.getText(),
                                                                    vistaCliente.txtApPaterno.getText(),
                                                                    vistaCliente.txtApMaterno.getText(),
                                                                    vistaCliente.cbxSexo.getSelectedItem().toString(),
                                                                    sdf.format(vistaCliente.dcFechaNacimiento.getDate()),
                                                                    vistaCliente.txtEmail.getText(),
                                                                    contra);

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

                                                JOptionPane.showMessageDialog(vistaCliente, "Datos del cliente registrados, puede continuar con su registro.");        
                                                            ControladorRegistroVehiculo ctrlRegistroVehiculo = new ControladorRegistroVehiculo(ClientePotencial);
                                                            ctrlRegistroVehiculo.iniciarVehiculo();
                                                            vistaCliente.dispose(); 
                                            }   
                                        }//Validez num carnet
                                        else{
                                            JOptionPane.showMessageDialog(vistaCliente, "Número de Carnet de extranjería inválido.");
                                            vistaCliente.txtNumeroDocumento.setText(null);
                                        }//Validez num carnet
                                    }//Carnet
                                }
                                else{
                                    JOptionPane.showMessageDialog(vistaCliente, "Usted no cuenta con la edad suficiente.");
                                    limpiarDatosCliente();
                                }
                            }//EXISTENCIA CORREO
                            else{
                                JOptionPane.showMessageDialog(vistaCliente, "Correo ya registrado. Ingrese otra dirección de correo.");
                                vistaCliente.txtEmail.setText(null);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(vistaCliente, "Correo inválido. Ingrese otra dirección de correo.");
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
        
        this.vistaCliente.txtNumeroDocumento.addKeyListener(new KeyAdapter(){
           @Override
           public void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
               if(c<'0' || c>'9') e.consume();
           }
        });
        
        this.vistaCliente.txtNombres.addKeyListener(new KeyAdapter(){
           @Override
           public void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
               if((c<'a' || c>'z') && (c<'A' || c>'Z')) e.consume();
           }
        });
        
        this.vistaCliente.txtApPaterno.addKeyListener(new KeyAdapter(){
           @Override
           public void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
               if((c<'a' || c>'z') && (c<'A' || c>'Z')) e.consume();
           }
        });
        
        this.vistaCliente.txtApMaterno.addKeyListener(new KeyAdapter(){
           @Override
           public void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
               if((c<'a' || c>'z') && (c<'A' || c>'Z')) e.consume();
           }
        });
        
        this.vistaCliente.btnAtras.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               ControladorPrincipal ctrlPrincipal = new ControladorPrincipal(fPrincipal);
                ctrlPrincipal.iniciar();
                vistaCliente.dispose();
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