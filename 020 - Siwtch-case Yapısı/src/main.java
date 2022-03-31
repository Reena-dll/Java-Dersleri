import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int day;
        Scanner input = new Scanner(System.in);
        System.out.print("Gün sayısı giriniz : ");

        day = input.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Bugün Pazartesi");
                break;
            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.printf("Bugün Çarşamba");
                break;
            case 4:
                System.out.println("Bugün Perşembe");
                break;
            case 5:
                System.out.printf("Bugün Cuma");
                break;
            case 6:
                System.out.printf("Bugün Cumartesi");
                break;
            case 7:
                System.out.println("Bugün Pazar");
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");
        }
    }
}


/*
* Switch-Case Yapısı
Java'da birden çok kod bloğunu koşullara bağlamak için "switch" deyimi kullanılır.
* Switch Case; tanımlanmış olan yalnızca bir değişkenin, alacağı değerlere bağlı olarak,
*  farklı sonuçlar döndürmesini sağlayan bir yapıdır. Switch kısmında kullanılacak olan
* değişkenler byte, short, int, char veya String veri tipine sahip olmalıdır.

Sözdizimi (Syntax)
switch(değer) {
    case x:
        // değer x'e eşitse bu kod bloğu çalışacak
        break;
    case y:
        // değer y'ye eşitse bu kod bloğu çalışacak
        break;
    default:
        // değer hiç bir şeye eşit değilse bu kod bloğu çalışacak
}
Burada dikkat edilmesi gereken durum switch içine yazdığımız değerleri case deyimi ile kontrol ediyoruz.
*  Switch içinde ki herhangi bir değer caselerden biri ile uyuşuyorsa o case içindeki kod bloğu çalışır.
* */
