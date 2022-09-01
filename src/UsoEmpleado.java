
// UNICO FICHERO FUENTE
import java.util.*;

public class UsoEmpleado {
    public static void main(String[] args) {
        /*
         * Empleado empleado1 = new Empleado("Juan Pérez",85000,1990,12,17);
         * Empleado empleado2 = new Empleado("Ana Pérez",95000,1995,10,15);
         * Empleado empleado3 = new Empleado("Flor Pérez",100000,1998,9,15);
         * 
         * empleado1.subeSueldo(5);
         * empleado1.subeSueldo(10);
         * empleado1.subeSueldo(8);
         * 
         * System.out.println("Nombre: "+empleado1.dameNombre()+ " Sueldo: "+
         * empleado1.dameSueldo()+" Fecha de Alta: "+ empleado1.dameFechaContrato());
         * System.out.println("Nombre: "+empleado2.dameNombre()+ " Sueldo: "+
         * empleado2.dameSueldo()+" Fecha de Alta: "+ empleado2.dameFechaContrato());
         */

        Empleado[] misEmpleados = new Empleado[3];
        // cuando se quiere guardar datos de diferentes tipos en un array es
        // recomendable usar una clase o craearla para guradar
        misEmpleados[0] = new Empleado("Lucia", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Maria", 95000, 1995, 4, 25);
        misEmpleados[2] = new Empleado("Fiorela", 95000, 1998, 9, 15);

        for (int i = 0; i < 3; i++) {
            misEmpleados[i].subeSueldo(5);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo()
                    + " Fecha de contrato: " + misEmpleados[i].dameFechaContrato());
        }
        // con FOR EACH se puede simplificar estos bucles
    }
}

// solo la principal lleva PUBLIC, ya que el fichero almacenara varias clases,
// por ello una clase tiene el MODIFICADOR DE ACCESO DIRECTO "PUBLIC"
class Empleado {

    public Empleado(String nom, double sueldo, int año, int mes, int dia) { // metodo constructr

        nombre = nom;
        this.sueldo = sueldo;
        // Clase: GregorianCalendar construye una fecha de la API de Java, los meses se
        // trbajan con iterador desde 0
        GregorianCalendar calendario = new GregorianCalendar(año, mes - 1, dia);
        // GETTIME por herencia, hereda todas las propiedades de la clase objeto en
        // general, por lo tanto lo heredo de CALENDAR
        altaContrato = calendario.getTime();

    }

    public String dameNombre() { // GETTER
        return nombre;
    }

    public double dameSueldo() { // GETTER
        return sueldo;
    }

    public Date dameFechaContrato() { // GETTER
        return altaContrato; // LOS VALORES YA FUERON ESTABLECIDOS EN EL CONSTRUCTOR
    }

    // SETTER, establece un aumento de sueldo
    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100; // Ex. 5% = 0.05*sueldo
        sueldo += aumento; // aumenta el sueldo y procentaje hallado
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
}
