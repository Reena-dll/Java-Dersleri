import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );

        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );
    }
}



/*
Doğruluk Tabloları
Ve (&&) Operatörünün Doğruluk Tablosu


Veya (||) Operatörünün Doğruluk Tablosu


Değil (!) Operatörünün Doğruluk Tablosu



* Soru İşareti Operatörü
? işareti operatörü ile Java'da mantıksal kıyaslama yapılabilir. ? ifadesi Java'daki "if-else" yapısı yerine kullanılabilir. Tek satırda bunu yapabilmemizi sağlar.
*  Kullanımı ise if'in içerisinde yer alacak ifadeyi soru işaretinden önce yazılır, ifadenin doğru olması durumunda yapılacak işlemler soru işareti ile iki
* nokta arasına yazılır. İfadenin yanlış olması durumunda yapılacaklar ise iki noktadan sonra yazılır.
*

Kullanımı :
*
* ( kontrol edilecek ifade ) ? doğru olması durumunda yapılacaklar : yanlış olması durumunda yapılacaklar

* */