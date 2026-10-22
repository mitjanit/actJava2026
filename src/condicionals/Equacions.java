package condicionals;

import java.util.Scanner;

public class Equacions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("A: ");
        int a = input.nextInt();

        System.out.print("B: ");
        int b = input.nextInt();

        System.out.print("C: ");
        int c = input.nextInt();

        int d = b*b - 4*a*c;

        if(d<0){
            System.out.println("No té solucions reals.");
        }
        else {
            if(d==0){
                float x = -b / (2*a);
                System.out.println("Té una solució: " + x);
            }
            else {

                double x1 = (-b + Math.sqrt(d)) / (2*a);
                double x2 = (-b - Math.sqrt(d)) / (2*a);
                System.out.println("Té 2 solucions: \n" + x1 + "\n" + x2);
            }
        }
    }
}
