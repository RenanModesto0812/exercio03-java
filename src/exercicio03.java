import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Double dolar = 5.20;
        Double libra = 7.01;
        Double euro = 5.99;
        Scanner sc = new Scanner(System.in);
        System.out.println("__________________COMEÇO  DA CONVERSÃO__________________");
        System.out.println("Pra qual moeda vc deseja converter?");
        System.out.println("[1]Dolar");
        System.out.println("[2]libra");
        System.out.println("[3]Euro");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("fazendo a soma pra o dolar");
                System.out.println("Qual o valor q vc deseja fazer a soma?");
                double valor1  = sc.nextDouble();
                double dolares = dolar * valor1;
                System.out.println("Em dolar vc vai ter: " +dolares);
                break;
            case 2:
                System.out.println("fazendo a soma pra o dolar");
                System.out.println("Qual o valor q vc deseja fazer a soma?");
                double valor2  = sc.nextDouble();
                double libras = libra * valor2;
                System.out.println("Em dolar vc vai ter: " +libras);
                break;
            case 3:
                System.out.println("fazendo a soma pra o dolar");
                System.out.println("Qual o valor q vc deseja fazer a soma?");
                double valor3  = sc.nextDouble();
                double euros = euro * valor3;
                System.out.println("Em dolar vc vai ter: " +euros);
                break;
            default:
                System.out.println("__________________FINAL DA CONVERSÃO__________________");
        }
        System.out.println("__________________FINAL DA CONVERSÃO__________________");
    }
}
