package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.ArregloClientes;
import Modelo.Configuracion;
import Modelo.Vehiculo;
import Vista.frmPaginaPrincipal;
import Vista.frmCliente;
import Vista.frmLogin;
import Vista.frmRegistroVehiculo;

public class ControladorPrincipal implements ActionListener{
    private ArregloClientes modeloClientes;
    private frmPaginaPrincipal vistaPrincipal;
    Vehiculo mVehiculo;
    frmCliente fCliente;
    frmRegistroVehiculo fVehiculo;
    
    public ControladorPrincipal(frmPaginaPrincipal vistaPrincipal){
        this.modeloClientes = Configuracion.arrClientes;
        this.vistaPrincipal = vistaPrincipal;
        this.vistaPrincipal.btnIngresa.addActionListener(this);
        this.vistaPrincipal.btnAfiliate.addActionListener(this);
    } 
    
    public void iniciar(){
        vistaPrincipal.setTitle("Sistema de peajes");
        vistaPrincipal.setLocationRelativeTo(null);
        vistaPrincipal.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistaPrincipal.btnIngresa){
            
            ControladorLogin controller = new ControladorLogin();
            controller.iniciar(); //se abre vista login
            vistaPrincipal.dispose(); //se cierra vista principal
        }
        else if(e.getSource() == vistaPrincipal.btnAfiliate){
            
            //ControladorCliente ctrlCliente = new ControladorCliente(modeloClientes, fCliente);
            //ctrlCliente.iniciarCliente();
            //vistaPrincipal.dispose(); 
        }
    }
    
}
