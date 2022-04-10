import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi Boyutunu Giriniz => ");
        int diziBoyut = input.nextInt();

        int[] arr = new int[diziBoyut];

        for (int i = 0; i < diziBoyut; i++) {
            System.out.print(i + 1 + ". Dizi Elemanını Giriniz => ");
            arr[i] = input.nextInt();
        }

        System.out.print("Aralık Giriniz => ");
        int space = input.nextInt();
        Arrays.sort(arr);
        for (int i : arr) {
            if (space < i) {
                System.out.println("Girilen sayıdan büyük en yakın sayı => " + i);
                int index = Arrays.binarySearch(arr, i);
                System.out.println("Girilen sayıdan küçük en yakın sayı => " + arr[index-1]);

                break;
            }

        }

    }
}
