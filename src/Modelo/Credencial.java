package Modelo;

import java.io.Serializable;

public class Credencial implements Serializable{
    private String correo;
    private String contraseña;

    //Método constructor
    public Credencial(String correo,String contraseña) {
        this.contraseña = contraseña;
        this.correo = correo;
    }
    
    public Credencial(String correo) {
        this.correo = correo;
    }
    
    //Métodos accesores
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    //Métodos del funcionamiento de la clase
    public boolean cambiarCorreo(String nuevoCorreo){
        boolean result = false;
        if(nuevoCorreo.compareTo(this.correo)!=0){
            this.correo = nuevoCorreo;
            result = true;
        }
        return result;
    }
    
    public boolean cambiarContraseña(String nuevaContraseña){
        boolean result = false;
        if(nuevaContraseña.compareTo(this.contraseña)!=0){
            this.contraseña = nuevaContraseña;
            result = true;
        }
        return result;
    }
}
/*
package Controlador;

import Modelo.Cliente;
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
                ControladorConfiguracion ctrlConfiguracion=new ControladorConfiguracion(this.indiceCliente);
                ctrlConfiguracion.iniciar();
                vista.dispose();
            }
        });
        
        this.vista.btnSaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorSaldo ctrlSaldo = new ControladorSaldo(this.indiceCliente);
                ctrlSaldo.iniciar();
                vista.dispose();
            }
        });
        
        this.vista.btnMovimientos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorMovimientos ctrlMovimientos =new ControladorMovimientos(this.indiceCliente);
                ctrlMovimientos.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnPagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorPagar ctrlPagar = new ControladorPagar(this.indiceCliente);
                ctrlPagar.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnRecargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorRecarga ctrlRecarga = new ControladorRecarga(this.indiceCliente);
                ctrlRecarga.iniciar();
                vista.dispose();
            }
        });
        this.vista.btnVehiculos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControladorVehiculos ctrlVehiculos = new ControladorVehiculos(this.indiceCliente);
                ctrlVehiculos.iniciar();
                vista.dispose();
            }
        });
    }
    
    public void iniciar(){
        vista.txtNombreUsuario.setText(this.Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getNombres()+" "
                                       +this.Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getApPaterno());
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}*/
