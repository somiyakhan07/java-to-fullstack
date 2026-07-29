// Design a simple Password Manager.
// A user's password should be protected from direct access. 
// The user should be able to change the password through a controlled operation, 
// but invalid passwords should not be accepted.

class SetPassword { // create class 
    private String password; // private variable


    public SetPassword(String password) { // parameterized constructor to set the initial password
        this.password = password;
        System.out.println("Password set successfully!");
    }

    public void changePassword(String oldPassword, String newPassword) { // method to change password with validation
        if (oldPassword.equals(password)) {
            this.password = newPassword;
            System.out.println("Password changed successfully!");
        } else {
            System.out.println("Invalid Password, Try Again!");
        }
    }
}

public class PasswordManager { // main class
    public static void main(String[] args) { // main method
        SetPassword p1 = new SetPassword("@123456"); // create class object and set initial password
        p1.changePassword("@123456", "@098765"); // change password

    }
}
// Password set successfully!
// password changed successfully!