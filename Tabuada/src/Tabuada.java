import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        //Importando o scanner
        Scanner scanner = new Scanner(System.in);

        //Recebendo um número pelo terminal como input do usuário.
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        //Exibindo a tabuada do número até 10.
        System.out.println("Tabuada do " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}