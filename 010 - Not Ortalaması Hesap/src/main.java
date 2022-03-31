import java.util.Scanner;

// Oğuzhan Sadıkoğlu

public class main {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;
        String Ad,Soyad;
        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);
        // Kullanıcı Bilgisi Al
        System.out.print("Lütfen İsminizi Giriniz : ");
        Ad = inp.nextLine();
        System.out.print("Lütfen Soyadınızı Giriniz : ");
        Soyad = inp.nextLine();
        // Kullanıcıdan değerleri al

        System.out.print("Matematik Notunuzu Giriniz : " );
        mat = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : " );
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : " );
        kimya = inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : " );
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : " );
        muzik = inp.nextInt();

        double ortalama = (mat+fizik+kimya+tarih+muzik)/5;

        boolean durum1 = ortalama<50;
        String str = (durum1) ? "Kaldı":"Geçti";

        System.out.println(Ad +" " + Soyad +  " \n Matematik Notu : " + mat + "\n Fizik Notu : "+ fizik + "\n Kimya Notu : "+ kimya +"\n Tarih Notu : "+tarih + "\n Müzik Notu : "+muzik + "\n Ortalaması : "+ ortalama + "\n Durum = "+ str );

    }
}
