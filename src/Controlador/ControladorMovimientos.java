package Controlador;

import Modelo.Cliente;
import Vista.frmMovimientos;

public class ControladorMovimientos {

    private Cliente user;
    private frmMovimientos vista;

    public ControladorMovimientos(Cliente user) {
        this.user = user;
        this.vista = new frmMovimientos();
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

}
