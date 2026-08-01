class Calc { // parent, super, base class
    public int add(int n1, int n2) { // add method
        return n1 + n2;
    }

    public int sub(int n1, int n2) { // subtraction method
        return n1 - n2;
    }

}

class AdvCalc extends Calc { // child, sub, derived class and single level inheritance
    public int multi(int n1, int n2) { // multiplication method
        return n1 * n2;
    }

    public int div(int n1, int n2) { // division method
        return n1 / n2;
    }

}

class VeryAdvCalc extends AdvCalc { // child of child class and multilevel inheritance
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }

}

public class MultilevelInheritance { // main class
    public static void main(String[] args) { // main method
        VeryAdvCalc obj = new VeryAdvCalc(); // create class obj
        int r1 = obj.add(2, 2); // call add method
        int r2 = obj.sub(2, 1); // call subtration method
        int r3 = obj.multi(2, 2); // call multiplication method
        int r4 = obj.div(40, 2); // call division method
        double r5 = obj.power(4, 2); // call power method

        System.out.println(r1 + " , " + r2 + " , " + r3 + " , " + r4 + " , " + r5);

    }

}
// 4 , 1 , 4 , 20 , 16.0