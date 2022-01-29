package Modelo;

import java.io.Serializable;
import java.util.Date;

public class Cuenta extends Credencial implements Serializable{
private static final long serialVersionUID=26L;
    private float saldoTotal;
    private float monto;
    private Tarjeta tarjeta;
    private Movimiento movimientos[];
    private int nm;//Cantidad de movimientos en el arreglo
    private int om;//Orden en el arreglo del último vehículo agregado
    private Vehiculo vehiculos[];
    private int nv; //Cantidad de vehículos en el arreglo
    private int ov; //Orden en el arreglo del último vehículo agregado
//    private Estacion estacion;
    
    public Cuenta() {
        super();
        this.saldoTotal = 12;
        this.tarjeta = null;
        this.nv = 0;
        this.ov = nv - 1;
        this.vehiculos = new Vehiculo[Configuracion.maxVehiculosXCliente];
        this.nm = 0;
        this.om = this.nm - 1;
        this.movimientos = new Movimiento[Configuracion.maxMovimientos];
    }

    //CONSTRUCTORES
    public Cuenta(Tarjeta tarjeta) {
        this.saldoTotal = 12;
        this.tarjeta = tarjeta;
        this.nv = 0;
        this.ov = nv - 1;
        this.vehiculos = new Vehiculo[Configuracion.maxVehiculosXCliente];
        this.nm = 0;
        this.om = this.nm - 1;
        this.movimientos = new Movimiento[Configuracion.maxMovimientos];
    }

    //MÉTODOS ACCESORES
    
    //AGREGADO
//    public Estacion getEstacion() {
//        return estacion;
//    }
//
//    public void setEstacion(Estacion estacion) {
//        this.estacion = estacion;
//    }
    //AGREGADO
    
    //MÉTODOS ACCESORES
    public float getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(float saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Movimiento getMovimientos(int i) { //Se puede usar para llamar a un movimeento del arreglo
        return movimientos[i];
    }

    public void setMovimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
    }

