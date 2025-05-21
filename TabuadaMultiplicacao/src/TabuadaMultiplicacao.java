public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            int numeroMultiplicado = numero * i;
            System.out.println(numero + " x " + i + " = " + numeroMultiplicado);
        }
    }
}