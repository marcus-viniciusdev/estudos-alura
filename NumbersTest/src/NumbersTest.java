import java.util.Scanner;

public class NumbersTest {
    public static void main(String[] args) {
        //Declarando as variáveis.
        Scanner perguntador = new Scanner(System.in);
        int numero1;
        int numero2;

        //Pergunta dois números ao usuário.
        System.out.println("Digite um número inteiro");
        numero1 = perguntador.nextInt();
        System.out.println("Digite outro número inteiro");
        numero2 = perguntador.nextInt();

        //Verificando se os números são iguais ou qual é maior.
        if (numero1 == numero2) {
            System.out.println("São iguais!");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro é maior!");
        } else {
            System.out.println("O segundo é maior!");
        }
    }
}