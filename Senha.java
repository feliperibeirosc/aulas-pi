import java.util.Scanner;

public class Senha{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int s, aux, mod;
		boolean temZero = false; 

		mod = 1000;
		s = scan.nextInt();
		
		for (int i = 0; i < 4; i++){
			aux = (s / mod) % 10;
			mod = mod/10;
			if (aux == 0){
				temZero = true;
			}
		}
		
		if(temZero == true){
			System.out.println("NAO");
		} else {
			System.out.println("SIM");
		}
	
	}
}