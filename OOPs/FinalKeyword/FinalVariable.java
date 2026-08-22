// Final Variable
// Create a Student class.
// Create a final int id.
// Try to assign a new value to id.
// Observe the compiler error

class Student {
    final int ID = 12;
}

public class FinalVariable {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.ID = 33;
        System.out.println(s1.ID);
    }
    
}
// cannot assign a value to final variable ID