import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yıl;
        System.out.print("Yılı Giriniz: ");
        yıl = input.nextInt();
        if ((yıl >= 0) && (yıl <= 2100)){

            if ((yıl%4 == 0) && (yıl%100 != 0)){
                System.out.println(yıl+" Bu bir artık yıldır.");

            } else if ((yıl%100 == 0) && (yıl%400 == 0)) {
                System.out.println(yıl+" Bu bir artık yıldır.");

            } else if ((yıl%100 == 0) && (yıl%400 != 0)) {
                System.out.println(yıl+" Bu bir artık yıl değildir.");

            } else {
                System.out.println(yıl+" Bu bir artık yıl değildir.");
            }

        } else {
            System.out.println("Tekrar Dene!!!");
        }
    }
}
