package bucles;

import java.util.Scanner;

public class SuccesioGeometrica {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        int n = input.nextInt();

        int p = 1;

        for(int i=0; i<n; i++){
            p = p * 2;
            System.out.println("2 elevat a " + i + "és " + p);
        }
    }
}
