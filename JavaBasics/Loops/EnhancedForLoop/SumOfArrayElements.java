//Find Sum of Array Elements

public class SumOfArrayElements {
    public static void main(String args[]) {
        int nums[] = { 10, 20, 30 };

        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("The sum of all Array Elements = " + sum);

    }
}

// The sum of all Array Elements = 60