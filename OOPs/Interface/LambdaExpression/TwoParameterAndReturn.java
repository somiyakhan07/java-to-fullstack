// Q3 — Two Parameters + Return
// ============================================================
//
// Create a functional interface Calculator with:
//
// int calculate(int a, int b);
//
// Use a lambda expression to perform addition.
//
// Input:
// 10, 20
//
// Output:
// 30
//
// Goal:
// Understand lambda expression with parameters and return value.

@FunctionalInterface
interface Calculator {

    int calculate(int a, int b);
}

public class TwoParameterAndReturn {

    public static void main(String[] args) {

        // Calculator - Functional Interface type
        // c - Reference variable
        // (a, b) -> a + b → Lambda implementation
        Calculator c = (a, b) -> a + b;

        // 10 and 20 are passed to the lambda.
        int result = c.calculate(10, 20);

        System.out.println(result);
    }
}

// Output:
// 30

/*
 * Important:
 *
 * (a, b) - Two parameters
 * a + b  - Return value
 *
 * Since the lambda has only one expression, the return keyword is not required.
 *
 * This:
 * (a, b) -> a + 
 * 
 * is equivalent to
 * 
 * (a, b) -> {
 *     return a + b;
 * }
 */