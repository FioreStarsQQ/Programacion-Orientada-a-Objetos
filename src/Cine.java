
public class Cine {

    private Asiento asientos[][];
    private double precio;
    private Pelicula pelicula;

    public Cine(int filas, int columnas, double precio, Pelicula pelicula) {

        asientos = new Asiento[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
        rellenaButacas(); // debe estar llena al crear Cine
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    private void rellenaButacas() {

        int fila = asientos.length;

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {

                asientos[i][j] = new Asiento((char) ('A' + j), fila); // porque en el ejemplo pone desde 8 hasta cero //
                                                                      // char tiene asociado un numero asi que lo que
                                                                      // hace es subir la codificacion de las letras y
                                                                      // sale el caracter de las letras del alfabeto

            }
            fila--;
        }
    }

    // todos los sitios
    public boolean haySitio() {

        boolean haySitio = false;

        for (int i = 0; i < asientos.length && !haySitio; i++) {
            for (int j = 0; j < asientos[0].length && !haySitio; j++) {

                if (!asientos[i][j].ocupado()) { // si no esta ocupado hay sitio
                    haySitio = true;
                }
            }
        }
        return haySitio;
    }

    // en un sitio concreto
    public boolean haySitioButaca(int fila, char letra) {

        return getAsiento(fila, letra).ocupado();

    }

    public Asiento getAsiento(int fila, char letra) {
        return asientos[asientos.length - fila - 1][letra - 'A'];
    }

    public boolean tieneDinero(Espectador e) {
        return e.getDinero() > precio;

    }

    public boolean tieneEdad(Espectador e) {
        return pelicula.tieneEdad(e);

    }

    public boolean sePuedeSentar(int fila, char letra, Espectador e) {
        return tieneDinero(e) && pelicula.tieneEdad(e) /* &&haySitioButaca(fila,letra) // esta de mas */;
    }

    public void sentar(int fila, char letra, Espectador e) {
        getAsiento(fila, letra).setEspectador(e);
    }

    public int getFilas() {
        return asientos.length;
    }

    public int getColumnas() {
        return asientos[0].length;
    }

    public void mostrar() {

        System.out.println("Información cine");
        System.out.println("Pelicula reproducida: " + pelicula);
        System.out.println("Precio entrada: " + precio);
        System.out.println("");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                System.out.println(asientos[i][j]);
            }
            System.out.println("");
        }
    }
}
