package modelo;

public class Equilatero extends Triangulo {

    public Equilatero(double lado) {
        super(lado, lado, lado);
    }

    public double getLado() {
        return super.getLadoA();
    }

    public String toString() {
        return "Lado: " + getLado();
    }
    
}
