// Count vowels, consonants, digits and spaces

public class CharacterCounter {
    public static void main(String[] args) {

        String username = "Somiya Khan 07";
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < username.length(); i++) {

            char ch = Character.toLowerCase(username.charAt(i));

            if (ch == ' ') {
                spaces++;
            }

            else if (Character.isDigit(ch)) {
                digits++;
            }

            else if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;

                } else {
                    consonants++;
                }

            }

        }
        System.out.println("spaces: " + spaces);
        System.out.println("digits: " + digits);
        System.out.println("vowels: " + vowels);
        System.out.println("consonants: " + consonants);

    }
}

/*
O/P:
spaces: 2
digits: 2
vowels: 4
consonants: 6
 */
