class Student {
    String name;
    int rollno;
    int marks;
}

public class FindLowestMarksUsingArrayObjects{ 
    public static void main(String args[]){

        Student s1 = new Student();
        s1.name = "Arman";
        s1.rollno = 1;
        s1.marks = 78;

        Student s2 = new Student();
        s2.name = "yalina";
        s2.rollno = 2;
        s2.marks = 99;

        Student s3 = new Student();
        s3.name = "mahek";
        s3.rollno = 3;
        s3.marks = 86;

        Student s4 = new Student();
        s4.name = "lina";
        s4.rollno = 4;
        s4.marks = 60;

        Student students[] = new Student[4]; // Array Of Object
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;

        Student lowMarkStudent = students[0];
        for(int i = 0; i < students.length; i++){
            if(students[i].marks < lowMarkStudent.marks){
                lowMarkStudent = students[i];

            }

        }

        System.out.println("Lowest marks student name: " + lowMarkStudent.name +": roll no-" + lowMarkStudent.rollno + " = " + lowMarkStudent.marks );




    }

}