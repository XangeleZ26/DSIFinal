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
                user.getCuenta().getMovimientos().ordenarMovimientosXFecha();
            
                DatosTablaAZ();
            }
        });
        
        this.vista.btnOrdenarMonto.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getCuenta().getMovimientos().ordenarMovimientosXMonto();
            
                DatosTablaAZ();
            }  
        });
        
        this.vista.btnOrdenarEstacion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getCuenta().getMovimientos().ordenarMovimientosXEstacion();

                DatosTablaAZ();
            }  
        });
        
        this.vista.btnOrdenarVehiculo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                user.getCuenta().getMovimientos().ordenarMovimientosXPlacaVehiculo();
                DatosTablaAZ();
            }  
        });
        
        this.vista.btnAZ.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                DatosTablaAZ();
            }  
        });
        
        this.vista.btnZA.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                DatosTablaZA();
            }  
        });
        
    }
    
    //MOVER ESTO AL MODELO DONDE PERTENEZCA
    public void DatosTablaAZ(){ //Menor a mayor
        DefaultTableModel TablaUser;
        TablaUser = new DefaultTableModel(user.getCuenta().getMovimientos().datosMovimientosAZ(),user.getCuenta().getMovimientos().cabecera());
        this.vista.jMovimientos.setModel(TablaUser);

    }
    
    public void DatosTablaZA(){ //Mayor a menor
        DefaultTableModel TablaUser;
        TablaUser = new DefaultTableModel(user.getCuenta().getMovimientos().datosMovimientosZA(),user.getCuenta().getMovimientos().cabecera());
        this.vista.jMovimientos.setModel(TablaUser);

    }
    
    public void iniciar() {
    vista.setLocationRelativeTo(null);
    vista.setVisible(true);
    DatosTablaAZ();
    }

}
