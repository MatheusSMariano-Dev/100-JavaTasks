import java.util.Scanner;

public class Ex09 {

        public class Main {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                int ano = input.nextInt();

                if (ano % 400 == 0) {
                    System.out.println("Ano bissexto");
                } else if (ano % 4 == 0 && ano % 100 != 0) {
                    System.out.println("Ano bissexto");
                } else {
                    System.out.println("Não é bissexto");
                }
            }
        }


    }
