public class CelsiusConverter {
    public static void main(String[] args){
        //Coloque a temperatura em graus Celsius que você queira converter em Fahrenheit.
        double temperaturaCelsius = 0;

        //Convertendo a temperatura em graus Celsius para Fahrenheit
        //Conta usada: T(temperatura) vezes 1,8 + 32.
        double temperaturaFahrenheit = temperaturaCelsius * 1.8 + 32;

        //Variável contendo o texto a ser exibido.
    String mensagem = String.format("%.1f°C em Fahrenheit fica: %.1fF", temperaturaCelsius, temperaturaFahrenheit);

        //Exibindo a mensagem.
        System.out.println(mensagem);

        //Convertendo a temperatura em Fahrenheit para inteiro
        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;

        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaFahrenheitInteira);
    }
}
