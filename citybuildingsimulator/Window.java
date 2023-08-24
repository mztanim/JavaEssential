package src.citybuildingsimulator;

public class Window {
    private boolean isOpen;
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String newValue){
        this.name = newValue;
    }


    public void open(){
        System.out.println("The Window is now open");
        isOpen = true;
    }

    public void close(){
        System.out.println("The Window is now closed");
        isOpen = false;
    }
}
