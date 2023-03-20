public class SaldoUm {
    public static void main(String[] args) {
        double saldo = 2000.00;
        double reajuste = 0.01;

        double saldoReajustado = saldo + (saldo * reajuste);

        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Saldo com reajuste: R$ " + saldoReajustado);

    }
}