
package Controlador;

import Modelo.Cliente;
import Modelo.ArregloClientes;
import Modelo.Cuenta;
import Modelo.Vehiculo;
import Modelo.Configuracion;
import Vista.frmVehiculos;
import Vista.AppPeaje;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorVehiculos {
    private Cliente usuario1;
    private frmVehiculos vista;

    public ControladorVehiculos(Cliente usuario) {
        this.usuario1 = usuario;
        this.vista = new frmVehiculos();
        /*
        this.vista.btnOrdenarPlaca.addActionListener();
        
        this.vista.btnOrdenarAño.addActionListener();
        
        this.vista.btnOrdenarEjes.addActionListener();
        
        this.vista.btnOrdenarPeso.addActionListener();
        
        this.vista.btnAñadirVehiculo.addActionListener();
        
        this.vista.btnEliminarVehiculo.addActionListener();
        
        this.vista.btnAtras.addActionListener();
        */
    }
    
    public void llenarTablaNormal(){
        DefaultTableModel user = new DefaultTableModel();
        String informacion[] = new String[8];
        user.addColumn("Placa");
        user.addColumn("Marca");
        user.addColumn("Modelo");
        user.addColumn("Categoría");
        user.addColumn("Ejes");
        user.addColumn("Uso");
        user.addColumn("Peso");
        user.addColumn("Año");
        this.vista.jTable1.setModel(user);
        /*informacion[0] = "Placa";
        informacion[1] = "Marca";
        informacion[2] = "Modelo";
        informacion[3] = "Categoría";
        informacion[4] = "Ejes";
        informacion[5] = "Tipo de uso";
        informacion[6] = "Peso bruto";
        informacion[7] = "Año";   
        user.addRow(informacion);*/
        for(int i=0;i<this.usuario1.getCuenta().getNv();i++){
            informacion[0] = this.usuario1.getCuenta().getVehiculos(i).getPlaca();
            informacion[1] = this.usuario1.getCuenta().getVehiculos(i).getMarca();
            informacion[2] = this.usuario1.getCuenta().getVehiculos(i).getModelo();
            informacion[3] = this.usuario1.getCuenta().getVehiculos(i).getCategoria();
            informacion[4] = String.valueOf(this.usuario1.getCuenta().getVehiculos(i).getEjes());
            informacion[5] = this.usuario1.getCuenta().getVehiculos(i).getTipoUso();
            informacion[6] = String.valueOf(this.usuario1.getCuenta().getVehiculos(i).getPesoBruto());
            informacion[7] = String.valueOf(this.usuario1.getCuenta().getVehiculos(i).getAño());   
            user.addRow(informacion);
        }
    }
    
    /*public void llenarTablaOrdenada(){
        DefaultTableModel user = new DefaultTableModel();
        String informacion[] = new String[8];
        this.vista.jTable1.setModel(user);
        for(int i=0;i<this.usuario.getCuenta.getNv;i++){
            informacion[0] = this.usuario1.getCuenta.getVehiculosOrdenados(i).getPlaca;
            informacion[1] = this.usuario1.getCuenta.getVehiculosOrdenados(i).getMarca;
            informacion[2] = this.usuario1.getCuenta.getVehiculosOrdenados(i).getModelo;
            informacion[3] = this.usuario1.getCuenta.getVehiculosOrdenados(i).getCategoria;
            informacion[4] = String.valueOf(this.usuario1.getCuenta.getVehiculosOrdenados(i).getEjes);
            informacion[5] = this.usuario1.getCuenta.getVehiculosOrdenados(i).getTipoUso;
            informacion[6] = String.valueOf(this.usuario1.getCuenta.getVehiculosOrdenados(i).getPesoBruto);
            informacion[7] = String.valueOf(this.usuario1.getCuenta.getVehiculosOrdenados(i).getAño);   
            user.addRow(informacion);
        }
    }*/

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        llenarTablaNormal();
    }
}
