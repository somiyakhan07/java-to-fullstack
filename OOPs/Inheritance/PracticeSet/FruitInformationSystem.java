/* Design a Fruit Information System.
Create a system where an Apple is a type of Fruit. 
Store common information about fruits in the parent class and include additional information that is specific to an Apple. 
Display all the details using the child class
 */

class Fruits { // parent, super, base class
    private String name; // variables
    private String color;
    private String taste;
    private boolean seed;

    public Fruits() { // default constructor
        name = "Fruit name";
        color = "Fruit color";
        taste = "Fruit taste";
        seed = true;
    }

    // Getters
    public String getName() { // fetch fruit name
        return name;
    }

    public String getColor() { // fetch fruit color
        return color;
    }

    public String getTaste() { // fetch fruit taste info
        return taste;
    }

    public boolean isSeed() { // fetch fruit seed info
        return seed;
    }

    // Setters
    public void setName(String name) { // set fruit name
        this.name = name;
    }

    public void setColor(String color) { // set fruit color
        this.color = color;
    }

    public void setTaste(String taste) { // set fruit taste info
        this.taste = taste;
    }

    public void setSeed(boolean seed) { // set seed info
        this.seed = seed;
    }

}

class Apples extends Fruits { // child, sub, derived class
    private String variety; // variables
    private String origin;
    private int weight;
    private double price;

    public Apples(String variety, String origin, int weight, double price) { // parameterized constructor
        this.variety = variety;
        this.origin = origin;
        this.weight = weight;
        this.price = price;
    }

    public String getVariety() { // fetch apple variety
        return variety;
    }

    public void setVariety(String variety) { // set apple variety
        this.variety = variety;
    }

    public String getOrigin() { // fetch apple origin
        return origin;
    }

    public void setOrigin(String origin) { // set apple origin
        this.origin = origin;
    }

    public int getWeight() { // fetch apple weight
        return weight;
    }

    public void setWeight(int weight) { // set apple weight
        this.weight = weight;
    }

    public double getPrice() { // fetch apple price
        return price;
    }

    public void setPrice(double price) { // set apple price
        this.price = price;
    }

}

public class FruitInformationSystem { // main class
    public static void main(String[] args) { // main method
        Apples a1 = new Apples("Best", "Japan", 20, 50); // set apple info
        a1.setName("Apple"); // set fruit name
        a1.setColor("Red"); // set color
        a1.setTaste("Sweet"); // set taste info
        a1.setSeed(true); // set seed info

        System.out.println("Fruit Name: " + a1.getName()); // display fruit name
        System.out.println("Fruit colour: " + a1.getColor()); // display fruit color
        System.out.println("Taste of fruit: " + a1.getTaste()); // display taste info
        System.out.println("Fruit have seeds: " + a1.isSeed()); // display seed info
        System.out.println("Variety of apple: " + a1.getVariety()); // display apple vaiety
        System.out.println("Apple origin: " + a1.getOrigin()); // display apple origin
        System.out.println("Apple weight: " + a1.getWeight()); // display apple weight
        System.out.println("Apple price: " + a1.getPrice()); // display apple price

    }

}
/*Output:
Fruit Name: Apple
Fruit colour: Red
Taste of fruit: Sweet
Fruit have seeds: true
Variety of apple: Best
Apple origin: Japan
Apple weight: 20
Apple price: 50.0
 */