import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***** Çin Zodyağı Hesaplama Menüsüne Hoş Geldiniz!!! *****\n\n\n");
        int dogumTarihi = 0;

        System.out.print("Lütfen Doğum Yılınızı Giriniz: ");
        dogumTarihi = input.nextInt();
        if (dogumTarihi >= 1900 && dogumTarihi <= 2200) {
            if (dogumTarihi % 12 == 0) {
                System.out.println("Çin Zodyağı Burcunuz: Maymun :P");
            }
            if (dogumTarihi % 12 == 1) {
                System.out.println("Çin Zodyağı Burcunuz: Horoz");
            }
            if (dogumTarihi % 12 == 2) {
                System.out.println("Çin Zodyağı Burcunuz: Köpek");
            }
            if (dogumTarihi % 12 == 3) {
                System.out.println("Çin Zodyağı Burcunuz: Domuz");
            }
            if (dogumTarihi % 12 == 4) {
                System.out.println("Çin Zodyağı Burcunuz: Fare");
            }
            if (dogumTarihi % 12 == 5) {
                System.out.println("Çin Zodyağı Burcunuz: Öküz");
            }
            if (dogumTarihi % 12 == 6) {
                System.out.println("Çin Zodyağı Burcunuz: Kaplan");
            }
            if (dogumTarihi % 12 == 7) {
                System.out.println("Çin Zodyağı Burcunuz: Tavşan");
            }
            if (dogumTarihi % 12 == 8) {
                System.out.println("Çin Zodyağı Burcunuz: Ejderha");
            }
            if (dogumTarihi % 12 == 9) {
                System.out.println("Çin Zodyağı Burcunuz: Yılan");
            }
            if (dogumTarihi % 12 == 10) {
                System.out.println("Çin Zodyağı Burcunuz: At");
            }
            if (dogumTarihi % 12 == 11) {
                System.out.println("Çin Zodyağı Burcunuz: Koyun");
            }
        }else{
            System.out.println("Yanlış Değer Aralığı Girildi");
        }


    }
}
