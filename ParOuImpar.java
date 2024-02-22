import java.util.Scanner;

public class ParOuImpar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	
		long n = (scan.nextLong()%2) ;
		
		if (n == 0){
			System.out.println("par");
		} else {
			System.out.println("impar");
		}
	}
}