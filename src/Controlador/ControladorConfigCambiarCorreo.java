package Controlador;

import Modelo.Cliente;
import Modelo.Configuracion;
import Vista.ConfigCambiarCorreo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControladorConfigCambiarCorreo {

    private ConfigCambiarCorreo vista;
    private Cliente user;

    
    public ControladorConfigCambiarCorreo(Cliente user) {
        this.vista = new ConfigCambiarCorreo();
        this.user = user;

        
        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorConfiguracion ctrlConfiguracion = new ControladorConfiguracion(user);
                ctrlConfiguracion.iniciar();
                vista.dispose();
            }
        });
        
        this.vista.btnCambiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isValido()) {
                    
                    Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                                          + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
                    Matcher mather = pattern.matcher(vista.txtCorreo.getText());
                    
                    if(mather.find() == true){
                    
                        if ((String.valueOf(vista.txtContrasena.getPassword())).equals(user.getCredencial().getContraseña())) {


                                //Este método es boolean, REVISAR
                                user.getCredencial().cambiarCorreo(vista.txtCorreo.getText());

                                  try {
                                    Configuracion.serial.serializar("archivoUser.txt", Configuracion.arrClientes);
                                    JOptionPane.showMessageDialog(null, "Cambios registrados.");
                                } catch (Exception ex) {
                                    JOptionPane.showMessageDialog(null, "Fallo en el guardado de archivo");
                                }

                                ControladorConfiguracion ctrlConfiguracion = new ControladorConfiguracion(user);
                                ctrlConfiguracion.iniciar();
                                vista.dispose();

                        } 
                        else {
                            JOptionPane.showMessageDialog(null, "Contraseña de cuenta incorrecta.");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Correo inválido. Ingrese otra dirección de correo.");
                    }
                } 
                else {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos!");
                }
            }
        });
        
        this.vista.OjoCerrado1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vista.OjoAbierto1.setVisible(true);
                vista.OjoCerrado1.setVisible(false);
                vista.txtContrasena.setEchoChar('•');
            }
        });
        
        this.vista.OjoAbierto1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vista.OjoAbierto1.setVisible(false);
                vista.OjoCerrado1.setVisible(true);
                vista.txtContrasena.setEchoChar((char) 0);
            }
        });
    }

    private boolean isValido() {
        return (this.vista.txtCorreo.getText().trim().length() != 0
                && String.valueOf(this.vista.txtContrasena.getPassword()).trim().length() != 0);
    }

    public void iniciar() {
        vista.OjoCerrado1.setVisible(false);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
