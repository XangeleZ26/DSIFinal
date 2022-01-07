package Controlador;


import Controlador.ControladorOpcionesIngreso;
import Modelo.Cliente;
import Vista.frmSaldo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorSaldo {
    private frmSaldo vista;
    private Cliente user;
    public ControladorSaldo(Cliente user){
        this.vista=new frmSaldo();
        this.user=user;
         this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorOpcionesIngreso controller = new ControladorOpcionesIngreso(user);
                controller.iniciar();
                vista.dispose();
            }
        });
         this.vista.btnRecargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorRecarga controller=new ControladorRecarga(user);
                controller.iniciar();
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
