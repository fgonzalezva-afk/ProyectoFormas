package modelo;
import java.util.ArrayList;

public class Coleccion {
    
    private ArrayList<Figura> figuras;
    private ArrayList<Cuerpo> cuerpos;

    public Coleccion() {
        figuras = new ArrayList<>();
        cuerpos = new ArrayList<>();
    }

    public ArrayList<Figura> getFiguras() { return figuras; }
    public ArrayList<Cuerpo> getCuerpos() { return cuerpos; }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void agregarCuerpo(Cuerpo cuerpo) {
        cuerpos.add(cuerpo);
    }

    public void listarFiguras() {
        System.out.println("Listado de Figuras:");
        for (Figura f : figuras) {
            f.imprimirInformacion();
        }
    }

    public void listarCuerpos() {
        System.out.println("Listado de Cuerpos:");
        for (Cuerpo c : cuerpos) {
            c.imprimirInformacion();
        }
    }

    public double calcularAreaTotal() {
        double total = 0;
        for (Figura f : figuras) {
            total += f.calcularArea();
        }
        for (Cuerpo c : cuerpos) {
            total += c.calcularArea();
        }
        return total;
    }

    public double calcularPerimetroTotal() {
        double total = 0;
        for (Figura f : figuras) {
            total += f.calcularPerimetro();
        }
        for (Cuerpo c : cuerpos) {
            total += c.calcularPerimetro();
        }
        return total;
    }

    public double calcularVolumenTotal() {
        double total = 0;
        for (Cuerpo c : cuerpos) {
            total += c.calcularVolumen();
        }
        return total;
    }

    public String toString() {
        return "Colección de Figuras y Cuerpos\n"
            + "Número de Figuras: " + figuras.size() + "\n"
            + "Número de Cuerpos: " + cuerpos.size();
    }



}
