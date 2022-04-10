import java.util.Locale;

public class main {
    public static void main(String[] args) {
        String str = "patika";
        String str2 = "paTİka";
        System.out.println(str.charAt(2)); // String ifadenin içerisinde ki değerin indeksine göre harfi getirir.
        System.out.println(str.codePointAt(1)); // Belirtilen indekste ki karakterin unicode değerini verir.
        System.out.println(str.codePointAt(2)); // Belirtilen indekste ki  bir önceki karakterin  unicode değerini verir.
        System.out.println(str.compareTo(str2));// İki string ifadeyi karşılaştırır. Eşit ise 0 çıkar. Eşit değişse unicode farklılığını yazar.
        System.out.println(str.compareToIgnoreCase(str2)); // İki string ifadeyi büyük küçük uyum olmadan karşılaştırır. Eşitler ise değer 0 çıkar.
        System.out.println(str.concat(".dev")); // String ifadenin sonuna ekleme yapar.
        System.out.println(str.contains("tika")); // İçerisinde kapsayıp kapsamadığını belirtiyor.
        System.out.println(str.endsWith("a")); // String ifadenin sonu ne ile bittiğini sorguluyoruz.
        System.out.println(str.startsWith("p")); // String ifadenin başlangıç ne ile başladığını sorguluyoruz.
        System.out.println(str.equals("patika")); // İki ifadeyi karşılaştırır.True veya False değeri döndürür.
        System.out.println(str.indexOf("k")); // Bir dizede belirtilen karakterlerin ilk bulunan oluşumunun konumunu verir.
        System.out.println(str.isEmpty()); // Değerin boş olup olmadığını kontrol eder
        System.out.println(str.length()); // String değerin uzunluğunu verir.
        //System.out.println(str.replace("a","b")); // Bir karakteri başka bir karaktere çevirmek. Tüm hepsi için geçerli
        //System.out.println(str.replaceFirst("a","b")); // Bir karakteri başka bir karaktere çevirmek. Sadece ilk bulduğu değer için
        //System.out.println(str.replaceAll("a","b")); // Bir karakteri başka bir karaktere çevirmek. Tüm cümle için bakar.
        //System.out.println(str.split());  //Bir dizeyi bir alt dizeye böler.
        System.out.println(str.substring(2, 6)); // Karakterleri bir dizeden, belirtilen bir başlangıç konumundan başlayarak ve belirtilen karakter sayısıyla ayıklar
        System.out.println(str.toLowerCase());// String değeri küçük harfe çevirir
        System.out.println(str.toUpperCase()); // Tüm değerleri büyük harfe çevirir.
        System.out.println(str.trim());// Bir string ifadenin sağında ki ve solunda ki boşlukları siler.
        System.out.println();
    }
}
