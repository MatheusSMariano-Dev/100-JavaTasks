import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");

         double C = leitura.nextDouble();
         double F = (C * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + F);
    }
}