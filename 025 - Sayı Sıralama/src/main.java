import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("1. Sayıyı giriniz: ");
        a = input.nextInt();

        System.out.print("2. Sayıyı giriniz: ");
        b = input.nextInt();

        System.out.print("3. Sayıyı giriniz: ");
        c = input.nextInt();

       /* if ((a > b) && (a > c)) {    Büyükten Küçüğe
            if (b > c) {
                System.out.println(a + " > " + b + " > " + c);
            } else if (b < c) {
                System.out.println(a + " > " + c + " > " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b + " > " + a + " > " + c);
            } else if (a < c) {
                System.out.println(b + " > " + c + " > " + a);
            }
        } else if (c > a && c > b) {
            if (a > b) {
                System.out.println(c+ " > " + a + " > " + b);
            } else if(a<b){
                System.out.println(c+ " > " + b + " > " + a);
            }

        } */

        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a + " < " + b + " < " + c);
            } else if (b > c) {
                System.out.println(a + " < " + c + " < " + b);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println(b + " < " + a + " < " + c);
            } else if (a > c) {
                System.out.println(b + " < " + c + " < " + a);
            }
        } else if (c < a && c < b) {
            if (a < b) {
                System.out.println(c + " < " + a + " < " + b);
            } else if (a > b) {
                System.out.println(c + " < " + b + " < " + a);
            }
        }

    }
}
