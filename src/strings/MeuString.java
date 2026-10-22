package strings;

import java.util.Locale;

public class MeuString {

    public static void main(String[] args) {

        String nom = "Toni";
        System.out.println(nom);

        int n = nom.length(); // 4
        int posO = nom.indexOf('o');  // 1
        int posZ = nom.indexOf('z');  // -1
        int posDarreraO = nom.lastIndexOf('o'); // 1

        char primera = nom.charAt(0); // 'T'
        char darrera = nom.charAt(nom.length()-1); // 'i'

        String part1 = nom.substring(2); // "ni"
        String part2 = nom.substring(1, 3); // "on"
        String junts1 = nom + "Profe"; // "ToniProfe"
        String junts2 = nom.concat("Profe"); //"ToniProfe"
        String feina = "Profe";
        String junts3 = nom.concat(feina); // "ToniProfe"
        String nomMaj = nom.toUpperCase(); // "TONI"
        String nomMin = nom.toLowerCase(); // "toni"
        String nom2 = nom.replace('i', 'o'); // "Tono"

        boolean començaT = nom.startsWith("T"); // true
        boolean començat = nom.startsWith("t"); // false
        boolean acabaO = nom.endsWith("O");     // false
        boolean acabaOni = nom.endsWith("oni");     // true

    }
}
