import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* int n;
        int k;
        int total=1;
        System.out.print("Ussu Alınacak Sayı: ");
        n = input.nextInt();
        System.out.print("Us Olacak Sayı: ");
        k = input.nextInt();
        int i = 1;
        while (i <= k) {
            total*= n;
            i++;
        }
        System.out.println("Result: "+ total);
        */

        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
        int n;
        int k;
        int total = 1;
        System.out.print("Ussu Alınacak Sayı: ");
        n = input.nextInt();
        System.out.print("Us Olacak Sayı: ");
        k = input.nextInt();

        for (int i = 1; i<=k ; i++){
            total*=n;
        }
        System.out.println("Result: "+ total);
    }
}
