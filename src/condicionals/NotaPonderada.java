package condicionals;

import java.util.Scanner;

public class NotaPonderada {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nota 1: ");
        float n1 = input.nextFloat();

        System.out.print("Nota 2: ");
        float n2 = input.nextFloat();

        System.out.print("Nota 3: ");
        float n3 = input.nextFloat();

        //double nota = 0.2 * n1 + 0.3 * n2 + 0.5 * n3;
        float nota = 0.2f * n1 + 0.3f * n2 + 0.5f * n3;

        if(nota>=5){
            System.out.println("APROVAT");
        }
        else {
            System.out.println("SUSPÉS");
        }

    }
}
