package Controlador;

import Modelo.Cliente;
import Modelo.Configuracion;
import Vista.ConfigCambiarTarjeta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class ControladorConfigCambiarTarjeta {

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
                    try {
                        /*Falta implementar la validación para la nueva tarjeta que se va a registrar*/
 /*Verificar también que esta no sea igual a la tarjeta anterior*/
                        long numero = Long.parseLong(vista.txtNumTarjet.getText());
                        int cvivi = Integer.parseInt(vista.txtCvv.getText());

                        int añoVencimiento = vista.jycAñoVencimiento.getYear();
                        int mesVencimiento = vista.jmcMesVencimiento.getMonth();

                        SimpleDateFormat sdfVencimiento = new SimpleDateFormat("MM/yyyy");
                        Date fechaVencimiento = new Date(añoVencimiento, mesVencimiento, 00);
                        sdfVencimiento.format(fechaVencimiento);
                        if (verificarVigenciaTarjeta(sdfVencimiento.format(fechaVencimiento))) {
                            if (verificarValidezTarjeta(vista.txtNumTarjet.getText(), vista.cbxMedioPago.getSelectedItem().toString())) {
                                if (verificarValidezCVV(vista.txtCvv.getText(), vista.cbxMedioPago.getSelectedItem().toString())) {

                                    user.getCuenta().getTarjeta().setMedioPago(vista.cbxMedioPago.getSelectedItem().toString());
                                    user.getCuenta().getTarjeta().setNumTarjeta(vista.txtNumTarjet.getText());
                                    user.getCuenta().getTarjeta().setCvv(vista.txtCvv.getText());

                                    user.getCuenta().getTarjeta().setFechaVencimiento(sdfVencimiento.format(fechaVencimiento));

                                    try {
                                        Configuracion.serial.serializar("archivoUser.txt", Configuracion.arrClientes);
                                        JOptionPane.showMessageDialog(null, "Cambios registrados.");
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "Fallo en el guardado de archivo");
                                    }

                                    ControladorConfiguracion ctrlConfiguracion = new ControladorConfiguracion(user);
                                    ctrlConfiguracion.iniciar();
                                    vista.dispose();
                                } else {
                                    JOptionPane.showMessageDialog(null, "CVV no válido. Digite nuevamente.");
                                    vista.txtCvv.setText("");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Número de tarjeta no válida. Digite nuevamente.");
                                vista.txtNumTarjet.setText(null);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Tarjeta caducada. Ingrese otra tarjeta.");
                            limpiarDatosTarjeta();
                        }

                    } catch (NumberFormatException a) {
                        JOptionPane.showMessageDialog(null, "Solo se admiten datos numéricos!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos!");
                }
            }
        });
    }

    private boolean isValido() {
        return (this.vista.cbxMedioPago.getSelectedItem().toString().trim().length() != 0
                && this.vista.txtNumTarjet.getText().trim().length() != 0
                && this.vista.txtCvv.getText().trim().length() != 0);

    }

    public boolean verificarValidezTarjeta(String numTarjeta, String medioPago) {
        boolean result = false;
        String aux;
        if(numTarjeta.length() == 16){
            if(numTarjeta.charAt(0) == '4' && medioPago.equalsIgnoreCase("VISA")){ //VISA
                result = true;
            }
            else if(numTarjeta.charAt(0) == '5' && medioPago.equalsIgnoreCase("MASTER CARD")){ //MASTER CARD
                switch (numTarjeta.charAt(1)){
                    case '1': 
                    case '2': 
                    case '3': 
                    case '4': 
                    case '5': result = true;
                        break;
                    default: result = false;
                        break;
                }
            }
        }
        else if (numTarjeta.length() == 15 && numTarjeta.charAt(0) == '3' && medioPago.equalsIgnoreCase("AMERICAN EXPRESS")) {
            switch(numTarjeta.charAt(1)){ //AMERICAN EXPRESS
                case '4':
                case '7': result = true;
                    break;
                default: result = false;
                    break;
            }
        }
        else if(numTarjeta.length() == 14 && numTarjeta.charAt(0) == '3' && medioPago.equalsIgnoreCase("DINERS CLUB")){
            switch(numTarjeta.charAt(1)){ //DINERS CLUB
                case '0':
                case '6':
                case '8':
                case '9': result = true;
                    break;
                default: result = false;
                    break;
            }
        }
        return result;
    }

    public boolean verificarVigenciaTarjeta(String fechaVencimiento) {
        boolean result = false;
        Date fechaActual = new Date();
        SimpleDateFormat fecha = new SimpleDateFormat("MM/yyyy");
        if (fechaVencimiento.compareTo(fecha.format(fechaActual)) > 0) {
            return true;
        }

        return result;
    }

    public boolean verificarValidezCVV(String cvv, String medioPago) {
        boolean result = false;
        if (cvv.length() == 3) {
            if (medioPago.equalsIgnoreCase("VISA")) {
                result = true;
            } else if (medioPago.equalsIgnoreCase("MASTER CARD")) {
                result = true;
            }
        } else if (cvv.length() == 4) {
            if (medioPago.equalsIgnoreCase("AMERICAN EXPRESS") ) {
                result = true;
            } else if (medioPago.equalsIgnoreCase("DINERS CLUB") ) {
                result = true;
            }
        }
        return result;
    }

    public void limpiarDatosTarjeta() {
        vista.cbxMedioPago.setSelectedIndex(-1);
        vista.txtNumTarjet.setText(null);
        vista.jycAñoVencimiento.setYear(-1);
        vista.jmcMesVencimiento.setMonth(-1);;
        vista.txtCvv.setText(null);
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

}
