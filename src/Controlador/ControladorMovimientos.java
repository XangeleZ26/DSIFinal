package Controlador;

import Modelo.Cliente;
import Vista.frmMovimientos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMovimientos {

    private Cliente user;
    private frmMovimientos vista;

    public ControladorMovimientos(Cliente user) {
        this.user = user;
        this.vista = new frmMovimientos();
         this.vista.btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ControladorOpcionesIngreso controller = new ControladorOpcionesIngreso(user);
                controller.iniciar();
                vista.dispose();
            }
        });
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

}
