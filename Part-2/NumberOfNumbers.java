import java.util.Scanner;
public class NumberOfNumbers{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int count = 0;
        while (true){
            System.out.println("Give a number:");
            int n = Integer.valueOf(reader.nextLine());
            if(n==0){
                System.out.println("Number of numbers: "+count);
                break;
            }else{
                count = count + 1;
            }
            
        }
    }

}