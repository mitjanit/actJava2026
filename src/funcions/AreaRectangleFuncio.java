package funcions;

import java.util.Scanner;

public class AreaRectangleFuncio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("A: ");
        int a = input.nextInt();

        System.out.print("B: ");
        int b = input.nextInt();

        System.out.printf("L'àrea del rectangle és %d.", areaRectangle(a, b));
    }

    public static int areaRectangle(int a, int b){
        return a * b;
    }
}
