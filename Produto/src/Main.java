public class Main {
    public static void main(String[] args) {
        Produto cafe = new Produto();
        cafe.setNome("Café Pilão");
        cafe.setPreco(15.00);

        System.out.printf("%s está de R$ %.2f está em oferta.\n", cafe.getNome(), cafe.getPreco());
        cafe.aplicaDesconto(25);
        System.out.printf("Custando: R$ %.2f", cafe.getPreco());
    }
}
