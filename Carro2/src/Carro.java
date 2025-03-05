public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void defineModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definePrecoDeCadaAno(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double calculaBarato() {
        double barato = precoAno1;
        if (precoAno2 < barato) {
            barato = precoAno2;
        } if (precoAno3 < barato) {
            barato = precoAno3;
        }
        return barato;
    }

    public double calculaCaro() {
        double caro = precoAno1;
        if (precoAno2 > caro) {
            caro = precoAno2;
        } if (precoAno3 > caro) {
            caro = precoAno3;
        }
        return caro;
    }

    public void exibeInformacoes(){
        System.out.println("Módelo: " + modelo);
        System.out.println("Preço ano 2025: " + precoAno1);
        System.out.println("Preço ano 2024: " + precoAno2);
        System.out.println("Preço ano 2023: " + precoAno3);
        System.out.println("Menor preço: " + calculaBarato());
        System.out.println("Maior preço: " + calculaCaro());
    }
}