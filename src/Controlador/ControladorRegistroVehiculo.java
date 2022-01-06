package Controlador;

import Modelo.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Vehiculo;
import Vista.frmRegistroVehiculo;

public class ControladorRegistroVehiculo implements ActionListener{
    private Vehiculo modeloVehiculo;
    private frmRegistroVehiculo vistaVehiculo;
    private Cliente user;
    public ControladorRegistroVehiculo(Vehiculo modeloVehiculo){
        this.modeloVehiculo = modeloVehiculo;
        this.vistaVehiculo = new frmRegistroVehiculo();
//        vistaVehiculo.iniciarVehiculo();    ???????
        
        this.vistaVehiculo.btnSiguiente1.addActionListener(this);
    }
    
    public void iniciarVehiculo(){
        vistaVehiculo.setTitle("Datos Vehiculo");
        vistaVehiculo.setLocationRelativeTo(null);
        vistaVehiculo.setVisible(true);
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
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistaVehiculo.btnSiguiente1){
            
        }
    }
    
}
