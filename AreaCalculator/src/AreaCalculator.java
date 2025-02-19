import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        //Declarando as variáveis.
        Scanner menu = new Scanner(System.in);
        int opcao = 0;

        //Loop do menu
        while (opcao != 3) {
            //Opções do menu.
            System.out.println("--------Menu--------");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            //Recebendo a opção que usuário escolheu.
            opcao = menu.nextInt();

            //Opções e as funções de cada uma delas.
            if (opcao == 1) {
                System.out.println("Qual é o comprimento de um lado do quadrado:");
                double comprimentoDoLado = menu.nextDouble();
                double area = comprimentoDoLado * comprimentoDoLado;
                System.out.println("Área do quadrado é " + area);
            } else if (opcao == 2) {
                System.out.println("Qual o raio do circulo");
                double raio = menu.nextDouble();
                double area = Math.PI * (raio * raio);
                System.out.println("Área do circulo é " + area);
            } else if (opcao == 3) {
                System.out.println("Programa encerrado!");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
