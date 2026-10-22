package bucles;

import java.util.Scanner;

public class TaulaMultiplicar10 {

    public static void main(String[] args) {

        for(int n=1; n<=10; n++) {
            System.out.println("Taula de Multiplicar del "+ n);
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + "x" + i + "=" + n * i);
            }
            System.out.println();
        }
    }
}
