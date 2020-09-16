import java.util.Scanner;

public class Moms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv købe summen: ");
        double købeSum = input.nextDouble();
        
        plusDanskMoms(købeSum);
        plusTyskMoms(købeSum);
    }
    public static void plusDanskMoms(double købeSum){
        double danskMoms = købeSum * 0.25;

        System.out.println("købs momsen er i DDK " + (int) (danskMoms * 100)/ 100.0);
    }
    public static void plusTyskMoms(double købeSum){
        double plusTyskMoms = købeSum * 0.16;
        
        System.out.println("Den tyske moms i DKK " + (int) (plusTyskMoms * 100)/ 100.0);
    }


}
