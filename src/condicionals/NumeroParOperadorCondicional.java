package condicionals;

import java.util.Scanner;

public class NumeroParOperadorCondicional {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("N: ");
        int n = input.nextInt();

        String m = n%2==0 ? "parell" : "imparell";

        System.out.printf("El número %d és %s.", n, m);
    }
}
