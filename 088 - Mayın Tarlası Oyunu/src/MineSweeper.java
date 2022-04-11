import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int satir;
    int sutun;
    int mineCount;
    int select = 1;
    int a;
    int b;
    Scanner input = new Scanner(System.in);
    String[][] map;


    void start() {
        System.out.println();
        System.out.print("Mayın Tarlasının Satır Sayısını Giriniz => ");
        int satir = input.nextInt();
        System.out.print("Mayın Tarlasının Sütun Sayısını Giriniz => ");
        int sutun = input.nextInt();
        this.satir = satir;
        this.sutun = sutun;
        helperPanel();

    }


    void helperPanel() {
        System.out.println("Mayınların Konumu");
        this.map = new String[satir][sutun];

        this.mineCount = (satir * sutun) / 4;
        for (int i = 0; i < this.satir; i++) {
            for (int k = 0; k < this.sutun; k++) {
                this.map[i][k] = "-";
            }
        }


        while (this.mineCount > 0) {
            int rnd1 = (int) (Math.random() * this.satir);
            int rnd2 = (int) (Math.random() * this.sutun);

            if (!(this.map[rnd1][rnd2].equals("*"))) {
                this.map[rnd1][rnd2] = "*";
                this.mineCount--;
            }
        }

        for (String[] row : this.map) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("================================================");
        next();
    }

    void next() {
        System.out.println("Mayın Tarlası Oyununa Hoş Geldiniz!!!");
        System.out.println();
        String[][] userMap = new String[satir][sutun];
        for (int i = 0; i < this.satir; i++) {
            for (int k = 0; k < this.sutun; k++) {
                userMap[i][k] = "-";
            }
        }
        for (String[] row : userMap) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        while (this.select > 0) {
            while (true) {
                System.out.print("Satır Seçiniz => ");
                a = input.nextInt();
                System.out.print("Sutün Seçiniz => ");
                b = input.nextInt();

                if (((a < 0) || (a >= satir)) || ((b < 0) || (b >= sutun))) {
                    System.out.println("Satır Sayısı ve Sutün Sayısı Girilen Aralıkta Olmalı.");
                } else if (!(userMap[a][b].equals("*") || userMap[a][b].equals("-"))) {
                    System.out.println("Daha önceden girdiğiniz değeri giremezsiniz.");
                } else {
                    break;
                }
            }

            if (this.map[a][b].equals("*")) {
                System.out.println("Mayına Bastınız. BAŞARISIZ!!!");
                for (String[] row : this.map) {
                    for (String col : row) {
                        System.out.print(col + " ");
                    }
                    System.out.println();
                    break;
                }
            } else {
                for (int i = a - 1; i <= a + 1; i++) {
                    for (int j = b - 1; j <= b + 1; j++) {
                        if ((this.map[i][j].equals("*"))) {
                            this.mineCount++;
                        }
                    }
                }
                for (int i = 1; i <= this.satir; i++) {
                    for (int j = 1; j <= this.sutun; j++) {
                        if (i == a && j == b) {
                            userMap[i][j] = String.valueOf(this.mineCount);
                        }
                        System.out.print(userMap[i][j] + " ");
                    }
                    System.out.println();
                }

            }
            System.out.println("Tebrikler Oyunu Kazandınız !!!");
        }
    }
}
