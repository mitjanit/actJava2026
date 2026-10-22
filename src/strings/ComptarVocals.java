package strings;

import java.util.Scanner;

public class ComptarVocals {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("STRING: ");
        String s = input.next();

        int n = 0;

        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='a' ||
                s.charAt(i)=='e' ||
                s.charAt(i)=='i' ||
                s.charAt(i)=='o' ||
                s.charAt(i)=='u'){
                n++;
            }
        }

        System.out.println("Nums Vocals: " + n);

    }
}
