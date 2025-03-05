public class NumerosPrimos {
    public boolean verificaPrimalidade(int numero){
        if (numero <= 1){
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0){
                return false;
            }
        }

        return true;
    }

    public void listarPrimos(int limite){
        for (int i = 2; i <= limite; i++){
            if (verificaPrimalidade(i)) {
                System.out.println(i);
            }
        }
    }
}
