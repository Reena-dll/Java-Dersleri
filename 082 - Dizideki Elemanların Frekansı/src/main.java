import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi Boyutunu Giriniz => ");
        int diziBoyut = input.nextInt();
        int count = 0;
        int[] arr = new int[diziBoyut];
        for (int i = 0; i < diziBoyut; i++) {
            System.out.print(i + 1 + ". Dizi Elemanını Giriniz => ");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                }
            }

            if (i == 0 && arr[i + 1] == arr[i]) {
                System.out.println(String.format("%d 'den %d tane var.", arr[i], count));
            }

            if (i == 0 && arr[i + 1] != arr[i]) {
                System.out.println(String.format("%d 'den %d tane var.", arr[i], count));
            }


            if (i != 0 && arr[i - 1] != arr[i]) {
                System.out.println(String.format("%d 'den %d tane var.", arr[i], count));
            }


        }
    }
}
