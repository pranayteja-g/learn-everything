package Java.Java_notes.classes;

interface  Convertible{
    void openRoof();
    void closeRoof();
}


class Car implements Convertible{
    void startEngine(){
        System.out.println("started engine");
    }

    void drive(){
        System.out.println("started driving");
    }

    void stopEngine(){
        System.out.println("stopped engine");
    }

    public void openRoof(){
        System.out.println("opened roof");
    }

    public void closeRoof() {
        System.out.println("closed roof");
    }
}

public class Main{
    public static void main(String[] args) {
        // Creating an instance of the Car class
        Car myCar = new Car();

        // Calling methods
        myCar.startEngine();
        myCar.drive();
        myCar.openRoof(); // Specific method from the Convertible interface
        myCar.closeRoof();
        myCar.stopEngine();
    }
}