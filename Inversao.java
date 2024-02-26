import java.util.Scanner;

public class Inversao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        n = n * -1;
        System.out.println(n);
    }
}
