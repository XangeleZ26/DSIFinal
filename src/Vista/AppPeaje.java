package Vista;

import Modelo.ArregloClientes;
import Modelo.Cliente;
import Modelo.Configuracion;
import Modelo.Peaje;
import Modelo.Tarjeta;
import java.text.SimpleDateFormat;
import java.util.Date;
import Controlador.*;

public class AppPeaje {

//MODIFICACION DE XAVIER
    public static void main(String[] args) {
        //DECLARAMOS LOS PEAJES
        Peaje peaje1 = new Peaje("Panamericana Norte", (float) 3, (float) 3.5, (float) 2.9);
        Peaje peaje2 = new Peaje("Panamericana Sur", (float) 3.25, (float) 3.6, (float) 2.8);
        Peaje peaje3 = new Peaje("Huaylas", (float) 2.5, (float) 3, (float) 2.5);
        Peaje peaje4 = new Peaje("Separadora Industrial", (float) 3.2, (float) 2.6, (float) 1.5);

        // ArregloPeajes arrPeajes = new ArregloPeajes();
        Configuracion.arrPeajes.agregarPeaje(peaje1);
        Configuracion.arrPeajes.agregarPeaje(peaje2);
        Configuracion.arrPeajes.agregarPeaje(peaje3);
        Configuracion.arrPeajes.agregarPeaje(peaje4);

        //DECLARAMOS LAS ESTACIONES DE CADA PEAJE
        peaje1.agregarEstacion("Serpentin de Pasamayo", "1N001", peaje1);
        peaje1.agregarEstacion("Variante Pasamayo", "1N002", peaje1);
        peaje1.agregarEstacion("El Paraíso", "1N003", peaje1);
        peaje1.agregarEstacion("Fortaleza", "1N004", peaje1);
        peaje2.agregarEstacion("Chilca", "1S001", peaje2);
        peaje3.agregarEstacion("Alto Lampas", "1H001", peaje3);
        peaje3.agregarEstacion("Cahuish", "1H002", peaje3);
        peaje4.agregarEstacion("Mayorazgo", "1I001", peaje4);
        peaje4.agregarEstacion("Parque industrial", "1I002", peaje4);
        peaje4.agregarEstacion("Central industrial", "1I003", peaje4);

        //MOSTRAMOS LA INFORMACIÓN DE CADA ESTACIÓN
        System.out.println("***Estaciones del peaje 1***");
        peaje1.mostrarEstaciones();
        System.out.println("");
        System.out.println("***Estaciones del peaje 2***");
        peaje2.mostrarEstaciones();
        System.out.println("");
        System.out.println("***Estaciones del peaje 3***");
        peaje3.mostrarEstaciones();
        System.out.println("");
        System.out.println("***Estaciones del peaje 4***");
        peaje4.mostrarEstaciones();
        System.out.println("");

        //AGREGAMOS CLIENTES
        ArregloClientes clientes = new ArregloClientes();
        Date fechanacimiento1 = new Date(2000 - 1900, 11 - 1, 14);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Cliente cliente = new Cliente("DNI", "11112222", "José Alonso", "Tolentino", "Tantaruna", "Masculino", sdf.format(fechanacimiento1), "josealonso@gmail.com", "123");
        //CLIENTE PRUEBA
        //Cliente clienteborrar = cliente;
        System.out.println("Cliente agregado: " + clientes.agregarCliente(cliente));
        Date fechanacimiento2 = new Date(2003 - 1900, 6 - 1, 25);
        cliente = new Cliente("DNI", "33334444", "Esthefany", "Meza", "Meza", "Femenino", sdf.format(fechanacimiento2), "esthefany.meza@gmail.com", "123");
        System.out.println("Cliente agregado: " + clientes.agregarCliente(cliente));
        Date fechanacimiento3 = new Date(1900 - 1900, 8 - 1, 10);
        cliente = new Cliente("PASAPORTE", "55556666", "Sheldon Lee", "Cooper", "Fowler", "Masculino", sdf.format(fechanacimiento3), "sheldon.cooper@gmail.com", "123");
        System.out.println("Cliente agregado: " + clientes.agregarCliente(cliente));
        Date fechanacimiento4 = new Date(2002 - 1900, 7 - 1, 25);
        cliente = new Cliente("RUC", "20518639928", "alfaBeta@gmail.com", "Brigth");
        System.out.println("Cliente agregado: " + clientes.agregarCliente(cliente));
        System.out.println("");
        System.out.println("***Clientes del sistema***");
        clientes.mostrarClientes();
        System.out.println("");

        //VERIFICAMOS EXISTENCIA DE CLIENTE
        System.out.println("Cliente con DNI número 12121212 existe: " + clientes.verificarExistenciaCliente("DNI", "12121212"));
        System.out.println("Cliente con DNI número 33334444 existe: " + clientes.verificarExistenciaCliente("DNI", "33334444"));
        System.out.println("");

        //VERIFICAMOS EXISTENCIA DE CORREOS
        System.out.println("Correo 'jose.tolentino@unmsm.edu.pe' existe: " + clientes.verificarExistenciaCorreo("jose.tolentino@unmsm.edu.pe"));
        System.out.println("Correo 'esthefany.meza@gmail.com' existe: " + clientes.verificarExistenciaCorreo("esthefany.meza@gmail.com"));
        System.out.println("");

        //ELIMINAR CLIENTE DEL SISTEMA
        System.out.println("Cliente '" + clientes.getArregloCliente(2).getNombres() + " " + clientes.getArregloCliente(2).getApPaterno() + " " + clientes.getArregloCliente(2).getApMaterno() + "' eliminado: " + clientes.eliminarCliente(clientes.getArregloCliente(2)));
        System.out.println("");
        System.out.println("***Clientes del sistema***");
        clientes.mostrarClientes();
        System.out.println("");

        //REGISTRAMOS DIRECCIÓN AL CLIENTE
        clientes.getArregloCliente(0).registrarDireccion("Lima", "Lima", "S.M.P.", "Av.Perú", 3085, "Portón marrón", "980798331");
        System.out.println(clientes.getArregloCliente(0).getDireccion().toString());
        System.out.println("");

        //CREAMOS LA CUENTA DEL CLIENTE
        SimpleDateFormat fecha = new SimpleDateFormat("yyyy/MM");
        Date fechaVen = new Date();
        Date fechaVencimiento1 = new Date(2025 - 1900, 12 - 1, 6);
        Date fechaVencimiento2 = new Date(2020 - 1900, 7 - 1, 6);

        Tarjeta tarjeta = new Tarjeta("VISA", "5040808012345678", fecha.format(fechaVencimiento1), "125");
        System.out.println("Cuenta creada: " + clientes.getArregloCliente(0).crearCuenta(tarjeta));
        tarjeta = new Tarjeta("VISA", "4040808012345678", fecha.format(fechaVencimiento2), "123");
        System.out.println("Cuenta creada: " + clientes.getArregloCliente(0).crearCuenta(tarjeta));
        tarjeta = new Tarjeta("VISA", "4040808012345678", fecha.format(fechaVencimiento1), "1234");
        System.out.println("Cuenta creada: " + clientes.getArregloCliente(0).crearCuenta(tarjeta));
        tarjeta = new Tarjeta("VISA", "4040808012345678", fecha.format(fechaVencimiento1), "124");
        System.out.println("Cuenta creada: " + clientes.getArregloCliente(0).crearCuenta(tarjeta));
        System.out.println("");
        System.out.println(clientes.getArregloCliente(0).getCuenta().getTarjeta().toString());
        System.out.println("");

        //REGISTRAMOS VEHÍCULOS AL CLIENTE
        System.out.println("Vehículo 'FALL1N1 Tesla Elon' registrado: " + clientes.getArregloCliente(0).getCuenta().registrarVehiculo("FALL1N1", "Tesla", "Elon", "Liviano", 2, "Privado", 2000, 2018, clientes.getArregloCliente(0)));
        System.out.println("Vehículo 'MESSI10 Chevrolet Camaro' registrado: " + clientes.getArregloCliente(0).getCuenta().registrarVehiculo("MESSI10", "Chevrolet", "Camaro", "Pesado", 2, "Público", 1500, 2015, clientes.getArregloCliente(0)));
        System.out.println("Vehículo 'MARIOKT Hyundai H100' registrado: " + clientes.getArregloCliente(0).getCuenta().registrarVehiculo("MARIOKT", "Hyundai", "H100", 6, 8500, 2010, clientes.getArregloCliente(0)));
        System.out.println("Vehículo 'J20G15GY Susuki Grand' registrado: " + clientes.getArregloCliente(0).getCuenta().registrarVehiculo("J20G15GY", "Susuki", "Grand", "Liviano", 2, "Público", 2100, 2007, clientes.getArregloCliente(0)));
        System.out.println("");
        System.out.println("***Vehículos del cliente***");
        clientes.getArregloCliente(0).getCuenta().mostrarVehiculos();
        System.out.println("");

        //VERIFICAMOS EXISTENCIA DE VEHÍCULOS
        System.out.println("Vehículo 'FALL1N1' existe: " + clientes.getArregloCliente(0).getCuenta().verificarExistenciaVehiculo("FALL1N1"));
        System.out.println("Vehículo '122SSNH' existe: " + clientes.getArregloCliente(0).getCuenta().verificarExistenciaVehiculo("122SSNH"));
        System.out.println("");

        //ORDENAR VEHÍCULOS POR AÑO
        System.out.println("***Vehículos del cliente ordenados por año***");
        clientes.getArregloCliente(0).getCuenta().ordenarVehiculosXAño();
        clientes.getArregloCliente(0).getCuenta().mostrarVehiculos();
        System.out.println("");

        //ORDENAR VEHÍCULOS POR PLACA
        System.out.println("***Vehículos del cliente ordenados por placa***");
        clientes.getArregloCliente(0).getCuenta().ordenarVehiculosXPlaca();
        clientes.getArregloCliente(0).getCuenta().mostrarVehiculos();
        System.out.println("");

        //ORDENAR VEHÍCULOS POR PESO
        System.out.println("***Vehículos del cliente ordenados por peso***");
        clientes.getArregloCliente(0).getCuenta().ordenarVehiculosXPesoBruto();
        clientes.getArregloCliente(0).getCuenta().mostrarVehiculos();
        System.out.println("");

        //ORDENAR VEHÍCULOS POR EJES
        System.out.println("***Vehículos del cliente ordenados por ejes***");
        clientes.getArregloCliente(0).getCuenta().ordenarVehiculosXEjes();
        clientes.getArregloCliente(0).getCuenta().mostrarVehiculos();
        System.out.println("");

        //ELIMINAR VEHÍCULO
        System.out.println("Vehículo 'J20G15GY Susuki Grand' eliminado: " + clientes.getArregloCliente(0).getCuenta().eliminarVehiculo("J20G15GY"));
        System.out.println("");
        clientes.getArregloCliente(0).getCuenta().mostrarVehiculos();
        System.out.println("");

        //MOVIMIENTOS: RECARGAS Y CONSUMOS
        System.out.println("Recarga de 0 soles exitosa: " + clientes.getArregloCliente(0).getCuenta().recargar(0, "124", "2021/12/28"));
        System.out.println("Recarga de 30 soles exitosa: " + clientes.getArregloCliente(0).getCuenta().recargar(30, "124", "2021/12/28"));
        System.out.println("Recarga de 100 soles exitosa: " + clientes.getArregloCliente(0).getCuenta().recargar(100, "124", "2021/12/28"));
        System.out.println(clientes.getArregloCliente(0).getCuenta().getMovimientos(0).imprimirMovimientoSimple());
        System.out.println("Saldo total: " + clientes.getArregloCliente(0).getCuenta().getSaldoTotal());
        System.out.println("");

        System.out.println("Peaje del vehículo '" + clientes.getArregloCliente(0).getCuenta().getVehiculos(0).getPlaca()
                + " " + clientes.getArregloCliente(0).getCuenta().getVehiculos(0).getMarca()
                + " " + clientes.getArregloCliente(0).getCuenta().getVehiculos(0).getModelo() + "' en la estación '"
                + peaje1.getEstaciones(0).getNombreEstacion() + "' pagado: "
                + clientes.getArregloCliente(0).getCuenta().pagarPeaje("2021/12/29", clientes.getArregloCliente(0).getCuenta().getVehiculos(0), peaje1.getEstaciones(0)));
        System.out.println("Saldo total: " + clientes.getArregloCliente(0).getCuenta().getSaldoTotal());
        System.out.println(clientes.getArregloCliente(0).getCuenta().getMovimientos(2).imprimirMovimientoSimple());
        System.out.println("");

        System.out.println("Peaje del vehículo '" + clientes.getArregloCliente(0).getCuenta().getVehiculos(1).getPlaca()
                + " " + clientes.getArregloCliente(0).getCuenta().getVehiculos(1).getMarca()
                + " " + clientes.getArregloCliente(0).getCuenta().getVehiculos(1).getModelo() + "' en la estación '"
                + peaje1.getEstaciones(1).getNombreEstacion() + "' pagado: "
                + clientes.getArregloCliente(0).getCuenta().pagarPeaje("2021/12/27", clientes.getArregloCliente(0).getCuenta().getVehiculos(1), peaje1.getEstaciones(1)));
        System.out.println("Saldo total: " + clientes.getArregloCliente(0).getCuenta().getSaldoTotal());
        //System.out.println(clientes.getArregloCliente(0).getCuenta().getMovimientos(3).imprimirMovimientoSimple());
        System.out.println("");

        System.out.println("Peaje del vehículo '" + clientes.getArregloCliente(0).getCuenta().getVehiculos(2).getPlaca()
                + " " + clientes.getArregloCliente(0).getCuenta().getVehiculos(2).getMarca()
                + " " + clientes.getArregloCliente(0).getCuenta().getVehiculos(2).getModelo() + "' en la estación '"
                + peaje1.getEstaciones(2).getNombreEstacion() + "' pagado: "
                + clientes.getArregloCliente(0).getCuenta().pagarPeaje("2021/12/31", clientes.getArregloCliente(0).getCuenta().getVehiculos(2), peaje1.getEstaciones(2)));
        System.out.println("Saldo total: " + clientes.getArregloCliente(0).getCuenta().getSaldoTotal());
        //System.out.println(clientes.getArregloCliente(0).getCuenta().getMovimientos(4).imprimirMovimientoSimple());
        System.out.println("");

        System.out.println("Peaje del vehículo '" + clientes.getArregloCliente(0).getCuenta().getVehiculos(0).getPlaca()
                + " " + clientes.getArregloCliente(0).getCuenta().getVehiculos(0).getMarca()
                + " " + clientes.getArregloCliente(0).getCuenta().getVehiculos(0).getModelo() + "' en la estación '"
                + peaje1.getEstaciones(3).getNombreEstacion() + "' pagado: "
                + clientes.getArregloCliente(0).getCuenta().pagarPeaje("2022/01/01", clientes.getArregloCliente(0).getCuenta().getVehiculos(0), peaje1.getEstaciones(3)));
        System.out.println("Saldo total: " + clientes.getArregloCliente(0).getCuenta().getSaldoTotal());
        //System.out.println(clientes.getArregloCliente(0).getCuenta().getMovimientos(5).imprimirMovimientoSimple());
        System.out.println("");

        System.out.println("Peaje del vehículo '" + clientes.getArregloCliente(0).getCuenta().getVehiculos(1).getPlaca()
                + " " + clientes.getArregloCliente(0).getCuenta().getVehiculos(1).getMarca()
                + " " + clientes.getArregloCliente(0).getCuenta().getVehiculos(1).getModelo() + "' en la estación '"
                + peaje2.getEstaciones(0).getNombreEstacion() + "' pagado: "
                + clientes.getArregloCliente(0).getCuenta().pagarPeaje("2021/12/28", clientes.getArregloCliente(0).getCuenta().getVehiculos(1), peaje2.getEstaciones(0)));
        System.out.println("Saldo total: " + clientes.getArregloCliente(0).getCuenta().getSaldoTotal());
        //System.out.println(clientes.getArregloCliente(0).getCuenta().getMovimientos(6).imprimirMovimientoSimple());
        System.out.println("");

        System.out.println("Peaje del vehículo '" + clientes.getArregloCliente(0).getCuenta().getVehiculos(2).getPlaca()
                + " " + clientes.getArregloCliente(0).getCuenta().getVehiculos(2).getMarca()
                + " " + clientes.getArregloCliente(0).getCuenta().getVehiculos(2).getModelo() + "' en la estación '"
                + peaje1.getEstaciones(0).getNombreEstacion() + "' pagado: "
                + clientes.getArregloCliente(0).getCuenta().pagarPeaje("2021/12/31", clientes.getArregloCliente(0).getCuenta().getVehiculos(2), peaje1.getEstaciones(0)));
        System.out.println("Saldo total: " + clientes.getArregloCliente(0).getCuenta().getSaldoTotal());
        //System.out.println(clientes.getArregloCliente(0).getCuenta().getMovimientos(7).imprimirMovimientoSimple());
        System.out.println("");

        System.out.println("Peaje del vehículo '" + clientes.getArregloCliente(0).getCuenta().getVehiculos(2).getPlaca()
                + " " + clientes.getArregloCliente(0).getCuenta().getVehiculos(2).getMarca()
                + " " + clientes.getArregloCliente(0).getCuenta().getVehiculos(2).getModelo() + "' en la estación '"
                + peaje3.getEstaciones(1).getNombreEstacion() + "' pagado: "
                + clientes.getArregloCliente(0).getCuenta().pagarPeaje("2021/12/31", clientes.getArregloCliente(0).getCuenta().getVehiculos(2), peaje3.getEstaciones(1)));
        System.out.println("Saldo total: " + clientes.getArregloCliente(0).getCuenta().getSaldoTotal());
        //System.out.println(clientes.getArregloCliente(0).getCuenta().getMovimientos(8).imprimirMovimientoSimple());
        System.out.println("");

        System.out.println("Peaje del vehículo '" + clientes.getArregloCliente(0).getCuenta().getVehiculos(2).getPlaca()
                + " " + clientes.getArregloCliente(0).getCuenta().getVehiculos(2).getMarca()
                + " " + clientes.getArregloCliente(0).getCuenta().getVehiculos(2).getModelo() + "' en la estación '"
                + peaje4.getEstaciones(2).getNombreEstacion() + "' pagado: "
                + clientes.getArregloCliente(0).getCuenta().pagarPeaje("2021/12/31", clientes.getArregloCliente(0).getCuenta().getVehiculos(2), peaje4.getEstaciones(2)));
        System.out.println("Saldo total: " + clientes.getArregloCliente(0).getCuenta().getSaldoTotal());
        //System.out.println(clientes.getArregloCliente(0).getCuenta().getMovimientos(9).imprimirMovimientoSimple());
        System.out.println("");

        //MOSTRAR VEHÍCULOS
        System.out.println("***Vehículos del cliente***");
        clientes.getArregloCliente(0).getCuenta().mostrarVehiculos();
        System.out.println("");

        //MOSTRAR MOVIMIENTOS
        System.out.println("***Movimientos del cliente***");
        clientes.getArregloCliente(0).getCuenta().mostrarMovimientos();
        System.out.println("");

        //ORDENAR MOVIMIENTOS POR FECHA
        System.out.println("***Movimientos del cliente ordenados por fecha***");
        clientes.getArregloCliente(0).getCuenta().ordenarMovimientosXFecha();
        clientes.getArregloCliente(0).getCuenta().mostrarMovimientos();
        System.out.println("");

        //ORDENAR MOVIMIENTOS POR MONTO
        System.out.println("***Movimientos del cliente ordenados por monto***");
        clientes.getArregloCliente(0).getCuenta().ordenarMovimientosXMonto();
        clientes.getArregloCliente(0).getCuenta().mostrarMovimientos();
        System.out.println("");

        //ODENAR MOVIMIENTOS POR PLACA DEL VEHÍCULO
        System.out.println("***Movimientos del cliente ordenados por vehículo***");
//        clientes.getArregloCliente(0).getCuenta().ordenarMovimientosXPlacaVehiculo();
        clientes.getArregloCliente(0).getCuenta().mostrarMovimientos();
        System.out.println("");

        //ORDENAR MOVIMIENTOS POR ESTACIÓN
        System.out.println("***Movimientos del cliente ordenados por estación***");
//        clientes.getArregloCliente(0).getCuenta().ordenarMovimientosXEstacion();
        clientes.getArregloCliente(0).getCuenta().mostrarMovimientos();
        System.out.println("");

        //Ingreso a la cuenta.
        /*
        Cliente nuevoCliente = clientes.getArregloCliente(0);
        nuevoCliente.getCuenta().mostrarVehiculos();
        
        frmVehiculos fVehiculos = new frmVehiculos(); 
        ControladorVehiculos ctrlVehiculos = new ControladorVehiculos(nuevoCliente);
        ctrlVehiculos.iniciar();*/
        //INICIO DE PROGRAMAAAA (SEGÚN LA VISTA)
        /*Configuracion.arrClientes = clientes;
        Configuracion.arrClientes.mostrarClientes();
        System.out.println("");
        Cliente clienteprueba = new Cliente();
        clienteprueba.mostrarClientes();
        System.out.println("");
        Configuracion.arrClientes.eliminarCliente(clienteborrar);
        Configuracion.arrClientes.mostrarClientes();
        System.out.println("");
        clienteprueba.mostrarClientes();
        System.out.println("");*/
        //cliente = new Cliente("DNI","75720836","ABC","DEF","GHI", "Fem", sdf.format(fechanacimiento2), "abc@gmail.com","1568");
        //System.out.println("Cliente agregado: "+Configuracion.arrClientes.agregarCliente(cliente));
//        Configuracion.arrClientes = clientes;
//        Configuracion.getArrClientes().mostrarClientes();
        clientes.mostrarClientes();
        System.out.println("");
        
        try {
            ArregloClientes extra = (ArregloClientes) Configuracion.serial.deserializar("archivoUser.txt");
            Configuracion.arrClientes = extra;
        } catch (Exception ex) {
            System.out.println("archivo vacio, primer guardado y/o archivo inexistente");
        }
        System.out.println(Configuracion.arrClientes);
        frmPaginaPrincipal fPrincipal = new frmPaginaPrincipal();

//        try {
//            Configuracion.serial.serializar("archivoUser.txt", Configuracion.arrClientes);
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null,"Fallo en el guardado de archivo");
//        }
//        try { //no se puede usar ObjectInputStream sin haber antes algún archivo existente
//            Configuracion.arrClientes=(ArregloClientes) Configuracion.serial.deserializar("archivoUser.txt");
//        } catch (Exception ex) {
//          JOptionPane.showMessageDialog(null,"Fallo en la recuperación de archivo");
//        }
        ControladorPrincipal ctrlPrincipal = new ControladorPrincipal(fPrincipal);
        ctrlPrincipal.iniciar();

