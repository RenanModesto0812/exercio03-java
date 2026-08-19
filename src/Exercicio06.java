import java.util.Scanner;
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro: %.2f\n", perimetro);

        scanner.close();
    }
}
