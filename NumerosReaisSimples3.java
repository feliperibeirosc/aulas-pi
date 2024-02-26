// Ex 16

import java.util.Scanner;

public class NumerosReaisSimples3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();

        System.out.printf("%.2f %.2f %.2f\n", A, B, C);
        
        scanner.close();
    }
}
