import java.util.Scanner;


public class main {


    public static void main(String[] args) {
        int gun, ay;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz günü yazınız : ");
        gun = input.nextInt();
        if ((gun >= 1) && (gun <= 31)){
            System.out.print("Doğduğunuz ayı giriniz: ");
            ay = input.nextInt();
            if ((ay >=1) && (ay <=12)){

                if ((gun >= 21) && (gun <= 31) && (ay == 3)){
                    System.out.println("Burcunuz Koç");
                } else if((gun >= 1) && (gun <= 20) && (ay == 4)) {
                    System.out.println("Burcunuz Koç");

                } else if ((gun >= 21) && (gun <= 30) && (ay == 4)) {
                    System.out.println("Burcunuz Boğa");
                } else if((gun >= 1) && (gun <= 21) && (ay == 5)) {
                    System.out.println("Burcunuz Boğa");

                } else if ((gun >= 22) && (gun <= 31) && (ay == 5)) {
                    System.out.println("Burcunuc İkizler");
                } else if((gun >= 1) && (gun <= 22) && (ay == 6)) {
                    System.out.println("Burcunuz İkizler");

                } else if ((gun >= 23) && (gun <= 30) && (ay == 6)) {
                    System.out.println("Burcunuz Yengeç");
                } else if((gun >= 1) && (gun <= 22) && (ay == 7)) {
                    System.out.println("Burcunuz Yengeç");

                } else if ((gun >= 23) && (gun <= 31) && (ay == 7)) {
                    System.out.println("Burcunuz Aslan");
                } else if((gun >= 1) && (gun <= 22) && (ay == 8)) {
                    System.out.println("Burcunuz Aslan");

                } else if ((gun >= 22) && (gun <= 31) && (ay == 8)) {
                    System.out.println("Burcunuz Başak");
                } else if((gun >= 1) && (gun <= 22) && (ay == 9)) {
                    System.out.println("Burcunuz Başak");

                } else if ((gun >= 23) && (gun <= 30) && (ay == 9)) {
                    System.out.println("Burcunuz Terazi");
                } else if((gun >= 1) && (gun <= 22) && (ay == 10)) {
                    System.out.println("Burcunuz Terazi");

                } else if ((gun >= 23) && (gun <= 31) && (ay == 10)) {
                    System.out.println("Burcunuz Akrep");
                } else if((gun >= 1) && (gun <= 21) && (ay == 11)) {
                    System.out.println("Burcunuz Akrep");

                } else if ((gun >= 22) && (gun <= 30) && (ay == 11)) {
                    System.out.println("Burcunuz Yay");
                } else if((gun >= 1) && (gun <= 21) && (ay == 12)) {
                    System.out.println("Burcunuz Yay");

                } else if ((gun >= 22) && (gun <= 31) && (ay == 12)) {
                    System.out.println("Burcunuz Oğlak ");
                } else if((gun >= 1) && (gun <= 21) && (ay == 1)) {
                    System.out.println("Burcunuz Oğlak");

                } else if ((gun >= 22) && (gun <= 31) && (ay == 1)) {
                    System.out.println("Burcunuz Kova");
                } else if((gun >= 1) && (gun <= 19) && (ay == 2)) {
                    System.out.println("Burcunuz Kova");

                } else if ((gun >= 20) && (gun <= 30) && (ay == 2)) {
                    System.out.println("Burcunuz Balık");
                } else if ((gun >= 1) && (gun <= 20) && (ay == 3)) {
                    System.out.println("Burcunuz Balık");

                } else {
                    System.out.println("Lütfen Tekrar Deneyin");
                }
            } else {
                System.out.println("Lütfen Tekrar Deneyin");
            }
        } else {
            System.out.println("Lütfen Tekrar Deneyin");
        }
    }
}