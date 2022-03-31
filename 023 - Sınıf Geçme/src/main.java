import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner inport = new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik;
        double ort = 0;
        int sayac = 5;
        System.out.print("Matematik notunu giriniz : ");
        mat = inport.nextInt();
        if (mat >= 0 && mat <= 100) {
        } else {
            mat = 0;
            sayac--;
        }
        System.out.print("Fizik notunu giriniz : ");
        fizik = inport.nextInt();
        if (fizik >= 0 && fizik <= 100) {
        } else {
            fizik = 0;
            sayac--;
        }
        System.out.print("Türkçe notunu giriniz : ");
        turkce = inport.nextInt();
        if (turkce >= 0 && turkce <= 100) {
        } else {
            turkce = 0;
            sayac--;
        }
        System.out.print("Kimya notunu giriniz : ");
        kimya = inport.nextInt();
        if (kimya >= 0 && kimya <= 100) {
        } else {
            kimya = 0;
            sayac--;
        }
        System.out.print("Müzik notunu giriniz : ");
        muzik = inport.nextInt();
        if (muzik >= 0 && muzik <= 100) {
        } else {
            muzik = 0;
            sayac--;
        }
        ort = (mat + fizik + turkce + kimya + muzik) / sayac;
        if (ort <= 55) {
            System.out.println("Sınıfta Kaldınız. Ortalamanız : " + ort);
        } else if (ort >= 56) {
            System.out.println("Sınıfı Geçtiniz. Ortalamanız : " + ort);
        }
    }
}
