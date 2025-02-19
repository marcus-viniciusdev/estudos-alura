import java.util.Scanner;

public class FactoringCalculator {
    public static void main(String[] args) {
        //Importando o scanner.
        Scanner scanner = new Scanner(System.in);

        //Recebendo um número do usuário.
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int numeroFatorial = 1;

        //Calculando o fatorial do número que o usuário passou.
        for (int i = 1; i <= numero; i++) {
            numeroFatorial *= i;
            System.out.println(numeroFatorial);
        }

        //Exibindo o fatorial do número.
        System.out.println(numero + " Fatorial é " + numeroFatorial);
    }
}
