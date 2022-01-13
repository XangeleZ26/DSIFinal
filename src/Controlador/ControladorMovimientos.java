package Controlador;

import Modelo.Cliente;
import Modelo.Configuracion;
import Vista.frmMovimientos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ControladorMovimientos {

    //private Cliente user;
    private frmMovimientos vista;
    private int indiceCliente;

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
        
        for(int i=0;i<Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getNm();i++){
            informacion[0] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getFecha();
            informacion[1] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getTipo();
            informacion[2] = Float.toString(Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getMovimientos(i).getMonto());
            informacion[3] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getVehiculos(i).getPlaca();
            informacion[4] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getVehiculos(i).getPlaca(); // mal, peaje
            informacion[5] = Configuracion.arrClientes.getArregloCliente(indiceCliente).getCuenta().getVehiculos(i).getPlaca(); // mal, peaje
            
            datos.addRow(informacion);
        }   
    }
    
        public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        DatosTabla();
    }

}
