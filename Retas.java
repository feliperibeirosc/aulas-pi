import java.util.Scanner;

public class Retas{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	
		float a, b, c, d;
		
		a = scan.nextFloat();	
		b = scan.nextFloat();
		c = scan.nextFloat();
		d = scan.nextFloat();
		
		if (a == c){
			if (b == d){
				System.out.println("coincidentes");
			} else {
				System.out.println("paralelas");
			}
		} else {
			System.out.println("concorrentes");
		}
	}
}