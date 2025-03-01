public class Main {
    public static void main(String[] args) {
        Carro hilux = new Carro();
        hilux.modelo = "Toyota Hilux 1968";
        hilux.ano = 1968;
        hilux.cor = "Vermelho";

        hilux.exibeFichaTecnica();
        System.out.println("Idade do veículo: " + hilux.calculaIdade() + " anos");
    }
}
