// ex 29

import java.util.Scanner;

public class Troca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a, b, aux;

        a = scan.nextLong();
        b = scan.nextLong();
        aux = b;
        b = a;
        a = aux;

        System.out.printf("%d %d\n", a, b);
        
    }
}
