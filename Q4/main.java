package object.Q4;

public class main {
    public static void main(String[] args) {
        ContaSimples conta = new ContaSimples();

        conta.titular = "Carlos Silva";

        conta.depositar(150.00);
        conta.depositar(200.50);
        conta.depositar(50.00);

        conta.exibirSaldo();
    }
}