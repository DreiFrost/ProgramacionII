package BibliotecaGeneral;

import BibliotecaGeneral.Prestamo;
/**
 *
 * @author DIEGO
 */
public class Multa {
    private double PagoSancion;
    private int diasRetraso;
    private double pagoPorDia;
    public Multa(double PagoSancion, int diasRetraso) {
        this.PagoSancion = PagoSancion;
        this.pagoPorDia = pagoPorDia;
        this.diasRetraso = (int) (diasRetraso * pagoPorDia);
    }
    
    public double getPagoSancion(){
        return PagoSancion;
    }
    
    public int getDiasRetraso() {
        return diasRetraso;
    }
    
    @Override
    public String toString() {
        return "Multa{"
        + "diasRetraso=" + diasRetraso
        + ", pagoSancion=" + PagoSancion
        + '}';
        }
    }
  
