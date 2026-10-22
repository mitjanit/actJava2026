package bucles;

import java.util.Scanner;

public class QuantsNumeros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numPars = 0, numImpars = 0;
        int numPos = 0, numNeg = 0;

        for(int i=1;i<=10;i++) {
            System.out.print("Número "+ i + ": ");
            int n = input.nextInt();
            if(n>=0){
                numPos++;
            }
            else {
                numNeg++;
            }
            if(n%2==0){
                numPars++;
            }
            else {
                numImpars++;
            }
        }

        System.out.println("Num Positius: " + numPos);
        System.out.println("Num Ngeatius: " + numNeg);
        System.out.println("Num Parells: " + numPars);
        System.out.println("Num Imparells: " + numImpars);
    }
}
