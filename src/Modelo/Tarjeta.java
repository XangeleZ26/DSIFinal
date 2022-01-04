
package Modelo;

import java.time.Instant;
import java.util.Date;

public class Tarjeta {

    private String medioPago;
    private String numTarjeta;
    private String claveTarjeta;
    private String fechaVencimiento;
    private String cvv;

    public Tarjeta(){
        
    }
    
    //MÉTODOS ACCESORES
    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getClaveTarjeta() {
        return claveTarjeta;
    }

    public void setClaveTarjeta(String claveTarjeta) {
        this.claveTarjeta = claveTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    
    //CONSTRUCTORES
    public Tarjeta(String medioPago, String numTarjeta, String claveTarjeta, String fechaVencimiento, String cvv) {
        this.medioPago = medioPago;
        this.numTarjeta = numTarjeta;
        this.claveTarjeta = claveTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
    }

    public Tarjeta(String medioPago, String numTarjeta, String claveTarjeta) {
        this.medioPago = medioPago;
        this.numTarjeta = numTarjeta;
        this.claveTarjeta = claveTarjeta;
    }
    
    //MÉTODOS DEL FUNCIONAMIENTO DE LA CLASE
    public void editarTarjeta(String numTarjeta) {
        //Revisar este método, es posible que sea innecesario
    }

    public boolean verificarDatosTarjeta(String numTarjeta, String claveTarjeta) {
        boolean result = false;
        if(numTarjeta == this.numTarjeta && claveTarjeta == this.claveTarjeta){
            result = true;
        }
        return result;
    }
    
    /*Visa: el primer número es 4 (16 números)
    Master Card: los dos primeros números están entre 51 y 55 (16 números)
    Diners Club: los primeros números están entre 300-305, 36, 38 y 39 (14 números)
    American Express: Los dos primeros números pueden ser 34 y 37 (15 números)*/
    
    public boolean verificarValidezTajeta() {
        boolean result = false;
        String aux;
        if(numTarjeta.length() == 16){
            if(this.numTarjeta.charAt(0) == '4' && medioPago.compareTo("VISA")==0){ //VISA
                result = true;
            }
            else if(this.numTarjeta.charAt(0) == '5' && medioPago.compareTo("MASTER CARD")==0){ //MASTER CARD
                switch (this.numTarjeta.charAt(1)){
                    case '1': 
                    case '2': 
                    case '3': 
                    case '4': 
                    case '5': result = true;
                        break;
                    default: result = false;
                        break;
                }
            }
        }
        else if (numTarjeta.length() == 15 && this.numTarjeta.charAt(0) == '3' && medioPago.compareTo("AMERICAN EXPRESS")==0) {
            switch(this.numTarjeta.charAt(1)){ //AMERICAN EXPRESS
                case '4':
                case '7': result = true;
                    break;
                default: result = false;
                    break;
            }
        }
        else if(numTarjeta.length() == 14 && this.numTarjeta.charAt(0) == '3' && medioPago.compareTo("DINERS CLUB")==0){
            switch(this.numTarjeta.charAt(1)){ //DINERS CLUB
                case '0':
                case '6':
                case '8':
                case '9': result = true;
                    break;
                default: result = false;
                    break;
            }
        }
        return result;
    }
    
    //REVISAR FUNCIONAMIENTO
    public boolean verificarVigenciaTarjeta(String fechaActual) {
        boolean result = false;
        
        if(this.fechaVencimiento.compareTo(fechaActual)>0){
            return true;
        }
        
        return result;
    }

    @Override
    public String toString() {
        return "***Datos de Tarjeta***" + "\n" +
                "Medio de Pago: " + medioPago + "\n" +
                "Número de Tarjeta: " + numTarjeta + "\n" +
                "Clave de Tarjeta: " + claveTarjeta + "\n" +
                "Fecha de Vencimiento: " + fechaVencimiento + "\n" +
                "CVV: " + cvv;
    }

}