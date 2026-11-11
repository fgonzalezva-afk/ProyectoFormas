package modelo;

public class Rombo extends Figura {
    
    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    //  Setters
    public double getDiagonalMayor() { return diagonalMayor; }
    public double getDiagonalMenor() { return diagonalMenor; }
    //  Getters
    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }
    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }   

    public double calcularLado() {
        return Math.sqrt(Math.pow(diagonalMayor / 2, 2)
                    + Math.pow(diagonalMenor / 2, 2));
    }

    public double calcularPerimetro() {
        return 4 * calcularLado();
    }

    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public String toString() {
        return "Diagonal mayor: " + diagonalMayor + "\nDiagonal menor: " + diagonalMenor;
    }

    

}
