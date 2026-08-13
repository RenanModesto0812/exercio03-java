import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o teu nome?");
        String nome = sc.nextLine();
        System.out.println("Qual a ano de nascimento?");
        int anoNascimento  = sc.nextInt();
        System.out.println("Quantas dias vc trabalhou esse mês?");
        double dias = sc.nextDouble();
        System.out.println("Quantas horas vc trabalhou no dia?");
        double horas = sc.nextDouble();
        System.out.println("Qual o valor da sua hora?");
        double valor = sc.nextDouble();
        double salario = horas * valor * dias;
        System.out.println("__________________FORMULÁRIO__________________");
        System.out.println("Nome: " + nome);
        System.out.println("Nasceu: " +(2026 - anoNascimento));
        System.out.println("Trabalhou dias: " + dias);
        System.out.println("Salário: R$" + salario);
        System.out.println("__________________FIM FORMULÁRIO__________________");
        sc.close();

        }
    }