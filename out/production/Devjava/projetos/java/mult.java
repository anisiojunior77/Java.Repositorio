package arrayg;

public class mult {
        public static void main(String[] args) {
            int arrays [][]=[2][2];
            arrays[0][1]=1;
            arrays[1][1]=2;
            arrays[2][1]=3;
            for (int i=0;i<arrays.length;i++){
                for (int j=0;j<arrays[i].length;j++){
                    System.out.println(arrays[i][j]);
                }
            }
        }
}
