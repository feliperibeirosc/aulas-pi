import java.util.Scanner;

public class Diferenca{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		System.out.println(!(a == b));
	}
}