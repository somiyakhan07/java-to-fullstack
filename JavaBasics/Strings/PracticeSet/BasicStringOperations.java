public class BasicStringOperations {
    public static void main(String[] args) {
        String name = "java Programming";
        

        // original string
        System.out.println("Original String: " + name);
        System.out.println();
        

         // Returns the length of the string.
        System.out.println("Length of string is: " + name.length());
        System.out.println();

        // Prints each character of the string.
        for (char ch : name.toCharArray()) {
            System.out.println(ch);

        }

        System.out.println();

        // Coverts to uppercase
        System.out.println("converted to uppercase: " + name.toUpperCase());
        System.out.println();

        // Converts to lowercase
        System.out.println("converted to lowercase: " + name.toLowerCase());
        System.out.println();

        // Prints characters from index 0 to 3.
        System.out.println("print from index 0 to 4: " + name.substring(0, 4));

        // Prints characters from index 5 to 15.
        System.out.println("print from index 5 to 16: " + name.substring(5, 16));

    }

}
/*
O/P:
Lenth of string is: 16

j
a
v
a
 
P
r
o
g
r
a
m
m
i
n
g

converted to uppercase: JAVA PROGRAMMING

converted to lowercase: java programming

print from index 0 to 4: java
print from index 5 to 16: Programming
 */