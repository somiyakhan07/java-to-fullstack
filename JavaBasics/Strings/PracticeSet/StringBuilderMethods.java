public class StringBuilderMethods{

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Python Programming ");

        // Original String
        System.out.println("Original String: " + sb); 
        System.out.println();

        // add text at end
        sb.append("Practice ");
        System.out.println("Append 'Practice': " + sb);
        System.out.println();

        // insert text from giving index
        sb.insert(7, "Core ");
        System.out.println("Insert 'Core' at index 7 : " + sb);
        System.out.println();

        // replaces characters between the given indexes
        sb.replace(0, 6, "Java");
        System.out.println("Replace from index 0 - 6 with 'Java': " + sb);
        System.out.println();

        // deletes characters between the given indexes
        sb.delete(5, 10);
        System.out.println("Delete from index 5 - 10: " + sb);
        System.out.println();

        // reverse the string
        System.out.println("Reverse: " + sb.reverse());
        System.out.println();

        // Returns the current capacity of the StringBuilder
        System.out.println("Capacity: " + sb.capacity());
    }
}
/*
O/P:
Original String: Python Programming 

Append 'Practice': Python Programming Practice 

Insert 'Core' at index 7 : Python Core Programming Practice 

Replace from index 0 - 6 with 'C': Java Core Programming Practice 

Delete from index 5 - 10: Java Programming Practice 

Reverse:  ecitcarP gnimmargorP avaJ

Capacity: 35
 */