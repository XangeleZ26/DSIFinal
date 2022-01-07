package Modelo;

import java.util.Date;

public class Cuenta {

    private float saldoTotal;
    private float monto;
    private Tarjeta tarjeta;
    private Movimiento movimientos[];
    private int nm;//Cantidad de movimientos en el arreglo
    private int om;//Orden en el arreglo del último vehículo agregado
    private Vehiculo vehiculos[];
    private int nv; //Cantidad de vehículos en el arreglo
    private int ov; //Orden en el arreglo del último vehículo agregado

    public Cuenta() {

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
    public boolean registrarVehiculo(String placa, String marca, String modelo, int ejes, String tipoUso, float pesoBruto, int año, Cliente dueño) {
        boolean result = false;
        if (verificarExistenciaVehiculo(placa) == false) {
            this.nv++;
            this.ov = this.nv - 1;
            this.vehiculos[ov] = new Vehiculo(placa, marca, modelo, ejes, tipoUso, pesoBruto, año, dueño);
            result = true;
            //Verificar si el registro fue correcto
            if (result == false) {
                this.nv--;
                this.ov = this.nv - 1;
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
        Vehiculo vehiculosOrdenados[] = new Vehiculo[nv];
        /*vehiculosOrdenados = vehiculos; Este es el método directo plara clonar, los cambios hechos en el
        clon se reflejan en el objeto original*/
        //Se clona cada uno de los espacios dle arreglo
        for (int i = 0; i < this.nv; i++) {
            vehiculosOrdenados[i] = vehiculos[i];
        }
        //Se ordena el arreglo clonado
        for (int i = 0; i < (this.nv); i++) {
            for (int j = i + 1; j < (this.nv); j++) {
                if (vehiculosOrdenados[i].getEjes() > vehiculosOrdenados[j].getEjes()) {
                    aux = vehiculosOrdenados[i];
                    vehiculosOrdenados[i] = vehiculosOrdenados[j];
                    vehiculosOrdenados[j] = aux;
                }
            }
        }
        //Imprimir vehículos ordenados
        System.out.format("%-15s%-15s%-15s%-12s%-8s%-10s%-10s%-6s\n", "Placa", "Marca", "Modelo", "Categoría", "Ejes", "Uso", "Peso", "Año");
        System.out.format("%-15s%-15s%-15s%-12s%-8s%-10s%-10s%-6s\n", "=====", "=====", "======", "=========", "====", "===", "====", "===");
        for (int i = 0; i < nv; i++) {
            System.out.format("%-15s%-15s%-15s%-12s%-8s%-10s%-10s%-6s\n", vehiculosOrdenados[i].getPlaca(), vehiculosOrdenados[i].getMarca(), vehiculosOrdenados[i].getModelo(), vehiculosOrdenados[i].getCategoria(), vehiculosOrdenados[i].getEjes(), vehiculosOrdenados[i].getTipoUso(), vehiculosOrdenados[i].getPesoBruto(), vehiculosOrdenados[i].getAño());
        }
    }

    public void ordenarVehiculosXPesoBruto() {
        Vehiculo aux;
        Vehiculo vehiculosOrdenados[] = new Vehiculo[nv];
        /*vehiculosOrdenados = vehiculos; Este es el método directo plara clonar, los cambios hechos en el
        clon se reflejan en el objeto original*/
        //Se clona cada uno de los espacios dle arreglo
        for (int i = 0; i < this.nv; i++) {
            vehiculosOrdenados[i] = vehiculos[i];
        }
        //Se ordena el arreglo clonado
        for (int i = 0; i < (this.nv); i++) {
            for (int j = i + 1; j < (this.nv); j++) {
                if (vehiculosOrdenados[i].getPesoBruto() > vehiculosOrdenados[j].getPesoBruto()) {
                    aux = vehiculosOrdenados[i];
                    vehiculosOrdenados[i] = vehiculosOrdenados[j];
                    vehiculosOrdenados[j] = aux;
                }
            }
        }
        //Imprimir vehículos ordenados
        System.out.format("%-15s%-15s%-15s%-12s%-8s%-10s%-10s%-6s\n", "Placa", "Marca", "Modelo", "Categoría", "Ejes", "Uso", "Peso", "Año");
        System.out.format("%-15s%-15s%-15s%-12s%-8s%-10s%-10s%-6s\n", "=====", "=====", "======", "=========", "====", "===", "====", "===");
        for (int i = 0; i < nv; i++) {
            System.out.format("%-15s%-15s%-15s%-12s%-8s%-10s%-10s%-6s\n", vehiculosOrdenados[i].getPlaca(), vehiculosOrdenados[i].getMarca(), vehiculosOrdenados[i].getModelo(), vehiculosOrdenados[i].getCategoria(), vehiculosOrdenados[i].getEjes(), vehiculosOrdenados[i].getTipoUso(), vehiculosOrdenados[i].getPesoBruto(), vehiculosOrdenados[i].getAño());
        }
    }

    public void ordenarVehiculosXAño() {
        Vehiculo aux;
        Vehiculo vehiculosOrdenados[] = new Vehiculo[nv];
        /*vehiculosOrdenados = vehiculos; Este es el método directo plara clonar, los cambios hechos en el
        clon se reflejan en el objeto original*/
        //Se clona cada uno de los espacios dle arreglo
        for (int i = 0; i < this.nv; i++) {
            vehiculosOrdenados[i] = vehiculos[i];
        }
        //Se ordena el arreglo clonado
        for (int i = 0; i < (this.nv); i++) {
            for (int j = i + 1; j < (this.nv); j++) {
                if (vehiculosOrdenados[i].getAño() > vehiculosOrdenados[j].getAño()) {
                    aux = vehiculosOrdenados[i];
                    vehiculosOrdenados[i] = vehiculosOrdenados[j];
                    vehiculosOrdenados[j] = aux;
                }
            }
        }
        //Imprimir vehículos ordenados
        System.out.format("%-15s%-15s%-15s%-12s%-8s%-10s%-10s%-6s\n", "Placa", "Marca", "Modelo", "Categoría", "Ejes", "Uso", "Peso", "Año");
        System.out.format("%-15s%-15s%-15s%-12s%-8s%-10s%-10s%-6s\n", "=====", "=====", "======", "=========", "====", "===", "====", "===");
        for (int i = 0; i < nv; i++) {
            System.out.format("%-15s%-15s%-15s%-12s%-8s%-10s%-10s%-6s\n", vehiculosOrdenados[i].getPlaca(), vehiculosOrdenados[i].getMarca(), vehiculosOrdenados[i].getModelo(), vehiculosOrdenados[i].getCategoria(), vehiculosOrdenados[i].getEjes(), vehiculosOrdenados[i].getTipoUso(), vehiculosOrdenados[i].getPesoBruto(), vehiculosOrdenados[i].getAño());
        }
    }

    public void ordenarVehiculosXPlaca() {
        Vehiculo aux;
        Vehiculo vehiculosOrdenados[] = new Vehiculo[nv];
        /*vehiculosOrdenados = vehiculos; Este es el método directo plara clonar, los cambios hechos en el
        clon se reflejan en el objeto original*/
        //Se clona cada uno de los espacios del arreglo
        for (int i = 0; i < this.nv; i++) {
            vehiculosOrdenados[i] = vehiculos[i];
        }
        //Se ordena el arreglo clonado
        for (int i = 0; i < (this.nv); i++) {
            for (int j = i + 1; j < (this.nv); j++) {
                if (vehiculosOrdenados[i].getPlaca().compareTo(vehiculosOrdenados[j].getPlaca()) > 0) {
                    aux = vehiculosOrdenados[i];
                    vehiculosOrdenados[i] = vehiculosOrdenados[j];
                    vehiculosOrdenados[j] = aux;
                }
            }
        }
        //Imprimir vehículos ordenados
        System.out.format("%-15s%-15s%-15s%-12s%-8s%-10s%-10s%-6s\n", "Placa", "Marca", "Modelo", "Categoría", "Ejes", "Uso", "Peso", "Año");
        System.out.format("%-15s%-15s%-15s%-12s%-8s%-10s%-10s%-6s\n", "=====", "=====", "======", "=========", "====", "===", "====", "===");
        for (int i = 0; i < nv; i++) {
            System.out.format("%-15s%-15s%-15s%-12s%-8s%-10s%-10s%-6s\n", vehiculosOrdenados[i].getPlaca(), vehiculosOrdenados[i].getMarca(), vehiculosOrdenados[i].getModelo(), vehiculosOrdenados[i].getCategoria(), vehiculosOrdenados[i].getEjes(), vehiculosOrdenados[i].getTipoUso(), vehiculosOrdenados[i].getPesoBruto(), vehiculosOrdenados[i].getAño());
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

    public boolean recargar(float monto, String cvv, String fecha) {
        boolean result = false;
            this.saldoTotal = this.saldoTotal + monto;
            result = true;
        //Registrar movimiento al arreglo
            registrarMovimiento(fecha, "Recarga", monto);
        return result;
    }

    public boolean pagarPeaje(String fecha, Vehiculo vehiculo, Estacion estacion) {
        boolean result = false;
        float tarifaNeta = estacion.calcularTarifaNeta(vehiculo.getEjes(), vehiculo.getCategoria(), vehiculo.getTipoUso());
        if (tarifaNeta > 0 && (this.saldoTotal >= tarifaNeta)) {
            this.saldoTotal = this.saldoTotal - tarifaNeta;
            this.saldoTotal = (float) (Math.round((double) this.saldoTotal * 100.0) / 100.0);
            result = true;
        }
        //Registrar movimiento al arreglo
        if (result == true) {
            registrarMovimiento(fecha, "Peaje", tarifaNeta, vehiculo, estacion);
        }
        return result;
    }

    public void mostrarMovimientos() {
        System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", "Fecha", "Tipo", "Monto", "Vehículo", "Peaje", "Estación");
        System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", "=====", "====", "=====", "========", "=====", "========");
        for (int i = 0; i < nm; i++) {
            if (movimientos[i].getTipo().compareTo("Recarga") == 0) {
                System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", movimientos[i].getFecha(), movimientos[i].getTipo(), movimientos[i].getMonto(), "-----", "-----", "-----");
            } else if (movimientos[i].getTipo().compareTo("Peaje") == 0) {
                System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", movimientos[i].getFecha(), movimientos[i].getTipo(), movimientos[i].getMonto(), movimientos[i].getVehiculo().getPlaca() + " " + movimientos[i].getVehiculo().getMarca() + " " + movimientos[i].getVehiculo().getModelo(), movimientos[i].getEstacion().getPeaje().getNombrePeaje(), movimientos[i].getEstacion().getNombreEstacion());
            }
        }
    }

    //ORDENAR MOVIMIENTOS
    public void ordenarMovimientosXFecha() {
        Movimiento aux;
        Movimiento movimientosOrdenados[] = new Movimiento[nm];
        /*movimientosOrdenados = movimientos; Este es el método directo plara clonar, los cambios hechos en el
        clon se reflejan en el objeto original*/
        //Se clona cada uno de los espacios del arreglo
        for (int i = 0; i < nm; i++) {
            movimientosOrdenados[i] = movimientos[i];
        }
        //Se ordena el objeto clonado
        for (int i = 0; i < nm; i++) {
            for (int j = i + 1; j < nm; j++) {
                if (movimientosOrdenados[i].getFecha().compareTo(movimientosOrdenados[j].getFecha()) > 0) {
                    aux = movimientosOrdenados[i];
                    movimientosOrdenados[i] = movimientosOrdenados[j];
                    movimientosOrdenados[j] = aux;
                }
            }
        }
        //Se imprime el objeto clonado
        System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", "Fecha", "Tipo", "Monto", "Vehículo", "Peaje", "Estación");
        System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", "=====", "====", "=====", "========", "=====", "========");
        for (int i = 0; i < nm; i++) {
            if (movimientosOrdenados[i].getTipo().compareTo("Recarga") == 0) {
                System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", movimientosOrdenados[i].getFecha(), movimientosOrdenados[i].getTipo(), movimientosOrdenados[i].getMonto(), "-----", "-----", "-----");
            } else if (movimientosOrdenados[i].getTipo().compareTo("Peaje") == 0) {
                System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", movimientosOrdenados[i].getFecha(), movimientosOrdenados[i].getTipo(), movimientosOrdenados[i].getMonto(), movimientosOrdenados[i].getVehiculo().getPlaca() + " " + movimientosOrdenados[i].getVehiculo().getMarca() + " " + movimientosOrdenados[i].getVehiculo().getModelo(), movimientosOrdenados[i].getEstacion().getPeaje().getNombrePeaje(), movimientosOrdenados[i].getEstacion().getNombreEstacion());
            }
        }
    }

    public void ordenarMovimientosXMonto() {
        Movimiento aux;
        Movimiento movimientosOrdenados[] = new Movimiento[nm];
        /*movimientosOrdenados = movimientos; Este es el método directo plara clonar, los cambios hechos en el
        clon se reflejan en el objeto original*/
        //Se clona cada uno de los espacios del arreglo
        for (int i = 0; i < nm; i++) {
            movimientosOrdenados[i] = movimientos[i];
        }
        //Se ordena el objeto clonado
        for (int i = 0; i < (this.nm); i++) {
            for (int j = i + 1; j < (this.nm); j++) {
                if (movimientosOrdenados[i].getMonto() > movimientosOrdenados[j].getMonto()) {
                    aux = movimientosOrdenados[i];
                    movimientosOrdenados[i] = movimientosOrdenados[j];
                    movimientosOrdenados[j] = aux;
                }
            }
        }
        //Se imprime el objeto clonado
        System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", "Fecha", "Tipo", "Monto", "Vehículo", "Peaje", "Estación");
        System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", "=====", "====", "=====", "========", "=====", "========");
        for (int i = 0; i < nm; i++) {
            if (movimientosOrdenados[i].getTipo().compareTo("Recarga") == 0) {
                System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", movimientosOrdenados[i].getFecha(), movimientosOrdenados[i].getTipo(), movimientosOrdenados[i].getMonto(), "-----", "-----", "-----");
            } else if (movimientosOrdenados[i].getTipo().compareTo("Peaje") == 0) {
                System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", movimientosOrdenados[i].getFecha(), movimientosOrdenados[i].getTipo(), movimientosOrdenados[i].getMonto(), movimientosOrdenados[i].getVehiculo().getPlaca() + " " + movimientosOrdenados[i].getVehiculo().getMarca() + " " + movimientosOrdenados[i].getVehiculo().getModelo(), movimientosOrdenados[i].getEstacion().getPeaje().getNombrePeaje(), movimientosOrdenados[i].getEstacion().getNombreEstacion());
            }
        }
    }

    public void ordenarMovimientosXPlacaVehiculo() {
        Movimiento aux;
        Movimiento movimientosOrdenados[] = new Movimiento[nm];
        /*movimientosOrdenados = movimientos; Este es el método directo plara clonar, los cambios hechos en el
        clon se reflejan en el objeto original*/
        //Se clona cada uno de los espacios del arreglo
        for (int i = 0; i < nm; i++) {
            movimientosOrdenados[i] = movimientos[i];
        }
        //Se ordena el objeto clonado
        for (int i = 0; i < nm; i++) {
            for (int j = i + 1; j < nm; j++) {
                if (movimientosOrdenados[i].getVehiculo() == null) {
                    aux = movimientosOrdenados[i];
                    movimientosOrdenados[i] = movimientosOrdenados[j];
                    movimientosOrdenados[j] = aux;
                } else if (movimientosOrdenados[i].getVehiculo().getPlaca().compareTo(movimientosOrdenados[j].getVehiculo().getPlaca()) > 0) {
                    aux = movimientosOrdenados[i];
                    movimientosOrdenados[i] = movimientosOrdenados[j];
                    movimientosOrdenados[j] = aux;
                }
            }
        }
        //Se imprime el objeto clonado
        System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", "Fecha", "Tipo", "Monto", "Vehículo", "Peaje", "Estación");
        System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", "=====", "====", "=====", "========", "=====", "========");
        for (int i = 0; i < nm; i++) {
            if (movimientosOrdenados[i].getTipo().compareTo("Recarga") == 0) {
                System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", movimientosOrdenados[i].getFecha(), movimientosOrdenados[i].getTipo(), movimientosOrdenados[i].getMonto(), "-----", "-----", "-----");
            } else if (movimientosOrdenados[i].getTipo().compareTo("Peaje") == 0) {
                System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", movimientosOrdenados[i].getFecha(), movimientosOrdenados[i].getTipo(), movimientosOrdenados[i].getMonto(), movimientosOrdenados[i].getVehiculo().getPlaca() + " " + movimientosOrdenados[i].getVehiculo().getMarca() + " " + movimientosOrdenados[i].getVehiculo().getModelo(), movimientosOrdenados[i].getEstacion().getPeaje().getNombrePeaje(), movimientosOrdenados[i].getEstacion().getNombreEstacion());
            }
        }
    }

    public void ordenarMovimientosXEstacion() {
        Movimiento aux;
        Movimiento movimientosOrdenados[] = new Movimiento[nm];
        /*movimientosOrdenados = movimientos; Este es el método directo plara clonar, los cambios hechos en el
        clon se reflejan en el objeto original*/
        //Se clona cada uno de los espacios del arreglo
        for (int i = 0; i < nm; i++) {
            movimientosOrdenados[i] = movimientos[i];
        }
        //Se ordena el objeto clonado
        for (int i = 0; i < nm; i++) {
            for (int j = i + 1; j < nm; j++) {
                if (movimientosOrdenados[i].getEstacion() == null) {
                    aux = movimientosOrdenados[i];
                    movimientosOrdenados[i] = movimientosOrdenados[j];
                    movimientosOrdenados[j] = aux;
                } else if (movimientosOrdenados[i].getEstacion().getNombreEstacion().compareTo(movimientosOrdenados[j].getEstacion().getNombreEstacion()) > 0) {
                    aux = movimientosOrdenados[i];
                    movimientosOrdenados[i] = movimientosOrdenados[j];
                    movimientosOrdenados[j] = aux;
                }
            }
        }
        //Se imprime el objeto clonado
        System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", "Fecha", "Tipo", "Monto", "Vehículo", "Peaje", "Estación");
        System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", "=====", "====", "=====", "========", "=====", "========");
        for (int i = 0; i < nm; i++) {
            if (movimientosOrdenados[i].getTipo().compareTo("Recarga") == 0) {
                System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", movimientosOrdenados[i].getFecha(), movimientosOrdenados[i].getTipo(), movimientosOrdenados[i].getMonto(), "-----", "-----", "-----");
            } else if (movimientosOrdenados[i].getTipo().compareTo("Peaje") == 0) {
                System.out.format("%-13s%-10s%-10s%-30s%-22s%-15s\n", movimientosOrdenados[i].getFecha(), movimientosOrdenados[i].getTipo(), movimientosOrdenados[i].getMonto(), movimientosOrdenados[i].getVehiculo().getPlaca() + " " + movimientosOrdenados[i].getVehiculo().getMarca() + " " + movimientosOrdenados[i].getVehiculo().getModelo(), movimientosOrdenados[i].getEstacion().getPeaje().getNombrePeaje(), movimientosOrdenados[i].getEstacion().getNombreEstacion());
            }
        }
    }
    /*
    public boolean ingresarCuenta(String usuario, String contraseña){
        boolean result = false;
        if(usuario.equals())
        return result;
    }
     */
}
