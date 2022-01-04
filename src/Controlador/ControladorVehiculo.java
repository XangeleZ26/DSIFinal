package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Vehiculo;
import Vista.frmRegistro;

public class ControladorVehiculo implements ActionListener{
    private Vehiculo modeloVehiculo;
    private frmRegistro vistaVehiculo;
    
    public ControladorVehiculo(Vehiculo modeloVehiculo, frmRegistro vistaVehiculo){
        this.modeloVehiculo = modeloVehiculo;
        this.vistaVehiculo = vistaVehiculo;
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
