package bucles;

import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("N: ");
        int n = input.nextInt();

        int suma = 0;

        for(int i=1; i<=n; i=i+1){
            System.out.print("Num "+i+": ");
            int x = input.nextInt();
            suma = suma + x;
        }

        System.out.println("Suma total: " + suma);
    }
}
