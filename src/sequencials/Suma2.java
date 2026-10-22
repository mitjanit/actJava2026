package sequencials;

import java.util.Scanner;

public class Suma2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = input.nextInt();
        System.out.print("Enter B: ");
        int b = input.nextInt();
        int suma = a + b;
        System.out.print("La suma és: " + suma);
    }
}
