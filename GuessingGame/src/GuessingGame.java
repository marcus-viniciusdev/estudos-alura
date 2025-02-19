import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        //Declarando as variáveis.
        int numeroAleatorio = new Random().nextInt(100);
        int numero = 0;
        int tentativas = 0;
        Scanner pergunta = new Scanner(System.in);

        //Exibindo uma pergunta.
        System.out.println("Tente adivinhar um número de 1 a 100:");

        //Loop de 5 tentativas.
        while (tentativas < 5) {
            //Recebendo um número e realizando as tentativas.
            numero = pergunta.nextInt();
            tentativas ++;

            //Dando dicas e dizendo se a pessoa acertou.
            if (numero == numeroAleatorio) {
                System.out.println("Você acertou o número. o número secreto é: " + numero);
                break;
            } else if (numero > numeroAleatorio){
                System.out.println(numero + " é maior que o número secreto.");
            } else {
                System.out.println(numero + " é menor que o número secreto.");
            }
        }

        //Revelando a resposta se a pessoa errou.
        if (tentativas == 5 && numero != numeroAleatorio){
            System.out.println("Você não acertou o número. o número secreto é: " + numeroAleatorio);
        }
    }
}
