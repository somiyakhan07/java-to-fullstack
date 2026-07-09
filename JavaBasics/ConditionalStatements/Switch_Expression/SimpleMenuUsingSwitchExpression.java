// Print simple menu using switch expression

public class SimpleMenuUsingSwitchExpression {
    public static void main(String[] args){
        int menu = 1;

        String result = switch (menu) {
            case 1 -> "Hello";
            case 2 -> "Welcome";
            case 3 -> "How are you?";
            case 4 -> "Exit";
            default -> "Invalid Input";
        };
        System.out.println(result);
    }
    
}
// Hello