import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        //Importando o scanner
        Scanner scanner = new Scanner(System.in);

        //Recebendo um número inteiro via input no terminal.
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        //Verificando se o número é par ou ímpar
        if ((numero % 2) == 0){
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }
    }
}
