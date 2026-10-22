package sequencials;

import java.util.Scanner;

import static java.lang.Math.PI;

public class AreaCercle {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // input R
        int r = input.nextInt();

        // calcula de l'àrea
        double area = PI * r * r;

        // ouput àrea
        System.out.println("AREA: " + area);
    }
}
