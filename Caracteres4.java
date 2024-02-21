import java.util.Scanner;

public class Caracteres4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char a, b, c;

        a = scan.next().charAt(0);
        b = scan.next().charAt(0);        
        c = scan.next().charAt(0);

        System.out.println(c + " " + b + " " + a);
    }
}
