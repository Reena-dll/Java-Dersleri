public class HelperArray {

    static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    static void fill(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
    }


    static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;

            }
        }
        return -1;
    }

    static void copyArray(int[] arr, int[] arr2, int newLenght) {


        for (int i = 0; i < arr.length; i++) {

            arr2[i] = arr[i];


        }

    }
}
