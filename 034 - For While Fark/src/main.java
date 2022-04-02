import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* int deger = 0;
        int denemeSayi=0;
        for (int i = 1; deger > 0; i++) {
            System.out.print("Bir değer giriniz: ");
            deger = input.nextInt();
            denemeSayi = i;
        }

        System.out.println(denemeSayi + ". Denemede girdiniz");
        */

       /* int sayi;
        for (boolean run = true; run; ) {
            System.out.print("Sayı Giriniz: ");
            sayi= input.nextInt();
            if (sayi<0){
                run = false;
            }
        }*/

        int sayi;

        do{
            System.out.print("Sayı Giriniz: ");
            sayi = input.nextInt();
        }
        while (sayi>0);



    }
}
