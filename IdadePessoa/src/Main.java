public class Main {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Felipe Dos Santos Araújo");
        pessoa.setIdade(18);

        System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos");
        pessoa.verificaIdade();
    }
}
