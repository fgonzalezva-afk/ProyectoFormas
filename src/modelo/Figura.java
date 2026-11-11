package modelo;

public abstract class Figura implements Forma {
    protected int id;

    public Figura() {
    }

    public Figura(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void imprimirInformacion() {
        System.out.println(toString()
            + "\nPerímetro: " + calcularPerimetro()
            + "\nÁrea: " + calcularArea());
    }


}
