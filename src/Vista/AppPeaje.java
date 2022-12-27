package Vista;

import Modelo.ArregloClientes;
import Modelo.Cliente;
import Modelo.Configuracion;
import Modelo.Peaje;
import Modelo.Tarjeta;
import java.text.SimpleDateFormat;
import java.util.Date;
import Controlador.*;
import java.io.File;

public class AppPeaje {

    public static void main(String[] args) {
   
        File archivo=new File("archivoUser.txt");
        if(archivo.exists()){
        try {
            ArregloClientes extra = (ArregloClientes) Configuracion.serial.deserializar("archivoUser.txt");
            Configuracion.arrClientes = extra;
        } catch (Exception ex) {
            System.out.println("archivo vacio, primer guardado y/o archivo inexistente");
        }}
        System.out.println(Configuracion.arrClientes);
        frmPaginaPrincipal fPrincipal = new frmPaginaPrincipal();
 
        ControladorPrincipal ctrlPrincipal = new ControladorPrincipal(fPrincipal);
        ctrlPrincipal.iniciar();
        Configuracion.arrClientes.mostrarClientes();
 
    }

}
