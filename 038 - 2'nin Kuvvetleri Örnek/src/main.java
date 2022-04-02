import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /* int number;
        System.out.print("Sayıyı Giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i *= 2) {
            System.out.println(i);
        } */ // ODEV Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        int number;
        System.out.print("Sayıyı Giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i *= 4) {
            System.out.println("4'ün Katları: " + i);
        }

        for (int i = 1; i <= number; i *= 5) {
            System.out.println("5'in Katları: " + i);
        }
    }
}
