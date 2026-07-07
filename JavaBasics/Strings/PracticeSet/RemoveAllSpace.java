// Removing blank space from the string

public class RemoveAllSpace {
    public static void main(String[] args) {
        String prog = " Learning Java Programming ";

         // Removes all types of whitespace
        String result = prog.replaceAll("\\s", "");

        System.out.print(result);

    }

}

// LearningJavaProgramming
