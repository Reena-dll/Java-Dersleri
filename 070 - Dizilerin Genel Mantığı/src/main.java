public class main {
    public static void main(String[] args) {
        //int[] list = new int[10];
        //int list2[] = new int[20];
        // 2 yolu da kullanabilirsiniz ama jargon olan 1.

        // list[0] = 10;
        // list[1] = 20;
        // list[2] = 30;

        // System.out.println(list[2]);
        //  System.out.println(list.length);

        /*
        for (int i = 0; i < list.length; i++) {
            list[i] = (i + 1) * 10;
            System.out.println(list[i]);
        }
        */

        /*
         int[] list = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(list.length);
        System.out.println(list[5]);

        for (int i =0; i<list.length; i++){
            System.out.println(list[i]);
        }

        */

        int[] list1 = {10,20,30,40,50,60,70,80,90,100};
        int[] list2 = {110,120,130,140,150,160,170,180,190,200};
        double[] list3 = {1.1,2.2,3.3,4.4,5.5};
        printArray(list1);
        printArray(list2);
        printArray(list3);


    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void printArray(double[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
