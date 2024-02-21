import java.util.Scanner;

public class AprovadoReprovado {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float m = scan.nextFloat();
    
    if(m >= 60){
        System.out.println("APROVADO");
    } else {
        System.out.println("REPROVADO");
    }
   }
}
