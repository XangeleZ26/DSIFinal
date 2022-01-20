
package Modelo;

public class Configuracion {
    public static int maxVehiculosXCliente = 10;
    public static int maxClientes = 10;
    public static int maxEstacionesXPeaje = 10;
    public static int maxMovimientos = 10;
    public static int maxPeajes = 10;
    
    public static ArregloClientes arrClientes = new ArregloClientes();
    public static ArregloPeajes arrPeajes = new ArregloPeajes();
    
    public static String[] arrPeaje = {"Panamericana Norte","Panamericana Sur","Huaylas","Separadora Industrial"};
    public static String[] arrEstaciones = {"Serpentin de Pasamayo","Variante Pasamayo","El Paraíso","Fortaleza"};

    public static ArregloClientes getArrClientes(){
        return arrClientes;
    }

    public void setArrClientes(ArregloClientes arrClientes) {
        Configuracion.arrClientes = arrClientes;
    }
    
    public static String[] marcasVehiculo = {"ACS", "AG AUTOMOTRIZ", "ALELUYA", "ALYER", "ASIA", "AUDI","AUTOCRAFT", "BAW", "BEIJING" ,
                                             "BMW", "BROWN", "BULLON", "Camc", "CEISA", "CEMAC", "CHERY", "CHEVROLET", "CHRYSLER", "CITROEN",
                                             "CLEMENT", "COCERVI", "CORENHA", "CORMAR", "CPR", "DAEWOO", "DAIHATSU", "DCMETAL", "DODGE",
                                             "DONG FENG", "DORSEY", "DUNHAM", "ESMECA", "FABRIMETAL", "FAMECA", "FIAT", "FMC", "FORD",
                                             "FOTON", "FREIGHTLINER", "FRUEHAUF", "FUFABRISAC", "G.H.INDUSTRIAL", "GDAN", "GM", "GMC",
                                             "GOLDEN DRAGON", "GRE & JHO", "GREAT DANE", "GREAT WALL", "GREYHOUND", "GUERRA", "HERCULES",
                                             "HINO", "HONDA", "HRT", "HUANGHAI", "INCAPER", "INCMENA", "INDIO", "INMEPO", "INTERNATIONAL",
                                             "ISUZU", "IVECO", "JAC", "JEEP", "JINBEI", "JMC", "JMR INVERSIONES", "JOSELOF", "KENWORTH",
                                             "KIA", "KILIN", "King Long", "LAM", "LEON", "LIMA TRAYLERS", "MACK", "MAHINDRA", "MAN", "MARCO POLO",
                                             "MAZDA", "MCI", "MELGA", "Mercedes", "MERCEDES BENZ", "MG", "MILLER", "MITSUBISHI", "MONTENEGRO",
                                             "NACIONAL", "NEOGAS", "NISSAN" , "OGJ METAL", "PAZ DEL PERU", "PERTRA", "PEUGEOT", "PINES", "QUSCHMITZ",
                                             "RAJUNSA", "RANDON", "RECRUSUL", "REFRISS", "REMCASA", "RENAULT", "RMB", "RMB SATECI", "RODO", "ROFOSA",
                                             "SAN MARTIN", "SATECI", "SCANIA", "SEAT", "SERMET", "SERVIMET", "SIELSAC", "SINOTRUK", "STRIK", 
                                             "SUBARU", "SUDENG", "SUZUKI", "THEURER", "TIANJIN", "TOYOTA", "TRAIL TEK", "TRAILMOBILE" , "TRAINPE",
                                             "TRAMASA", "TRIELHT", "UTILITY", "VALDERRAMA", "VERA", "VOLKSWAGEN", "VOLVO", "VRAMEL", "VW",
                                             "WHITE", "WHUE", "YAMAHA", "YUEJIN", "ZXAUTO"};
    public static int[] ejesVehiculo = {2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static String[] categoriasVehiculo = {"Liviano", "Pesado"};
    public static String[] tipoUsoVehiculo = {"Privado", "Público"};
    public static String[] tipoDocumentos = {"DNI", "Carnet Extranjería", "Pasaporte"};
    public static String[] sexo ={"Femenino", "Masculino"};
    public static String[] distritosLima = {"", "ANCON", "ATE", "BARRANCO", "BELLAVISTA", "BREÑA", "CARABAYLLO", "CARMEN DE LA LEGUA REYNOSO", "CHACLACAYO", 
                                            "CHORRILLOS", "CIENEGUILLA", "COMAS", "EL AGUSTINO", "INDEPENDENCIA", "JESUS MARIA", "LA MOLINA", "LA PERLA",
                                            "LA PUNTA", "LA VICTORIA", "LIMA", "LINCE", "LOS OLIVOS", "LURIGANCHO", "LURIN", "MAGDALENA DEL MAR", "MIRAFLORES",
                                            "PACHACAMAC", "PUCUSANA", "PUEBLO LIBRE", "PUENTE PIEDRA", "PUNTA HERMOSA", "PUNTA NEGRA", "RIMAC", "SAN BARTOLO",
                                            "SAN BORJA", "SAN ISIDRO", "SAN JUAN DE LURIGANCHO", "SAN JUAN DE MIRAFLORES", "SAN LUIS", "SAN MARTIN DE PORRES",
                                            "SAN MIGUEL", "SANTA ANITA", "SANTA MARIA DEL MAR", "SANTA ROSA", "SANTIAGO DE SURCO", "SURQUILLO", "VENTANILLA",
                                            "VILLA EL SALVADOR", "VILLA MARIA DEL TRIUNFO"};
    public static String[] medioPago={"VISA", "MASTER CARD", "AMERICAN EXPRESS", "DINERS CLUB"};

    public static String datosVehiculos[] = {"Placa", "Marca", "Modelo", "Categoría", "Ejes", "Uso", "Peso", "Año"};
    public static String[] departamentosPeru ={"LIMA", "AMAZONAS", "ANCASH", "APURIMAC", "AREQUIPA", "AYACUCHO", "CAJAMARCA", "CALLAO", "CUSCO", "HUANCAVELICA", "HUANUCO", 
                                               "ICA", "JUNÍN", "LA LIBERTAD", "LAMBAYEQUE", "LORETO", "MADRE DE DIOS", "MOQUEGUA", "PASCO", "PIURA", "PUNO", 
                                               "SAN MARTÍN", "TACNA", "TUMBES", "UCAYALI"};
    public static String[] provinciasLima = {"LIMA", "BARRANCA", "CAJATAMBO", "CANTA", "CAÑETE", "HUARAL", "HUAROCHIRÍ", "HUAURA", "OYÓN", "YAUYOS"};
    public static String[] datosMovimiento={"FECHA","TIPO","MONTO","VEHICULO","PEAJE","ESTACION"};
            
           
}
        
