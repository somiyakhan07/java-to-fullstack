import java.util.Scanner;

class  Student {
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    // "this" keyword point to the instance variable
    public void setAge(int age){
        // this.age refers to the instance variable
        // age refers to the method parameter
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        // this.age refers to the instance variable
        // age refers to the method parameter
        this.name = name;
    }
    

    
}

public class ThisKeyword{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        System.out.println("Enter Name: ");
        String inputname = sc.nextLine();
        s1.setName(inputname);

        System.out.println("Enter Age: ");
        int inputAge = sc.nextInt();
        s1.setAge(inputAge);

        System.out.println("Student name: " + s1.getName() + " , " + "Student Age: " + s1.getAge());

        sc.close();
    }

}
