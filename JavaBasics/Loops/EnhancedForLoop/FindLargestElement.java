// Find Largest Element Using Enhanced for loop
public class FindLargestElement {
    public static void main(String args[]) {
        int nums[] = { 10, 50, 20, 80, 30 };

        int largest = nums[0];

        for (int n : nums) {
            if (n > largest) {
                largest = n;
            }
        }
        System.out.println("The largest element in array is: " + largest);
    }

}
// O/P: The largest element in array is: 80