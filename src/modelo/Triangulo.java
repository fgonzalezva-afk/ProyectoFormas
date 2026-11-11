package modelo;

public abstract class Triangulo extends Figura  {
    
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    //  Getters
    public double getLadoA() { return ladoA; }
    public double getLadoB() { return ladoB; }
    public double getLadoC() { return ladoC; }
    // Setters
    public void setLadoA(double ladoA) { this.ladoA = ladoA; }
    public void setLadoB(double ladoB) { this.ladoB = ladoB; }
    public void setLadoC(double ladoC) { this.ladoC = ladoC; }

    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }

    public String toString() {
        return "Lado A: " + ladoA + "\nLado B: " + ladoB + "\nLado C: " + ladoC;
    }

    public static Triangulo crear(double a, double b, double c) {
        if (a == b && b == c) return new Equilatero(a);
        if (a == b) return new Isosceles(a, c);
        if (a == c) return new Isosceles(a, b);
        if (b == c) return new Isosceles(b, a);
        return new Escaleno(a, b, c);
    }


}
