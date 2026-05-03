package projetos.java.atividades;

public class part2mult {
    public static void main(String[] args) {
        /* Um array pode ser definida varias posiçoes para varios lugares diferentes
        e ser inicializado ja com valores exemplo posso ter 3 linhas mas na primeira linha tenho 4 colunas
        na sugunda 2 e na terceira 1.
         */
        int[][]arrey= new int[3][];
        arrey[0]=new int[1];
        arrey[1]=new int[3];
        arrey[2]=new int[6];
    for(int i=0;i<arrey.length;i++){
        System.out.println("----------");
    for(int j=0;j<arrey[i].length;j++){
    System.out.print(arrey[i][j]+",");}

    //como no codigo acima pode ter valores diferentes de colunas para cada linha

    System.out.print("\n");
        int numero [][] = {{1,2,3},{4,5,6,7},{8,9,10}};
    for (int []numero1 : numero) {
        for(int num: numero1) {
        System.out.print(num+",");
        }
    }
    }    }

}
