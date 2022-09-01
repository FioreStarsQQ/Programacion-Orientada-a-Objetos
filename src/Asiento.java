public class Asiento {

    private char letra;
    private int fila;
    // private boolean ocupado; // si el espectador es igual a 1 quiere decir que
    // esta vacio por eso se quita el boolean
    private Espectador espectador;

    public Asiento(char letra, int fila) {
        this.letra = letra;
        this.fila = fila;
        this.espectador = null; // siempre va a ser null segun rellenaButacas
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public int edadEspectador() {
        return espectador.getEdad();
    }

    public boolean ocupado() {
        return espectador != null; // quiere decir que esta ocupado
    }

    @Override
    public String toString() {
        return "Asiento [espectador=" + espectador + ", fila=" + fila + ", letra=" + letra + "]";
    }

}
