
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
    public void agregarEstacion(String nombreEstacion, String codigoEstacion, Peaje peaje){
        //Se podría convertir a un método booelean?
        if(verificarExistenciaEstacion(nombreEstacion,codigoEstacion)==false){
            this.ne++;
            this.oe=this.ne-1;
            this.estaciones[oe] = new Estacion(nombreEstacion, codigoEstacion, peaje);
        }
    }
    
    public void agregarEstacion(Estacion estacion){
        //Se podría convertir a un método booelean?
        if(verificarExistenciaEstacion(estacion.getNombreEstacion(),estacion.getCodigoEstacion())==false){
            this.ne++;
            this.oe=this.ne-1;
            this.estaciones[oe] = estacion;
        }
    }
    
    public boolean verificarExistenciaEstacion(String nombreEstacion, String codigoEstacion){
        boolean result = false;
        if(this.ne!=0){
            for(int i=0;(i<ne && result==false);i++){
                if(this.estaciones[i].getNombreEstacion().compareTo(nombreEstacion)==0 &&
                   this.estaciones[i].getCodigoEstacion().compareTo(codigoEstacion)==0){
                    result = true;
                }
            }
        }
        return result;
        //Si es false, significa que la estación no existe en el peaje, por lo tanto se puede registrar
    }
    
    public void mostrarEstaciones(){
        float variacion;
        System.out.format("%-25s%-10s%-25s\n", "Nombre", "Codigo", "Peaje");
        System.out.format("%-25s%-10s%-25s\n", "======", "======", "=====");
        for(int i=0;i<ne;i++){
             System.out.format("%-25s%-10s%-25s\n", estaciones[i].getNombreEstacion(), estaciones[i].getCodigoEstacion(), estaciones[i].getPeaje().getNombrePeaje());
            /*if(estaciones[i].getPorcentajeVariacion()>1){
                variacion = ((float)Math.round((double)(estaciones[i].getPorcentajeVariacion()-1)*100))/100;
                System.out.format("%-25s%-10s%-10s%-25s\n", estaciones[i].getNombreEstacion(), estaciones[i].getCodigoEstacion(), "+"+variacion+"%", estaciones[i].getPeaje().getNombrePeaje());
            }
            else if(estaciones[i].getPorcentajeVariacion()<1){
                variacion = ((float)Math.round((double)(1-estaciones[i].getPorcentajeVariacion())*100))/100;
                System.out.format("%-25s%-10s%-10s%-25s\n", estaciones[i].getNombreEstacion(), estaciones[i].getCodigoEstacion(), "-"+variacion+"%", estaciones[i].getPeaje().getNombrePeaje());
            }*/
        }
    }
    
}
