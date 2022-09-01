public class PrincipalCine {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Horror", 90, 16, "Fiorela");

        Cine cine = new Cine(8, 9, 5.5, pelicula);
        Espectador e;
        int fila = 0;
        char letra = 0;

        int numEspectadores = 20;
        for (int i = 0; i < numEspectadores && cine.haySitio(); i++) {
            e = new Espectador(POO4.nombres[POO4.generarNumeroEnteroAleatorio(0, POO4.nombres.length - 1)],
                    POO4.generarNumeroEnteroAleatorio(10, 30), POO4.generarNumeroRealAleatorio(1, 10));

            System.out.println(e);

            do {

                fila = POO4.generarNumeroEnteroAleatorio(0, cine.getFilas() - 1);
                letra = (char) POO4.generarNumeroEnteroAleatorio('A', 'A' + (cine.getColumnas() - 1));

            } while (cine.haySitioButaca(fila, letra));

            if (cine.sePuedeSentar(fila, letra, e)) {
                e.pagar(cine.getPrecio());
                cine.sentar(fila, letra, e);
                // System.out.println(e);
                // System.out.println();
            }
        }

        cine.mostrar();

        System.out.println("Fin");
    }
}
