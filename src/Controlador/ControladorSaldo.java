package Controlador;


import Controlador.ControladorOpcionesIngreso;
import Modelo.Cliente;
import Modelo.Configuracion;
import Vista.frmSaldo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorSaldo {
    private frmSaldo vista;
    private Cliente user;
    
    public ControladorSaldo(Cliente user){
        this.vista = new frmSaldo();
        //this.user=user;
        this.user = user;
        
        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(user);
                ctrlOpcionesIngreso.iniciar();
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
        
    }
    
    public void iniciar() {
        vista.txtSaldoTotal.setText(String.valueOf(user.getCuenta().getSaldoTotal()));
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
}
