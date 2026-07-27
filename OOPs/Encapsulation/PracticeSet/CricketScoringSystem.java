// Design a Cricket Player scoring system.**
// The system should keep track of a player's total runs. 
// A player's score can increase when new runs are added, but the existing score should never be reduced through the scoring operation

class Player { // create player class
    private String name; // private variable
    private int runs;

    public Player(String name) { // parameterized constructor
        this.name = name;
    }

    public String getName() { // fetch name
        return name;
    }

    public void setName(String name) { // set player name in private name variable
        this.name = name;
    }

    public int getRuns() { // fetch run
        return runs;
    }

    public void addRuns(int score) { // method that adds runs to the player's total score
        if (score >= 0 && score <= 6) {
            runs += score;
        } else {
            System.out.println("Invalid Score");
        }
    }

}

public class CricketScoringSystem { // main class
    public static void main(String[] args) { // main method
        Player p1 = new Player("Tasmay"); // class object p1
        System.out.println("Player Name: " + p1.getName()); // display name
        p1.addRuns(6); // add run
        System.out.println("Runs: " + p1.getRuns()); // display run
        p1.addRuns(4); // add run
        System.out.println("Runs: " + p1.getRuns()); // disp;ay run

    }

}
/*output:
Player Name: Tasmay
Runs: 6
Runs: 10
 */