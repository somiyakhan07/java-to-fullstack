// Print message for grade using switch expression

public class GradeMessage {
    public static void main(String[] args) {
        char grade = 'A';
        grade = Character.toUpperCase(grade);

        String message = switch (grade) {
            case 'A' -> "Excellent";
            case 'B' -> "Very Good";
            case 'C' -> "Good";
            case 'D' -> "Pass";
            case 'F' -> "Fail";
            default -> "Invalid Grade";
        };
        System.out.println(message);

    }

}
// Excellent