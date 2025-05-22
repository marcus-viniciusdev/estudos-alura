import br.com.alura.desafios.classes.Produto;
import br.com.alura.desafios.classes.ProdutoPerecivel;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> carrinho = new ArrayList<>();
        carrinho.add(new ProdutoPerecivel("Café", 17.50, 2, 9, 25));
        carrinho.add(new Produto("Livro", 54.90, 2));
        carrinho.add(new Produto("Caderno", 74.90, 1));
        carrinho.add(new Produto("Caneta", 3.90, 4));
        carrinho.add(new ProdutoPerecivel("Arroz", 5.50, 5, 6, 25));
        carrinho.add(new ProdutoPerecivel("Feijão", 4.90, 3, 7, 25));
        carrinho.add(new ProdutoPerecivel("Macarrão", 5.90, 2, 10, 25));

        System.out.println("Quantos produtos no carrinho: " + carrinho.size());
        System.out.println("Primeiro produto: " + carrinho.get(0));
        System.out.println("Produtos: " + carrinho);

        System.out.printf("Valor final do carrinho: R$%.2f", calculaCarrinho(carrinho));
    }

    public static double calculaCarrinho(ArrayList<Produto> carrinhoDeCompras) {
        double total = 0;
        for (Produto item : carrinhoDeCompras) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }
}
