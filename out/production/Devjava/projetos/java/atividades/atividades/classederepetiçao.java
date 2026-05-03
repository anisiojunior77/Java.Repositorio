package projetos.java.atividades;

public class classederepetiçao {
    public static void main(String[] args) {
        //estrutura de repetiçao sao elas while do while e for
        //sendo while enquanto e for para do fazer
        /* diferençao deles while e um enquanto e funciona normalmente
        ja do while faz uma repetiçao do codigo obrigatoria
        e for e uma estrutura para (para) sendo ela for ( : : )
         */
        int cont = 0;
        while (cont < 100) {
            System.out.println(cont);
            cont += 5;
        }
        for (cont = 10; cont > 1; cont--) {
            System.out.println("menos 1");
            System.out.println(cont);
        }
        //Pode ser utilizado o breack para parar seu codigo de loop para nao deixar ele rodando
        //na memoria, como o exemplo a seguir.

        var dinheiro = 1000;
        // dividir uma geladeira
        for (int valor = 1; valor < dinheiro; valor++) {
            var parcela = dinheiro / valor;
            if (valor > 10) {
                System.out.println(parcela);
                break;
            }
        }

        //Ao contrario do break (que seria uma pausa existe o continue, que continua o seu codigo ate a condiçao ser comcluida
        //oq quero dizer e que ele pula a continuação da repetição e volta para o inicio
        //contagem de 1 ate 10
        for(int i =0;i<10;i++) {
            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }
        }

    }
