// Ex 20

import java.util.Scanner;

public class NumerosReaisDupla2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b, c;

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        System.out.printf("%.4f\n", c);
        System.out.printf("%.4f\n", b);
        System.out.printf("%.4f\n", a);

        scan.close();
    }
}
