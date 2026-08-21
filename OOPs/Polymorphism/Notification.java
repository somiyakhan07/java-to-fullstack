// Notification
// Create a Message parent class with a send() method.
// Override it in Email and SMS.

class Message {
    public void send() { // Parent class method
        System.out.println("Message Send");
    }
}

class Email extends Message { // Email inherits Message
    @Override
    public void send() { // Override parent send() method
        System.out.println("Email Send");
    }
}

class SMS extends Message { // SMS inherits Message
    @Override
    public void send() { // Override parent send() method
        System.out.println("SMS Send");
    }
}

public class Notification {
    public static void main(String[] args) {

        Message m1 = new Message(); // Parent reference + parent object
        m1.send();

        System.out.println();

        Message m2 = new Email(); // Parent reference + Email object
        m2.send(); // Email's overridden method runs

        System.out.println();

        Message m3 = new SMS(); // Parent reference + SMS object
        m3.send(); // SMS's overridden method runs
    }
}

/* output:
Message Send

Email Send

SMS Send
*/