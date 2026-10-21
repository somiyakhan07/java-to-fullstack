class StudentAgeValidation {

    public static void main(String[] args) {

        int age = 14;

        try {
            if (age < 18) {
                // throw creates an exception when age is below 18.
                throw new IllegalArgumentException("UnderAge");
            } else {
                System.out.println("Success");
            }
        } catch (IllegalArgumentException e) {
            // catch handles the exception and prints its message.
            System.out.println(e.getMessage());
        }
    }
}