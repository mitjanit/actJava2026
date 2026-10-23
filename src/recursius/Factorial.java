package recursius;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N: ");
        int n = input.nextInt();

        System.out.printf("El factorial de %d és %d.%n", n, factorial(n));
        System.out.printf("El factorial recursiu de %d és %d.", n, factorialR(n));
    }

    public static int factorial(int n){
        int f = 1;
        while(n>1){
            f = f * n;
            n = n - 1;
        }
        return f;
    }

    public static int factorialR(int n){
        if(n==0){
            return 1; // Cas base (sabem la solució 0! = 1)
        }
        else {
            return n * factorialR(n-1);  // Cas recursiu
        }
    }
}
