package object.Q4;

public class ContaSimples {
    public String titular;
    public double saldo = 0.0;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado na conta de " + titular);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
}
