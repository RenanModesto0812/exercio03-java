import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("olá, como é seu nome? ");
        String nome = sc.nextLine();
        System.out.println("Bem-vindo: " +nome);
        System.out.println("Perfeito! " +nome + ", agora digite o valor q deseja somar: ");
        Float valor1 = sc.nextFloat();
        System.out.println("Agora qual o outro numero q deseja somar com ele? ");
        Float valor2 = sc.nextFloat();
        float soma = valor1 + valor2;
        float subtracao = valor1 - valor2;
        float multiplicacao = valor1 * valor2;
        float divisao = valor1 / valor2;
        System.out.println(nome+ ", aqui estão os resultados das tuas somas: ");
        System.out.println(valor1 + " + " + valor2 +" = " + soma);
        System.out.println(valor1 + " - " + valor2 +" = " + subtracao);
        System.out.println(valor1 + " * " + valor2 +" = " + multiplicacao);
        System.out.println(valor1 + " / " + valor2 +" = " + divisao);
        sc.close();
    }
}