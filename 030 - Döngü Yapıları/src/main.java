public class main {
    public static void main(String[] args) {
        int i = 1;
        int k;
        System.out.println("Porgram Başladı.");
        while (i <=5){
            System.out.println(i);
            k=1;
            while (k<=10){
                System.out.print(k+",");
                k++;
            }
            System.out.println();

            i++;
        }

        System.out.println("Program Bitti.");
    }
}


/*
* Döngü Yapıları
Döngüler, belirli bir koşul sağlandığı sürece tekrarlanması gereken işler için kullanılan programlama kodlarıdır.
*  Döngü deyimleri, bahsedilen komut parçalarının belirtilen şartlar gerçekleştikçe tekrar tekrar işlenmesini sağlar.
*  Java’da for, while ve do-while olmak üzere 3 adet döngü deyimi bulunmaktadır

Kısacası : Döngü yapıları kodumuzun belirli kısımlarının döngüye girmesini ve birden fazla kez çalışmasını sağlar.
*  Döngüler bir koşula bağlanır ve bu koşul var olduğu sürece aynı kod bloğu çalışmaya devam eder. Koşul artık sağlanmıyorsa döngü sona erer.
* */