package src.citybuildingsimulator;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    // Knows about something (data)

    private int currentSpeed;

    public int topSpeed;

    public String timeOfArrival;

    public int lineNumbers;

    public boolean isMoving;

    public String direction;

    // private boolean hasStarted;

    // private boolean hasStopped;

    public List<Door> doors;

    public List<Window> windows;


    public Door door1;

    //Type, we define our own type, declare the memory
    public enum movementState {
        STOPPED,
        STARTED,
        MOVING,
    }

    // Variable declaring
    public movementState state;

    // A methods
    // Constructors
    public Bus() {
        this.state = movementState.STOPPED;
        topSpeed = 200;
        door1 = new Door(); // create new object of our door

        doors = new ArrayList<>(); // door object creating
        doors.add(new Door());
        doors.get(0).setName("Front Door");
        doors.get(0).open();
        doors.add(new Door());
        doors.get(1).setName("Second Door");
        doors.add(new Door());
        doors.get(2).setName("Third Door");

    }

    public Bus(Door newDoor) {
        this.state = movementState.STOPPED;
        topSpeed = 200;
        this.door1 = newDoor; // create new object of our door

    }

    // int because return Int,
    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void setCurrentSpeed(int newValue) {
        if (newValue >= 0 && newValue <= this.topSpeed) {
            this.currentSpeed = newValue;

        }
    }

    // Do something (Actions, events)
    // public: readable, accessible from anywhere in the project

    public void start() {
        if (this.state == movementState.STOPPED) {
            System.out.println("The bus " + lineNumbers + " has started");
            state = movementState.STARTED;
        }
    }

    public void stop() {
        if (this.state != movementState.STOPPED) {
            System.out.println("The Bus " + lineNumbers + " has Stopped");
            state = movementState.STOPPED;
        }

    }

// Private : readable or accessible only from that Bus Class
    // Start
    // Accelerate
    // Brake
    // Stop
    // turn
    // open doors
    // close door


    public void printDoorStatus() {
        for (int i = 0; i < doors.size(); i++) {
            System.out.println(doors.get(i).getName());
        }
// for each: COllestion doors and when in Door it will do some operation
        doors.forEach(e ->
                System.out.println(e.getName() + " door is open ?" + e.getDoorOpenStatus));
    }

}
