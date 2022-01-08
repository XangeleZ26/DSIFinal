
package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private String tipoDocumento;
    private String numDocumento;
    private String nombres;
    private String apPaterno;
    private String apMaterno;
    private String sexo;
    private String fechaNacimiento;
    private String correo;
    private String contraseña;
    private Direccion direccion;
    //private Tarjeta tarjeta;
    private Cuenta cuenta;
    
    //CONSTRUCTORES
    public Cliente(Cliente cliente){
        this.tipoDocumento = cliente.tipoDocumento;
        this.numDocumento = cliente.numDocumento;
        this.nombres = cliente.nombres;
        this.apPaterno = cliente.apPaterno;
        this.apMaterno = cliente.apMaterno;
        this.sexo = cliente.sexo;
        this.fechaNacimiento = cliente.fechaNacimiento;
        this.correo = cliente.correo;
        this.contraseña = cliente.numDocumento;
    }
    
    public Cliente(String tipoDocumento, String numDocumento, String nombres, String apPaterno, String apMaterno, String sexo, String fechaNacimiento, String correo,String contrasena) {
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.contraseña = contrasena;             
    }
    public Cliente(String tipoDocumento, String numDocumento, String nombres, String apPaterno, String apMaterno, String sexo, String fechaNacimiento, String correo) {
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.contraseña = numDocumento;             
    }

    public Cliente(String tipoDocumento, String numDocumento, String nombres, String apPaterno) {
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.nombres = nombres;
        this.apPaterno = apPaterno;
    }

    public Cliente(String numDocumento, String correo) {
        this.numDocumento = numDocumento;
        this.correo = correo;
    }

    public Cliente(String numDocumento, String correo, String contraseña) {
        this.numDocumento = numDocumento;
        this.correo = correo;
        this.contraseña = contraseña;
    }
    
    //MÉTODO Contraseña
    public int cambioContrasena(String contrasena,String novoContra,String verifContra){
        int result=0;
        if(!(this.contraseña.equals(contrasena))){
            result=1;
        }
         if(!(novoContra.equals(verifContra))){
            result=2;
        }
         if((!(this.contraseña.equals(contrasena)))&&(!(novoContra.equals(verifContra)))){
             result=3;
         }
          return result;
    }
    
    //MÉTODOS ACCESORES
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Direccion getDireccion() { //Se puede usar para registrar dirección
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    /*public Tarjeta getTarjeta() { //Se puede usar para registrar tarjeta
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }*/

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    //MÉTODOS DEL FUNCIONAMIENTO DE LA CLASE
    public void registrarDireccion(String departamento, String provincia, String distrito, String avenida, int numero, String telefono){
        this.direccion = new Direccion(departamento,provincia,distrito,avenida,numero,telefono);
    }
    
    public boolean crearCuenta(Tarjeta tarjeta){
        boolean result = false;
        Date fechaActual = new Date();
        SimpleDateFormat fecha = new SimpleDateFormat("yyyy/MM"); 
        if(tarjeta.verificarValidezTajeta()==true && tarjeta.verificarVigenciaTarjeta(fecha.format(fechaActual))){
            this.cuenta = new Cuenta (tarjeta);
            result = true;
        }
        return result; 
    }
    
    /*public void registrarTarjeta(String medioPago, String numTarjeta, String claveTarjeta, String fechaVencimiento, String cvv){
        this.tarjeta = new Tarjeta(medioPago,numTarjeta,claveTarjeta,fechaVencimiento,cvv);
    }*/
    
    public void cambiarCorreo(String nuevoCorreo){
        this.correo = nuevoCorreo;
    }
    
    public void cambiarContraseña(String nuevaContraseña){
        this.contraseña = nuevaContraseña;
    }

    @Override
    public String toString() {
        return "***Datos de Usuario***" + "\n" +
               "Tipo de Documento: " + tipoDocumento + "\n" +
               "Numero de Documento: " + numDocumento + "\n" +
               "Nombres: " + nombres + "\n" +
               "Ap. Paterno: " + apPaterno + "\n" +
               "Ap. Materno: " + apMaterno + "\n" +
               "Sexo: " + sexo + "\n" +
               "Fecha de nacimiento: " + fechaNacimiento + "\n" +
               "Correo: " + correo + "\n" +
               "Contraseña: " + contraseña;
    }
    
}