
package Controlador;

import Modelo.Cliente;
import Modelo.Configuracion;
import Modelo.Peaje;
import Modelo.ArregloPeajes;
import Vista.frmPagar;
import Vista.AppPeaje;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemEvent;
import Vista.frmMovimientos;

public class ControladorPagar {
    private Cliente user;
    private frmPagar vista;
    private int x;
    
    /*public String[] getEstacion(String Peaje){
        String[] estaciones = new String[4];
        
        if(vista.cbxPeaje.getSelectedIndex()==1){
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
        }*/

    public ControladorPagar(Cliente user) {
        //this.user = user;
        this.vista = new frmPagar();
        this.user = user;
        

         this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(user);
                ctrlOpcionesIngreso.iniciar();
                vista.dispose();
            }
        });
        
        this.vista.btnPagar.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e ){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            if(datosLlenosPagar()){
                user.getCuenta().pagarPeaje(
                sdf.format(vista.dcFechaPago.getDate()),
                user.getCuenta().getVehiculos(x),
                Configuracion.arrPeajes.getArregloPeajes(vista.cbxPeaje.getSelectedIndex()).getEstaciones(vista.cbxEstacion.getSelectedIndex())    
                );
                //user.getCuenta().getMovimientos().imprimirMovimientoSimple();
                //user.getCuenta().getSaldoTotal();
                
                 try {
                        Configuracion.serial.serializar("archivoUser.txt",Configuracion.arrClientes);
                        JOptionPane.showMessageDialog(null, "Pago realizado con éxito");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,"Fallo en el guardado de archivo");
                    }
                 //PARA MOSTRAR COMPROBANTE
                            ControladorBoleta comprobante = new ControladorBoleta(user,String.valueOf(user.getCuenta().getMonto()));
                            comprobante.iniciarParaConsumo(vista.cbxPeaje.getSelectedItem().toString(),vista.cbxEstacion.getSelectedItem().toString(),vista.cbxVehiculo.getSelectedItem().toString(),sdf.format(vista.dcFechaPago.getDate()));
//                            vista.dispose();

                            //PARA CERRAR COMPROBANTE
                            comprobante.getVistaBoleta().btnOKBoleta.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(user);
                                    ctrlOpcionesIngreso.iniciar();
                                    comprobante.getVistaBoleta().dispose();
                                    vista.dispose();
                                }
                            });
      
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
        
        for (int i = 0; i < user.getCuenta().getNv(); i++){  
        vista.cbxVehiculo.addItem(user.getCuenta().getVehiculos(i).getPlaca());
        x = i;
        }
     
        
        /*this.vista.cbxVehiculo.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
        for (int i = 0; i < user.getCuenta().getNv(); i++){  
        vista.cbxVehiculo.addItem(user.getCuenta().getVehiculos(i).getPlaca());
        }
        }
        });*/
    }
    
   /* public void llenarTabla() {
        DefaultTableModel modelo = new DefaultTableModel(user.getCuenta().getMovimientos(i).getFecha(),
                                        Configuracion.arrTarjeta.header(),user.getCuenta().getMovimientos(i).getTipo(),
                                        Float.toString(user.getCuenta().getMovimientos(i).getMonto()),
                                        user.getCuenta().getMovimientos(i).getVehiculo().getPlaca(),
                                        user.getCuenta().getMovimientos(i).getEstacion().getPeaje().getNombrePeaje(),
                                        user.getCuenta().getMovimientos(i).getEstacion().getNombreEstacion()
        );
        this.vista.tblTarjetas.setModel(modelo);
    }*/

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
    DefaultComboBoxModel peajesComboBox = new DefaultComboBoxModel();
        for(Object o : Modelo.Configuracion.arrPeaje){
            peajesComboBox.addElement(o);
        }
        vista.cbxPeaje.setModel(peajesComboBox);
      
            DefaultComboBoxModel estacionesComboBox = new DefaultComboBoxModel();
        for(Object o : Modelo.Configuracion.arrEstaciones){
            estacionesComboBox.addElement(o);
        }
        vista.cbxEstacion.setModel(estacionesComboBox);
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

}



