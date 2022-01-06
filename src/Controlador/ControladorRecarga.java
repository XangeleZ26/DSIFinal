
package Controlador;

import Modelo.Cliente;
import Vista.frmRecarga;


public class ControladorRecarga {
    private frmRecarga vista;
    private Cliente user;
    public ControladorRecarga(Cliente user){
        this.vista=new frmRecarga();
        this.user=user;
    }
       public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
