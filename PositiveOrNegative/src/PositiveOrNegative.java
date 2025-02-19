import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        //Declarando as variáveis.
        Scanner pergunta = new Scanner(System.in);
        double numero;

        //Perguntando um número e recebendo ele.
        System.out.println("Digite um número");
        numero = pergunta.nextDouble();

        //Verificando se o número é nulo, positivo ou negativo.
        if (numero > 0){
            System.out.println("Número positivo");
        } else if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número nulo");
        }
    }
}
