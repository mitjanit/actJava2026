package bucles;

import java.util.Scanner;

public class SuccesioAritmetica {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        int n = input.nextInt();

        for(int i=0; i<n; i++){
            int x = 2*i -1;
            System.out.println("X" + i + ": " + x);
        }
    }
}
