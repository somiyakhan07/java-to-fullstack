class Password {

    String password;

    public String setPassword(String password) {
        if (password.length() < 8) {
            // Throw an exception if the password has fewer than 8 characters.
            throw new IllegalArgumentException("Password must contain at least 8 characters");
        } else {
            // If the password is valid, print success and return it.
            System.out.println("Password set Successfully");
            return password;
        }
    }
}

public class PasswordLengthValidation {
    public static void main(String[] args) {

        Password p1 = new Password();

        try {
            p1.setPassword("1234567");
        } catch (IllegalArgumentException e) {
            // Catch the exception and print its message.
            System.out.println(e.getMessage());
        }
    }
}

// Password must contain at least 8 characters