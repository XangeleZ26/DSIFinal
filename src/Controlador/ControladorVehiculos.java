
package Controlador;

import Modelo.Cliente;
import Vista.frmVehiculos;

public class ControladorVehiculos {
    private Cliente user;
    private frmVehiculos vista;

    public ControladorVehiculos(Cliente user) {
        this.user = user;
        this.vista = new frmVehiculos();
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
