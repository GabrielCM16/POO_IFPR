public class UltilizarEmprestimo {
    public static void main(String[] args) {
        Emprestimo E1 = new Emprestimo();
        Emprestimo E2 = new Emprestimo();

        E1.numeroParcelas = 12;
        E1.taxaJuros = 3.0;
        E1.valorTotal = 2000.0;

        E2.numeroParcelas = 15;
        E2.taxaJuros = 4.5;
        E2.valorTotal = 8000.0;

        double proxE1, proxE2;
        System.out.println("Valores das parcelas: ");
        do {
            proxE2 = E2.proximaParcela();
            proxE1 = E1.proximaParcela();

            System.out.println("E1: " + proxE1 + "\t E2: " + proxE2);

        }while(proxE1 > 0 && proxE2 > 0);

    }
}
