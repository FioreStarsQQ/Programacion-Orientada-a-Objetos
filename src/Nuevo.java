public class Nuevo {
    public static void main(String[] args) {

        Empleados trabajor1 = new Empleados("Karelia");
        Empleados trabajor2 = new Empleados("Karen");
        Empleados trabajor3 = new Empleados("Karen");
        Empleados trabajor4 = new Empleados("Karen");
        Empleados trabajor5 = new Empleados("Karen");

        trabajor1.cambiaSeccion("RRHH");
        // trabajor1.cambiaNombre("Maria");

        System.out.println(trabajor1.devuelveDatos());
        // Empleados.Id++;
        System.out.println(trabajor2.devuelveDatos());
        System.out.println(trabajor3.devuelveDatos());
        System.out.println(trabajor4.devuelveDatos());
        System.out.println(trabajor5.devuelveDatos());
        // los metods estaticos siempre trabajan con la clase directamente, no actuan sobre objetos OTRO DATO: los metdos statics acceden solo a variables o constantes static
        System.out.println(Empleados.dameIdSiguiente());

    }
}

class Empleados {

    private final String nombre; // ´para que el nombre no cambie a pesar de que este se quiera cambiar en el
                                 // main, se trata de una constante
    private String seccion;
    private int Id; // un campo id que comparta cada objeto creado por ello se usa STATIC, no
                    // pertenece a ningun objeto sino a la clase en gneral
    private static int IdSiguiente = 1; // copia de la variable, compartida con tdos donde se esta usando, se usa una
                                        // clase antes por eso MAth.PI == Empleados.Id

    public Empleados(String nom) {
        nombre = nom;
        seccion = "administracion";
        Id = IdSiguiente;
        IdSiguiente++;
    }

    public static String dameIdSiguiente(){
        return "El Id siguiente es: "+IdSiguiente;
    }

    public void cambiaSeccion(String seccion) { // SETTER
        this.seccion = seccion; // this corresponde al campo de clase

    }

    public String devuelveDatos() { // GETTER
        return "El nombre es " + nombre + " y la seccion es " + seccion + " y el Id es " + Id;
    }

    // public void cambiaNombre(String nombre) {
    // this.nombre =nombre;
    // }
}
