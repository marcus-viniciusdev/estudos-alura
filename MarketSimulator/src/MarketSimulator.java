public class MarketSimulator {
    public static void main(String[] args){
        //Detalhes do pedido.
        String produto = "Café";
        double precoProduto = 15.50;
        int quantidade = 1;

        //Calculando o valor da compra.
        double valor = precoProduto * quantidade;

        //Exibindo o pedido.
        String pedido = "Você não pediu nada.";
        if (quantidade == 1) {
            pedido = String.format("O valor do %s é R$%.2f!", produto, valor);
        } else if (quantidade > 1) {
            pedido = String.format("O valor de %d %s é de R$%.2f!", quantidade, produto, valor);
        }
        System.out.println(pedido);
    }
}
