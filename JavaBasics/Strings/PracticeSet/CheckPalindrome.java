// Check Palindrome

public class CheckPalindrome {
    public static void main(String[] args) {
        String prog = "madam";
        String original = prog;
        String reversed = "";

        for (int i = prog.length() - 1; i >= 0; i--) {
            char ch = prog.charAt(i);
            reversed += ch;
        }
        if (original.equals(reversed)) {
            System.out.println(original + " = " + reversed + ": " + "Palindrome");
        } else {
            System.out.println(original + " = " + reversed + ": " + " Not Palindrome");
        }

    }
}
// madam = madam: Palindrome