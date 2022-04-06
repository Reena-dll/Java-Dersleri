public class Car {
    // Nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;
    // Jargon, Sınıfın nitelikleri en başta yazılır.


    Car(String model, int speed , String color, String type) {
        this.model = model;
        this.speed = speed;
        this.type = "Sedan";
        this.speedLimit = 180;
        this.color = color;
    }

    //Jargon, Niteliklerden sonra Constructor'lar yazılır

    // Davranışlar
    void increaseSpeed(int increment) {
        if (this.speed + increment < this.speedLimit) {
            this.speed += increment;
        }

    }

    void decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed -= decrease;
        }
    }

    void printInfo() {
        System.out.println("===============");
        System.out.println("Model => "+ this.model+"\nColor => "+this.color+"\nType => "+this.type+"\nSpeed => "+this.speed);

    }
}
