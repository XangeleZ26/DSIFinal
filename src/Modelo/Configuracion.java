
package Modelo;

public class Configuracion {
    public static int maxVehiculosXCliente = 10;
    public static int maxClientes = 10;
    public static int maxEstacionesXPeaje = 10;
    public static int maxMovimientos = 10;
    public static int maxPeajes = 10;
    
    public static ArregloClientes arrClientes=new ArregloClientes();

    public static ArregloClientes getArrClientes() {
        return arrClientes;
    }

    public static void setArrClientes(ArregloClientes arrClientes) {
        Configuracion.arrClientes = arrClientes;
    }
    
    
}

