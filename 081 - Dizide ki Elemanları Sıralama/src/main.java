import java.util.Arrays;
import java.util.Scanner;

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
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
