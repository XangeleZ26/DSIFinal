
package Modelo;

public class ArregloPeajes {
    private Peaje arregloPeajes[];
    private int np; //Cantidad de peajes en el arreglo
    private int op; //Orden en el arreglo del último peaje registrado
    
    //Constructor
    public ArregloPeajes() {
        this.np = 0;
        this.arregloPeajes = new Peaje[Configuracion.maxPeajes];
    }
    
    //Métodos accesores
    public Peaje getArregloPeajes(int i) { //Sirve para invocar a un objeto Peaje del arreglo
        return arregloPeajes[i];
    }

    public void setArregloPeajes(Peaje[] arregloPeajes) {
        this.arregloPeajes = arregloPeajes;
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }
    
    //Métodos de funcionamiento de la clase
    public boolean agregarPeaje(Peaje peaje){
        boolean result = false;
        if(verificarExistenciaPeaje(peaje.getNombrePeaje())==false){
            this.np++;
            this.op=this.np-1;
            this.arregloPeajes[op]=peaje;
            result = true;
        }
        return result;
    }
    
    public boolean agregarPeaje(String nombrePeaje, float livianoPublico, float livianoPrivado, float pesado){
        boolean result = false;
        if(verificarExistenciaPeaje(nombrePeaje)==false){
            this.np++;
            this.op=this.np-1;
            this.arregloPeajes[op] = new Peaje(nombrePeaje, livianoPublico, livianoPrivado, pesado);
            result = true;
        }
        return result;
    }
    
    public boolean borrarPeaje(Peaje peaje){
        boolean result = false;
        int orden = -1;
        //Buscar en qué orden del arreglo se encuentra el objeto
        for (int i=0; i<np && orden==-1; i++) {
            if (peaje == this.arregloPeajes[i]) {
                orden = i;
                result = true;
            }
        }
        //Una vez ubicado el objeto, se borra copiándose todos los objetos desde adelante hacia atrás
        for (int i=orden;i<np;i++) {
            this.arregloPeajes[i] = this.arregloPeajes[i+1];
        }
        //Se borra el último espacio en memoria del arreglo y se cambia el número y el orden de los vehículos
        this.arregloPeajes[this.op] = null;
        this.np--;
        this.op = this.np - 1;
        //Verificar si el borrado fue correcto
        if (result == false) {
            this.np++;
            this.op = this.np-1;
        }
        return result;
    }
    
    public boolean verificarExistenciaPeaje(String nombrePeaje){
        boolean result = false;
        if(np!=0){
            for(int i=0;(i<np && result==false);i++){
                if(nombrePeaje.compareTo(arregloPeajes[i].getNombrePeaje())==0){
                    result = true;
                }
            }
        }
        return result;
        //Si es false, significa que el peaje no existe, por lo tanto se puede registrar
    }
    
    /*Este método verifica si la estación existe en cualquiera de los peajes registrados
    en el arreglo*/
    public boolean verificarExistenciaGeneralEstacion(Estacion estacion){
        boolean result = false;
        if(this.np!=0){
            for(int i=0;i<np;i++){
                if(this.arregloPeajes[i].verificarExistenciaEstacion(estacion.getNombreEstacion(), estacion.getCodigoEstacion())==false){
                    result = true;
                }
            }
        }
        return result;
        /*Si es false, significa que la estación no existe en ningún peaje, por lo tanto
        se puede registrar*/
    }
    
    /*Este método verifica si la estación existe en cualquiera de los peajes registrados
    en el arreglo*/
    public boolean verificarExistenciaGeneralEstacion(String nombreEstacion, String codigoEstacion){
        boolean result = false;
        if(this.np!=0){
            for(int i=0;i<np;i++){
                if(this.arregloPeajes[i].verificarExistenciaEstacion(nombreEstacion,codigoEstacion)==false){
                    result = true;
                }
            }
        }
        return result;
        /*Si es false, significa que la estación no existe en ningún peaje, por lo tanto
        se puede registrar*/
    }
}
