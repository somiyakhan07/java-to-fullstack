public class StringBufferExample {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Java ");

        // append() text at the end.
        sb.append(" Programming ");
        System.out.println("Append: " + sb); 

        // insert() text at the specified index
        sb.insert(5, "Core");
        System.out.println("Insert: " + sb);

        // replace() Replaces characters between the given indexes
        sb.replace(5,9, "Advanced");
        System.out.println("Replace: " + sb);

        // delete() characters between the given indexes
        sb.delete(5,14);
        System.out.println("Delete: " + sb);

        // reverse() Reverses the string
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // length() returns the current length of the StringBuilder.
        System.out.println("Length: " + sb.length());

        // capacity() Returns the current capacity of the StringBuffer.
        System.out.println("Capacity: "+ sb.capacity());

        // Now it shows the last modified String Value here
        System.out.println(sb);

        

    }
    
}

/*
O/P:
Append: Java  Programming 
Insert: Java Core Programming 
Replace: Java Advanced Programming 
Delete: Java Programming 
Reverse:  gnimmargorP avaJ
Capacity: 44
 gnimmargorP avaJ 
 */