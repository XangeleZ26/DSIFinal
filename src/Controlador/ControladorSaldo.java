package Controlador;


import Controlador.ControladorOpcionesIngreso;
import Modelo.Cliente;
import Modelo.Configuracion;
import Vista.frmSaldo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorSaldo {
    private frmSaldo vista;
    //private Cliente user;
    private int indiceCliente;
    
    public ControladorSaldo(int indiceCliente){
        this.vista = new frmSaldo();
        //this.user=user;
        this.indiceCliente = indiceCliente;
        
        this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorOpcionesIngreso ctrlOpcionesIngreso = new ControladorOpcionesIngreso(indiceCliente);
                ctrlOpcionesIngreso.iniciar();
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
        
    }
    
    public void iniciar() {
        vista.txtSaldoTotal.setText(String.valueOf(Configuracion.arrClientes.getArregloCliente(this.indiceCliente).getCuenta().getSaldoTotal()));
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
}
