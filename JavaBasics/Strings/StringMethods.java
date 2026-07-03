public class StringMethods {
    public static void main(String[] args) {
        String name = "Abhi Kumar";

        System.out.println(name.length()); // Check length of the string
        System.out.println(name.charAt(3)); // Check character at index of the string
        System.out.println(name.substring(2)); // Start string with the given index number
        System.out.println(name.toUpperCase()); // convert string into Uppercase
        System.out.println(name.toLowerCase()); // covert string into Lowercase
        System.out.println("Trim: " + name.trim()); // Removes extra spaces from the beginning and end of the string
        System.out.println(name.contains("Abhi")); // Check character at index of the string
        System.out.println(name.startsWith("A")); // Checks whether the string starts with the given char
        System.out.println(name.endsWith("r")); // Checks whether the string ends with the given char
        System.out.println(name.replace("Abhi", "Akhay")); // Replaces the specified text with new text
        System.out.println(name.equals("Abhi Kumar")); // Checks if given value is equal to String value
        System.out.println(name.equalsIgnoreCase("Abhi")); // Checks equality ignoring letter case
        System.out.println(name.indexOf("K")); // find the index of the given char
        System.out.println(name.isEmpty()); // Checks whether the string is empty.

    }
}
/*
O/P:
10
i
hi Kumar
ABHI KUMAR
abhi kumar
Trim: Abhi Kumar
true
true
true
Akhay Kumar
true
false
5
false
 */