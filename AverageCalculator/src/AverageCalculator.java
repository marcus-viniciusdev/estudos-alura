public class AverageCalculator {
    public static void main(String[] args){
        //Variáveis das notas do aluno.
        double nota1 = 4.5;
        double nota2 = 4.0;
        double nota3 = 9.0;
        double nota4 = 7.5;

        //Calculando a média do aluno
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        //Outra opção para escolas que usam notas com pesos diferentes.
        //double media = (nota1 * 2 + nota2 * 3 + nota3 * 2 + nota4 * 3) / 10;

        //Média de corte da escola
        double mediaDeCorte = 6.0;

        //Exibindo a nota do aluno.
        System.out.println(String.format("Sua média foi: %.2f", media));

        //Verificando se o aluno passou de ano
        if (media >= mediaDeCorte) {
            System.out.println("Você passou de ano!!!");
        } else {
            System.out.println("""
                    Você reprovou de ano
                    Sua mãe está decepcionada com você!
                    """);
        }
    }
}
