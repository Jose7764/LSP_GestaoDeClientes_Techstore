package estrategias;

public class DescontoVIPStrategy {

    public double aplicar(double valor, double percentual) {
        return valor - (valor * percentual / 100);
    }

}