
package Controlador;

import Modelo.Cliente;
import Modelo.Configuracion;
import Vista.frmPagar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import Modelo.Estacion;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemEvent;

public class ControladorPagar {
    //private Cliente user;
    private frmPagar vista;
    private Estacion estacion;
    private int indiceCliente;
    private int x;
    
    public String[] getEstacion(String Peaje){
        String[] estaciones = new String[4];
        if(Peaje.equalsIgnoreCase("Panamericana Norte")){
            estaciones[0]= "Serpentin de Pasamayo";
            estaciones[1]= "Variante Pasamayo";
            estaciones[2]= "El Paraíso";
            estaciones[3]= "Fortaleza";
        }
        if(Peaje.equalsIgnoreCase("Panamericana Sur")){
            estaciones[0]= "Chilca";       
        }
        if(Peaje.equalsIgnoreCase("Huaylas")){
            estaciones[0]= "Alto Lampas";
            estaciones[1]= "Cahuish";
        }
        if(Peaje.equalsIgnoreCase("Separadora Industrial")){
            estaciones[0]= "Mayorazgo";
            estaciones[1]= "Parque industrial";
            estaciones[2]= "Central industrial";
        }
        return estaciones;
        }

    public ControladorPagar(int indiceCliente) {
        //this.user = user;
        this.vista = new frmPagar();
        this.estacion = estacion;
        this.indiceCliente = indiceCliente;
        

         this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(indiceCliente);
                ctrlOpcionesIngreso.iniciar();
                vista.dispose();
            }
        });
        
        this.vista.btnPagar.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e ){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat año = new SimpleDateFormat("yyyy");
           // vista.cbxVehiculo.getSelectedItem() = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getVehiculos(i);

            if(datosLlenosPagar()){
                Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().pagarPeaje(
                sdf.format(vista.dcFechaPago.getDate()),
                Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getVehiculos(x),
                Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getEstacion()
                );
            
                JOptionPane.showMessageDialog(null, "Pago realizado con éxito");
            }
            else{
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos, por favor.");
            }
           }
        });
        
        this.vista.cbxPeaje.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(vista.cbxPeaje.getSelectedItem().toString().trim().length() != 0){
                if(vista.cbxPeaje.getSelectedIndex()>0){
                    vista.cbxEstacion.setModel(new DefaultComboBoxModel(getEstacion(vista.cbxPeaje.getSelectedItem().toString())));
                }
            }
        }
        });
        
        for (int i = 0; i < Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getNv(); i++){  
        vista.cbxVehiculo.addItem(Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getVehiculos(i).getPlaca());
        x = i;
        }
     
        
        /*this.vista.cbxVehiculo.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
        for (int i = 0; i < Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getNv(); i++){  
        vista.cbxVehiculo.addItem(Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getVehiculos(i).getPlaca());
        }
        }
        });*/
        
   
    }

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
  
     public void limpiarDatos(){
        vista.cbxPeaje.setSelectedIndex(-1);
        vista.cbxEstacion.setSelectedItem(-1);
        vista.cbxVehiculo.setSelectedItem(-1);
        vista.dcFechaPago.setDate(null);
    }
}

