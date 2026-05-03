package projetos.java.atividades;

public class ifelseatividades {
    public static void main(String[] args) {
        /* entendendo sobre if else com a logica not (!)
        importante toda variavel precisa ter um valor antes de ser inicializada
        senao o codigo vai dar erro
        if = se else = senao else if = senao se
        importante if else so funcina com tipos logicos
        entao so funciona com true e false ou seja bloolean
        Importante else = (senao) nao possui condição
         */
        int valorcaderno = 10;
                int carteira = 20;
                boolean codiçao = valorcaderno > carteira;
                String comparador;
        if (codiçao){
            comparador = "você pode comprar";
        }else if (valorcaderno < carteira){
            comparador = "Não possui saldo";
        }else{
            comparador = "Tem certeza disso";
        }
        System.out.println(comparador);
        System.out.println(codiçao);
        codiçao = !codiçao;
                System.out.println(codiçao);
                int idade = 20;
                System.out.println(idade);

                //operador ternario e o uso de ? : para valores true ou false

        var doar = "quero doar";
        var naodoar = "Nao quero doar";
        int valor = 1000;
        String voudoar = valor > 1000 ? doar : naodoar;
        System.out.println(voudoar);

        // assim voce usa um operador ternario

    }
}
