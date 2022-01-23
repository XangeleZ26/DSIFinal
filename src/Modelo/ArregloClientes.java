package Modelo;

import java.io.Serializable;

public class ArregloClientes implements Serializable {
    private Cliente arregloCliente[];
    private int nc; //Cantidad total de clientes en el arreglo
    private int oc; //Orden en el arreglo del último cliente agregado
    
    //CONSTRUCTOR
    public ArregloClientes(){
        this.nc = 0;
        this.oc = this.nc-1;
        this.arregloCliente = new Cliente[Configuracion.maxClientes];
        
    }

    //MÉTODOS ACCESORES
    public Cliente getArregloCliente(int i){ //Sirve para invocar a un cliente del arreglo    
        return arregloCliente[i];
    }
    
    public void setArregloCliente(Cliente[] arregloCliente) {    
        this.arregloCliente = arregloCliente;
    }

    public int getNc() {
        return nc;
    }

    public int getOc() {
        return oc;
    }

    //MÉTODOS DE FUNCIONAMIENTO DE LA CLASE
    public boolean verificarExistenciaCliente(String tipoDoc, String numDoc) {
        boolean result = false;
        for(int i=0; i<nc && result==false; i++){
            if((tipoDoc.equals(this.arregloCliente[i].getTipoDocumento()))&&
                    (numDoc.equals(this.arregloCliente[i].getNumDocumento()))){
                result = true;
            }
        }
        return result;
    }
    
    public boolean verificarExistenciaCorreo(String correo){
        boolean result = false;
        for(int i=0; i<nc && result==false; i++){
            if(correo.equals(this.arregloCliente[i].getCredencial().getCorreo())){
                result = true;
            }
        }
        return result;
    }
    
    public boolean agregarCliente(Cliente cliente){
        boolean result = false;
            
            if(verificarExistenciaCliente(cliente.getTipoDocumento(),cliente.getNumDocumento())==false){
                if(estaLleno()){
                    this.crecerArreglo();
                }
                this.nc++;
                this.oc=this.nc-1;
                this.arregloCliente[this.oc] = cliente;
                result = true;
            }

        //Verificar si el agregado fue correcto
        /*if(result == false){
            this.nc--;
            this.oc = this.nc-1;
        }*/
        return result;
    }
    public Cliente buscarCliente(String correo,String contrasena){
        int indice=-2;
        for(int i=0;i<nc;i++){
            if(this.arregloCliente[i].getCredencial().getCorreo().equalsIgnoreCase(correo)&&this.arregloCliente[i].getCredencial().getContraseña().equalsIgnoreCase(contrasena)){
                indice=i;
            }
        }
        return this.arregloCliente[indice];
    }
    
    public int buscarOrdenCliente(String correo,String contrasena){
        int indice=-2;
        for(int i=0;i<nc;i++){
            if(this.arregloCliente[i].getCredencial().getCorreo().equalsIgnoreCase(correo)&&this.arregloCliente[i].getCredencial().getContraseña().equalsIgnoreCase(contrasena)){
                indice=i;
            }
        }
        return indice;
    }
    
    public void crecerArreglo(){
        Cliente clientePlus[]=new Cliente[this.arregloCliente.length+2];
        for(int i=0; i<this.arregloCliente.length; i++) {
            clientePlus[i] = this.arregloCliente[i];
        }
        this.arregloCliente = clientePlus;
    }
    private boolean estaLleno() {
        boolean result = false;
        if(this.nc >=this.arregloCliente.length){
            result = true;
        }
        return result;
    }
    
    public boolean eliminarCliente(Cliente cliente){
        boolean result = false;
        int orden=-1;
        //Primero se debe encontrar el orden del objeto en el arreglo
        for(int i=0; i<nc && orden==-1 ;i++){
            if(cliente == this.arregloCliente[i]){
                orden=i;
                result = true;
            }
        }
        //Una vez ubicado el orden del objeto, se borra copiando los objetos de adelante hacia atrás
        if(result==true){
        for(int i=orden; i<nc-1; i++){
            this.arregloCliente[i] = this.arregloCliente[i+1];
        }
        //Se borra el espacio en memoria sobrante y se modifica la cantidad y el orden de objetos
        this.arregloCliente[this.nc-1] = null;
        this.nc--;
        this.oc=this.nc-1;
        }
        
//        Verificar si el eliminado fue correcto
//        if(result == false){
//            this.nc++;
//            this.oc = this.nc-1;
//        }
        return result;
    }
    
    public void mostrarClientes(){
        System.out.format("%-12s%-12s%-15s%-15s%-15s%-12s%-14s%-40s%-25s\n","Tipo Doc.","Num. Doc.","Nombres","A. Paterno","A. Materno","Sexo","Fecha Nac.","Correo","Contraseña");
        System.out.format("%-12s%-12s%-15s%-15s%-15s%-12s%-14s%-40s%-25s\n","=========","=========","=======","==========","==========","====","==========","======","==========");
        for(int i=0;i<nc;i++){
            System.out.format("%-12s%-12s%-15s%-15s%-15s%-12s%-14s%-40s%-25s\n",arregloCliente[i].getTipoDocumento(),arregloCliente[i].getNumDocumento(),arregloCliente[i].getNombres(),arregloCliente[i].getApPaterno(),arregloCliente[i].getApMaterno(),arregloCliente[i].getSexo(),arregloCliente[i].getFechaNacimiento(),arregloCliente[i].getCredencial().getCorreo(),arregloCliente[i].getCredencial().getContraseña());
        }
    }

    @Override
    public String toString() {
        String contenido = "";
         for(int i=0;i<this.nc;i++){
             contenido+=this.arregloCliente[i]+"\n";
         }
         return contenido;
    }
    
}
