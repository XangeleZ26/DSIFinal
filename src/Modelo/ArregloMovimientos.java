package Modelo;

import CarpetaDesign.ITipoMostrador;
import Vista.frmMovimientos;
import java.io.Serializable;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ArregloMovimientos implements Serializable,ITipoMostrador {
private static final long serialVersionUID=26L;
    private Movimiento[] movimientos;
    private int nm;//Cantidad de movimientos en el arreglo
    private int om;//Orden en el arreglo del último movimiento agregado

    public ArregloMovimientos() {
        this.movimientos = new Movimiento[Configuracion.maxMovimientos];
        this.nm = 0;
        this.om = this.nm - 1;
    }

    public Object[][] datosMovimientosAZ() {
        Object datos[][] = new Object[this.nm][6];
        for (int i = 0; i < this.nm; i++) {
            if (this.movimientos[i].getTipo().compareTo("Recarga") == 0) {

                datos[i][0] = this.movimientos[i].getFecha();
                datos[i][1] = this.movimientos[i].getTipo();
                datos[i][2] = Float.toString(this.movimientos[i].getMonto());
                datos[i][3] = "";
                datos[i][4] = "";
                datos[i][5] = "";

            } else if (this.movimientos[i].getTipo().compareTo("Consumo") == 0) {

                datos[i][0] = this.movimientos[i].getFecha();
                datos[i][1] = this.movimientos[i].getTipo();
                datos[i][2] = Float.toString(this.movimientos[i].getMonto());
                datos[i][3] = this.movimientos[i].getVehiculo().getPlaca();
                datos[i][4] = this.movimientos[i].getEstacion().getPeaje().getNombrePeaje();
                datos[i][5] = this.movimientos[i].getEstacion().getNombreEstacion();

            }
        }
        return datos;
    }
    
    public Object[][] datosMovimientosZA() {
        Object datos[][] = new Object[this.nm][6];
        for (int i = 0; i < this.nm; i++) {
            if (this.movimientos[this.om-i].getTipo().compareTo("Recarga") == 0) {

                datos[i][0] = this.movimientos[this.om-i].getFecha();
                datos[i][1] = this.movimientos[this.om-i].getTipo();
                datos[i][2] = Float.toString(this.movimientos[this.om-i].getMonto());
                datos[i][3] = "";
                datos[i][4] = "";
                datos[i][5] = "";

            } else if (this.movimientos[this.om-i].getTipo().compareTo("Consumo") == 0) {

                datos[i][0] = this.movimientos[this.om-i].getFecha();
                datos[i][1] = this.movimientos[this.om-i].getTipo();
                datos[i][2] = Float.toString(this.movimientos[this.om-i].getMonto());
                datos[i][3] = this.movimientos[this.om-i].getVehiculo().getPlaca();
                datos[i][4] = this.movimientos[this.om-i].getEstacion().getPeaje().getNombrePeaje();
                datos[i][5] = this.movimientos[this.om-i].getEstacion().getNombreEstacion();

            }
        }
        return datos;
    }

    public Object[] cabecera() {
        Object datos[] = new Object[6];
        datos[0] = "FECHA";
        datos[1] = "TIPO";
        datos[2] = "MONTO";
        datos[3] = "VEHICULO";
        datos[4] = "PEAJE";
        datos[5] = "ESTACION";
        return datos;
    }

    private boolean estaLleno() {
        boolean result = false;
        if (this.nm >= this.movimientos.length) {
            result = true;
        }
        return result;
    }

    public void crecerArreglo() {
        Movimiento movimientosPlus[] = new Movimiento[this.movimientos.length + 2];
        for (int i = 0; i < this.movimientos.length; i++) {
            movimientosPlus[i] = this.movimientos[i];
        }
        this.movimientos = movimientosPlus;
    }

    public void registrarMovimiento(String fecha, String tipo, float monto, Vehiculo vehiculo, Estacion estacion) {
        if (estaLleno()) {
            this.crecerArreglo();
        }
        this.nm++;
        this.om = this.nm - 1;
        this.movimientos[om] = new Movimiento(fecha, tipo, monto, vehiculo, estacion);
    }

    public void registrarMovimiento(String fecha, String tipo, float monto) {
        if (estaLleno()) {
            this.crecerArreglo();
        }
        this.nm++;
        this.om = this.nm - 1;
        this.movimientos[om] = new Movimiento(fecha, tipo, monto);
    }

    public void mostrarMovimientos() {
        System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", "Fecha", "Tipo", "Monto", "Vehículo", "Peaje", "Estación");
        System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", "=====", "====", "=====", "========", "=====", "========");
        for (int i = 0; i < nm; i++) {
            if (movimientos[i].getTipo().compareTo("Recarga") == 0) {
                System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", movimientos[i].getFecha(), movimientos[i].getTipo(), movimientos[i].getMonto(), "-----", "-----", "-----");
            } else if (movimientos[i].getTipo().compareTo("Consumo") == 0) {
                System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", movimientos[i].getFecha(), movimientos[i].getTipo(), movimientos[i].getMonto(), movimientos[i].getVehiculo().getPlaca() + " " + movimientos[i].getVehiculo().getMarca() + " " + movimientos[i].getVehiculo().getModelo(), movimientos[i].getEstacion().getPeaje().getNombrePeaje(), movimientos[i].getEstacion().getNombreEstacion());
            }
        }
    }
    public Movimiento getMovimiento(int i) { //Se puede usar para llamar a un movimeento del arreglo
        return movimientos[i];
    }

    @Override
    public void ordenarAZ(JFrame vista) {
         
        if(vista!=null){
        frmMovimientos vistaMovimientos=(frmMovimientos) vista;
        DefaultTableModel TablaUser;
        TablaUser = new DefaultTableModel(datosMovimientosAZ(),cabecera());
        vistaMovimientos.jMovimientos.setModel(TablaUser);
        }
    }

    @Override
    public void ordenarZA(JFrame vista) {
          if(vista!=null){
        frmMovimientos vistaMovimientos=(frmMovimientos) vista;
        DefaultTableModel TablaUser;
        TablaUser = new DefaultTableModel(datosMovimientosZA(),cabecera());
        vistaMovimientos.jMovimientos.setModel(TablaUser);
        }
    }

}
