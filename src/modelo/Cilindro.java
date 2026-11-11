package modelo;

public class Cilindro extends Cuerpo {
    
    private Circulo base;
    private Rectangulo lateral;

    public Cilindro(Circulo base, double altura) {
        this.base = base;
        this.lateral = new Rectangulo(base.calcularPerimetro(), altura);
        
    }

    public Circulo getBase() { return base; }
    public Rectangulo getLateral() { return lateral; }

    public double getRadio() {
        return base.getRadio();
    }

    public double getAltura() {
        return lateral.getAltura();
    }

    public void setBase(Circulo base) {
        this.base = base;
        this.lateral = new Rectangulo(base.calcularPerimetro(), getAltura());
    }

    public void setAltura(double altura) {
        lateral.setAltura(altura);
    }

    public double calcularPerimetro() {
        return 2 * base.calcularPerimetro();
    }

    public double calcularArea() {
        return 2 * base.calcularArea() + lateral.calcularArea();
    }

    public double calcularVolumen() {
        return base.calcularArea() * getAltura();
    }

    public String toString() {
        return "Cilindro\nRadio: " + getRadio() + "\nAltura: " + getAltura();
    }

}
