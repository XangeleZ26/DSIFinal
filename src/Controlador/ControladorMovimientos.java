package Controlador;

import Modelo.Cliente;
import Modelo.Configuracion;
import Modelo.Estacion;
import Modelo.Peaje;
import Modelo.Cuenta;
import Modelo.Vehiculo;
import Vista.frmMovimientos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ControladorMovimientos {

    private Cliente user;
    private frmMovimientos vista;

    public ControladorMovimientos(Cliente user) {
        this.vista = new frmMovimientos();
        this.user = user;
        
        this.vista.btnAtras.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(user);
                ctrlOpcionesIngreso.iniciar();
                vista.dispose();
            }
        });
        
        this.vista.btnOrdenarFecha.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            user.getCuenta().ordenarMovimientosXFecha();
            
            DatosTabla();
            }
        });
        
        this.vista.btnOrdenarMonto.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            user.getCuenta().ordenarMovimientosXMonto();
            
            DatosTabla();
            }  
        });
        
        this.vista.btnOrdenarEstacion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            user.getCuenta().ordenarMovimientosXEstacion();

            DatosTabla();
            }  
        });
        
        this.vista.btnOrdenarVehiculo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            user.getCuenta().ordenarMovimientosXPlacaVehiculo();
            DatosTabla();
            }  
        });
        
        
    }

    public void DatosTabla(){
        
        DefaultTableModel TablaUser = new DefaultTableModel();
        String informacion[] = new String[6];
        for(Object o : Modelo.Configuracion.datosMovimiento){
            TablaUser.addColumn(o);
        }
        this.vista.jMovimientos.setModel(TablaUser);
        
        for(int i=0;i<user.getCuenta().getNm();i++){
        if(user.getCuenta().getMovimientos(i).getTipo().compareTo("Recarga")== 0){
                
                informacion[0] = user.getCuenta().getMovimientos(i).getFecha();
                informacion[1] = user.getCuenta().getMovimientos(i).getTipo();
                informacion[2] = Float.toString(user.getCuenta().getMovimientos(i).getMonto());
                informacion[3] = "";
                informacion[4] = "";
                informacion[5] = "";
                TablaUser.addRow(informacion);
        }
        else if(user.getCuenta().getMovimientos(i).getTipo().compareTo("Consumo")== 0){      
                
                informacion[0] = user.getCuenta().getMovimientos(i).getFecha();
                informacion[1] = user.getCuenta().getMovimientos(i).getTipo();
                informacion[2] = Float.toString(user.getCuenta().getMovimientos(i).getMonto());
                informacion[3] = user.getCuenta().getMovimientos(i).getVehiculo().getPlaca();
                informacion[4] = user.getCuenta().getMovimientos(i).getEstacion().getPeaje().getNombrePeaje(); 
                informacion[5] = user.getCuenta().getMovimientos(i).getEstacion().getNombreEstacion(); 
                TablaUser.addRow(informacion);
        
            }
        } 
    }
    public void iniciar() {
    vista.setLocationRelativeTo(null);
    vista.setVisible(true);
    DatosTabla();
    }

}
