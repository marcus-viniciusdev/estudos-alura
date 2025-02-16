public class BmiCalculator {
    public static void main(String[] args) {
        // Declarando a variável de peso e altura.
        // Coloque seu peso e sua altura na variável a seguir:
        double peso = 57.3;
        double altura = 1.55;

        // Calculando o IMC.
        double imc = peso / (altura * altura);

        // Criando a mensagem a ser exibida.
        String mensagem = String.format("Seu IMC é: %f", imc);

        //Exibindo a mensagem.
        System.out.println(mensagem);

        //Diagnósticando a pessoa deacordo com o IMC (Índice de massa corporal)
        if (imc <= 18.5){
            System.out.println("Seu peso está abaixo do normal!");
        } else if (imc >= 18.6 && imc <= 24.9){
            System.out.println("Seu peso está normal!");
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Você está com sobrepeso!");
        } else if (imc >= 30.0 && imc <= 34.9){
            System.out.println("Você está com obesidade grau I!");
        } else if (imc >= 35.0 && imc <= 39.9){
            System.out.println("Você está com obesidade grau II");
        } else {
            System.out.println("Você está com obesidade grau III");
        }
    }
}
