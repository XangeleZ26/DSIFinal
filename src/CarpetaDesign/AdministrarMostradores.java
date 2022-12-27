/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
