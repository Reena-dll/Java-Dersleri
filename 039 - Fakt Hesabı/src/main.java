import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /* int number;
        int fakt = 1;
        System.out.print("Enter the number for factorial calculation: ");
        number = input.nextInt();
        for (int i = 1; i <= number ; i++){
            fakt *=i;
        }
        System.out.println(number+"! = "+fakt);
        */ // Java ile kombinasyon hesaplayan program
        int n;
        int r;
        int nFakt = 1;
        int rFakt = 1;
        int nEksiR;
        int result;
        do {
            System.out.println("The first number must be greater than the second number.");
            System.out.print("First Number : ");
            n = input.nextInt();
            System.out.print("Second Number : ");
            r = input.nextInt();
        }
        while(n<r);

        nEksiR = n-r;
        int nEksiRFakt=1;

        for (int i = 1; i <= n; i++) {
            nFakt *=i;
        }
        for (int i = 1; i <= r; i++) {
            rFakt *=i;
        }
        for (int i = 1; i <= nEksiR; i++) {
            nEksiRFakt *=i;
        }
        result= nFakt / (rFakt*nEksiRFakt);
        System.out.println("C("+n+","+r+") = "+ result);

    }
}
