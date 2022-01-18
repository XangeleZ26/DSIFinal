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
    private Cliente user;
    //public ControladorOpcionesIngreso(Cliente user){
    public ControladorOpcionesIngreso(Cliente user){
        //this.user=user;
        this.vista=new frmOpcionesIngreso();
        this.user=user;
        
        
        this.vista.btnConfiguracion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorConfiguracion ctrlConfiguracion=new ControladorConfiguracion(user);
                ctrlConfiguracion.iniciar();
                vista.dispose();
            }
        });
        
        this.vista.btnSaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorSaldo ctrlSaldo = new ControladorSaldo(user);
                ctrlSaldo.iniciar();
                vista.dispose();
            }
        });
        
        this.vista.btnMovimientos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorMovimientos ctrlMovimientos =new ControladorMovimientos(user);
                ctrlMovimientos.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnPagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorPagar ctrlPagar = new ControladorPagar(user);
                ctrlPagar.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnRecargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorRecarga ctrlRecarga = new ControladorRecarga(user);
                ctrlRecarga.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnVehiculos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorVehiculos ctrlVehiculos = new ControladorVehiculos(user);
                ctrlVehiculos.iniciar();
                vista.dispose();
            }
        });
    }
    
    public void iniciar(){
        if(user.getTipoDocumento().equals("RUC")){
        vista.txtNombreUsuario.setText(user.getRazonSocial());
        }else{
            vista.txtNombreUsuario.setText(user.getNombres()+" "
                                       +user.getApPaterno());
        }
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
