// Simple menu program using swtich statement

public class SimpleMenuProgram {
    public static void main(String[] args){

        String name = "Akki";
        int menu = 1;

        switch(menu){
            case 1:
                System.out.println("Hello " + name);
                break;
            case 2:
                System.out.println("Welcome " + name);
                break;
            case 3:
                System.out.println("How was your day? " + name);
                break;
            case 4:
                System.out.println("Exit");
                break;
                
            default:
                System.out.println("Invalid Menu Choice");
        }
        
    }
    
}
// Hello Akki
