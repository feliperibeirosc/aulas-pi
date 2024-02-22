import java.util.Scanner;

public class Ufabc{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	
		char n = scan.next().charAt(0);
		
		if (n == 'A'){
			System.out.println("F");
		} else {
			System.out.println("A");
		}
	}
}