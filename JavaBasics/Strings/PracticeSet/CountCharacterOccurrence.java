// Check character occurrence in string
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

/*
O/P:
i occurs 5 times
  occurs 9 times
p occurs 2 times
r occurs 4 times
a occurs 5 times
c occurs 3 times
t occurs 2 times
e occurs 4 times
j occurs 1 times
v occurs 2 times
o occurs 3 times
g occurs 3 times
m occurs 1 times
y occurs 2 times
s occurs 1 times
n occurs 1 times
l occurs 3 times
d occurs 2 times
b occurs 1 times
u occurs 1 times
 */