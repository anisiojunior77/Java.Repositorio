package projetos.java.atividades;

public class arreymult {
        public static void main(String[] args) {
            int arrays [][]=new int[2][2];
            arrays[0][0]=1;
            arrays[1][0]=2;
            arrays[1][1]=3;
            for (int i=0;i<arrays.length;i++){
                for (int j=0;j<arrays[i].length;j++){
                    System.out.println(arrays[i][j]);
                }
            }
        }
    }
    //esse e uma array multidimencional e é usado como se fosse matriz pode aver arrays ate 4d


