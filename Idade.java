// ex 30

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anoAtual, anoNasci;
        
        anoAtual = scan.nextInt();
        String nome = scan.next();
        anoNasci = scan.nextInt();
        int idade = anoAtual-anoNasci;
        scan.close();

        System.out.printf("%s, voce completa %d anos de idade neste ano.\n", nome, idade);
    }
    
}