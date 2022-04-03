import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yıldız Basamağı Girin: ");
        int deger = input.nextByte();

        for (int i = 1; i <= deger; i++) {
            for (int k = 1; k <= (deger - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }


            System.out.println();

        }

        for (int i = 1; i <= deger-1; i++) {
            for (int m = 1; m <= i; m++) {
                System.out.print(" ");
            }
            for (int z = 1; z<= ((deger-i)*2)-1 ; z++){
                System.out.print("*");

            }
            System.out.println();

        }







        /*for (int i = 0; i <= deger; i++)
        {
            for(int x=deger;x>i;x--)
            {
               System.out.print(" ");
            }
            for(int y = 1; y <= i; y++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }*/
    }
}
