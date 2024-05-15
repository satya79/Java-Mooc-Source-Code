import java.util.Scanner;
public class SecondsInADay{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int num = Integer.valueOf(reader.nextLine());
        num = num*24*60*60;
        System.out.println(num);
    
    
    }
    


}