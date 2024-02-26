// Ex 19

import java.util.Scanner;

public class NumerosReaisDupla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b, c;

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        System.out.printf("%.4f\n", a);
        System.out.printf("%.4f\n", b);
        System.out.printf("%.4f\n", c);

        scan.close();
    }
}
