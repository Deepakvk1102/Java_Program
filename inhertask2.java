class vehicle{
    String brand;
    int year;

    void startEngine(){

    }
}
class car extends vehicle{
    String fueltype;

    void startEngine(){
        System.err.println("Car engine starts");
    }

    void drive(){
        System.out.println("Car is driving");
    }
}
class Truck extends vehicle{
    int loadCapacity;

    void startEngine(){
        System.out.println("Truck engine starts");
    }

    void haul(){
        System.out.println("Truck is hauling");
    }
}
public class inhertask2 {
    public static void main(String[] args) {
        vehicle v1=new vehicle();
        v1.brand="dio";
        v1.year=20;
        // System.out.println(v1.year);

        car c1=new car();
        c1.brand="KN";
        c1.year=2016;
        c1.fueltype="petrol";
        c1.startEngine();
        c1.drive();

        System.out.println(c1.brand + c1.year + c1.fueltype);
    }
}
