public class StringBufferMethod {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Java Programming ");

        // Original String
        System.out.println("Original String: " + sb); 
        System.out.println();

        // add text at end
        sb.append("Practice ");
        System.out.println("Append 'Practice': " + sb);
        System.out.println();

        // insert text from giving index
        sb.insert(5, "Core ");
        System.out.println("Insert 'Core' at index 5 : " + sb);
        System.out.println();

        // replaces characters between the given indexes
        sb.replace(0, 4, "C");
        System.out.println("Replace from index 0 - 4 with 'C': " + sb);
        System.out.println();

        // deletes characters between the given indexes
        sb.delete(6, 18);
        System.out.println("Delete from index 6 - 18: " + sb);
        System.out.println();

        // reverse the string
        System.out.println("Reverse: " + sb.reverse());
        System.out.println();

        // Returns the current capacity of the StringBuffer.
        System.out.println("Capacity: " + sb.capacity());


        
    }    
}
/*
O/P:
Original String: Java Programming 

Append 'Practice': Java Programming Practice 

Insert 'Core' at index 5 : Java Core Programming Practice 

Replace from index 0 - 4 with 'C': C Core Programming Practice 

Delete from index 6 - 18: C Core Practice 

 Reverse:  ecitcarP eroC C

 Capacity: 33
  */
