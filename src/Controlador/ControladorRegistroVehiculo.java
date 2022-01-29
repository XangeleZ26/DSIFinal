package Controlador;

import Modelo.Cliente;
import Modelo.Configuracion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import Modelo.Vehiculo;
import Modelo.ArregloClientes;
import Modelo.Configuracion;
import Modelo.Cliente;
import Vista.frmRegistroVehiculo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.util.Date;

public class ControladorRegistroVehiculo{
    private Cliente ClientePotencial;
    private frmRegistroVehiculo vistaVehiculo;

    
    //PROVENIENTE DEL CONTROLADOR ENTREGA
    public ControladorRegistroVehiculo(Cliente ClientePotencial){
        this.ClientePotencial = ClientePotencial;
        this.vistaVehiculo = new frmRegistroVehiculo();
        
         this.vistaVehiculo.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                ControladorCliente ctrlOpcionesIngreso = new ControladorCliente();
                ctrlOpcionesIngreso.iniciarCliente();
                vistaVehiculo.dispose();
            }
        });
        this.vistaVehiculo.cbxEjes.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(vistaVehiculo.cbxEjes.getSelectedItem().toString().trim().length() != 0){
                    if(vistaVehiculo.cbxEjes.getSelectedIndex()>-1){
                        vistaVehiculo.cbxCategoria.setModel(new DefaultComboBoxModel(getCategoria(vistaVehiculo.cbxEjes.getSelectedItem().toString())));
                        vistaVehiculo.cbxTipoUso.setModel(new DefaultComboBoxModel(getTipoUso(vistaVehiculo.cbxEjes.getSelectedItem().toString())));
                    }
                }
            }
        });
        
        this.vistaVehiculo.txtPesoBruto.addKeyListener(new KeyAdapter(){
           @Override
           public void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
                if(((c<'0')||(c>'9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.' || vistaVehiculo.txtPesoBruto.getText().contains("."))){
                    e.consume();
                } 
           }
        });
        
        this.vistaVehiculo.txtAño.addKeyListener(new KeyAdapter(){
           @Override
           public void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
               if(c<'0' || c>'9') e.consume();
           }
        }); 
        this.vistaVehiculo.btnSiguiente2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(datosLlenosVehiculo()){
                    if(!ClientePotencial.getCuenta().verificarExistenciaVehiculo(vistaVehiculo.txtPlaca.getText())){
                        Date fecha = new Date();
                        int año = Integer.parseInt(vistaVehiculo.txtAño.getText());
                        if((fecha.getYear()+1900< año) || (año<1900)){
                            JOptionPane.showMessageDialog(null, "Año no válido, digite nuevamente.");
                            vistaVehiculo.txtAño.setText(null);
                        }
                        String ejesCadena = vistaVehiculo.cbxEjes.getSelectedItem().toString();
                        int ejesEntero = Integer.parseInt(ejesCadena);
                        ClientePotencial.getCuenta().registrarVehiculo(
                                                     vistaVehiculo.txtPlaca.getText(),
                                                     vistaVehiculo.cbxMarca.getSelectedItem().toString(),
                                                     vistaVehiculo.txtModelo.getText(),
                                                     vistaVehiculo.cbxCategoria.getSelectedItem().toString(),
                                                     ejesEntero,
                                                     vistaVehiculo.cbxTipoUso.getSelectedItem().toString(),
                                                     Float.parseFloat(vistaVehiculo.txtPesoBruto.getText()),
                                                     Integer.parseInt(vistaVehiculo.txtAño.getText()),
                                                     ClientePotencial);
                        JOptionPane.showMessageDialog(null, "Datos del vehículo registrado, puede continuar.");
                        ControladorEntrega ctrlEntrega = new ControladorEntrega(ClientePotencial);
                        ctrlEntrega.iniciarEntrega();
                        vistaVehiculo.dispose();      
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Vehículo ya registrado, ingrese nuevos datos por favor.");
                        limpiarDatosVehiculo();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos, por favor.");
                }   
            }
        });
        
    }
 
    //PROVENIENTE DEL CONTROLADOR VEHÍCULOS
    public ControladorRegistroVehiculo(Cliente cliente,frmRegistroVehiculo vista){
        this.vistaVehiculo = vista;
        this.ClientePotencial=cliente;  //aqui el cliente ya existe, solo desea agregar carros
       
           this.vistaVehiculo.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorVehiculos ctrlOpcionesIngreso = new ControladorVehiculos(cliente);
                ctrlOpcionesIngreso.iniciar();
                vista.dispose();
            }
        });
        this.vistaVehiculo.btnSiguiente2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(datosLlenosVehiculo()){
                    if(!ClientePotencial.getCuenta().verificarExistenciaVehiculo(vistaVehiculo.txtPlaca.getText())){
                        Date fecha = new Date();
                        int año = Integer.parseInt(vistaVehiculo.txtAño.getText());
                        if((fecha.getYear()+1900< año) || (año<1900)){
                            JOptionPane.showMessageDialog(null, "Año no válido, digite nuevamente.");
                            vistaVehiculo.txtAño.setText(null);
                        }
                    String ejesCadena = vistaVehiculo.cbxEjes.getSelectedItem().toString();
                    int ejesEntero = Integer.parseInt(ejesCadena);
                   ClientePotencial.getCuenta().registrarVehiculo(
                                                 vistaVehiculo.txtPlaca.getText(),
                                                 vistaVehiculo.cbxMarca.getSelectedItem().toString(),
                                                 vistaVehiculo.txtModelo.getText(),
                                                 vistaVehiculo.cbxCategoria.getSelectedItem().toString(),
                                                 ejesEntero,
                                                 vistaVehiculo.cbxTipoUso.getSelectedItem().toString(),
                                                 Float.parseFloat(vistaVehiculo.txtPesoBruto.getText()),
                                                 Integer.parseInt(vistaVehiculo.txtAño.getText()),
                                                 ClientePotencial);
                    try {
                        Configuracion.serial.serializar("archivoUser.txt",Configuracion.arrClientes);
                        JOptionPane.showMessageDialog(null, "Datos del vehículo registrado, puede continuar.");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,"Fallo en el guardado de archivo");
                    }
                    
                    ControladorVehiculos ctrlVehiculos = new ControladorVehiculos(ClientePotencial);
                    ctrlVehiculos.iniciar();
                    vistaVehiculo.dispose();  
                }
                    else{
                        JOptionPane.showMessageDialog(null, "Vehículo ya registrado, ingrese nuevos datos por favor.");
                        limpiarDatosVehiculo();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos, por favor.");
                }   
            }
        });
        this.vistaVehiculo.cbxEjes.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(vistaVehiculo.cbxEjes.getSelectedItem().toString().trim().length() != 0){
                    if(vistaVehiculo.cbxEjes.getSelectedIndex()>-1){
                        vistaVehiculo.cbxCategoria.setModel(new DefaultComboBoxModel(getCategoria(vistaVehiculo.cbxEjes.getSelectedItem().toString())));
                        vistaVehiculo.cbxTipoUso.setModel(new DefaultComboBoxModel(getTipoUso(vistaVehiculo.cbxEjes.getSelectedItem().toString())));
                    }
                }
            }
        });
        this.vistaVehiculo.txtPesoBruto.addKeyListener(new KeyAdapter(){
           @Override
           public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(((c<'0')||(c>'9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.' || vistaVehiculo.txtPesoBruto.getText().contains("."))){
                    e.consume();
                }   
           }
        });
        
        this.vistaVehiculo.txtAño.addKeyListener(new KeyAdapter(){
           @Override
           public void keyTyped(KeyEvent e){
               char c = e.getKeyChar();
               if(c<'0' || c>'9') e.consume();
           }
        });
    }
    
    public void iniciarVehiculo(){
        vistaVehiculo.setTitle("Datos Vehiculo");
        vistaVehiculo.setLocationRelativeTo(null);
        vistaVehiculo.setVisible(true);
        vistaVehiculo.cbxMarca.setSelectedItem(-1);
        vistaVehiculo.cbxEjes.setSelectedItem(-1);
        vistaVehiculo.cbxCategoria.setSelectedItem(-1);
        vistaVehiculo.cbxTipoUso.setSelectedItem(-1);
        DefaultComboBoxModel marcasComboBox = new DefaultComboBoxModel();
        for(Object o : Modelo.Configuracion.marcasVehiculo){
            marcasComboBox.addElement(o);
        }
        vistaVehiculo.cbxMarca.setModel(marcasComboBox);
        
        DefaultComboBoxModel ejesComboBox = new DefaultComboBoxModel();
        for(Object o : Modelo.Configuracion.ejesVehiculo){
            ejesComboBox.addElement(o);
        }
        vistaVehiculo.cbxEjes.setModel(ejesComboBox);
        
        DefaultComboBoxModel categoriasComboBox = new DefaultComboBoxModel();
        for(Object o : Modelo.Configuracion.categoriasVehiculo){
            categoriasComboBox.addElement(o);
        }
        vistaVehiculo.cbxCategoria.setModel(categoriasComboBox);
        
        DefaultComboBoxModel tipoUsoComboBox = new DefaultComboBoxModel();
        for(Object o : Modelo.Configuracion.tipoUsoVehiculo){
            tipoUsoComboBox.addElement(o);
        }
        vistaVehiculo.cbxTipoUso.setModel(tipoUsoComboBox);
        
    }
    
    public boolean datosLlenosVehiculo(){
        return (this.vistaVehiculo.txtPlaca.getText().trim().length() != 0
                && this.vistaVehiculo.cbxMarca.getSelectedItem().toString().trim().length() != 0
                && this.vistaVehiculo.txtModelo.getText().trim().length() != 0
                && this.vistaVehiculo.txtPesoBruto.getText().trim().length() != 0
                && this.vistaVehiculo.cbxEjes.getSelectedItem().toString().trim().length() != 0
                && this.vistaVehiculo.txtAño.getText().trim().length() != 0
                && this.vistaVehiculo.cbxCategoria.getSelectedItem().toString().trim().length() != 0
                && this.vistaVehiculo.cbxTipoUso.getSelectedItem().toString().trim().length() != 0);
    }
    
    public void limpiarDatosVehiculo(){
        vistaVehiculo.txtPlaca.setText(null);
        vistaVehiculo.cbxMarca.setSelectedIndex(-1);
        vistaVehiculo.txtModelo.setText(null);
        vistaVehiculo.txtPesoBruto.setText(null);
        vistaVehiculo.cbxCategoria.setSelectedIndex(-1);
        vistaVehiculo.cbxTipoUso.setSelectedIndex(-1);
        vistaVehiculo.cbxEjes.setSelectedIndex(-1);
        vistaVehiculo.txtAño.setText(null);
    }
    
    //PASAR AL MODELO
    public String[] getCategoria(String ejes){
        String[] categoria = new String[2];
        if(ejes.equalsIgnoreCase("2")){
            categoria[0]= "Liviano";
            categoria[1]= "Pesado";
        }
        if(ejes.equalsIgnoreCase("3") || ejes.equalsIgnoreCase("4") ||
           ejes.equalsIgnoreCase("5") || ejes.equalsIgnoreCase("6") ||
           ejes.equalsIgnoreCase("7") || ejes.equalsIgnoreCase("8") ||
           ejes.equalsIgnoreCase("9") || ejes.equalsIgnoreCase("10")){
            categoria[0]="Pesado";
        }
        return categoria;
    }
    
    //PASAR AL MODELO
    public String[] getTipoUso(String ejes){
        String[] tipoUso = new String[2];
        if(ejes.equalsIgnoreCase("2")){
            tipoUso[0]= "Privado";
            tipoUso[1]= "Público";
        }
        if(ejes.equalsIgnoreCase("3") || ejes.equalsIgnoreCase("4") ||
           ejes.equalsIgnoreCase("5") || ejes.equalsIgnoreCase("6") ||
           ejes.equalsIgnoreCase("7") || ejes.equalsIgnoreCase("8") ||
           ejes.equalsIgnoreCase("9") || ejes.equalsIgnoreCase("10")){
            tipoUso[0]="Privado";
        }
        return tipoUso;
    }
}
