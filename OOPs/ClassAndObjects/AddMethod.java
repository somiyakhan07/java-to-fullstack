class Calculator {
    public int add(int a, int b) {
        int r = a + b;
        return r;
    }
}

public class AddMethod {
    public static void main(String args[]) {
        int num1 = 4;
        int num2 = 5;
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }

} // 9