import br.com.alura.classes.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(new Pessoa("Pedro dos Santos Neves", 21));
        listaDePessoas.add(new Pessoa("Ana Beatriz Duarte", 24));
        listaDePessoas.add(new Pessoa("João Paulo Miguel", 19));
        System.out.println("Total de pessoas: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0));
        System.out.println("Pessoas: " + listaDePessoas);
    }
}