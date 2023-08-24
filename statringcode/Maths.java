package src.statringcode;

public class Maths {

    public int add(int X, int Y){
        return X + Y;
    }


    public static void main(String[] args) {
        Maths maths= new Maths();
        System.out.println(maths.add(2,5)==7);
    }
}
