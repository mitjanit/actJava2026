package strings;

import java.util.Scanner;

public class NomLlinatges {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("NOM I LLINATGES: ");
        String nomLlinatges = input.nextLine();
        //System.out.println(nomLlinatges);

        int posBlanc1 = nomLlinatges.indexOf(' ');
        String nom = nomLlinatges.substring(0, posBlanc1);
        System.out.printf("Nom: %s.%n", nom);

        int posBlanc2 = nomLlinatges.lastIndexOf(' ');
        String llinatge1 = nomLlinatges.substring(posBlanc1+1, posBlanc2);
        System.out.printf("1r Llinatge: %s.%n", llinatge1);

        String llinatge2 = nomLlinatges.substring(posBlanc2+1);
        System.out.printf("2n Llinatge: %s.%n", llinatge2);

    }
}
