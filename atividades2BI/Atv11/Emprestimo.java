public class Emprestimo {
    public double valorTotal;
    public double taxaJuros;
    public int numeroParcelas;

    public double proximaParcela(){
        if (this.numeroParcelas > 0){
            double juros = valorTotal * (taxaJuros / 100.0);
            double valor = (valorTotal / (double) numeroParcelas) * taxaJuros;
            numeroParcelas--;
            return valor;
        } else {
            return -1.0;
        }
    }

}
