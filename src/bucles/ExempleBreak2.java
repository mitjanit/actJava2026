package bucles;

import java.sql.PreparedStatement;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class ExempleBreak2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float total = 0;
        int quants = 0;
        while(true) {
            System.out.print("Continuar [S/N]: ");
            char resposta = input.next().charAt(0);

            if (resposta == 'S' || resposta == 's') {
                System.out.print("Número: ");
                int n = input.nextInt();
                total += n;
                quants++;
            }
            else {
                break;
            }
        }
        System.out.printf("El total és %f.%n", total);
        System.out.printf("La mitjana és %f.", total/quants);


    }
}
