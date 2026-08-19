import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.hypot(base, altura);

        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro: %.2f\n", perimetro);
        System.out.printf("Diagonal: %.2f\n", diagonal);

        scanner.close();
    }
}