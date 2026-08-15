// Design a Notification Management System.
// A system should support different notification types while sharing common notification functionality.
// Decide the appropriate inheritance structure and build the program.(hierarchical)

class Notification {
    private String recepient;
    private String message;
    private boolean sent;

    public Notification(String recepient, String message, boolean sent) {
        this.recepient = recepient;
        this.message = message;
        this.sent = sent;
    }

    public String getRecepient() {
        return recepient;
    }

    public void setRecepient(String recepient) {
        this.recepient = recepient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }

    public void sendNotication() {
        sent = true;
        System.out.println("Notification Sent!");
    }
}

class Email extends Notification {
    private String emailAddress;
    private String subject;

    public Email(String recepient, String message, boolean sent, String emailAddress, String subject) {
        super(recepient, message, sent);
        this.emailAddress = emailAddress;
        this.subject = subject;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

class SMS extends Notification {
    private String phoneNo;
    private boolean deliveryReport;

    public SMS(String recepient, String message, boolean sent, String phoneNo, boolean deliveryReport) {
        super(recepient, message, sent);
        this.phoneNo = phoneNo;
        this.deliveryReport = deliveryReport;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public boolean isDeliveryReport() {
        return deliveryReport;
    }

    public void setDeliveryReport(boolean deliveryReport) {
        this.deliveryReport = deliveryReport;
    }
}

class Push extends Notification {
    private String deviceId;
    private String appName;

    public Push(String recepient, String message, boolean sent, String deviceId, String appName) {
        super(recepient, message, sent);
        this.deviceId = deviceId;
        this.appName = appName;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}

public class NotifictionManagementSystem {
    public static void main(String[] args) {

        // Email object
        Email e1 = new Email(
                "Aliya",
                "Your Java class is scheduled at 5 PM.",
                false,
                "aliya@gmail.com",
                "Java Class Reminder"
        );

        System.out.println("----Email Notification----");
        System.out.println("Recipient: " + e1.getRecepient());
        System.out.println("Message: " + e1.getMessage());
        System.out.println("Email Address: " + e1.getEmailAddress());
        System.out.println("Subject: " + e1.getSubject());

        // Send notification
        e1.sendNotication();

        // Check status after sending
        System.out.println("Notification Sent: " + e1.isSent());


        // SMS object
        SMS s1 = new SMS(
                "Aliya",
                "Your OTP is 1234.",
                false,
                "9876543210",
                true
        );

        System.out.println();
        System.out.println("----SMS Notification----");
        System.out.println("Recipient: " + s1.getRecepient());
        System.out.println("Message: " + s1.getMessage());
        System.out.println("Phone Number: " + s1.getPhoneNo());
        System.out.println("Delivery Report: " + s1.isDeliveryReport());

        // Send notification
        s1.sendNotication();

        // Check status after sending
        System.out.println("Notification Sent: " + s1.isSent());


        // Push object
        Push p1 = new Push(
                "Aliya",
                "You have a new message.",
                false,
                "DEVICE12345",
                "WhatsApp"
        );

        System.out.println();
        System.out.println("----Push Notification----");
        System.out.println("Recipient: " + p1.getRecepient());
        System.out.println("Message: " + p1.getMessage());
        System.out.println("Device ID: " + p1.getDeviceId());
        System.out.println("App Name: " + p1.getAppName());

        // Send notification
        p1.sendNotication();

        // Check status after sending
        System.out.println("Notification Sent: " + p1.isSent());
    }
}

/*output:
----Email Notification----
Recipient: Aliya
Message: Your Java class is scheduled at 5 PM.
Email Address: aliya@gmail.com
Subject: Java Class Reminder
Notification Sent!
Notification Sent: true

----SMS Notification----
Recipient: Aliya
Message: Your OTP is 1234.
Phone Number: 9876543210
Delivery Report: true
Notification Sent!
Notification Sent: true

----Push Notification----
Recipient: Aliya
Message: You have a new message.
Device ID: DEVICE12345
App Name: WhatsApp
Notification Sent!
 */
