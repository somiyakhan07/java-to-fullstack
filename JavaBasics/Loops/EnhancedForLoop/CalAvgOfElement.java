// Calculate Average of Elements

public class CalAvgOfElement {
    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 80, 78, 54, 24 };
        int sum = 0;
        int totalArray = 0;
        for (int n : arr) {
            sum += n;
            totalArray++;
        }
        System.out.println("average of nums is: " + sum / totalArray);

    }

}

// O/P- average of nums is: 42