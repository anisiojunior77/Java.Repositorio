package projetos.java.atividades.exercicios;

public class operadores {
    public static void main(String[] args) {
        var idade = 10;
        int idade1 = 20;
        int soma = idade1 + idade;
        Boolean comparador = soma >= 30;
        System.out.println(comparador);

        // Para comparadores logicos so usamos o tipo de variavel boolean

        String nome = "Anisio";
        boolean caracter = nome == "Anisio" ;
        System.out.println(nome);
        System.out.println(caracter);

    // existe tbm logicos como o (end) = && e (or) = ||

        boolean caracter1 = caracter == true || comparador == false;
        System.out.println(caracter1);

        // atribuidores += -= *= /= ou ++ -- ** //
        int logico = 1;
                logico = logico + 1;
                        logico --;
                        logico*= 2;

                        //são as formas de utilizar os atribuidores

        System.out.println(logico);
    }
}