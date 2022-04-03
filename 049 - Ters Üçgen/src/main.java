import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz: ");
        int basValue = input.nextInt();

        for (int i = 1; i <= basValue; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (basValue-i)*2+1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
