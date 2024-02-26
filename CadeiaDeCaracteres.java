// ex 23

import java.util.Scanner;

public class CadeiaDeCaracteres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] a, b, c = new char[50];

        a = scan.nextLine().toCharArray();
        b = scan.nextLine().toCharArray();
        c = scan.nextLine().toCharArray();

        scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
