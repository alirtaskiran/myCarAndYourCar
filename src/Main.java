public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.make = "Mercedes";
        myCar.model = "S600";
        myCar.year = "2022";
        myCar.nowSpeed = 0;
        myCar.distance = 100;

        System.out.println("Benim Araba : " + myCar.year + " " + myCar.make + " " + myCar.model);

        Car yourCar = new Car ();
        yourCar.make = "Toyota";
        yourCar.model = "Corolla";
        yourCar.nowSpeed = 100;
        yourCar.distance = 90;
        yourCar.year = "2008";

        System.out.println("Senin Araba : " + yourCar.year + " " + yourCar.make + " " + yourCar.model);

    }
}