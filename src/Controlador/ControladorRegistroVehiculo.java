package Controlador;

import Modelo.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Vehiculo;
import Modelo.ArregloClientes;
import Vista.frmRegistroVehiculo;
import javax.swing.JOptionPane;

public class ControladorRegistroVehiculo{
    private ArregloClientes modeloCliente = new ArregloClientes();
    //private Vehiculo modeloVehiculo;
    private frmRegistroVehiculo vistaVehiculo;
    //private Cliente user;
    
    public ControladorRegistroVehiculo(ArregloClientes clientes){
        this.modeloCliente = modeloCliente;
        this.vistaVehiculo = new frmRegistroVehiculo();
        
        this.vistaVehiculo.btnSiguiente1.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               if(datosLlenosVehiculo()){
                    ControladorEntrega ctrlEntrega = new ControladorEntrega(modeloCliente);
                    ctrlEntrega.iniciarEntrega();
                    vistaVehiculo.dispose();
               }
               else{
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos, por favor.");
               }
               
           }
        });
        this.vistaVehiculo.btnRegistrarVehiculo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(datosLlenosVehiculo()){
                    String ejesCadena = vistaVehiculo.cbxEjes.getSelectedItem().toString();
                    int ejesEntero = Integer.parseInt(ejesCadena);
                    modeloCliente.getArregloCliente(modeloCliente.getOc()).getCuenta().registrarVehiculo(
                                                vistaVehiculo.txtPlaca.getText(),
                                                vistaVehiculo.cbxMarca.getSelectedItem().toString(),
                                                vistaVehiculo.txtModelo.getText(),
                                                ejesEntero,
                                                vistaVehiculo.cbxTipoUso.getSelectedItem().toString(),
                                                Float.parseFloat(vistaVehiculo.txtPesoBruto.getText()),
                                                Integer.parseInt(vistaVehiculo.txtAño.getText()),
                                                clientes.getArregloCliente(clientes.getOc()));
                    JOptionPane.showMessageDialog(null, "Datos del vehículo registrados, puede continuar con su registro.");
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
