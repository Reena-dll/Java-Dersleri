import  java.util.Scanner;
public class main {
    static int power(int alt,int us){
        int result=1;
        if (us == 0){
            return 1;
        }
        for (int i=1; i<= us ; i++){
            result *= alt;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alt, us=0;
        System.out.print("Alt Sayıyı Giriniz: ");
        alt = input.nextInt();
        if (alt==0){
            System.out.println("Alt Sayı 0 Olamaz.");
        }else {
            System.out.print("Üs Sayıyı Giriniz: ");
            us = input.nextInt();
            System.out.println("Sonuc: "+ power(alt,us));
        }




    }
}
