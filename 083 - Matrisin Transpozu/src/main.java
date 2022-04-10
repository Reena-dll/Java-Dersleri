import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static int[][] transpoze(int matris[][], int satir, int sutun) {
        int b[][] = new int[sutun][satir];
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                b[i][j] = matris[j][i];
            }
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matrisin Satır Sayısını Giriniz => ");
        int satir = input.nextInt();
        System.out.print("Matrisin Sütun Sayısını Giriniz => ");
        int sutun = input.nextInt();

        int a[][] = new int[satir][sutun];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                a[i][j] = (int)(Math.random()*10);
            }
        }
        System.out.println("Rastgele oluşan matris : ");

        for (int[] row: a){
            for (int col: row){
                System.out.print(col+" ");
            }
            System.out.println();
        }

        System.out.println("Matrisin Transpozu :");
        for (int i =0; i< transpoze(a,satir,sutun).length;i++){
            for (int j = 0; j< transpoze(a,satir,sutun)[0].length; j++){
                System.out.print(transpoze(a,satir,sutun)[i][j]+" ");
            }
            System.out.println();
        }
    }
}
