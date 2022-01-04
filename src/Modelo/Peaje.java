
package Modelo;

public class Peaje {
    private String nombrePeaje;
    private float livianoPublico;
    private float livianoPrivado;
    private float pesado;
    private Estacion estaciones[]=new Estacion[Configuracion.maxEstacionesXPeaje];
    private int ne;
    private int oe;
    
    //MÉTODOS ACCESORES
    public String getNombrePeaje() {
        return nombrePeaje;
    }

    public void setNombrePeaje(String nombrePeaje) {
        this.nombrePeaje = nombrePeaje;
    }

    public float getLivianoPublico() {
        return livianoPublico;
    }

    public void setLivianoPublico(float livianoPublico) {
        this.livianoPublico = livianoPublico;
    }

    public float getLivianoPrivado() {
        return livianoPrivado;
    }

    public void setLivianoPrivado(float livianoPrivado) {
        this.livianoPrivado = livianoPrivado;
    }

    public float getPesado() {
        return pesado;
    }

    public void setPesado(float pesado) {
        this.pesado = pesado;
    }
    //OJO
    public Estacion getEstaciones(int i) {
        return estaciones[i];
    }

    public void setEstaciones(Estacion[] estaciones) {
        this.estaciones = estaciones;
    }

    @Override
    public String toString() {
        return "***Datos del peaje***" + "\n" +
                "Nombre: " + nombrePeaje + "\n" +
                "Precio Liviano Público: " + livianoPublico + "\n" +
                "Precio Liviano Privado: " + livianoPrivado + "\n" +
                "Precio Pesado: " + pesado;
    }
    
    //CONSTRUCTOR
    public Peaje(String nombrePeaje, float livianoPublico, float livianoPrivado, float pesado) {
        this.nombrePeaje = nombrePeaje;
        this.livianoPublico = livianoPublico;
        this.livianoPrivado = livianoPrivado;
        this.pesado = pesado;
    }
    
    //MÉTODOS DEL FUNCIONAMIENTO DE LA CLASE
    public void agregarEstacion(String nombreEstacion, String codigoEstacion, float porcentajeVariacion, Peaje peaje){
        this.ne++;
        this.oe=this.ne-1;
        this.estaciones[oe] = new Estacion(nombreEstacion, codigoEstacion, porcentajeVariacion, peaje);
    }
    
    public void mostrarEstaciones(){
        float variacion;
        System.out.format("%-25s%-10s%-10s%-25s\n", "Nombre", "Codigo", "Var.", "Peaje");
        System.out.format("%-25s%-10s%-10s%-25s\n", "======", "======", "====", "=====");
        for(int i=0;i<ne;i++){
            if(estaciones[i].getPorcentajeVariacion()>1){
                variacion = ((float)Math.round((double)(estaciones[i].getPorcentajeVariacion()-1)*100))/100;
                System.out.format("%-25s%-10s%-10s%-25s\n", estaciones[i].getNombreEstacion(), estaciones[i].getCodigoEstacion(), "+"+variacion+"%", estaciones[i].getPeaje().getNombrePeaje());
            }
            else if(estaciones[i].getPorcentajeVariacion()<1){
                variacion = ((float)Math.round((double)(1-estaciones[i].getPorcentajeVariacion())*100))/100;
                System.out.format("%-25s%-10s%-10s%-25s\n", estaciones[i].getNombreEstacion(), estaciones[i].getCodigoEstacion(), "-"+variacion+"%", estaciones[i].getPeaje().getNombrePeaje());
            }
        }
    }
    
}
