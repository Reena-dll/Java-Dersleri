import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 = {1,325,1,415,325,6431,41,12,4532};
        int[] arr3 = {55,22,43,13,52,90,52,-13,-2,59,-41,120};
        int[] copyArr = Arrays.copyOf(arr3,arr3.length);
        int[] copyArr2 = new int[7];
        HelperArray.copyArray(arr,copyArr2,7);
        //HelperArray helper = new HelperArray();
        //helper.print(arr);
        //helper.print(arr2);
       // System.out.println(Arrays.toString(arr));
        //Arrays.fill(arr,10);
       // HelperArray.fill(arr,20);
        Arrays.fill(arr,2,5,10);
        System.out.println(HelperArray.search(arr2,6431));
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.binarySearch(arr3,43));
        System.out.println(Arrays.toString(copyArr));
        System.out.println(Arrays.toString(copyArr2));





    }
}
