
package Controlador;

import Modelo.Cliente;
import Vista.frmPagar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import Modelo.Estacion;

////////////////////////////
public class ControladorPagar {
    private Cliente user;
    private frmPagar vista;
    private Estacion estacion;
    ////////////////////////
    public ControladorPagar(Cliente user) {
        this.user = user;
        this.vista = new frmPagar();
        this.estacion = estacion;

         this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorOpcionesIngreso controller = new ControladorOpcionesIngreso(user);
                controller.iniciar();
                vista.dispose();
            }
        });
         
        this.vista.btnPagar.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat año = new SimpleDateFormat("yyyy");

            if(datosLlenosPagar()){
            user.getCuenta().pagarPeaje(
                sdf.format(vista.dcFechaPago.getDate()),
                user.getCuenta().getVehiculos(Integer. parseInt(año.format(vista.dcFechaPago.getDate()))),
                user.getCuenta().getEstacion(vista.cbxEstacion.getSelectedItem().toString())
                );
                JOptionPane.showMessageDialog(null, "Pago realizado con éxito");
            }
            else{
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos, por favor.");
            }
           }
        });
        
        //
                this.vista.cbxPeaje.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(vista.cbxPeaje.getSelectedItem().toString()== "Panamericana Norte"){
                vista.cbxEstacion.addItem("Serpentin de Pasamayo");
                vista.cbxEstacion.addItem("Variante Pasamayo");
                vista.cbxEstacion.addItem("El Paraíso");
                vista.cbxEstacion.addItem("Fortaleza");
            }

            if(vista.cbxPeaje.getSelectedItem().toString()== "Panamericana Sur"){
                vista.cbxEstacion.addItem("Chilca");  
            }

            if(vista.cbxPeaje.getSelectedItem().toString()== "Huaylas"){
            vista.cbxEstacion.addItem("Alto Lampas");
            vista.cbxEstacion.addItem("Cahuish");
            }

            if(vista.cbxPeaje.getSelectedItem().toString() == "Separadora Industrial"){
            vista.cbxEstacion.addItem("Mayorazgo");
            vista.cbxEstacion.addItem("Parque industrial");
            vista.cbxEstacion.addItem("Central industrial");      
            }
            
        }
        });
        
        //
    }
    ////////////////////////
    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    public boolean datosLlenosPagar(){
    return (this.vista.cbxPeaje.getSelectedItem().toString().trim().length() != 0
    && this.vista.cbxEstacion.getSelectedItem().toString().trim().length() != 0
    && this.vista.cbxVehiculo.getSelectedItem().toString().trim().length() != 0
    && this.vista.dcFechaPago.getDate() != null);
             
    }  

  
}
////////////////////////////