    //OJO
    public Vehiculo getVehiculos(int i) { //Se puede usar para llamar a un vehículo del arreglo
        return vehiculos[i];
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getNm() {
        return nm;
    }

    public int getNv() {
        return nv;
    }

    //MÉTODOS DEL FUNCIONAMIENTO DE LA CLASE
    public boolean registrarVehiculo(String placa, String marca, String modelo, String categoria, int ejes, String tipoUso, float pesoBruto, int año, Cliente dueño) {
        boolean result = false;
        if(nv != Configuracion.maxVehiculosXCliente){
            if (verificarExistenciaVehiculo(placa) == false) {
            this.nv++;
            this.ov = this.nv - 1;
            this.vehiculos[ov] = new Vehiculo(placa, marca, modelo, categoria, ejes, tipoUso, pesoBruto, año, dueño);
            result = true;
            //Verificar si el registro fue correcto
            if (result == false) {
                this.nv--;
                this.ov = this.nv - 1;
            }
            }
        }
        
        return result;
    }

    public boolean registrarVehiculo(String placa, String marca, String modelo, int ejes, float pesoBruto, int año, Cliente dueño) {
        boolean result = false;
        if (verificarExistenciaVehiculo(placa) == false) {
            this.nv++;
            this.ov = this.nv - 1;
            this.vehiculos[ov] = new Vehiculo(placa, marca, modelo, ejes, pesoBruto, año, dueño);
            result = true;
            //Verificar si el registro fue correcto
            if (result == false) {
                this.nv--;
                this.ov = this.nv - 1;
            }
        }
        return result;
    }

    public boolean eliminarVehiculo(Vehiculo vehiculo) {
        boolean result = false;
        int orden = -1;
        //Buscar en qué orden del arreglo se encuentra el objeto
        for (int i = 0; i < nv && orden == -1; i++) {
            if (vehiculo == this.vehiculos[i]) {
                orden = i;
                result = true;
            }
        }
        //Una vez ubicado el objeto, se borra copiándose todos los objetos desde adelante hacia atrás
        for (int i = orden; i < nv; i++) {
            this.vehiculos[i] = this.vehiculos[i + 1];
        }
        //Se borra el último espacio en memoria del arreglo y se cambia el número y el orden de los vehículos
        this.vehiculos[this.ov] = null;
        this.nv--;
        this.ov = this.nv - 1;
        //Verificar si el borrado fue correcto
        if (result == false) {
            this.nv++;
            this.ov = this.nv - 1;
        }
        return result;
    }
    
    //Nuevo método de Eliminar Vehículo
    public void eliminarVehiculo(int orden) {
        //Se borra copiándose todos los objetos desde adelante hacia atrás
        for (int i = orden; i < nv; i++) {
            this.vehiculos[i] = this.vehiculos[i + 1];
        }
        //Se borra el último espacio en memoria del arreglo y se cambia el número y el orden de los vehículos
        this.vehiculos[this.ov] = null;
        this.nv--;
        this.ov = this.nv - 1;
    }
    
    //Nuevo método de Eliminar Vehículo usando la placa
    public boolean eliminarVehiculo(String placa) {
        boolean result = false;
        //Se buscael vehículo en el arreglo y se almacena su orden
        int orden=-1;
        orden = buscarOrdenVehiculo(placa);
        
        if(orden>=0){
            //Se borra copiándose todos los objetos desde adelante hacia atrás
            for (int i = orden; i < nv; i++) {
                this.vehiculos[i] = this.vehiculos[i + 1];
            }
            //Se borra el último espacio en memoria del arreglo y se cambia el número y el orden de los vehículos
            this.vehiculos[this.ov] = null;
            this.nv--;
            this.ov = this.nv - 1;
            result = true;
        }
        return result;
    }
    
    //Método que devuelve el orden de un vehículo en el arreglo
    public int buscarOrdenVehiculo(String placa) {
        int orden = -1;
        for (int i = 0; (i < nv && orden == -1); i++) {
            if (placa.equals(this.vehiculos[i].getPlaca())) {
                orden = i;
            }
        } 
        return orden;
    }
    
    public boolean verificarExistenciaVehiculo(String placa) {
        boolean result = false;
        for (int i = 0; i < nv; i++) {
            if (placa.equals(this.vehiculos[i].getPlaca())) {
                result = true;
            }
        }
        return result;
    }

    public void ordenarVehiculosXEjes() {
        Vehiculo aux;
        for (int i = 0; i < (this.nv); i++) {
            for (int j = i + 1; j < (this.nv); j++) {
                if (vehiculos[i].getEjes() > vehiculos[j].getEjes()) {
                    aux = vehiculos[i];
                    vehiculos[i] = vehiculos[j];
                    vehiculos[j] = aux;
                }
            }
        }
    }

    public void ordenarVehiculosXPesoBruto() {
        Vehiculo aux;
        for (int i = 0; i < (this.nv); i++) {
            for (int j = i + 1; j < (this.nv); j++) {
                if (vehiculos[i].getPesoBruto() > vehiculos[j].getPesoBruto()) {
                    aux = vehiculos[i];
                    vehiculos[i] = vehiculos[j];
                    vehiculos[j] = aux;
                }
            }
        }
    }

    public void ordenarVehiculosXAño() {
        Vehiculo aux;
        for (int i = 0; i < (this.nv); i++) {
            for (int j = i + 1; j < (this.nv); j++) {
                if (vehiculos[i].getAño() > vehiculos[j].getAño()) {
                    aux = vehiculos[i];
                    vehiculos[i] = vehiculos[j];
                    vehiculos[j] = aux;
                }
            }
        }
    }

    public void ordenarVehiculosXPlaca() {
        Vehiculo aux;
        for (int i = 0; i < (this.nv); i++) {
            for (int j = i + 1; j < (this.nv); j++) {
                if (vehiculos[i].getPlaca().compareTo(vehiculos[j].getPlaca()) > 0) {
                    aux = vehiculos[i];
                    vehiculos[i] = vehiculos[j];
                    vehiculos[j] = aux;
                }
            }
        }
    }

    public void mostrarVehiculos() {
        System.out.format("%-15s%-15s%-15s%-12s%-8s%-10s%-10s%-6s\n", "Placa", "Marca", "Modelo", "Categoría", "Ejes", "Uso", "Peso", "Año");
        System.out.format("%-15s%-15s%-15s%-12s%-8s%-10s%-10s%-6s\n", "=====", "=====", "======", "=========", "====", "===", "====", "===");
        for (int i = 0; i < nv; i++) {
            System.out.format("%-15s%-15s%-15s%-12s%-8s%-10s%-10s%-6s\n", vehiculos[i].getPlaca(), vehiculos[i].getMarca(), vehiculos[i].getModelo(), vehiculos[i].getCategoria(), vehiculos[i].getEjes(), vehiculos[i].getTipoUso(), vehiculos[i].getPesoBruto(), vehiculos[i].getAño());
        }
    }

    //MOVIMIENTOS
    private boolean estaLleno() {
        boolean result = false;
        if (this.nm >= this.movimientos.length) {
            result = true;
        }
        return result;
    }

    public void crecerArreglo() {
        Movimiento movimientosPlus[] = new Movimiento[this.movimientos.length + 2];
        for (int i = 0; i < this.movimientos.length; i++) {
            movimientosPlus[i] = this.movimientos[i];
        }
        this.movimientos = movimientosPlus;
    }

    public void registrarMovimiento(String fecha, String tipo, float monto, Vehiculo vehiculo, Estacion estacion) {
        if (estaLleno()) {
            this.crecerArreglo();
        }
        this.nm++;
        this.om = this.nm - 1;
        this.movimientos[om] = new Movimiento(fecha, tipo, monto, vehiculo, estacion);
    }

    public void registrarMovimiento(String fecha, String tipo, float monto) {
        if (estaLleno()) {
            this.crecerArreglo();
        }
        this.nm++;
        this.om = this.nm - 1;
        this.movimientos[om] = new Movimiento(fecha, tipo, monto);
    }

    public boolean recargar(float monto, Tarjeta tarjeta, String fecha) {
        boolean result = false;
        if (monto > 0 && tarjeta.getCvv().equals(this.tarjeta.getCvv())) {
            this.saldoTotal = this.saldoTotal + monto;
            result = true;
        }
        //Registrar movimiento al arreglo
        if (result) {
            registrarMovimiento(fecha, "Recarga", monto);
        }
        return result;
    }
    
    /*Hacer validación del CVV*/
    public boolean recargar(float monto, String cvv, String fecha) {
        boolean result = false;
        if(monto>0){
            this.saldoTotal = this.saldoTotal + monto;
            registrarMovimiento(fecha, "Recarga", monto);
            result = true;
        }
        //Registrar movimiento al arreglo
            
        return result;
    }
    public String verCostoPeaje(Vehiculo vehiculo,Estacion estacion){
        this.monto = estacion.calcularTarifaNeta(vehiculo.getEjes(), vehiculo.getCategoria(), vehiculo.getTipoUso());
        return String.valueOf(this.monto);
    }
    public boolean pagarPeaje(String fecha, Vehiculo vehiculo, Estacion estacion) {
        boolean result = false;
        this.monto = estacion.calcularTarifaNeta(vehiculo.getEjes(), vehiculo.getCategoria(), vehiculo.getTipoUso());
        if (this.monto > 0 && (this.saldoTotal >= this.monto)) {
            this.saldoTotal = this.saldoTotal - this.monto;
            this.saldoTotal = (float) (Math.round((double) this.saldoTotal * 100.0) / 100.0);
            result = true;
        }
        //Registrar movimiento al arreglo
        if (result == true) {
            registrarMovimiento(fecha, "Consumo", this.monto, vehiculo, estacion);
        }
        return result;
    }

    public void mostrarMovimientos() {
        System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", "Fecha", "Tipo", "Monto", "Vehículo", "Peaje", "Estación");
        System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", "=====", "====", "=====", "========", "=====", "========");
        for (int i = 0; i < nm; i++) {
            if (movimientos[i].getTipo().compareTo("Recarga") == 0) {
                System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", movimientos[i].getFecha(), movimientos[i].getTipo(), movimientos[i].getMonto(), "-----", "-----", "-----");
            } else if (movimientos[i].getTipo().compareTo("Consumo") == 0) {
                System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", movimientos[i].getFecha(), movimientos[i].getTipo(), movimientos[i].getMonto(), movimientos[i].getVehiculo().getPlaca() + " " + movimientos[i].getVehiculo().getMarca() + " " + movimientos[i].getVehiculo().getModelo(), movimientos[i].getEstacion().getPeaje().getNombrePeaje(), movimientos[i].getEstacion().getNombreEstacion());
            }
        }
    }

    //ORDENAR MOVIMIENTOS
    public void ordenarMovimientosXFecha() {
        Movimiento aux;
        for (int i = 0; i < nm; i++) {
            for (int j =0; j < (this.nm-1); j++) {
                if (movimientos[j].getFecha().compareTo(movimientos[j+1].getFecha()) > 0) {
                    aux = movimientos[j];
                    movimientos[j] = movimientos[j+1];
                    movimientos[j+1] = aux;
                }
            }
        }
    }

    public void ordenarMovimientosXMonto() {
        Movimiento aux;
        for (int i = 0; i < (this.nm); i++) {
            for (int j =0; j < (this.nm-1); j++) {
                if (movimientos[j].getMonto() > movimientos[j+1].getMonto()) {
                    aux = movimientos[j];
                    movimientos[j] = movimientos[j+1];
                    movimientos[j+1] = aux;
                }
            }
        }
    }
    
    public void ordenarMovimientosXEstacion() {
        Movimiento aux;
           for(int z=0;z<this.nm;z++){
        if(this.movimientos[z].getEstacion()==null){
            this.movimientos[z].setEstacion(new Estacion());
            this.movimientos[z].getEstacion().setNombreEstacion("¯");
        }
    }
        
        for (int i = 0; i < (this.nm); i++) {  
            for (int j =0; j < (this.nm-1); j++) {
                if (movimientos[j].getEstacion().getNombreEstacion().compareTo(movimientos[j+1].getEstacion().getNombreEstacion())> 0) {
                    aux = movimientos[j];
                    movimientos[j] = movimientos[j+1];
                    movimientos[j+1] = aux;
                }
               
            }
        }
    }
    public void ordenarMovimientosXPlacaVehiculo() {
        Movimiento aux;
        for(int z=0;z<this.nm;z++){
        if(this.movimientos[z].getVehiculo()==null){
            this.movimientos[z].setVehiculo(new Vehiculo());
            this.movimientos[z].getVehiculo().setPlaca("¯");
        }
    }
        for (int i = 0; i < (this.nm); i++) {
            for (int j =0; j < (this.nm-1); j++) {
                if (this.movimientos[j].getVehiculo().getPlaca().compareTo(this.movimientos[j+1].getVehiculo().getPlaca()) > 0) {
                    aux = movimientos[j];
                    movimientos[j] = movimientos[j+1];
                    movimientos[j+1] = aux;
                }
            }

        }
    }
    
    public Object[][] datosVehiculosAZ(){
        Object datosVehiculos[][] = new Object[this.nv][8];
        
        for(int i=0;i<this.nv;i++){
            datosVehiculos[i] = vehiculos[i].datosVehiculo();
        }
        
        return datosVehiculos;
    }
    
    public Object[][] datosVehiculosZA(){
        Object datosVehiculos[][] = new Object[this.nv][8];
        
        for(int i=0;i<this.nv;i++){
            datosVehiculos[i] = vehiculos[this.ov-i].datosVehiculo();
        }
        
        return datosVehiculos;
    }
}
