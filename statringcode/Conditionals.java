package src.statringcode;

public class Conditionals {
    public static void main(String[] args) {
        int number = 0;

        if (number == 0){
            System.out.println("number is equal to zero");
        } else {
            System.out.println("number is NOT equal to Zero");
        }

        number = 1;

        if (number == 0){
            System.out.println("number is equal to zero");
        } else {
            System.out.println("number is NOT equal to Zero");
        }

        int age = 34;
        boolean isNordeaEmployee = false;

        if (age <= 18){
            System.out.println("customer is Minor");
        } else if (age > 18 && age <=65){
            System.out.println("customer is Adult");
        } else {
            System.out.println("Customer is retired age");
        }

        //TODO: Ternary: condition ? true result : false result

        String valueToOutput = (number ==0)
                ? "number is equal to zero"
                : "Number is not equal to zero";
        System.out.println(valueToOutput);
    }
}
