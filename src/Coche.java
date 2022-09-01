public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;
    private String color;
    private int pesoTotal;
    private boolean asientosCuero, climatizador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 100;
        motor = 1000;
        pesoPlataforma = 500;
    }

    public String dimeDatosGenerales() { // GETTER
        return "La plataforma del vehículo tiene " + ruedas + " ruedas. Mide " + largo / 1000
                + " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + pesoPlataforma
                + " kg. Motor equivalente a " + motor;
    }

    public String dimeLargo() { // GETTER
        return "El largo del coche es " + largo;
    }

    public void estableceColor(String colorCoche) { // SETTER
        color = colorCoche;
    }

    public String dimeColor() {
        return "El color del coche es " + color;
    }

    public void configuraAsientos(String asientosCuero) { // SETTER
        // this.asientosCuero = asientosCuero; estableciuendo la diferecnica entre un
        // varible de la clase y una creada como parametro
        if (asientosCuero.equalsIgnoreCase("si")) {
            this.asientosCuero = true;

        } else {
            this.asientosCuero = false;
        }
    }

    public String dimeAsientos() {
        if (asientosCuero) {
            return "El coche tiene asientos de cuero.";

        } else {
            return "El coche tiene asientos de serie.";
        }
    }

    public void configuraClimatizador(String climatizador) { // SETTER
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }

    }

    public String dimeClimatizador() { // GETTER
        if (climatizador == true) {
            return "El coche tiene climatizador.";
        } else {
            return "El coche lleva aire acondicionado.";
        }
    }

    public String dimePesoCoche() { // SETTER Y GETTER
        int pesoCarroceria = 500;
        pesoTotal = pesoPlataforma + pesoCarroceria;
        if (asientosCuero) { // igual a true se entiendoe
            pesoTotal = pesoTotal + 50;
        }
        if (climatizador) {
            pesoTotal = pesoTotal + 20;
        }
        return "El peso del coche es " + pesoTotal;
    }

    public int precioCoche() { // GETTER
        int precioFinal = 1000;

        if (asientosCuero == true) {
            precioFinal += 2000;
        }
        if (climatizador == true) {
            precioFinal += 1500;
        }
        return precioFinal;
    }

}