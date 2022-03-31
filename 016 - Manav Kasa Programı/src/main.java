import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        double toplamTutar = 0;

        System.out.print("Armut kaç kilo : ");
        toplamTutar += armut*input.nextDouble();
        System.out.print("Elma kaç kilo : ");
        toplamTutar += elma*input.nextDouble();
        System.out.print("Domates kaç kilo : ");
        toplamTutar += domates*input.nextDouble();
        System.out.print("Muz kaç kilo : ");
        toplamTutar += muz*input.nextDouble();
        System.out.print("Patlıcan kaç kilo : ");
        toplamTutar += patlican*input.nextDouble();

        System.out.println("Toplam Tutar = "+toplamTutar);

    }
}
