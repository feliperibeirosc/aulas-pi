import java.util.Scanner;

public class Triangulo2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		float angulo;
		
		angulo = scan.nextFloat();
		angulo = 180 - angulo - scan.nextFloat();
		
		System.out.println(angulo);
		
		if(angulo < 90){
			System.out.println("acutangulo");
		} else if (angulo == 90){
			System.out.println("retangulo");
		} else {
			System.out.println("obtusangulo");
		}	
	}
}