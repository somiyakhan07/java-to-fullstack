// User Registration - username, password and password have minimum 8 characters

class User { // create user class
    private String username; // private variable
    private String password;

    public User() { // default constructor
        username = "Set your username";
        password = "12345678";
    }

    public User(String username, String password) { // parameterized constructor with password validation
        this.username = username;
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("password should be greater than 8 characters");
            this.password = "set again";
        }

    }

    public String getUsername() { // fetch username
        return username;
    }

    public void setUsername(String username) { // set username in private username variable
        this.username = username;
    }

    // public String getPassword() { // fetch password
    //     return password;
    // }

    public void setPassword(String password) { // set password in private passwors variable and password validation
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("password should be minimum 8 characters");
            this.password = "set again";
        }
    }
}

public class UserRegistration { // main class
    public static void main(String[] args) { // main method
        User u1 = new User();
        u1.setUsername("Mina"); // set name
        u1.setPassword("1234567"); // set password

        System.out.println("Username: " + u1.getUsername()); // display username
       // System.out.println("Password: " + u1.getPassword()); // display password

    }

}
/*output:
password should be greater than 8 characters
Username: Mina
Password: set again
 */