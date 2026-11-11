package modelo;

public class Cubo extends Cuerpo {
    
    private Cuadrado cara;

    public Cubo(Cuadrado cara) {
        this.cara = cara;
    }

    public Cuadrado getCara() { return cara; }
    public void setCara(Cuadrado cara) { this.cara = cara; }

    public double getArista() {
        return cara.getLado();
    }

    public double calcularPerimetro() {
        return 12 * getArista();
    }

    public double calcularArea() {
        return 6 * cara.calcularArea();
    }

    public double calcularVolumen() {
        return Math.pow(getArista(), 3);
    }

    public String toString() {
        return "Cubo\nArista: " + getArista();
    }

}
