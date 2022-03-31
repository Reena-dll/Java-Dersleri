public class main {
    public static void main(String[] args) {
        int age=25;
        int weight=48;

        if(age>=18){

            if(weight>=48){
                System.out.println("Kan verebilirsiniz");
            }
            else{
                System.out.println("Kan veremezsiniz");
            }

        }
        else{
            System.out.println("Kan verebilmek için yaşınız 18'den büyük olmalıdır.");
        }
    }
}


/*
* If ve Else Blokları
Java'da mantıksal ve koşullu ifadeler için if blokları kullanılır. Java 'da if blokları Türkçede "eğer" cümlesinin verdiği anlamla aynı şeyi ifade etmektedir. Programlamada koşul oluşturmak için if ve else bloklarını kullanırız. Else deyimi "değil ise" anlamı katmaktadır ve if deyiminden sonra kullanılır. Programlama da if ve else deyimleri çok önemlidir ve kodlamanın temel yapı taşlarını oluştururlar. If ve Else blokları ile programımız içerisinde ki algoritmalarımızı oluştururuz.

Koşula göre program içinde farklı işlemleri yerine getirmek gerekebilir. İf-else muhtemelen yazılım programlarında en yaygın kullanılan karar mekanizmasıdır. Bu tarz durumları Java'da kodlayabilmek için if-else karar mekanizmasının yanında switch-case gibi yapılarda kullanılmaktadır. İf-else karar mekanizması istenilen koşul gerçekleştiği takdirde çalışır. Kısacası belirlenen koşul doğruysa yazılan kod çalışır.

Java'da Karar Mekanizmaları
Java'da koşullu ifade ve şart oluşturmak için If ve Else kullanılırız. Ayrıca else if, switch gibi koşullu ifadelere sahiptir.

Programımızda belirtilen bir koşul doğruysa yürütülecek bir kod bloğu belirtmek için if kullanılır.
Aynı koşul yanlışsa yürütülecek bir kod bloğu belirtmek için else deyimi kullanılır.
İlk koşul yanlışsa, test edilecek yeni bir koşul belirtmek için eğer if else deyimi kullanılır.
Yürütülecek birçok alternatif kod bloğu belirtmek için switch deyimi kullanılır.
*
* else if
if- else- if : if-else-if kalıbında, bir if satırı, istediğiniz sayıda else-if satırı ve isteğe bağlı olarak tanımlanan bir else satırı bulunur.
*  Yani, else satırının tanımlanması şart değildir. Program, en başta yer alan if satırı ile if-else-if kalıbını değerlendirmeye başlar.
*  İlk doğru ifadenin bulunduğu if veya else-if satırı ile karşılaştığında ilgili işlem satırını çalıştırır. Kalıbın geri kalan tüm satırlarını
*  değerlendirmeye almadan geçer. Eğer if ve else if satırlarında yer alan ifadelerden hiç biri doğru bir sonuç vermezse, else satırında yer
* alan işlem satırını çalıştırır. else satırı da mevcut değilse, program if-else-if kalıbının hiç bir satırını çalıştırmadan bir sonraki satırdan
*  çalışmasına devam eder. if-else-if kalıbında sadece tek bir satır işlem görür.
*
* */
