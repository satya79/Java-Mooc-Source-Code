
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int num = Integer.valueOf(scan.nextLine());
        if (num < 0){
            System.out.println("impossible!");
        } else if (0 <= num & num <=49) {
            System.out.println("failed");
        } else if (50 <= num & num <=59) {
            System.out.println("1");
        } else if (60 <= num & num <=69) {
            System.out.println("2");
        } else if (70 <= num & num <=79) {
            System.out.println("3");
        } else if (80 <= num & num <=89) {
            System.out.println("4");
        } else if (90 <= num & num <=100) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        } 
        
       
        

    }
}
