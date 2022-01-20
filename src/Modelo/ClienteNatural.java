package Modelo;

public class ClienteNatural extends Cliente{
    private String nombres;
    private String apPaterno;
    private String apMaterno;
    private String sexo;
    private String fechaNacimiento;
    private Credencial credencial;

    public ClienteNatural() {
        
    }

    public ClienteNatural(String nombres, String apPaterno, String apMaterno, String sexo, String fechaNacimiento, Cliente cliente) {
        super(cliente);
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public ClienteNatural(String tipoDocumento, String numDocumento, String nombres, String apPaterno, String apMaterno, String sexo, String fechaNacimiento, String correo, String contraseña) {
        super(tipoDocumento, numDocumento, correo, contraseña);
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public ClienteNatural(String tipoDocumento, String numDocumento, String nombres, String apPaterno, String apMaterno, String sexo, String fechaNacimiento, String correo) {
        super(tipoDocumento, numDocumento, correo);
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
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

    @Override
    public String toString() {
        return "Tipo de Documento: " + getTipoDocumento() + "\n" +
               "Numero de Documento: " + getNumDocumento() + "\n" +
               "Correo: " + credencial.getCorreo() + "\n" +
               "Contraseña: " + credencial.getContraseña() + "\n" +
               "Nombres: " + nombres + "\n" +
               "Ap. Paterno: " + apPaterno + "\n" +
               "Ap. Materno:" + apMaterno + "\n" +
               "Sexo: " + sexo + "\n" +
               "Fecha de nacimiento: " + fechaNacimiento;
    }
    
}
