package strings;

import java.util.Scanner;

public class PasswordIguals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("PASSWORD 1: ");
        String p1 = input.next();

        System.out.print("PASSWORD 2: ");
        String p2 = input.next();

        if(p1.equals(p2)){
            System.out.println("Passwords Iguals.");
        }
        else {
            System.out.println("Passwords Diferents.");
        }
    }
}
