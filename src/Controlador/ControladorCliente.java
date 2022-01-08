package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.Cliente;
import Modelo.Configuracion;
import Modelo.ArregloClientes; 
import Vista.frmCliente;
import java.text.SimpleDateFormat;

public class ControladorCliente{
    private ArregloClientes modeloCliente;
    private ArregloClientes clientes;
    private frmCliente vistaCliente;
    Cliente mCliente = new Cliente();
    public ControladorCliente(ArregloClientes modeloCliente){
        this.vistaCliente = new frmCliente();
        this.modeloCliente = modeloCliente;
        this.clientes = Configuracion.arrClientes;
        this.vistaCliente.btnOpcionRUC.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               ControladorRUC ctrlRUC = new ControladorRUC(clientes, mCliente);
               ctrlRUC.iniciarRUC();
               vistaCliente.dispose(); 
           }
        });
        this.vistaCliente.btnSiguiente2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(datosLlenosCliente()){
                    
                    if(!modeloCliente.verificarExistenciaCliente(
                    vistaCliente.cbxTipoDocumento.getSelectedItem().toString(),
                    vistaCliente.txtNumeroDocumento.getText())){
                        if(!modeloCliente.verificarExistenciaCorreo(vistaCliente.txtEmail.getText())){
                            String contra = String.valueOf(vistaCliente.txtContrasena.getPassword());
                            String contraVerif = String.valueOf(vistaCliente.txtVerifContrasena.getPassword());
                            
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            //String fechaNacimiento = sdf.format(vistaCliente.dcFechaNacimiento.getDate());
                            if(contra != null){
                                if(contra.compareTo(contraVerif) == 0){
                                    Cliente cliente = new Cliente(
                                                    vistaCliente.cbxTipoDocumento.getSelectedItem().toString(),
                                                    vistaCliente.txtNumeroDocumento.getText(),
                                                    vistaCliente.txtNombres.getText(),
                                                    vistaCliente.txtApPaterno.getText(),
                                                    vistaCliente.txtApMaterno.getText(),
                                                    vistaCliente.cbxSexo.getSelectedItem().toString(),
                                                    sdf.format(vistaCliente.dcFechaNacimiento.getDate()),
                                                    vistaCliente.txtEmail.getText(),
                                                    vistaCliente.txtContrasena.getPassword().toString());
                                    modeloCliente.agregarCliente(cliente);
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Verificación de contraseña incorrecta.");
                                }
                            }
                            else{
                                Cliente cliente = new Cliente(
                                                vistaCliente.cbxTipoDocumento.getSelectedItem().toString(),
                                                vistaCliente.txtNumeroDocumento.getText(),
                                                vistaCliente.txtNombres.getText(),
                                                vistaCliente.txtApPaterno.getText(),
                                                vistaCliente.txtApMaterno.getText(),
                                                vistaCliente.cbxSexo.getSelectedItem().toString(),
                                                sdf.format(vistaCliente.dcFechaNacimiento.getDate()),
                                                vistaCliente.txtEmail.getText());
                                modeloCliente.agregarCliente(cliente);
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
    }
    
    public void iniciarCliente(){
        vistaCliente.setTitle("Datos Cliente");
        vistaCliente.setLocationRelativeTo(null);
        vistaCliente.setVisible(true);
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
