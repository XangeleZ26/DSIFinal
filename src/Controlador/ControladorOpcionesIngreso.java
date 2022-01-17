package Controlador;

import Modelo.Cliente;
import Modelo.Configuracion;
import Vista.frmOpcionesIngreso;
import Vista.frmPaginaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorOpcionesIngreso {
    //private Cliente user;
    private frmOpcionesIngreso vista;
    private int indiceCliente;
    //public ControladorOpcionesIngreso(Cliente user){
    public ControladorOpcionesIngreso(int indiceCliente){
        //this.user=user;
        this.vista=new frmOpcionesIngreso();
        this.indiceCliente = indiceCliente;
        
        
        this.vista.btnConfiguracion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorConfiguracion ctrlConfiguracion=new ControladorConfiguracion(indiceCliente);
                ctrlConfiguracion.iniciar();
                vista.dispose();
            }
        });
        
        this.vista.btnSaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorSaldo ctrlSaldo = new ControladorSaldo(indiceCliente);
                ctrlSaldo.iniciar();
                vista.dispose();
            }
        });
        
        this.vista.btnMovimientos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorMovimientos ctrlMovimientos =new ControladorMovimientos(indiceCliente);
                ctrlMovimientos.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnPagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorPagar ctrlPagar = new ControladorPagar(indiceCliente);
                ctrlPagar.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnRecargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorRecarga ctrlRecarga = new ControladorRecarga(indiceCliente);
                ctrlRecarga.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnVehiculos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorVehiculos ctrlVehiculos = new ControladorVehiculos(indiceCliente);
                ctrlVehiculos.iniciar();
                vista.dispose();
            }
        });
    }
    
    public void iniciar(){
        if(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getTipoDocumento().equals("RUC")){
        vista.txtNombreUsuario.setText(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getRazonSocial());
        }else{
            vista.txtNombreUsuario.setText(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getNombres()+" "
                                       +Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getApPaterno());
        }
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
