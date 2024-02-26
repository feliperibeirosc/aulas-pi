// ex 26

import java.util.Scanner;

public class CadeiaDeCaracteres4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] a, b, c = new char[50];

        a = scan.next().toCharArray();
        b = scan.next().toCharArray();
        c = scan.next().toCharArray();

        scan.close();

        System.out.println(new String(c) + " " + new String(b) + " " + new String(a));
    }
}
