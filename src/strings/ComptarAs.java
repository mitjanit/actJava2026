package strings;

import java.util.Scanner;

public class ComptarAs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("STRING: ");
        String s = input.next();

        int n = 0;

        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='a'){
                n++;
            }
        }

        System.out.println("Nums As: " + n);

    }
}
