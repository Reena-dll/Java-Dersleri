import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayiyi Girin : ");

        int sayi = inp.nextInt();

        int toplam = 0;

        while (sayi != 0) {
            int x = sayi % 10;
            toplam += x;
            sayi /= 10;
        }
        System.out.println("Toplam : " + toplam);

    }
}
