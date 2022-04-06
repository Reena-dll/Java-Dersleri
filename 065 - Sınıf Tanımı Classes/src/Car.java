public class Car {
    // Nitelikler
    String type = "Sedan";
    String model;
    String color;
    int speed;
    int speedLimit = 180;
    // Jargon, Sınıfın nitelikleri en başta yazılır.



    //Jargon, Niteliklerden sonra Constructor'lar yazılır

    // Davranışlar
    void increaseSpeed(int increment) {
        if (speed + increment < speedLimit) {
            speed += increment;
        }

    }

    void decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println(model + "Hızınız => "+speed);
    }
}
