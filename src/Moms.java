import java.util.Scanner;

public class Moms {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Skriv købe summen: ");
        double købeSum = input.nextDouble();


        double plusDanskMoms = købeSum * 0.25;
        double plusTyskMoms = købeSum * 0.16;
        
        System.out.println("købs momsen er i DDK " + plusDanskMoms);
        System.out.println("Den tyske moms i DKK " + (plusTyskMoms * 100)/ 100);
    }
}