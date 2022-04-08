public class main {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] list2 = new int[list.length];
        for (int i = list.length - 1, k=0; i >= 0; i--,k++) {
            list2[k]=list[i];
        }

        printArray(list);
        printArray(list2);
    }
}
