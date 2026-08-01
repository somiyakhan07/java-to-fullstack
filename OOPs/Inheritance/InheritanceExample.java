class Calc { // parent, super, base class
    public int add(int n1, int n2) { // add method
        return n1 + n2;
    }

    public int sub(int n1, int n2) { // subtraction method
        return n1 - n2;
    }

}

class AdvCalc extends Calc { // child, sub, derived class
    public int multi(int n1, int n2) { // multiplication method
        return n1 * n2;
    }

    public int div(int n1, int n2) { // division method
        return n1 / n2;
    }

}

public class InheritanceExample { // main class
    public static void main(String[] args) { // main method
        AdvCalc obj = new AdvCalc(); // create class obj 
        int r1 = obj.add(2, 2); // call add method
        int r2 = obj.sub(2, 1); // call substration method
        int r3 = obj.multi(2, 2); // call multiplition method
        int r4 = obj.div(40, 2); // call division method

        System.out.println(r1 + " , " + r2 + " , " + r3 + " , " + r4);

    }

}
// 4 , 1 , 4 , 20