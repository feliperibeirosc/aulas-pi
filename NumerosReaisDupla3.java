// Ex 21

import java.util.Scanner;

public class NumerosReaisDupla3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b, c;

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        System.out.printf("%.4f %.4f %.4f\n", a, b, c);
        
        scan.close();
    }
}
