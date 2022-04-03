import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        int ebob = 0;
        int ekok=0;
        System.out.print("N1 Sayısını Giriniz: ");
        int n11 = input.nextInt();

        System.out.print("N2 Sayısını Giriniz: ");
        int n22 = input.nextInt();

        if (n11 < n22) {
            n1 = n11;
            n2 = n22;
        } else {
            n1 = n22;
            n2 = n11;
        }
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                ebob = i;
            }
        }
        System.out.println("----------");

        for (int k = n1; k >= 1; k--) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println("Ebob: "+ebob);
                break;
            }
        }


        for (int i = 1; i <= (n1 * n2); i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println("Ekok: "+i);
                break;
            }
        }
        int i =1;
        while (n1 >= i) {
            if (n2 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB : " + ebob);
        i = n1;

        while (i < n1 * n2) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                System.out.println("EKOK : " + ekok);
                break;
            }
            i++;
        }

    }
}
