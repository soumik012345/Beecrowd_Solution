import java.util.Scanner;

public class URI_1003 {
 
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.printf("SOMA = %d\n", a + b);
        }
    }
 
}