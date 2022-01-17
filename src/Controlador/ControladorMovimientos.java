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

    //private Cliente user;
    private frmMovimientos vista;
    private int indiceCliente;
    private String OrdenadoPor = new String();

    public ControladorMovimientos(int indiceCliente) {
        //this.user = user;
        this.vista = new frmMovimientos();
        this.indiceCliente = indiceCliente;
        
        
        this.vista.btnAtras.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(indiceCliente);
                ctrlOpcionesIngreso.iniciar();
                vista.dispose();
            }
        });
        
        this.vista.btnOrdenarFecha.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().ordenarMovimientosXFecha();
            OrdenadoPor = "Fecha";
            llenarTablaOrdenada();
            }
        });
        
        this.vista.btnOrdenarMonto.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().ordenarMovimientosXMonto();
            OrdenadoPor = "Monto";
            llenarTablaOrdenada();
            }  
        });
        
        this.vista.btnOrdenarVehiculo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().ordenarMovimientosXPlacaVehiculo();
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
        
        for(int i=0;i<Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getNm();i++){
        if(Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getTipo().compareTo("Recarga")== 0){
            
            informacion[0] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getFecha();
            informacion[1] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getTipo();
            informacion[2] = Float.toString(Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getMonto());
            datos.addRow(informacion);
        
        }
        if(Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getTipo().compareTo("Consumo")== 0){      
        
            informacion[0] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getFecha();
            informacion[1] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getTipo();
            informacion[2] = Float.toString(Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getMonto());
            informacion[3] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getVehiculo().getPlaca();
            informacion[4] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getEstacion().getPeaje().getNombrePeaje(); 
            informacion[5] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getEstacion().getNombreEstacion(); 
            datos.addRow(informacion);
        
        }
        }  
    }
    
    public void llenarTablaOrdenada(){
        DefaultTableModel user = new DefaultTableModel();
        String informacion[] = new String[8];
        user.addColumn("Fecha");
        user.addColumn("Tipo");
        user.addColumn("Monto");
        user.addColumn("Vehiculo");
        user.addColumn("Peaje");
        user.addColumn("Estación");
        this.vista.jMovimientos.setModel(user);
        
        for(int i=0;i<Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getNm();i++){
        if(Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getTipo().compareTo("Recarga")== 0){
            
            informacion[0] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getFecha();
            informacion[1] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getTipo();
            informacion[2] = Float.toString(Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getMonto());
            user.addRow(informacion);
        
        }
        if(Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getTipo().compareTo("Consumo")== 0){      
        
            informacion[0] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getFecha();
            informacion[1] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getTipo();
            informacion[2] = Float.toString(Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getMonto());
            informacion[3] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getVehiculo().getPlaca();
            informacion[4] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getEstacion().getPeaje().getNombrePeaje(); 
            informacion[5] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getEstacion().getNombreEstacion(); 
            user.addRow(informacion);
        
        }
        }
    }
    
        public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        DatosTabla();
    }

}
