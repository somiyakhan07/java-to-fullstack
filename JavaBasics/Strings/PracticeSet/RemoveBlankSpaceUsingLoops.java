// Remove all blank space from string using loop and condition

public class RemoveBlankSpaceUsingLoops {
    public static void main(String[] args) {
        String prog = " I Learn Java Programs Every Single Day To Get Better At Logic Building ";
        String result = "";
        

        for (int i = 0; i < prog.length(); i++) {
            char ch = prog.charAt(i);
            if (ch != ' ') {
                result+=ch;
            }

        }
        System.out.println(result);

    }
}

// ILearnJavaProgramsEverySingleDayToGetBetterAtLogicBuilding