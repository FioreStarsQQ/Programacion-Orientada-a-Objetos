public class POO4 {
    
    
    public static int generarNumeroEnteroAleatorio(int minimo, int maximo){
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
    
    public static double generarNumeroRealAleatorio(int minimo, int maximo){
        double num=Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
    public static final String nombres[] = {
        "Fiorela","Laura", "Juan", "Marco"
    };
}

