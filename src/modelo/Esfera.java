package modelo;

public class Esfera extends Cuerpo {
    
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double calcularArea() {
        return 4 * Math.PI * radio * radio;
    }

    public double calcularVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    public String toString() {
        return "Esfera\nRadio: " + radio;
    }

}
