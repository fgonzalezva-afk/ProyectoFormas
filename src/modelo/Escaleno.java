package modelo;

public class Escaleno extends Triangulo {
    
    public Escaleno(double ladoA, double ladoB, double ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    public String toString() {
        return "Triángulo escaleno\nLado A: " + getLadoA() + "\nLado B: " 
                + getLadoB() + "\nLado C: " + getLadoC();
    }

}
