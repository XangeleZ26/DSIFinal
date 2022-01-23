package Modelo;

import java.io.Serializable;

public class Estacion implements Serializable{
    private String nombreEstacion;
    private String codigoEstacion;
    //private float tarifaNeta;
    private Peaje peaje;
    //private float porcentajeVariacion;
    
    //MÉTODOS ACCESORES
    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    public String getCodigoEstacion() {
        return codigoEstacion;
    }

    public void setCodigoEstacion(String codigoEstacion) {
        this.codigoEstacion = codigoEstacion;
    }

    /*public float getTarifaNeta() {
    return tarifaNeta;
    }
    public void setTarifaNeta(float tarifaNeta) {
    this.tarifaNeta = tarifaNeta;
    }*/

    //public float getPorcentajeVariacion() {
    //    return porcentajeVariacion;
    //}

    //public void setPorcentajeVariacion(float porcentajeVariacion) {
    //    this.porcentajeVariacion = porcentajeVariacion;
    //}

    public Peaje getPeaje() {
        return peaje;
    }

    public void setPeaje(Peaje peaje) {
        this.peaje = peaje;
    }
    
    //CONSTRUCTOR
    public Estacion(String nombreEstacion, String codigoEstacion, Peaje peaje) {
        this.nombreEstacion = nombreEstacion;
        this.codigoEstacion = codigoEstacion;
        this.peaje = peaje;
    }
    
    //Calcular la tarifa neta
    
    public float calcularTarifaNeta(int ejes, String categoria, String tipoUso){
        float tarifaNeta = (float)0;
        if("Liviano".compareTo(categoria)==0){ 
            if("Público".compareTo(tipoUso)==0){
                tarifaNeta = ((float)ejes)*((float)this.getPeaje().getLivianoPublico());
            }
            else if("Privado".compareTo(tipoUso)==0){
                tarifaNeta = ((float)ejes)*((float)this.getPeaje().getLivianoPrivado());
            }
        }
        else if("Pesado".compareTo(categoria)==0){
            tarifaNeta = ((float)ejes)*((float)this.getPeaje().getPesado());
        }
        //Redondear a dos cifras
        tarifaNeta = (float)(Math.round((double)tarifaNeta*100.0)/100.0);
        return tarifaNeta;
    }
    
    @Override
    public String toString() {
        return "***DATOS DE LA ESTACIÓN***" + "\n" +
               "Nombre de la estación: " + nombreEstacion + "\n" +
               "Codigo de la estación" + codigoEstacion + "\n" +
               "Nombre del peaje: " + peaje.getNombrePeaje();
    }
    
}
