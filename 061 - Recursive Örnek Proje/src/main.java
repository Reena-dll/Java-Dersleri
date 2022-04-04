import java.util.Scanner;

public class main {

    static int example(int sayi, int score, int temp) {


        System.out.println(sayi);
        if (sayi < 0 || sayi == 0) {
            score++;
            return example(sayi + 5, score, temp);
        }
        if (score == 0) {
            return example(sayi - 5, score, temp);
        } else {
            if (temp != sayi) {
                return example(sayi + 5, score, temp);
            } else{
                return sayi;
            }

        }


    }

    public static void main(String[] args) {
        // Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
        // Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
        // Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
        Scanner input = new Scanner(System.in);
        int score = 0;
        System.out.print("Sayıyı Giriniz: ");
        int sayi = input.nextInt();
        int temp = sayi;
        if (sayi == 0 || sayi < 0) {
            System.out.println("İlk Girilen Değer 0'dan Büyük Olmalıdır.");
        } else {
            System.out.print(example(sayi, score, temp));
        }
    }
}
