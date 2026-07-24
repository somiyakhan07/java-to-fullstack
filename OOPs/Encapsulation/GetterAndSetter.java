import java.util.Scanner;

class Name {  
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String n) {
        name = n;
    }
}

public class GetterAndSetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Name obj = new Name();

        System.out.print("Enter your name: ");
        String inputName = sc.nextLine();
        obj.setName(inputName);

        System.out.println("name: " + obj.getName());
        sc.close();
    }
}