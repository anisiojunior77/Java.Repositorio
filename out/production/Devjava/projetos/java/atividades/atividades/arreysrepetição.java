package projetos.java.atividades;

public class arreysrepetição {
    public static void main(String[] args) {
        /*intrudução aos arreys, são listas tipo matriz, que declara espaçao vagos e posição
        sao usadas para objetos...
         */
        int [] matriz= new int [5];
        matriz[0]=1;
        matriz[1]=2;
        matriz[2]=3;
        matriz[3]=4;
        System.out.println(matriz[0]+" " +matriz[1]+" "+matriz[2]);

        String[] anime = new String[4];
        anime[0]="goku";
        anime[1]="luffy";
        anime[2]="naruto";
        anime[3]="ichigo";
        for (int i=0;i<anime.length;i++){
            System.out.println(anime[i]);
        }
    }

}
/* quando um arreys que sao feitos para objtos nao a um valor armagenado nele
é colocado valores como
byre , short , int ,long , float, double o valor 0
char /u0000 " "
String null
bollean false
posso utilar a variavel (length) para contar o numero de espaços vazios
 */
