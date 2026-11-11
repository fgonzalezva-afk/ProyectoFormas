package modelo;

public class Tetraedro extends Cuerpo {

    private Equilatero cara;

    public Tetraedro(Equilatero cara) {
        this.cara = cara;
    }

    public Equilatero getCara() {
        return cara;
    }
    public void setCara(Equilatero cara) {
        this.cara = cara;
    }

    public double getArista() {
        return cara.getLado();
    }

    public double calcularPerimetro() {
        return 6 * getArista();
    }

    public double calcularArea() {
        return 4 * cara.calcularArea();
    }

    public double calcularVolumen() {
        return Math.pow(getArista(), 3) / (6 * Math.sqrt(2));
    }

    public String toString() {
        return "Tetraedro\nArista: " + getArista();
    }
}
