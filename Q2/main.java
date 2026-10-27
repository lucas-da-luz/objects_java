public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();

        meuCachorro.nome = "Rex";
        meuCachorro.raca = "Labrador";

        System.out.println("Nome do cachorro: " + meuCachorro.nome);
        System.out.println("Raça: " + meuCachorro.raca);

        System.out.print("O cachorro latindo: ");
        meuCachorro.latir();
    }
}
