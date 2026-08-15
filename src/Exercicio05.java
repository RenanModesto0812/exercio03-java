import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double inss = 8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do senhor q deseja efetual o calculo?");
        String nome = sc.nextLine();
        System.out.println("Tudo bem, senhor " + nome);
        System.out.println("Pode me fornecer uns dados?");
        System.out.println("[1]Sim");
        System.out.println("[2]Não");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Quantos dias o você trabalha?");
                int dias = sc.nextInt();
                System.out.println("Qual o valor da sua hora?");
                double hora = sc.nextDouble();
                System.out.println("Quantas horas vc trabalha por dia?");
                double hora2 = sc.nextDouble();
                double soma = hora * hora2;
                double salario_bruto = hora * hora2 * dias;
                double inss2 = inss / 100;
                double desconto = salario_bruto * inss2;
                double salario_liquido = salario_bruto - desconto;
                System.out.println("Olá "+nome + "Venho por meio dessa solicitação falar o resultado!");
                System.out.println("---------------------------INICIO---------------------");
                System.out.println("O seu salário bruto é: "+salario_bruto);
                System.out.println("O desconto do Inss é de: "+inss2);
                System.out.println("O desconto será de: "+desconto);
                System.out.println("O teu salario real será: "+salario_liquido);
                System.out.println("---------------------------CÁLCULO FINALIZADO---------------------");
                break;
            case 2:
                System.out.println("OK cancelando a operação!!");
                break;
        }
    }
}