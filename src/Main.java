public class Main {
    public static void main(String[] args) {
        // Instanciar um objeto Carro
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.setAno(2022);
        carro.numeroPortas = 4;

        // Instanciar um objeto Moto
        Moto moto = new Moto();
        moto.marca = "Yamaha";
        moto.modelo = "MT-07";
        moto.setAno(2021);
        moto.setCilindrada(689);

        // Imprimir as informações dos veículos
        System.out.println(carro.informacoesVeiculo());
        System.out.println(moto.informacoesVeiculo());
    }
}
