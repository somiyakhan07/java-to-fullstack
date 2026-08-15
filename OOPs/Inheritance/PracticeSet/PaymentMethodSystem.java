// Design a Payment Management System.
// Different payment methods share some common functionality but also have unique features. 
// Choose the most suitable inheritance type and implement the system. (Hierarchical inheritance)

class Payment {
    private String accountNo;
    private String password;
    private boolean payment;

    public Payment(String accountNo, String password) {
        this.accountNo = accountNo;
        this.password = password;
        this.payment = false;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public boolean isPayment() {
        return payment;
    }

    public void makePayment(String writingAccountNo, String writingPassword) {
        if (writingPassword.equals(password) && writingAccountNo.equals(accountNo)) {
            this.payment = true;
            System.out.println("Payment Successfull!");
        } else {
            System.out.println("Invalid Password or Account Number, Payment Failed!");
        }
    }

    public void resetPassword(String oldPassword, String newPassword) {
        if (oldPassword.equals(password)) {
            this.password = newPassword;
            System.out.println("Password Successfully Changed!");
        } else {
            System.out.println("Invalid Password, Try Again!");
        }
    }

}

class UPI extends Payment {
    private String upiId;
    private String phoneNo;

    public UPI(String accountNo, String password, String upiId, String phoneNo) {
        super(accountNo, password);

        this.upiId = upiId;
        this.phoneNo = phoneNo;
    }

    public String getUpiId() {
        return upiId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

}

class Card extends Payment {
    private String cardNo;

    public Card(String accountNo, String password, String cardNo) {
        super(accountNo, password);
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

}

class Cash extends Payment {
    private double cashReceived;

    public Cash(String accountNo, String password, double cashReceived) {
        super(accountNo, password);
        this.cashReceived = cashReceived;
    }

    public double getCashReceived() {
        return cashReceived;
    }

    public void setCashReceived(double cashReceived) {
        this.cashReceived = cashReceived;
    }

}

public class PaymentMethodSystem {
    public static void main(String[] args) {
        Payment p1 = new Payment("123456", "9999");
        System.out.println("---Payment Method---");
        System.out.println("Account number: " + p1.getAccountNo());

        UPI upi1 = new UPI("123456", "9999", "1234567890@upi", "1234567890");
        System.out.println();
        System.out.println("----UPI Method----");
        System.out.println("Account number: " + upi1.getAccountNo());
        System.out.println("UPI ID: " + upi1.getUpiId());
        System.out.println("Phone Number: " + upi1.getPhoneNo());
        upi1.makePayment("123456", "9999");

        Card c1 = new Card("123456", "9911", "3434343434");
        System.out.println();
        System.out.println("----Card Method----");
        System.out.println("Account number: " + c1.getAccountNo());
        System.out.println("Card Number: " + c1.getCardNo());
        c1.makePayment("123456", "9911");
        c1.resetPassword("9911", "1111");
        c1.makePayment("123456", "9911");
        c1.makePayment("123456", "1111");

        Cash ch1 = new Cash("123456", "9922", 20000);
        System.out.println();
        System.out.println("----Cash Received----");
        System.out.println("Account number: " + ch1.getAccountNo());
        System.out.println("Cash Received: " + ch1.getCashReceived());
        ch1.makePayment("123456", "9922");
        ch1.resetPassword("9922", "1111");
        ch1.makePayment("123456", "9922");
        ch1.makePayment("123456", "1111");

    }
}
/*output:
---Payment Method---
Account number: 123456

----UPI Method----
Account number: 123456
UPI ID: 1234567890@upi
Phone Number: 1234567890
Payment Successfull!

----Card Method----
Account number: 123456
Card Number: 3434343434
Payment Successfull!
Password Successfully Changed!
Invalid Password or Account Number, Payment Failed!
Payment Successfull!

----Cash Received----
Account number: 123456
Cash Received: 20000.0
Payment Successfull!
Password Successfully Changed!
Invalid Password or Account Number, Payment Failed!
Payment Successfull!
 */