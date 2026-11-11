package modelo;

public class Cuadrado extends Rectangulo {

    public Cuadrado(double lado) {
        super(lado, lado);
    }

    public double getLado() { return getBase(); }
    public void setLado(double lado) { 
        super.setBase(lado); 
        super.setAltura(lado); 
    }
    public void setBase(double base) {
        setLado(base);
    }
    public void setAltura(double altura) {
        setLado(altura);
    }

    public String toString() {
        return "Lado: " + getLado();
    }
}
