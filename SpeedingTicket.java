import java.util.Scanner;
public class SpeedingTicket{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Give speed:");
        int speed = Integer.valueOf(reader.nextLine());
        if (speed > 120){
            System.out.println("Speeding ticket!");
            
        }
    
    
    }
    
}