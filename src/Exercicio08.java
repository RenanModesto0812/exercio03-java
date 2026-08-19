import java.util.Scanner;
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Kelvin: " + kelvin + " K");

        scanner.close();
    }
}