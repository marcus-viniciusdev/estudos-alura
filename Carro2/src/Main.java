public class Main {
    public static void main(String[] args) {
        Uno uno = new Uno();
        uno.defineModelo("Uno Economy");
        uno.setEconomico(true);
        uno.definePrecoDeCadaAno(23000, 20000, 18000);
        uno.exibeInformacoes();
    }
}
