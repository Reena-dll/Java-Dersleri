import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      /*  int sayi;
        System.out.print("Sayıyı Giriniz: ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++){
            if (i%2 == 1){
                continue;
            }
            System.out.println(i);
        }*/

        // ÖDEV 1 " Üstte ki sorguyu While döngüsü ile yazma

       /* int sayi;
        System.out.print("Sayıyı Giriniz: ");
        sayi = input.nextInt();

        while (sayi >= 0) {

            if (sayi % 2 == 0){
                System.out.println(sayi);
            }
            sayi--;
        }
        */

        // ÖDEV 2 " Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız."

        int sayi, ort = 0, sayac = 0;
        System.out.print("Sayıyı Giriniz: ");
        sayi = input.nextInt();
        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                ort += i;
                sayac++;
            }
        }
        ort/=sayac;
        System.out.println("Ortalama: "+ ort);


    }
}
