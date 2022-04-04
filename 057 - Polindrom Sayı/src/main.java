public class main {

    static boolean isPolindrom(int number) {

        int temp = number, reversNumber = 0, lastNumber = 0;

        while (temp != 0) {
            System.out.println("***********");
            System.out.println("Sayı => " + temp);
            lastNumber = temp % 10;
            System.out.println("Son Basamak: " + lastNumber);
            reversNumber = reversNumber * 10 + lastNumber;
            System.out.println("Yeni Sayı: " + reversNumber);
            temp /= 10;
            System.out.println("Yeni Temp: " + temp);

        }
        if (reversNumber == number) {
            System.out.println("Bu sayı palindrom sayısıdır");
        } else {
            System.out.println("Bu sayı palindrom sayı değildir.");
        }

        return true;
    }

    public static void main(String[] args) {
        isPolindrom(102);
    }
}
