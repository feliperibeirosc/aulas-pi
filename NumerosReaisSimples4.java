// Ex 17

import java.util.Scanner;

public class NumerosReaisSimples4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();

        System.out.printf("%.2f %.2f %.2f\n", C, B, A);
        
        scanner.close();
    }
}