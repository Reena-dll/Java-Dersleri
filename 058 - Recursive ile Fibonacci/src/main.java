public class main {

    static int fib(int n) {

        if (n == 1 || n == 0){
            return 1;
        }
        return fib(n - 1) + fib(-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
