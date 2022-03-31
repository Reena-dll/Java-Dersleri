import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double pi = 3.14;
        int a;
        System.out.print("Dairenin Yarı Çapını Giriniz : ");
        r = input.nextInt();
        System.out.print("Merkez Açısını Giriniz : ");
        a = input.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
        double merkezAci = (pi * (r * r) * a) / 360;
        System.out.println("Merkez açısısının ölçüsü " + a + " olan daire diliminin alanı :" + merkezAci);
    }
}
