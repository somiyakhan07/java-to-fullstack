// Print yearmonth days using switch expression

public class MonthDays {
    public static void main(String[] args){
        int year = 2026;
        int month = 2;
        boolean isLeapYear = (year%4 ==0);


    if(isLeapYear){
        System.out.println(year + " Is A Leap Year");

    } else {
        System.out.println(year + " Is Not A Leap Year");
    }

            String monthDays = switch(month){
                case 1 -> "Month January and has 31 days";
                case 2 -> { if(isLeapYear){
                    yield "Month February and has 29 days" ;
                } else {
                    yield "Month February and has 28 days";
                }
            }
                case 3 -> "Month March and has 31 days";
                case 4 -> "Month April and has 30 days";
                case 5 -> "Month May and has 31 days";
                case 6 -> "Month June and has 30 days";
                case 7 -> "Month July and has 31 days";
                case 8 -> "Month August and has 31 days";
                case 9 -> "Month September and has 30 days";
                case 10 -> "Month October and has 31 days";
                case 11 -> "Month November and has 30 days";
                case 12 -> "Month December and has 31 days";
                default -> "Invalid Input";
            };
            System.out.println(monthDays);
        
    }

}
// 2026 Is Not A Leap Year
// Month February and has 28 days