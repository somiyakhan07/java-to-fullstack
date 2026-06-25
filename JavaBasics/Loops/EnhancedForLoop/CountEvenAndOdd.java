// Count Even/Odd

public class CountEvenAndOdd {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5 };
        int even = 0;
        int odd = 0;
        int zero = 0;

        for (int n : nums) {

            if (n % 2 == 0) {
                even++;

            } else if (n % 2 != 0) {
                odd++;
            } else {
                zero++;
            }
        }
        System.out.println("total even numders in array: " + even);
        System.out.println("total odd numders in array: " + odd);
        System.out.println("total zero numders in array: " + zero);
    }

}
/*
 total even numders in array: 2
 total odd numders in array: 3
 total zero numders in array: 0
 */
