public class DiscountCalculator {
    public static void main(String[] args){
        //Declarando o preço e o desconto.
        double precoOriginal = 15.50;
        double porcentagemDesconto = 10.0;

        //Calculando o desconto.
        double precoDesconto = precoOriginal * (porcentagemDesconto / 100);
        double precoFinal = precoOriginal - precoDesconto;

        //Exibindo a mensagem
        String mensagem = String.format("%.2f com o desconto de %.2f fica %.2f", precoOriginal, precoDesconto, precoFinal);
        System.out.println(mensagem);
    }
}
