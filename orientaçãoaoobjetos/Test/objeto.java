package orientaçãoaoobjetos.Test;

import orientaçãoaoobjetos.Dominio.Registro;

public class objeto {
    public static void main(String[] args) {
        /* Orientação de objeto mostrar como vc crie uma classe que serie
        igual um registro no visualg, e declarado a classe com public e depois
        as variaveis dentro da classe assim puxamos ela com import para podemos a utilizar esse
        registro
         */
        Registro pessoa = new Registro();
        Registro pessoa2 = new Registro();
        pessoa.nome = "Anisio";
        pessoa2.nome = "felipe";
        System.out.println(pessoa.nome);
        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.idade);

    }
}
