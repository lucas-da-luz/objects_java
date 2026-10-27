package object.Q5;

public class main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana";
        aluno1.nota1 = 8.5;
        aluno1.nota2 = 9.0;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Bruno";
        aluno2.nota1 = 7.0;
        aluno2.nota2 = 8.0;

        double media1 = aluno1.calcularMedia();
        double media2 = aluno2.calcularMedia();

        System.out.println("Média de " + aluno1.nome + ": " + media1);
        System.out.println("Média de " + aluno2.nome + ": " + media2 + "\n");


        if (media1 > media2) {
            System.out.println("O aluno com a maior média foi " + aluno1.nome + " com média " + media1);
        } else if (media2 > media1) {
            System.out.println("O aluno com a maior média foi " + aluno2.nome + " com média " + media2);
        } else {
            System.out.println("Ambos os alunos obtiveram a mesma média (" + media1 + ").");
        }
    }
}