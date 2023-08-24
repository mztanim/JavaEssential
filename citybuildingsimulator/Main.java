package src.citybuildingsimulator;

public class Main {

    public static void main(String[] args) {

    Bus bus1;
    bus1 = new Bus(); // instanttiation, creation , Object creation
    bus1.setCurrentSpeed(-100);
    System.out.println(bus1.getCurrentSpeed());
    bus1.topSpeed = 200;
    bus1.isMoving = true;
    bus1.lineNumbers = 7;
    bus1.timeOfArrival = "10.30";
    bus1.start();
    bus1.stop();
    bus1.start();
    bus1.stop();


    Bus bus2;
    bus2 = new Bus();
    bus2.setCurrentSpeed(60);
    bus2.topSpeed = 200;
    bus2.isMoving = true;
    bus2.lineNumbers = 67;
    bus2.timeOfArrival = "10.40";
    bus2.start();
    bus2.stop();


    Bus bus3;
    bus3 = new Bus();
    bus3.setCurrentSpeed(100);
    bus3.topSpeed = 200;
    bus3.isMoving = false;
    bus3.lineNumbers = 87;
    bus3.timeOfArrival = "10.50";
    bus3.start();
    bus3.stop();


    }
}
