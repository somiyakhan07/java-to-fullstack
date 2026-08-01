class A {
    public A() {
        System.out.println("Object Created!");
    }

    public void show() {
        System.out.println("in A show");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        // a1 (reference object name) create new object in stack and not an anonymous object
        A a1 = new A();
        System.out.println();

        // It is a anonymous object because this doesn't have a name
        new A();
        System.out.println();
        new A().show();
    }

}
