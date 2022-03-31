import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Değişkenlerimiz
        int birinciKenar, ikinciKenar;
        double hipotenus;
        double ucgenAlan;
        double ucgenCevre;
        double u;
        System.out.print("Birinci Kenarı Giriniz : ");
        birinciKenar = input.nextInt();
        System.out.print("İkinci Kenarı Giriniz : ");
        ikinciKenar = input.nextInt();
        hipotenus = Math.sqrt((birinciKenar*birinciKenar)+ (ikinciKenar*ikinciKenar));
        System.out.println("Hipotenüs : "+hipotenus);
        ucgenCevre = 2*((birinciKenar+ikinciKenar+hipotenus)/2);
        System.out.println("Üçgenin Çevresi : "+ucgenCevre);
        u = (birinciKenar+ikinciKenar+hipotenus)/2;
        ucgenAlan = u*(u-birinciKenar)*(u-ikinciKenar)*(u-hipotenus);
        System.out.println("Üçgenin Alanı : " + ucgenAlan);



    }
}
