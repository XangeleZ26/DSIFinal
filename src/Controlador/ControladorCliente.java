package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.Cliente;
import Modelo.ArregloClientes; 
import Vista.frmCliente;
import java.text.SimpleDateFormat;

public class ControladorCliente implements ActionListener{
    private ArregloClientes modeloCliente;
    private frmCliente vistaCliente;
    
    public ControladorCliente(ArregloClientes modeloCliente, frmCliente vistaCliente){
        this.modeloCliente = modeloCliente;
        this.vistaCliente = vistaCliente;
        this.vistaCliente.btnSiguiente2.addActionListener(this);
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
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistaCliente.btnSiguiente2){
            if(!modeloCliente.verificarExistenciaCliente(
                    vistaCliente.cbxTipoDocumento.getSelectedItem().toString(),
                    vistaCliente.txtNumeroDocumento.getText())){
                if(!modeloCliente.verificarExistenciaCorreo(
                    vistaCliente.txtEmail.getText())){
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    String fechaNacimiento = sdf.format(vistaCliente.dcFechaNacimiento.getDate());
                    Cliente cliente = new Cliente(
                                    vistaCliente.cbxTipoDocumento.getSelectedItem().toString(),
                                    vistaCliente.txtNumeroDocumento.getText(),
                                    vistaCliente.txtNombres.getText(),
                                    vistaCliente.txtApPaterno.getText(),
                                    vistaCliente.txtApMaterno.getText(),
                                    vistaCliente.cbxSexo.getSelectedItem().toString(),
                                    fechaNacimiento,
                                    vistaCliente.txtEmail.getText(),vistaCliente.txtContrasena.getPassword().toString());
                    limpiarDatosCliente();
                }
                else{
                    JOptionPane.showMessageDialog(vistaCliente, "Correo ya registrado. Ingrese otra dirección de correo.");
                }
            }
            else{
                JOptionPane.showMessageDialog(vistaCliente, "Cliente ya registrado. Ingrese nuevos datos.");
            }
        }
    }
    
}
