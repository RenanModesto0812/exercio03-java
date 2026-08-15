import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("olá, como é seu nome? ");
        String nome = sc.nextLine();
        System.out.println("Bem-vindo: " +nome);
        System.out.println("Aluno " +nome + ", agora digite o valor da sua primeira nota: ");
        Float nota1 = sc.nextFloat();
        System.out.println("digite o valor da segunda nota:");
        Float nota2 = sc.nextFloat();
        System.out.println("digite o valor da segunda nota:");
        Float nota3 = sc.nextFloat();
        System.out.println("digite o valor da segunda nota:");
        Float nota4 = sc.nextFloat();
        float soma = nota1 + nota2 + nota3 + nota4;
        float divisao = soma / 4;
        System.out.println("---------------------- NOTA BOLETIM-------------------------");
        System.out.println(nome+ ", aqui estão os resultados das tuas somas: ");
        System.out.println("O valor total das suas notas juntos são: "+soma);
        System.out.println("Sua média final é : " + divisao);
        System.out.println("---------------------- FIM BOLETIM-------------------------");
        sc.close();
    }
}
