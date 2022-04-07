public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

     int readyFight() {

        System.out.println("--------------------------------------------------------------");
        System.out.println("Dövüş Başlamadan Önce Yazı Tura Atılacak...");
        if (f1.chance == 1 && f2.chance == 0) {
            System.out.println(f1.name + " Dövüşçüsü Yazı Seçti.");
            System.out.println(f2.name + " Dövüşçüsü Tura Seçti");
            System.out.println("Sistem Yazı Tura Atıyor...");
            if (isChance()==1){
                System.out.println("YAZI GELDİ !!!");
                System.out.println("Dövüşe Başlayan Kişi => "+f1.name);
                return 1;
            }else if(isChance()==0){
                System.out.println("TURA GELDİ !!!");
                System.out.println("Dövüşe Başlayan Kişi => "+f2.name);
                return 2;
            } else{
                System.out.println("Sistemde Sorun Çıktı");

            }

        } else if (f1.chance == 0 && f2.chance == 1){
            System.out.println(f2.name + " Dövüşçüsü Yazı Seçti.");
            System.out.println(f1.name + " Dövüşçüsü Tura Seçti");

            System.out.println("Sistem Yazı Tura Atıyor...");
            if (isChance()==1){
                System.out.println("YAZI GELDİ !!!");
                System.out.println("Dövüşe Başlayan Kişi => "+f2.name);
                return 2;
            }else if(isChance()==0){
                System.out.println("TURA GELDİ !!!");
                System.out.println("Dövüşe Başlayan Kişi => "+f1.name);
                return 1;
            }else{
                System.out.println("Sistemde Sorun Çıktı");
                readyFight();
            }
        }
        return 1;
    }

    void run() {

        if (readyFight()==1){
            if (isCheck()) {

                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println(" === YENİ TUR ===");
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }

                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }

                    System.out.println(this.f1.name + " Sağlık = >" + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık = > " + this.f2.health);
                }

            } else {
                System.out.println("Sporcuların sikletleri uymuyor.");
            }

        } else if(readyFight()==2){
            if (isCheck()) {

                while (this.f2.health > 0 && this.f1.health > 0) {
                    System.out.println(" === YENİ TUR ===");
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }

                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }

                    System.out.println(this.f2.name + " Sağlık = >" + this.f2.health);
                    System.out.println(this.f1.name + " Sağlık = > " + this.f1.health);
                }

            } else {
                System.out.println("Sporcuların sikletleri uymuyor.");
            }
        }


    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " Kazandı !!!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " Kazandı !!!");
            return true;
        }

        return false;
    }

    int isChance() {
        double randomNumber = Math.random() * 100;
        if (randomNumber >= 50.0) {
            return 1;
        } else if (randomNumber < 50.0){
            return 0;
        }
        return 2;
    }
}
