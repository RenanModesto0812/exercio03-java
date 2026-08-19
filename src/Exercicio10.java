import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o teu nome?");
        String nome = scanner.nextLine();
        System.out.print("Digite a média final do aluno: ");
        double media = scanner.nextDouble();

        if (media >= 7.0) {
            System.out.println( nome +" Foi Aprovado");
        } else if (media >= 5.0) {
            System.out.println( nome +" Está de Recuperação");
        } else {
            System.out.println( nome + " Está Reprovado");
        }

        scanner.close();
    }
}
