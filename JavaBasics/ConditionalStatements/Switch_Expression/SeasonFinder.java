// Print Month Season using switch statement

public class SeasonFinder {
    public static void main(String[] args){
        int month = 7;

        String monthSeason = switch(month){
            case 12, 1, 2 -> "Winter Season";
            case 3, 4 , 5 -> "Summer Season";
            case 6, 7, 8, 9 -> "Monsoon Season";
            case 10, 11 -> "Autumn Season";
            default -> "Invalid Month Input";
        };
        System.out.println(monthSeason);

    }
    
}
// Monsoon Season