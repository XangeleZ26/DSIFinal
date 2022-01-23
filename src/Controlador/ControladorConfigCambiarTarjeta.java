package Controlador;

import Modelo.Cliente;
import Modelo.Tarjeta;
import Modelo.Configuracion;
import Vista.ConfigCambiarTarjeta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

public class ControladorConfigCambiarTarjeta {
    private Tarjeta TarjetaPotencial;
    private ConfigCambiarTarjeta vista;
    private Cliente user;

    public ControladorConfigCambiarTarjeta(Cliente user) {
        this.vista = new ConfigCambiarTarjeta();
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
                    SimpleDateFormat sdfVencimiento = new SimpleDateFormat("yyyy/MM");
                    String fechaVencimiento = sdfVencimiento.format(vista.dcFechaVencimiento.getDate());
                    
                    TarjetaPotencial = new Tarjeta(
                                vista.cbxMedioPago.getSelectedItem().toString(),
                                vista.txtNumTarjet.getText(),
                                fechaVencimiento,
                                vista.txtCvv.getText());   
                    if(!vista.txtNumTarjet.getText().equalsIgnoreCase(user.getCuenta().getTarjeta().getNumTarjeta())){
                        if (TarjetaPotencial.verificarVigenciaTarjeta(fechaVencimiento)) {
                            if(TarjetaPotencial.verificarValidezTajeta(vista.txtNumTarjet.getText(),
                                                                       vista.cbxMedioPago.getSelectedItem().toString())){
                                if(TarjetaPotencial.verificarValidezCVV(vista.txtCvv.getText(),
                                                                        vista.cbxMedioPago.getSelectedItem().toString())){
                                    user.getCuenta().getTarjeta().setMedioPago(vista.cbxMedioPago.getSelectedItem().toString());
                                    user.getCuenta().getTarjeta().setNumTarjeta(vista.txtNumTarjet.getText());
                                    user.getCuenta().getTarjeta().setCvv(vista.txtCvv.getText());                 
                                    user.getCuenta().getTarjeta().setFechaVencimiento(fechaVencimiento);

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
                                else{
                                    JOptionPane.showMessageDialog(vista, "CVV no válido. Digite nuevamente.");
                                    vista.txtCvv.setText(null);
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(vista, "Número de tarjeta no válida. Digite nuevamente.");
                                vista.txtNumTarjet.setText(null);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(vista, "Tarjeta caducada. Ingrese otra tarjeta.");
                            limpiarDatosTarjeta();
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(vista, "Usted ha ingresado los mismo datos de su anterior tarjeta. Ingrese nuevos datos, por favor.");
                        limpiarDatosTarjeta();
                    }
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos!");
                }
            }
        });
        
        this.vista.txtNumTarjet.addKeyListener(new KeyAdapter(){
           @Override
           public void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
               if(c<'0' || c>'9') e.consume();
           }
        });
        
        this.vista.txtCvv.addKeyListener(new KeyAdapter(){
           @Override
           public void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
               if(c<'0' || c>'9') e.consume();
           }
        });
    }

    private boolean isValido() {
        return (this.vista.cbxMedioPago.getSelectedItem().toString().trim().length() != 0
                && this.vista.txtNumTarjet.getText().trim().length() != 0
                && this.vista.txtCvv.getText().trim().length() != 0
                && this.vista.dcFechaVencimiento.getDate() != null);
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        DefaultComboBoxModel medioPagoComboBox = new DefaultComboBoxModel();
        for (Object o : Modelo.Configuracion.medioPago) {
            medioPagoComboBox.addElement(o);
        }
        vista.cbxMedioPago.setModel(medioPagoComboBox);
    }
    
    public void limpiarDatosTarjeta() {
        vista.cbxMedioPago.setSelectedIndex(-1);
        vista.txtNumTarjet.setText(null);
        vista.txtCvv.setText(null);
        vista.dcFechaVencimiento.setDate(null);
    }
}
