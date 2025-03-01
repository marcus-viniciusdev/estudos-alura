public class Carro {
    String modelo;
    int ano;
    String cor;

    public void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public int calculaIdade(){
        return 2025 - ano;
    }
}
