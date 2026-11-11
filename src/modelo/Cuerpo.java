package modelo;

public abstract class Cuerpo implements Forma {

    protected int id;

    public Cuerpo() {
    }

    public Cuerpo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract double calcularVolumen();

    @Override
    public void imprimirInformacion() {
        System.out.println(toString()
            + " | Perímetro: " + calcularPerimetro()
            + " | Área: " + calcularArea()
            + " | Volumen: " + calcularVolumen());
    }

}
