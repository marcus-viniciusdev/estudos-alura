public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(834);
        conta.setSaldo(3000);
        conta.titular = "Marcus Vinicius";

        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.printf("Saldo: R$%.2f\n", conta.getSaldo());
        System.out.println("Titular: " + conta.titular);
    }
}
