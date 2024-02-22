import java.util.Scanner;

public class IdadeMaisVelho{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	
		int idadeUm = scan.nextInt();
		int idadeDois = scan.nextInt();
		
		if (idadeUm >= idadeDois){
			System.out.println(idadeUm);
		} else {
			System.out.println(idadeDois);
		}
	}
}