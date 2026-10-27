public class Main {
    public static void main(String[] args) {
        // 1. Instanciando o objeto da classe Cachorro
        Cachorro meuCachorro = new Cachorro();

        // 2. Definindo o nome e a raça do cachorro
        meuCachorro.nome = "Rex";
        meuCachorro.raca = "Labrador";

        // 3. Imprimindo as informações do cachorro
        System.out.println("Nome do cachorro: " + meuCachorro.nome);
        System.out.println("Raça: " + meuCachorro.raca);

        // 4. Chamando o método latir()
        System.out.print("O cachorro latindo: ");
        meuCachorro.latir();
    }
}
