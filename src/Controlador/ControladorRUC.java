package Controlador;

import Modelo.ArregloClientes;
import Modelo.Cliente;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.frmRUC;

public class ControladorRUC {
    private frmRUC vistaRUC;
    private ArregloClientes modeloClientes;
    private Cliente user;
    
    public ControladorRUC(ArregloClientes modeloCliente, Cliente user){
        this.vistaRUC = new frmRUC();
        this.user = user;
        this.modeloClientes = modeloClientes;
        this.vistaRUC.btnVolverCliente.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               ControladorCliente ctrlCliente = new ControladorCliente(modeloClientes);
               ctrlCliente.iniciarCliente();
               vistaRUC.dispose(); 
           }
        });
        this.vistaRUC.btnNext.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(datosLlenosCliente()){
                    if(user.verificarValidezRUC(vistaRUC.txtRUC.getText())){
                         if(!modeloClientes.verificarExistenciaCliente(
                            "RUC", vistaRUC.txtRUC.getText())){
                             Cliente cliente = new Cliente("RUC", vistaRUC.txtRUC.getText(), vistaRUC.txtCorreo.getText(), vistaRUC.txtCorreo.getText());
                             modeloClientes.agregarCliente(cliente);
                         }
                         else{
                            limpiarDatosRUC();
                            JOptionPane.showMessageDialog(vistaRUC, "Cliente ya registrado. Ingrese nuevos datos.");
                         }
                    }
                    else{
                        vistaRUC.txtRUC.setText(null);
                        JOptionPane.showMessageDialog(vistaRUC, "RUC inválido, digite nuevamente");
                    }
      
                }
                else{
                    JOptionPane.showMessageDialog(vistaRUC, "Debe llenar todos los campos, por favor.");
                }
            }
        });
    }
    
    public void iniciarRUC(){
        vistaRUC.setTitle("Datos RUC");
        vistaRUC.setLocationRelativeTo(null);
        vistaRUC.setVisible(true);
    }
    
    public void limpiarDatosRUC(){
        vistaRUC.txtRUC.setText(null);
        vistaRUC.txtRazonSocial.setText(null);
        vistaRUC.txtCorreo.setText(null);
    }
    
    public boolean datosLlenosCliente(){
        return (this.vistaRUC.txtRUC.getText().trim().length() != 0
                && this.vistaRUC.txtRazonSocial.getText().trim().length() != 0
                && this.vistaRUC.txtCorreo.getText().trim().length() != 0);
    }
}
