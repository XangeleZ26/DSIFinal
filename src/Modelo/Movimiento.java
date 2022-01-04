
package Modelo;

import java.util.Date;

public class Movimiento {

    private String fecha;
    //private String hora;
    private float monto;
    private String tipo;
    private Estacion estacion;
    private Vehiculo vehiculo;

    public Movimiento(String fecha, String tipo, float monto, Vehiculo vehiculo, Estacion estacion) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.monto = monto;
        this.vehiculo = vehiculo;
        this.estacion = estacion;
    }

    public Movimiento(String fecha, String tipo, float monto) {
        this.monto = monto;
        this.tipo = tipo;
        this.fecha = fecha;
        this.vehiculo = null;
        this.estacion = null;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Estacion getEstacion() {
        return estacion;
    }

    public void setEstacion(Estacion estacion) {
        this.estacion = estacion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void mostrarBoleta(String fecha, float monto) {
        
    }
    /*
    public void agregarMovimiento(Date fecha, float monto) {
           
    }
    */
    /*
    @Override
    public String toString() {
        return  "***Datos del movimiento***" + "\n" +
                "Fecha: " + fecha + "\n" +
                "Monto: " + monto + "\n"
                "Vehiculo: " + vehiculo.getPlaca() + " " + vehiculo.getMarca() + " " + vehiculo.getModelo() + "\n" +
                "Estacion: " + estacion.getCodigoEstacion() + " " + estacion.getNombreEstacion();
    }
    */
    public String imprimirMovimientoSimple(){
        if(this.vehiculo!=null && this.estacion!=null){
            return "***Datos del movimiento***" + "\n" +
                   "Fecha: " + fecha + "\n" +
                   "Monto: " + monto + "\n" +
                   "Vehiculo: " + vehiculo.getPlaca() + " " + vehiculo.getMarca() + " " + vehiculo.getModelo() + "\n" +
                   "Estacion: " + estacion.getCodigoEstacion() + " " + estacion.getNombreEstacion();
        }
        else if(this.vehiculo==null && this.estacion==null){
            return "***Datos del movimiento***" + "\n" +
                   "Fecha: " + fecha + "\n" +
                   "Monto: " + monto;
        }
        else{
            return "El movimiento no existe";
        }
    }
}
