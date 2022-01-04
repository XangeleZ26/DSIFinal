package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.ArregloClientes;
import Modelo.Vehiculo;
import Vista.frmPaginaPrincipal;
import Vista.frmLogin;
import Vista.frmRegistro;

public class ControladorPrincipal implements ActionListener{
    private ArregloClientes modeloClientes;
    private frmPaginaPrincipal vistaPrincipal;
    Vehiculo mVehiculo;
    frmRegistro fVehiculo;
    
    public ControladorPrincipal(ArregloClientes modeloClientes, frmPaginaPrincipal vistaPrincipal){
        this.modeloClientes = modeloClientes;
        this.vistaPrincipal = vistaPrincipal;
        this.vistaPrincipal.btnIngresa.addActionListener(this);
        this.vistaPrincipal.btnAfiliate.addActionListener(this);
    } 
    
    public void iniciarPrincipal(){
        vistaPrincipal.setTitle("Sistema de peajes");
        vistaPrincipal.setLocationRelativeTo(null);
        vistaPrincipal.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistaPrincipal.btnIngresa){
            frmLogin fLogin = new frmLogin();
            fLogin.setVisible(true);
        }
        else if(e.getSource() == vistaPrincipal.btnAfiliate){
            
        }
    }
    
}
