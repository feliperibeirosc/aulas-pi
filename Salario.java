// ex 28

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v, pd, sl;
        
        v = scan.nextDouble();
        int q = scan.nextInt();
        pd = scan.nextDouble();

        scan.close();

        sl = v*q*(1-pd/100);

        System.out.printf("%.2f\n",sl);
    }
}
