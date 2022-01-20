package Modelo;

public class ClienteJuridico extends Cliente{
    private String razonSocial;
    private Credencial credencial;

    public ClienteJuridico() {
        
    }

    public ClienteJuridico(String razonSocial, Cliente cliente) {
        super(cliente);
        this.razonSocial = razonSocial;
    }

    public ClienteJuridico(String tipoDocumento, String numDocumento, String razonSocial, String correo, String contraseña) {
        super(tipoDocumento, numDocumento, correo, contraseña);
        this.razonSocial = razonSocial;
    }

    public ClienteJuridico(String tipoDocumento, String numDocumento, String razonSocial, String correo) {
        super(tipoDocumento, numDocumento, correo);
        this.razonSocial = razonSocial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public String toString() {
        return "Tipo de Documento: " + getTipoDocumento() + "\n" +
               "Numero de Documento: " + getNumDocumento() + "\n" +
               "Correo: " + credencial.getCorreo() + "\n" +
               "Contraseña: " + credencial.getContraseña() + "\n" +
               "razonSocial=" + razonSocial;
    }
    
}
