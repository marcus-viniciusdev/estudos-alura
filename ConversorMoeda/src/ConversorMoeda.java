public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public double converterDolarParaReal(double dolares) {
        double contacaoDoDolar = 5.80;
        return dolares * contacaoDoDolar;
    }
}
