
package CarpetaDesign;

import javax.swing.JFrame;

public class AdministrarMostradores {

    public AdministrarMostradores() {

    }

    public void OrderMode1(ITipoMostrador object, JFrame vista) {
        object.ordenarAZ(vista);
    }

    public void OrderMode2(ITipoMostrador object, JFrame vista) {
        object.ordenarZA(vista);
    }

}
