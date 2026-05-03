package orientaçãoaoobjetos.Test;

import orientaçãoaoobjetos.Dominio.Carro;

public class regcarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.ano = 2021;
        Carro carro2 = new Carro();
        carro2.marca = "Chevolete";
        carro2.modelo = "Cruze";
        carro2.ano = 2024;
            System.out.println(carro.marca);
            System.out.println(carro.modelo);
            System.out.println(carro.ano);
            System.out.println("---------------------\n Carro numero2:\n ------------------------");
            System.out.println(carro2.marca);
            System.out.println(carro.modelo);
            System.out.println(carro.ano);
    }
}
