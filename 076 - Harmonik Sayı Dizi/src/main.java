import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizilerde Harmonik Hesabı Yapan Program");
        System.out.print("Lütfen Dizi Boyutunu Giriniz:");
        int diziBoyut = input.nextInt();

        int[] arr = new int[diziBoyut];
        double harmonik = 0;

        for (int i = 0 ; i < diziBoyut ; i++){
            System.out.print(i+1+". Değeri Giriniz.");
            arr[i] = input.nextInt();
            harmonik += (1.0/arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Dizinin Harmonik Değeri => "+ diziBoyut/harmonik);




    }
}
