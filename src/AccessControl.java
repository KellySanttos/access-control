import java.util.Scanner;

public class AccessControl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int age = scanner.nextInt();

        String authorized = "USUÁRIO AUTORIZADO!";
        String denied = "USUÁRIO NEGADO!";

        if (age >= 18) {
            System.out.println(authorized);
            System.out.println("--------------------------------");

            System.out.print("Digite o primeiro número: ");
            int numberOne = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int numberTwo = scanner.nextInt();

            int result = Multiply(numberOne, numberTwo);
            System.out.println("--------------------------------");

            System.out.println("Resultado da multiplicação: ".concat(String.valueOf(result)));

            scanner.close();

        } else
            System.out.println(denied);
    }
    public static int Multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
}
