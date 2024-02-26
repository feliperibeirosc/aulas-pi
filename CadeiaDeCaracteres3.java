// ex 25

import java.util.Scanner;

public class CadeiaDeCaracteres3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] a, b, c = new char[50];

        a = scan.next().toCharArray();
        b = scan.next().toCharArray();
        c = scan.next().toCharArray();

        scan.close();

        System.out.println(new String(a) + " " + new String(b) + " " + new String(c));
    }
}
