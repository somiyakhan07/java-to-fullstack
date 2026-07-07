public class CountCharacterOccurrence {
    public static void main(String[] args) {

        String name = "i practice java program every single day to build logic";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (ch == name.charAt(k)) {
                    alreadyCounted = true;
                    break;
                }

            }

            if (alreadyCounted) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < name.length(); j++) {
                if (ch == name.charAt(j)) {
                    count++;
                }

            }

            System.out.println(ch + " occurs " + count + " times");

        }

    }
}