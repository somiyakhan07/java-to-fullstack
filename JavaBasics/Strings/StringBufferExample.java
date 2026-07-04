public class StringBufferExample {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Java ");

        // append()
        sb.append(" Programming ");
        System.out.println("Append: " + sb); 

        // insert()
        sb.insert(5, "Core");
        System.out.println("Insert: " + sb);

        // replace()
        sb.replace(5,9, "Advanced");
        System.out.println("Replace: " + sb);

        // delete()
        sb.delete(5,14);
        System.out.println("Delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // capacity()
        sb.capacity();
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