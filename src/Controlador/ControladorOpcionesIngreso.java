/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Vista.frmOpcionesIngreso;
import Vista.frmPaginaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorOpcionesIngreso {
    private Cliente user;
    private frmOpcionesIngreso vista;
    
    public ControladorOpcionesIngreso(Cliente user){
       this.user=user;
        this.vista=new frmOpcionesIngreso(); 
        
        this.vista.btnConfiguracion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ControladorConfiguracion controller=new ControladorConfiguracion(user);
               controller.iniciar();
               vista.dispose();
            }
        });
        this.vista.btnSaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ControladorSaldo controller=new ControladorSaldo(user);
               controller.iniciar();
               vista.dispose();
            }
        });
    }
    
      public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
