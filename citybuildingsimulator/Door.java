package src.citybuildingsimulator;

public class Door {
    boolean getDoorOpenStatus;
    private boolean isOpen;
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String newValue){
        this.name = newValue;
    }


    public void open(){
        System.out.println("The door is now open");
        isOpen = true;
    }

    public void close(){
        System.out.println("The door is now closed");
        isOpen = false;
    }

    public String getDoorOpenStatus() {
    }
}
