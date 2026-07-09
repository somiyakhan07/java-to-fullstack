// Print Traffic signal light message using switch expression

public class TrafficSignal {
    public static void main(String[] args){
        String signal = "green";
        signal = signal.toUpperCase();

        String trafficSignal = switch (signal){
            case "RED" -> "STOP";
            case "YELLOW" -> "GET READY!!";
            case "GREEN" -> "GO!";
            default -> "Invalid Traffic Signal";
        };
        System.out.println(trafficSignal);
    }
    
}
// GO!