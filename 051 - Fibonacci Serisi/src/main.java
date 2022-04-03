import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayısını Giriniz: ");
        int number = input.nextInt();
        int a = 1;
        int b = 1;
        int c;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i = 1; i <= number-2; i++){
            c = a + b;
            a = b;
            b = c;

            System.out.print(c+" ");
        }
    }
}