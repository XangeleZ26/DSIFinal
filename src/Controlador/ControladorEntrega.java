package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Direccion;
import Vista.frmEntrega;

public class ControladorEntrega implements ActionListener{
    private Direccion modeloDireccion;
    private frmEntrega vistaEntrega;
    
    public ControladorEntrega(Direccion modeloDireccion, frmEntrega vistaEntrega){
        this.modeloDireccion = modeloDireccion;
        this.vistaEntrega = vistaEntrega;
        this.vistaEntrega.btnSiguiente3.addActionListener(this);
    }
    
    public void iniciarEntrega(){
        vistaEntrega.setTitle("Datos de Entrega");
        vistaEntrega.setLocationRelativeTo(null);
        vistaEntrega.setVisible(true);
    }
    
    public void limpiarEntrega(){
        vistaEntrega.txtDepartamento.setText(null);
        vistaEntrega.txtProvincia.setText(null);
        vistaEntrega.txtAvenida.setText(null);
        vistaEntrega.cbxDistrito.setSelectedIndex(-1);
        vistaEntrega.txtNumero.setText(null);
        vistaEntrega.txtTelefono.setText(null);
        vistaEntrega.txtReferencia.setText(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistaEntrega.btnSiguiente3){
            Direccion direccion = new Direccion(
                                    vistaEntrega.txtDepartamento.getText(),
                                    vistaEntrega.txtProvincia.getText(),
                                    vistaEntrega.cbxDistrito.getSelectedItem().toString(),
                                    vistaEntrega.txtAvenida.getText(),
                                    Integer.parseInt(vistaEntrega.txtNumero.getText()),
                                    vistaEntrega.txtTelefono.getText());
        limpiarEntrega();
        }
    }
    
}
