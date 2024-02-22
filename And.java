import java.util.Scanner;

public class And{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		boolean p = scan.nextBoolean();
		boolean q = scan.nextBoolean();
		System.out.println(p&&q);
	}
}