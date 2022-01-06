
package Controlador;

import Modelo.Cliente;
import Vista.frmPagar;


public class ControladorPagar {
    private Cliente user;
    private frmPagar vista;

    public ControladorPagar(Cliente user) {
        this.user = user;
        this.vista = new frmPagar();
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
