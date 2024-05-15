import java.util.Scanner;
public class DifferentTypesOfInput{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a string:");
        String text = reader.nextLine();
        System.out.println("Give an integer:");
        int number = Integer.valueOf(reader.nextLine());
        System.out.println("Give a double:");
        double num_double = Double.valueOf(reader.nextLine());
        System.out.println("Give a boolean:");
        boolean value = Boolean.valueOf(reader.nextLine());
        System.out.println("You gave the string "+ text);
        System.out.println("You gave the integer "+ number);
        System.out.println("You gave the double "+ num_double);
        System.out.println("You gave the boolean "+ value);
        
    
    
    }


}