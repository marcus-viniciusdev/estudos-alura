import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMoeda conversor = new ConversorMoeda();

        System.out.print("Digite o valor em dólar para ser convertido: ");
        double dolarValor = scanner.nextDouble();
        System.out.printf("$ %.2f na conversão fica R$ %.2f", dolarValor, conversor.converterDolarParaReal(dolarValor));
    }
}
