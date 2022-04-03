import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int topNumber = 0;
        int botNumber = 0;

        System.out.print("Kaç Sayı Gireceksiniz: ");
        int totalNumber = input.nextInt();

        for (int i = 1; i <= totalNumber; i++) {
            System.out.print(i + ". Sayıyı Giriniz: ");
            int number = input.nextInt();
            if (number > topNumber) {
                topNumber = number;
            } else if (number < botNumber) {
                botNumber = number;
            }
            if (botNumber==0){
                botNumber = number;
            }
        }
        System.out.println("En Büyük Sayı: " + topNumber);
        System.out.println("En Küçük Sayı: " + botNumber);











        /*

        Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22

         */
    }
}
