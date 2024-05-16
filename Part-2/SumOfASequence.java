
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Last number?");
        int num = scanner.nextInt();
        for (int i = 1;i<=num;i++  ){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    
}
