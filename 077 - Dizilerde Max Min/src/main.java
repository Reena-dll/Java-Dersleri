public class main {
    public static void main(String[] args) {
        int[] arr = {41, 23, 52, -13, 101, -35, 22, 78, 777, -99};

        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Maximum Değer => "+max);
        System.out.println("Minimum Değer => "+min);
    }
}
