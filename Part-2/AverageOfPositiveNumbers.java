
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;
        while(true){
            int a = scanner.nextInt();
            if (a==0){
                break;
            }else if (a>0){
                total = total + a;
                count = count + 1;
            } 
                
        } 
        if(count !=0){
            System.out.println((total)/(double)count);
        }else{
            System.out.println("Cannot calculate the average");
        }
    }
        

}

