package Controlador;

import Modelo.Cliente;
import Vista.frmMovimientos;
import Modelo.Vehiculo;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ControladorMovimientos {

    private Cliente user;
    private frmMovimientos vista;

    public ControladorMovimientos(Cliente user) {
        this.user = user;
        this.vista = new frmMovimientos();
        
        this.vista.btnAtras.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorOpcionesIngreso controller = new ControladorOpcionesIngreso(user);
                controller.iniciar();
                vista.dispose();
            }
        });
        
/*
        this.vista.btnOrdenarFecha.addActionListener(new ActionListener(){
            
        });
        
        this.vista.btnOrdenarMonto.addActionListener(new ActionListener(){
        
        
        });
        
        this.vista.btnOrdenarVehiculo.addActionListener(new ActionListener(){
        
        
        });
        
  */ 
    }

    public void DatosTabla(){
        DefaultTableModel datos = new DefaultTableModel();
        String informacion[] = new String[6];
        datos.addColumn("Fecha");
        datos.addColumn("Tipo");
        datos.addColumn("Monto");
        datos.addColumn("Vehiculo");
        datos.addColumn("Peaje");
        datos.addColumn("Estación");
        
        this.vista.jMovimientos.setModel(datos);
        
        for(int i=0;i<this.user.getCuenta().getNm();i++){
            informacion[0] = this.user.getCuenta().getMovimientos(i).getFecha();
            informacion[1] = this.user.getCuenta().getMovimientos(i).getTipo();
            informacion[2] = Float.toString(this.user.getCuenta().getMovimientos(i).getMonto());
            informacion[3] = this.user.getCuenta().getVehiculos(i).getPlaca();
            informacion[4] = this.user.getCuenta().getVehiculos(i).getPlaca(); // mal, peaje
            informacion[5] = this.user.getCuenta().getVehiculos(i).getPlaca(); // mal, peaje
            
            datos.addRow(informacion);
        }   
    }
    
        public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        DatosTabla();
    }

}
