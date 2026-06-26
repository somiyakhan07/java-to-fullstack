class Student {
    String name;
    int rollno;
}

public class NonPrimitiveDataTypes {
    public static void main(String args[]){
    String name = "somiya";

    int nums[] = {10,20,30};

    Student s1 = new Student();
    s1.name = "Aditi";
    s1.rollno = 1;

    System.out.println(name);
    System.out.println();

    for(int n : nums){
        System.out.println("Elements of nums: " + n);
    }
    System.out.println();

    System.out.println("name- " + s1.name + " : " + s1.rollno);

    }

}
