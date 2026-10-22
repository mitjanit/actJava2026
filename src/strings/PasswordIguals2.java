package strings;

import java.util.Scanner;

public class PasswordIguals2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("PASSWORD 1: ");
        String p1 = input.next();

        System.out.print("PASSWORD 2: ");
        String p2 = input.next();

        boolean iguals = true;

        if(p1.length()!=p2.length()){
            iguals = false;
        }
        else {
            for(int i=0; i<p1.length(); i++){
                if(p1.charAt(i)!=p2.charAt(i)){
                    iguals = false;
                }
            }
        }
        System.out.println("Passwords iguals: " + iguals);
    }
}
