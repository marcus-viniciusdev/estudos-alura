public class DolarConverter {
    public static void main(String[] args){
        //Coloque o valor em dólar que você queira converter em reais.
        double precoDolar = 299.99;

        //Coloque a contação do dólar.
        double valorDolar = 5.698762542;

        //Realizando a converção do dólar.
        double convercaoReais = precoDolar * valorDolar;

        //Exibindo o resultado.
        String mensagem = String.format("$%.2f convertido em Reais fica R$%.2f", precoDolar, convercaoReais);
        System.out.println(mensagem);
    }
}
