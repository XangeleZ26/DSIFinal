package Modelo;

import java.io.Serializable;

public class ArregloMovimientos implements Serializable {
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

    //ORDENAR MOVIMIENTOS
    public void ordenarMovimientosXFecha() {
        Movimiento aux;
        for (int i = 0; i < nm; i++) {
            for (int j = 0; j < (this.nm - 1); j++) {
                if (movimientos[j].getFecha().compareTo(movimientos[j + 1].getFecha()) > 0) {
                    aux = movimientos[j];
                    movimientos[j] = movimientos[j + 1];
                    movimientos[j + 1] = aux;
                }
            }
        }
    }

    public void ordenarMovimientosXMonto() {
        Movimiento aux;
        for (int i = 0; i < (this.nm); i++) {
            for (int j = 0; j < (this.nm - 1); j++) {
                if (movimientos[j].getMonto() > movimientos[j + 1].getMonto()) {
                    aux = movimientos[j];
                    movimientos[j] = movimientos[j + 1];
                    movimientos[j + 1] = aux;
                }
            }
        }
    }

    public void ordenarMovimientosXEstacion() {
        Movimiento aux;
        for (int z = 0; z < this.nm; z++) {
            if (this.movimientos[z].getEstacion() == null) {
                this.movimientos[z].setEstacion(new Estacion());
                this.movimientos[z].getEstacion().setNombreEstacion("¯");
            }
        }

        for (int i = 0; i < (this.nm); i++) {
            for (int j = 0; j < (this.nm - 1); j++) {
                if (movimientos[j].getEstacion().getNombreEstacion().compareTo(movimientos[j + 1].getEstacion().getNombreEstacion()) > 0) {
                    aux = movimientos[j];
                    movimientos[j] = movimientos[j + 1];
                    movimientos[j + 1] = aux;
                }

            }
        }
    }

    public void ordenarMovimientosXPlacaVehiculo() {
        Movimiento aux;
        for (int z = 0; z < this.nm; z++) {
            if (this.movimientos[z].getVehiculo() == null) {
                this.movimientos[z].setVehiculo(new Vehiculo());
                this.movimientos[z].getVehiculo().setPlaca("¯");
            }
        }
        for (int i = 0; i < (this.nm); i++) {
            for (int j = 0; j < (this.nm - 1); j++) {
                if (this.movimientos[j].getVehiculo().getPlaca().compareTo(this.movimientos[j + 1].getVehiculo().getPlaca()) > 0) {
                    aux = movimientos[j];
                    movimientos[j] = movimientos[j + 1];
                    movimientos[j + 1] = aux;
                }
            }

        }
    }

    public Movimiento getMovimiento(int i) { //Se puede usar para llamar a un movimeento del arreglo
        return movimientos[i];
    }
}
