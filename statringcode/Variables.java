package src.statringcode;

public class Variables {
    public static void main(String[] args) {
       // method integers. interger is also a method under main method. and we can call it.
        integers();
        Strings();
        booleans();
        finalVariables();

    }

    private static void finalVariables() {
        // Also notes on constant values (fixed, unchangeable value by using the "final" keyword)
        //Also note on variable declaratiob line and variable assignment on the same line is
        final int pi;
        pi=3;
        final String domainName = "oneadr.net";
        final String emailSuffix = "@nordea.com";
    }

    private static void booleans() {
        boolean value;
        value = false;
        System.out.println(value);
    }

    private static void Strings() {
        String text;
        text = "Hello World from String city";
        text = text + "Second line !!";
        text += "!!!!!!!!!!!!!";
        System.out.println(text.length());
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        System.out.println(text.replace("Hello", "Goodbye"));

        System.out.println(text.indexOf("!"));

        System.out.println(text);

        String name = "Md Monir Tanim";
        System.out.println(name.substring(0, name.indexOf(" ")));
    }

    private static void integers() {
        int number1;
        number1 = 100;

        // comment line --- Ignored when we run the code
        // add
        number1 = number1+123;
        number1 +=123;

        //Subtract
        number1 = number1 - 123;
        number1 -=123;

        //Multiply
        number1 = number1 * 123;
        number1 *=123;

        //Divide
        number1 = number1 / 123;
        number1 /=123;

        System.out.println(number1);
    }
}
