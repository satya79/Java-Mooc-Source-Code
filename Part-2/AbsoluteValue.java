
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a<0){
            System.out.println(-1*a);
        }else{
            System.out.println(a);
        }

    }
}
