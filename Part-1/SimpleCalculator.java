import java.util.Scanner;
public class SimpleCalculator{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(reader.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(reader.nextLine());
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
        System.out.println(num1+" / "+num2+" = "+(num1/(double)num2));
        
                
    
    
    
    }



}

