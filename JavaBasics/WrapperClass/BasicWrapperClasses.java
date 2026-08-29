// Basic Wrapper Classes
// Create variables for all 8 primitive data types and their corresponding Wrapper Classes.
// Example:
// int a = 10;
// Integer b = 10;

public class BasicWrapperClasses {
    public static void main(String[] args) {
        byte a1 = 10;
        Byte b1 = a1;

        short a2 = 20;
        Short b2 = a2;

        int a3 = 30;
        Integer b3 = a3;

        long a4 = 3453;
        Long b4 = a4;

        float a5 = 3.2f;
        Float b5 = a5;

        double a6 = 3.14;
        Double b6 = a6;

        char a7 = 'a';
        Character b7 = a7;

        boolean a8 = true;
        Boolean b8 = a8;

        System.out.println("Auto Boxing");
        System.out.println("----Primitive variable type values----");
        System.out.println("byte: " + a1);
        System.out.println("short: " + a2);
        System.out.println("int: " + a3);
        System.out.println("long: " + a4);
        System.out.println("float: " + a5);
        System.out.println("double: " + a6);
        System.out.println("char: " + a7);
        System.out.println("boolean: " + a8);
        System.out.println();
        System.out.println("----Wrapper class object reference variable values----");
        System.out.println("Byte: " + b1);
        System.out.println("Short: " + b2);
        System.out.println("Integer: " + b3);
        System.out.println("Long: " + b4);
        System.out.println("Float: " + b5);
        System.out.println("Double: " + b6);
        System.out.println("Character: " + b7);
        System.out.println("Boolean: " + b8);

    }
}

/* output:
Auto Boxing
----Primitive variable type values----
byte: 10
short: 20
int: 30
long: 3453
float: 3.2
double: 3.14
char: a
boolean: true

----Wrapper class object reference variable values----
Byte: 10
Short: 20
Integer: 30
Long: 3453
Float: 3.2
Double: 3.14
Character: a
Boolean: true
 */