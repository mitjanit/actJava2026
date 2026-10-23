package funcions;

import java.util.Scanner;

public class CelsiusAFarenheitFuncio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("C: ");
        float c = input.nextFloat();

        System.out.printf("La temperatura en ºF és %f.", conversioFarenheit(c));
    }

    public static float conversioFarenheit(float celsius){
        return celsius * (9.0f / 5) + 32;
    }
}
