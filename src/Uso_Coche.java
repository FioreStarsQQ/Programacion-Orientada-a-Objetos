
import javax.swing.JOptionPane;

public class Uso_Coche {
    public static void main(String[] args) {

        Coche miCoche = new Coche();

        miCoche.estableceColor(JOptionPane.showInputDialog("Introduce el color del coche:"));
        System.out.println(miCoche.dimeDatosGenerales());
        System.out.println(miCoche.dimeColor());

        miCoche.configuraAsientos(JOptionPane.showInputDialog("¿Deseas asientos de cuero? si/no"));

        System.out.println(miCoche.dimeAsientos());

        miCoche.configuraClimatizador(JOptionPane.showInputDialog("¿Deseas climatizador? si/no"));

        System.out.println(miCoche.dimeClimatizador());
        System.out.println(miCoche.dimePesoCoche());
        System.out.println("El precio final del coche es: " + miCoche.precioCoche());
    }
}
