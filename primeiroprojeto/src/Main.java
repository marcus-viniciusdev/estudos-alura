public class Main {
    public static void main(String[] args) {
        String nome = "Maria";
        int idade = 30;
        double valor = 50.9999;
        String texto = "Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais".formatted(nome, idade, valor);
        System.out.println(texto);
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
    }
}