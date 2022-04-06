public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "Audi R8";
        audi.type = "Sports";
        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.decreaseSpeed(10);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.model = "M3 GTR";
        bmw.speed = 20;
        bmw.type = "Sports";
        bmw.increaseSpeed(20);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(60);
        bmw.increaseSpeed(50);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 30;
        mercedes.printSpeed();


    }
}