        //INICIO DE PROGRAMAAAA (SEGÚN LA VISTA)
        //ZONA EXPERIMENTAL********************************
        //esto es para prueba, debido a que el cliente 0 registró dirección,tarjeta y carros,
        //lo estoy considerando como "cliente debidamente registrado" y lo estoy agregando a este arreglo 
        //estático para su uso en el programa visual
        /*Configuracion.arrClientes.agregarCliente(clientes.getArregloCliente(0));
        System.out.println("USAR PARA LOGIN EN EL SISTEMA (ES MOMENTANEO)");
        System.out.println("Correo experimental: xd");
        System.out.println("contraseña experimental: 123");
        System.out.println("CVV de tarjeta activa: 124");
        clientes.mostrarClientes();*/
        //ZONA EXPERIMENTAL********************************
        //Trabajo de vista y controladores
//        ArregloClientes mClientes = new ArregloClientes();
//        mClientes.toString();
//        frmCliente fCliente = new frmCliente();
//        ControladorCliente ctrlCliente = new ControladorCliente(mClientes, fCliente);
//        //ctrlCliente.iniciarCliente();
//        frmEntrega fEntrega = new frmEntrega();
//        Direccion mEntrega = new Direccion();
//        //ControladorEntrega ctrlEntrega = new ControladorEntrega(mClientes);
//        //ctrlEntrega.iniciarEntrega();
//        frmRecargaOpcional fRecargaOpc = new frmRecargaOpcional();
//        Cuenta mCuenta = new Cuenta();
//        Tarjeta mTarjeta = new Tarjeta();
//        ControladorRecargaOpc ctrlRecargaOpc = new ControladorRecargaOpc(mCuenta, mTarjeta);
//        ctrlRecargaOpc.iniciarRecargaOpc();
    }

}
