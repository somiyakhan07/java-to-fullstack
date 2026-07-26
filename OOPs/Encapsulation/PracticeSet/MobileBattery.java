// Battery percentage - range 0 - 100

class Percentage { // create percentage class 
    private int percentage;

    public Percentage(int percentage) { // parameterized constructor with percentage validation
        if (percentage >= 0 && percentage <= 100) {
            this.percentage = percentage;
        } else {
            System.out.println("Invalid Persentage");
        }
    }

    public int getPercentage() { // fetch battery percentage 
        return percentage;
    }

    public void setPercentage(int percentage) { // set battery percentage in private percentage variable with percentage validation
        if (percentage >= 0 && percentage <= 100) {
            this.percentage = percentage;
        } else {
            System.out.println("Invalid Percentage");
        }
    }
}

public class MobileBattery { // main class
    public static void main(String[] args) { // main method
        Percentage p1 = new Percentage(80); // create percentage object p1 with hardcoded value
        System.out.println("Battery Percentage: " + p1.getPercentage()); // display battery percentage
    }

}
// Battery Percentage: 80