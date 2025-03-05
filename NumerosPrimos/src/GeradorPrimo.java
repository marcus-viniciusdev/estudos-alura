public class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int numero) {
        int proximoPrimo = numero + 1;
        while (!verificaPrimalidade(proximoPrimo)){
            proximoPrimo++;
        }

        return proximoPrimo;
    }
}
