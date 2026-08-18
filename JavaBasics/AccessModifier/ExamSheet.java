// Protected Access Modifier

// 4. Create a `Student` class with a **protected** `marks` variable. Create a `ExamSheet` class that extends `Student` and access `marks` from the child class.

class ExamSheet extends Student {
    public void showMarks() {
        System.out.println(marks);
    }
}