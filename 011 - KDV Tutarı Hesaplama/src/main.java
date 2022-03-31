import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar;
        double kdvOran = 0;
        System.out.print("Lütfen Tutarı Giriniz : ");
        tutar = input.nextDouble();

        if (tutar <=1000)
        {
            kdvOran = 0.18;
        }
        else if (tutar >1000)
        {
            kdvOran = 0.08;
        }
        double kdvTutar = tutar*kdvOran;
        double toplamTutar = tutar+kdvTutar;

        System.out.println("KDV'siz Tutar : "+tutar);
        System.out.println("KDV Oranı : "+kdvOran);
        System.out.println("KDV Tutarı : "+kdvTutar);
        System.out.println("Toplam Tutar : "+toplamTutar);
    }
}
