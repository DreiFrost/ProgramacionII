package modelo;

/**
 *
 * @author DIEGO
 */
public abstract class Poligono {

    private int numeroLados;
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    
    //metodo abstracto 
    public abstract double area();
    public abstract double perimetro();
    
    
}
