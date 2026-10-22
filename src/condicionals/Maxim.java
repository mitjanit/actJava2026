package condicionals;

import java.util.Scanner;

public class Maxim {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("A: ");
        int a = input.nextInt();

        System.out.print("B: ");
        int b = input.nextInt();

        System.out.print("El màxim és : ");
        if(a>b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}
