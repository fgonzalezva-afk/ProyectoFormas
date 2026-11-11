package modelo;
 
public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    // Getters
    public double getBase() { return base; }
    public double getAltura() { return altura; }
    // Setters
    public void setBase(double base) { this.base = base; }
    public void setAltura(double altura) { this.altura = altura; }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public double calcularArea() {
        return base * altura;
    }   

    public String toString() {
        return "Base: " + base + "\nAltura: " + altura;
    }

}
