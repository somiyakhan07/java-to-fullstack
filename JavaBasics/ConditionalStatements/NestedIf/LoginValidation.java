// Check username and password for login validadtion

public class LoginValidation {
    public static void main(String[] args) {
        String username = "alia780"; // input
        int pass = 34554; // input

        if (username.equals("alia780")) { // check username
            if (pass == 34554) { // check password
                System.out.println("Login Successful.");
            } else {
                System.out.println("Wrong Password"); // print if password is wrong
            }
        } else {
            System.out.println("User Not Found"); // priint if user not found
        }

    }

}

// Login Successful.
