package Controlador;

import Modelo.ArregloClientes;
import Modelo.Cliente;
import Modelo.Configuracion;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import Vista.frmRUC;

public class ControladorRUC {
    private frmRUC vistaRUC;
    private Cliente ClientePotencial;
        
    public ControladorRUC(Cliente ClientePotencial){
        this.vistaRUC = new frmRUC();
        this.ClientePotencial = ClientePotencial;
        
        this.vistaRUC.btnVolverCliente.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               ControladorCliente ctrlCliente = new ControladorCliente();
               ctrlCliente.iniciarCliente();
               vistaRUC.dispose(); 
           }
        });
        
        this.vistaRUC.btnNext.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(datosLlenosCliente()){
                    if(ClientePotencial.verificarValidezRUC(vistaRUC.txtRUC.getText())){
                         if(!Configuracion.arrClientes.verificarExistenciaCliente("RUC", vistaRUC.txtRUC.getText())){
                            String contra = String.valueOf(vistaRUC.txtContrasena.getPassword());
                            String contraVerif = String.valueOf(vistaRUC.txtVerifContrasena.getPassword());
                            if(contra != null && contraVerif !=null){ //aqui no usa contraseña creada
                                if(contra.equalsIgnoreCase(contraVerif)){
                                    Cliente ClientePotencial = new Cliente("RUC", vistaRUC.txtRUC.getText(), 
                                                           vistaRUC.txtCorreo.getText(), vistaRUC.txtRazonSocial.getText(), contra);
        
                                    JOptionPane.showMessageDialog(vistaRUC, "Datos de RUC registrados, puede continuar con su registro.");
                                    ControladorRegistroVehiculo ctrlVehiculo = new ControladorRegistroVehiculo(ClientePotencial);
                                    ctrlVehiculo.iniciarVehiculo();
                                    vistaRUC.dispose();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Verificación de contraseña incorrecta.");
                                }
                            }
                            else{ //aqui no usa contraseña creada
                                Cliente ClientePotencial = new Cliente("RUC", vistaRUC.txtRUC.getText(),vistaRUC.txtCorreo.getText(), vistaRUC.txtRazonSocial.getText());
                                    JOptionPane.showMessageDialog(vistaRUC, "Datos de RUC registrados, puede continuar con su registro.");
                                    ControladorRegistroVehiculo ctrlVehiculo = new ControladorRegistroVehiculo(ClientePotencial);
                                    ctrlVehiculo.iniciarVehiculo();
                                    vistaRUC.dispose();
                            }
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
        this.vistaRUC.lblOjoCerrado1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                vistaRUC.lblOjoAbierto1.setVisible(true);
                vistaRUC.lblOjoCerrado1.setVisible(false);
                vistaRUC.txtContrasena.setEchoChar('•');
            }
        });
        
        this.vistaRUC.lblOjoAbierto1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                vistaRUC.lblOjoAbierto1.setVisible(false);
                vistaRUC.lblOjoCerrado1.setVisible(true);
                vistaRUC.txtContrasena.setEchoChar((char) 0);
            }
        });
        
        this.vistaRUC.lblOjoCerrado2.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                vistaRUC.lblOjoAbierto2.setVisible(true);
                vistaRUC.lblOjoCerrado2.setVisible(false);
                vistaRUC.txtVerifContrasena.setEchoChar('•');
            }
        });
        
        this.vistaRUC.lblOjoAbierto2.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                vistaRUC.lblOjoAbierto2.setVisible(false);
                vistaRUC.lblOjoCerrado2.setVisible(true);
                vistaRUC.txtVerifContrasena.setEchoChar((char) 0);
            }
        });
        
        this.vistaRUC.txtRUC.addKeyListener(new KeyAdapter(){
           @Override
           public void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
               if(c<'0' || c>'9') e.consume();
           }
        });
    }
    
    public void iniciarRUC(){
        vistaRUC.setTitle("Datos RUC");
        vistaRUC.setLocationRelativeTo(null);
        vistaRUC.setVisible(true);
        vistaRUC.lblOjoCerrado1.setVisible(false);
        vistaRUC.lblOjoCerrado2.setVisible(false);
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
