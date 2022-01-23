
package Controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Serializacion {
    private ObjectOutputStream escribir;
    private ObjectInputStream lector;
    public Serializacion(){
  try {
        File archivo=new File("C:/Users/GIGABYTE/Desktop/VS CODES/Java/G04_ProyectoFinal/archivoUser.txt");       
            archivo.createNewFile();
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(null,"No se pudo crear el archivo");
        }
    }
    public void serializar(String archivo,Object arreglo) throws Exception{
        try { 
            this.escribir=new ObjectOutputStream(new FileOutputStream(archivo));
            escribir.writeObject(arreglo);
            escribir.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally{
            this.escribir.close();
        }
        
    }
    public Object deserializar(String archivo) throws Exception{
        Object  arreglo = null;
 
        try {
            this.lector = new ObjectInputStream(new FileInputStream(archivo));
            arreglo = (Object)lector.readObject();
        } catch (Exception ex) {
        }finally{
            this.lector.close();
        }
        return arreglo;  
    }
}
