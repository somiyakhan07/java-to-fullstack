// Super Keyword
// The super keyword is used to access the parent class.
// Here, super() calls the parent class constructor before executing the child class constructor.

class Animal { // parent, super, base class

    Animal() { // parent class constructor
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal { // child, sub, derived class

    Dog() { // child class constructor
        super(); // calls the parent class constructor
        System.out.println("Dog Constructor");
    }

}

public class SuperKeyword { // main class

    public static void main(String[] args) { // main method

        Dog d = new Dog(); // create child class object

    }

}
/* output:
Animal Constructor
Dog constructor
 */