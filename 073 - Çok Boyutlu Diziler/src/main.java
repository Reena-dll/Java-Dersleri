public class main {
    public static void main(String[] args) {
        int[] list = new int[5];

        int[][] matris = new int[6][6];
        matris[0][0] = 0;
        matris[2][3] = 839;
        //System.out.println(matris[2][3]);

        int[][] matris2 = {
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 390, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
        System.out.println(matris2[5][3]);

        int[][] matris3 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(matris3[2][3]);
        System.out.println(matris3.length);
        System.out.println(matris3[0].length);

        int number=1;
        int[][] matris4 = new int[3][4];
        for (int i = 0; i < matris4.length; i++) {
            for (int k = 0; k<matris4[0].length; k++){
                matris4[i][k] = number++;
            }
        }

        System.out.println("-------------------");
        System.out.println(matris4[2][3]);
        System.out.println(matris4.length);
        System.out.println(matris4[0].length);
        System.out.println("-------------------");

        for (int i = 0; i<matris4.length;i++){
            for (int j = 0 ; j<matris4[0].length;j++){
                System.out.print(matris4[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
