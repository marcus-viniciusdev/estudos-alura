package br.com.alura.desafios.classes;

public class ProdutoPerecivel extends Produto {
    private int dataValidadeMes;
    private int dataValidadeAno;

    public ProdutoPerecivel(String nome, double preco, int quantidade, int dataValidadeMes, int dataValidadeAno)  {
        super(nome, preco, quantidade);
        if (dataValidadeMes >= 1 && dataValidadeMes <= 12) {
            this.dataValidadeMes = dataValidadeMes;
            this.dataValidadeAno = dataValidadeAno;
        } else {
            System.out.println("Data inválida do " + this.getNome());
            System.exit(0);
        }
    }

    public int getDataValidadeMes() {
        return dataValidadeMes;
    }

    public int getDataValidadeAno() {
        return dataValidadeAno;
    }

    @Override
    public String toString() {
        return String.format("%s R$%.2f Val: %02d/%02d Quantidade %d - Total : %.2f", getNome(), getPreco(), getDataValidadeMes(), getDataValidadeAno(), getQuantidade(), getPreco() * getQuantidade());
    }
}
