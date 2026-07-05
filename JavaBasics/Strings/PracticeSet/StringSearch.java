// Demonstrates searching operations on a String.

public class StringSearch {
    public static void main(String[] args){

        String prog = "Java Programming";

        // Checks if the string contains the given text.
        System.out.println("Contains 'Java': " + prog.contains("Java"));

        // Checks if the string starts with the given character.
        System.out.println("Starts with 'J': " + prog.startsWith("J"));

        // Checks if the string ends with the given character.
        System.out.println("Ends with 'g': " + prog.endsWith("g"));

        // Returns the index of the first occurrence of the given text.
        System.out.println("Index of 'Java': " + prog.indexOf("Java"));

        // Returns -1 if the text is not found.
        System.out.println("Index of 'Python': " + prog.indexOf("Python"));


    }
    
}
/*
O/P:
Contains 'Java': true
Starts with 'J': true
Ends with 'g': true
Index of 'Java': 0
Index of 'Python': -1
*/