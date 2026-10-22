package condicionals;

import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("NOTA: ");
        int nota = input.nextInt();

        switch (nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: System.out.println("Suspès"); break;
            case 5:
            case 6: System.out.println("Aprovat"); break;
            case 7:
            case 8: System.out.println("Notable"); break;
            case 9:
            case 10: System.out.println("Excel·lent"); break;
            default: System.out.println("Nota incorrecta");
        }

    }
}
