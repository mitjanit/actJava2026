package variables;

import java.util.Scanner;

public class VariablesEntrada {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Què te diven? ");
        String nom = input.next();

        System.out.print("Quants anys tens?");
        int edat = input.nextInt();

        System.out.print("Quant medeixes?");
        float altura = input.nextFloat();

        System.out.print("Quin grup sanguini tens?");
        char grup = input.next().charAt(0);

        System.out.print("Ets major d'edat?");
        boolean majorEdat = input.nextBoolean();

        System.out.print("Nom: " + nom + ", tenc " + edat + " anys" +
                "\nmedeixo "+ altura + " cm" + "\t\tGrup sanguini: " + grup +
                "\n\nSom major d'edat: "+ majorEdat);
    }
}
