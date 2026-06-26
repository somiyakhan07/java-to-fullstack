// Data Loss During Type Casting

public class DataLossExample {
    public static void main(String args[]) {
        double pi = 3.14159;

        int num = (int) pi;

        System.out.println("value of double: " + pi);
        System.out.println("value of double after type casting in int: " + num);
    }

}

/*
value of double: 3.14159
value of double after type casting in int: 3
*/