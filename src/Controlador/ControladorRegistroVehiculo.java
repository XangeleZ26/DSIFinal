package Controlador;

import Modelo.Cliente;
import Modelo.Configuracion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Vehiculo;
import Modelo.ArregloClientes;
import Modelo.Configuracion;
import Modelo.Cliente;
import Vista.frmRegistroVehiculo;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

public class ControladorRegistroVehiculo{
    private Cliente ClientePotencial;
    private frmRegistroVehiculo vistaVehiculo;
    
    //PROVENIENTE DEL CONTROLADOR ENTREGA
    public ControladorRegistroVehiculo(Cliente ClientePotencial){
        this.ClientePotencial = ClientePotencial;
        this.vistaVehiculo = new frmRegistroVehiculo();
        this.vistaVehiculo.btnSiguiente2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(datosLlenosVehiculo()){
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
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos, por favor.");
                }   
            }
        });
    }
    
    //PROVENIENTE DEL CONTROLADOR VEHÍCULOS
    public ControladorRegistroVehiculo(Cliente cliente,frmRegistroVehiculo vista){
        this.vistaVehiculo = vista;
        this.ClientePotencial=cliente;  //aqui el cliente ya existe, solo desea agregar carros
        this.vistaVehiculo.btnSiguiente2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(datosLlenosVehiculo()){
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
                    ControladorVehiculos ctrlVehiculos = new ControladorVehiculos(ClientePotencial);
                    ctrlVehiculos.iniciar();
                    vistaVehiculo.dispose();  
                }
                else{
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos, por favor.");
                }   
            }
        });
    }
    
    public void iniciarVehiculo(){
        vistaVehiculo.setTitle("Datos Vehiculo");
        vistaVehiculo.setLocationRelativeTo(null);
        vistaVehiculo.setVisible(true);
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
}
