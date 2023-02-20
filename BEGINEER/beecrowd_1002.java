
import java.util.Scanner;

public class URI_1002 {
 
    public static void main(String[] args) {
 
        try (Scanner input = new Scanner(System.in)) {
            final double n = 3.14159;
            double r = input.nextDouble();
            System.out.printf("A=%.4f\n", n * r * r);
        }
    }
 
}