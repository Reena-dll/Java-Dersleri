import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " Sayısı bir armstrong sayıdır.");
        } else {
            System.out.println("ArmStrong Sayısı değildir");
        }
        System.out.println(result);




       /* int a = 2451232, basamakSayi = 0;
        // 2451/10 = 245
        // 245/10 = 24
        // 24/10 = 2
        // 2/10 = 0

        while (a != 0) {
            a = a / 10;
            basamakSayi+=1;
        }
        System.out.println(basamakSayi);

        // Bir sayının son basamağını bulma işlemi

        */

    }
}
