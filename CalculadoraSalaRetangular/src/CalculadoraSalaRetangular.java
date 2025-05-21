public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public void calcularArea(double largura, double altura) {
        double area = largura * altura;
        System.out.println("Área de uma sala de a largura de " + largura + " m e altura de " + altura + " m é de " + area + " m");
    }

    @Override
    public void calcularPerimetro(double largura, double altura) {
        double perimetro = (largura + altura) * 2;
        System.out.println("Perimetro de uma sala de a largura de " + largura + " m e altura de " + altura + " m é de " + perimetro + " m");
    }
}
