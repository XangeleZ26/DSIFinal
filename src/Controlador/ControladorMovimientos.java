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
            
            DatosTabla();
            }
        });
        
        this.vista.btnOrdenarMonto.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            user.getCuenta().getMovimientos().ordenarMovimientosXMonto();
            
            DatosTabla();
            }  
        });
        
        this.vista.btnOrdenarEstacion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
             user.getCuenta().getMovimientos().ordenarMovimientosXEstacion();

            DatosTabla();
            }  
        });
        
        this.vista.btnOrdenarVehiculo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
             user.getCuenta().getMovimientos().ordenarMovimientosXPlacaVehiculo();
            DatosTabla();
            }  
        });
        
        
    }
    
    //MOVER ESTO AL MODELO DONDE PERTENEZCA
    public void DatosTabla(){
        DefaultTableModel TablaUser;
        TablaUser = new DefaultTableModel(user.getCuenta().getMovimientos().datosMovimientos(),user.getCuenta().getMovimientos().cabecera());
        this.vista.jMovimientos.setModel(TablaUser);

    }
    public void iniciar() {
    vista.setLocationRelativeTo(null);
    vista.setVisible(true);
    DatosTabla();
    }

}
