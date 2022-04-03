public class main {

    static int sum(int x, int y) {

        return x + y;

    }

    static void sum2(int a, int b){
        int result = a+b;
        System.out.println(result);
    }

    public static void main(String[] args) {

        int t = sum(5, 2) + sum(3, 5);
        System.out.println(t);
        sum2(5,2);
    }
}
