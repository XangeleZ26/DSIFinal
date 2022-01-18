package Controlador;

import Modelo.Cliente;
import Modelo.Configuracion;
import Modelo.Estacion;
import Modelo.Peaje;
import Vista.frmMovimientos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ControladorMovimientos {

    private Cliente user;
    private frmMovimientos vista;

    private String OrdenadoPor = new String();

    public ControladorMovimientos(Cliente user) {
        //this.user = user;
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
            OrdenadoPor = "Fecha";
            llenarTablaOrdenada();
            }
        });
        
        this.vista.btnOrdenarMonto.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            user.getCuenta().ordenarMovimientosXMonto();
            OrdenadoPor = "Monto";
            llenarTablaOrdenada();
            }  
        });
        
        this.vista.btnOrdenarVehiculo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            user.getCuenta().ordenarMovimientosXPlacaVehiculo();
            OrdenadoPor = "Vehiculo";
            llenarTablaOrdenada();
            }  
        });
        
        
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
        
        for(int i=0;i<user.getCuenta().getNm();i++){
            if(user.getCuenta().getMovimientos(i).getTipo().compareTo("Recarga")== 0){
                
                informacion[0] = user.getCuenta().getMovimientos(i).getFecha();
                informacion[1] = user.getCuenta().getMovimientos(i).getTipo();
                informacion[2] = Float.toString(user.getCuenta().getMovimientos(i).getMonto());
                informacion[3] = "";
                informacion[4] = "";
                informacion[5] = "";
                datos.addRow(informacion);
        
            }
            else if(user.getCuenta().getMovimientos(i).getTipo().compareTo("Consumo")== 0){      
                
                informacion[0] = user.getCuenta().getMovimientos(i).getFecha();
                informacion[1] = user.getCuenta().getMovimientos(i).getTipo();
                informacion[2] = Float.toString(user.getCuenta().getMovimientos(i).getMonto());
                informacion[3] = user.getCuenta().getMovimientos(i).getVehiculo().getPlaca();
                informacion[4] = user.getCuenta().getMovimientos(i).getEstacion().getPeaje().getNombrePeaje(); 
                informacion[5] = user.getCuenta().getMovimientos(i).getEstacion().getNombreEstacion(); 
                datos.addRow(informacion);
        
            }
        }  
    }
    
    public void llenarTablaOrdenada(){
        DefaultTableModel Tablauser = new DefaultTableModel();
        String informacion[] = new String[8];
        Tablauser.addColumn("Fecha");
        Tablauser.addColumn("Tipo");
        Tablauser.addColumn("Monto");
        Tablauser.addColumn("Vehiculo");
        Tablauser.addColumn("Peaje");
        Tablauser.addColumn("Estación");
        this.vista.jMovimientos.setModel(Tablauser);
        
        for(int i=0;i<user.getCuenta().getNm();i++){
        if(user.getCuenta().getMovimientos(i).getTipo().compareTo("Recarga")== 0){
            
            informacion[0] = user.getCuenta().getMovimientos(i).getFecha();
            informacion[1] = user.getCuenta().getMovimientos(i).getTipo();
            informacion[2] = Float.toString(user.getCuenta().getMovimientos(i).getMonto());
            Tablauser.addRow(informacion);
        
        }
        if(user.getCuenta().getMovimientos(i).getTipo().equals("Consumo")){      
        
            informacion[0] = user.getCuenta().getMovimientos(i).getFecha();
            informacion[1] = user.getCuenta().getMovimientos(i).getTipo();
            informacion[2] = Float.toString(user.getCuenta().getMovimientos(i).getMonto());
            informacion[3] = user.getCuenta().getMovimientos(i).getVehiculo().getPlaca();
            informacion[4] = user.getCuenta().getMovimientos(i).getEstacion().getPeaje().getNombrePeaje(); 
            informacion[5] = user.getCuenta().getMovimientos(i).getEstacion().getNombreEstacion(); 
            Tablauser.addRow(informacion);
        
        }
        }
    }
    
        public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        DatosTabla();
    }

}
