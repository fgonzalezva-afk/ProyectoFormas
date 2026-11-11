package modelo;

public class Isosceles extends Triangulo{
    
    public Isosceles(double ladoIgual, double base) {
        super(ladoIgual, ladoIgual, base);
    }

    public double getLadoIgual() { return getLadoA(); }
    public double getBase() { return getLadoC(); }

    public String toString() {
        return "Triángulo isósceles\nLados iguales: " + getLadoIgual()
            + "\nBase: " + getBase();
    }
    
}
