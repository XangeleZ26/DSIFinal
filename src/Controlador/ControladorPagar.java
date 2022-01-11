
package Controlador;

import Modelo.Cliente;
import Vista.frmPagar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorPagar {
    private Cliente user;
    private frmPagar vista;

    public ControladorPagar(Cliente user) {
        this.user = user;
        this.vista = new frmPagar();
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
