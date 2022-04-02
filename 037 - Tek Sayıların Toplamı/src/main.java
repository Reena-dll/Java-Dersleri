import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /*
        int n;
        int toplam = 0;
        do {
            System.out.print("Sayı Giriniz: ");
            n = input.nextInt();
            if (n % 2 == 1) {
                toplam += n;
            }
        } while (n > 0);

        System.out.println("Toplam " + toplam); */

        // ODEV java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve
        // 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

        int n;
        int total = 0;

        do {
            System.out.print("Sayıyı Giriniz: ");
            n = input.nextInt();
            if (n % 2 == 0 && n % 4 == 0){
                total+=n;
            }

        } while (n % 2 == 0);
        System.out.println(total);

    }
}
