public class Main {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        GeradorPrimo gerador = new GeradorPrimo();
        verificador.verificarSeEhPrimo(19);
        System.out.println("O próximo primo depois do 19 é " + gerador.gerarProximoPrimo(19));
    }
}
