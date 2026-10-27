package object.Q5;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }
}