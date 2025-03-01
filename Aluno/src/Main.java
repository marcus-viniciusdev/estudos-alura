public class Main {
    public static void main(String[] args) {
        Aluno felipe = new Aluno("Felipe", 10, 9.5, 8, 8.5);
        System.out.printf("Aluno: %s\n", felipe.getNome());
        System.out.printf("Nota 1: %.2f\n", felipe.getNota1());
        System.out.printf("Nota 2: %.2f\n", felipe.getNota2());
        System.out.printf("Nota 3: %.2f\n", felipe.getNota3());
        System.out.printf("Nota 4: %.2f\n", felipe.getNota4());
        System.out.printf("A média de nota de %s é %.2f", felipe.getNome() , felipe.calculaMedia());
    }
}
