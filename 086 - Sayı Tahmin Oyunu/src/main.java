import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int number = rand.nextInt(100);
        // int number = (int)(Math.random()*100);
        System.out.println(number);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz => ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz...");
                if (!isWrong){
                    isWrong = true;
                    System.out.println("Bir daha ki hatalı girişinizde hakkınızdan düşülecektir.");
                }else{
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan Hakkı =>"+(5-right));
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler Doğru Tahmin Ettiniz !!");
                isWin = true;
                break;
            }else{

                System.out.println("Hatalı bir sayı girdiniz.");
                if (selected > number){
                    System.out.println(selected+" Sayısı, gizli sayıdan büyüktür.");
                }else{
                    System.out.println(selected+" Sayısı, gizli sayıdan küçüktür.");
                }

                System.out.println("Kalan Hakkı =>"+(5-right));
            }
            wrong[right++] = selected;
        }

        if (!isWin){
            System.out.println("Kaybettiniz.");

        }

        System.out.println("Tahminleriniz : ");
        for ( int i : wrong){
            if (i!=0){
                System.out.print(i+" ");
            }
        }

    }
}
