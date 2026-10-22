package strings;

import java.util.Scanner;

public class LletraAlletra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("STRING: ");
        String s = input.next();

        System.out.println("STRING sencer: " + s);

        System.out.println("STRING lletra x lletra: ");
        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }

        System.out.println("STRING lletra x lletra (al revés): ");
        for (int i = s.length()-1; i >= 0; i--){
            System.out.println(s.charAt(i));
        }
    }
}
