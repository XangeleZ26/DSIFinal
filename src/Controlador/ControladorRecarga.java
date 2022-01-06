
package Controlador;

import Vista.frmRecarga;


public class ControladorRecarga {
    private frmRecarga vista;
     //aqui tambn agregar como atributo un Cliente, ya q se entiende que el cliente q seleccionamos desde Login, llegará aquí
    public ControladorRecarga(){
        this.vista=new frmRecarga();
        
        
    }
       public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
