public class StringBuilderExample {
    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("Java");

        // append() text at the end.
        sb.append(" programming ");
        System.out.println("Append: " + sb);

        // insert() text at the specified index.
        sb.insert(5 , "Core ");
        System.out.println("Insert: " + sb);

        //replace Replaces characters between the given indexes
        sb.replace(5, 9 , "Advanced");
        System.out.println("Replace: " + sb);

        // delete() characters between the given indexes
        sb.delete(0, 5);
        System.out.println("Delete: " + sb);

        // reverse() Reverses the string
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // capacity() Returns the current capacity of the StringBuffer.
        System.out.println("Capacity: " + sb.capacity());

        
    }
    
}

/*
O/P:
Append: Java programming 
Insert: Java Core programming 
Replace: Java Advanced programming 
Delete: Advanced programming 
Reverse:  gnimmargorp decnavdA
Capacity: 42
 */
