import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;

        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();

       /* if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz.");
        } else if (heat <= 25) {
            if (heat <= 15){
                System.out.println("Sinemaya Gidebilirsniz");
            }
            if (heat >=10){
                System.out.println("Pikniğe Gidebilirsiniz");
            }

        }else
        {
            System.out.println("Yüzmeye Gidebilirsiniz");
        }*/

        if (heat>25) System.out.println("Yüzmeye Gidebilirsin");
        else if(heat>=15 && heat<25) System.out.println("Pikniğe Gidebilirsiniz\"");
        else if(heat>=5 && heat<15) System.out.println("Sinemaya Gidebilirsniz");
        if (heat<5) System.out.println("Kayak Yapabilirsiniz.");
    }
}
