// Temperature - Store Celsius and return Fahrenheit with getter

class CalcTemperature { // Create CalcTemperature class

    private double celsius; // Private variable to store Celsius temperature

    public CalcTemperature(double celsius) { // Parameterized constructor
        this.celsius = celsius; // Initialize private Celsius variable
    }

    public double getCelsius() { // Getter to fetch Celsius temperature
        return celsius; // Return Celsius value
    }

    public void setCelsius(double celsius) { // Setter to set Celsius value
        this.celsius = celsius; // Store Celsius value in private variable
    }

    public double getFahrenheit() { // Getter to calculate and return Fahrenheit
        return (celsius * 9.0 / 5) + 32; // Convert Celsius to Fahrenheit
    }
}

public class Temperature { // Main class

    public static void main(String[] args) { // Main method

        CalcTemperature t1 = new CalcTemperature(22); // Create object t1 and initialize Celsius value

        // Display Celsius and converted Fahrenheit temperature
        System.out.println(
                "Celsius: " + t1.getCelsius()
                        + " = Fahrenheit: " + t1.getFahrenheit());
    }
}

/*
 * Output:
 * Celsius: 22.0 = Fahrenheit: 71.6
 */
