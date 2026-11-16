public class RepasJAVA {

    public static void main(String[] args) {

        // 1) Declaració de variables (tipus nom;)
        int edat = 20;
        float pes = 75.3f;
        String nom;
        boolean casat = true;
        char grup;

        // 2) Declaració de constants (final tipus NOM = valor; )
        final int NUM_ALUMNES = 10;

        // 3) Operacions aritmètiques (+, -, *, /, %)
        edat = edat + 1;
        pes = pes * 2;

        // 4) Operacions booleanes (&&, || , !, <, <=, >, >=, !=, ==)
        boolean retirat = (edat > 60) && !casat;
        boolean menor = (edat <=17) || (pes<35);

        // 5) Operacions d'assignació (=, +=, -=, *=, /=, %=)
        edat = 44;
        edat += 5;
        pes *= 2;

        // 6) Estructures condicionals
        // (if, if-else,if-else if-else,switch, operador condicional )
        if(edat>=18){ }

        if(edat>=18){ } else { }

        if(edat<5){} else if(edat<10){} else {}

        switch(edat){
            case 10: { break; }
            case 20: { break; }
            default: { }
        }

        boolean majorEdat = edat>=18 ? true : false;
        String etiqueta = edat>65 ? "JUBILAT" : "TREBALLANT";

        //7) Estructures iteratives (bucles: while, do-while, for)
        // Tots el bucles tenen 3 parts: init., condició, update
        int x = 0;
        while(x<10){
            x++;
        }

        int y= 0;
        do{
            y++;
        }while(y<10);

        for(int z=0; z<10; z++){ }

        for(int a = 0, b= 10; a<5 && b>5; a++, b--){ }

        // 8) Operacions amb Strings
        nom = "Paquita";
        int llarg = nom.length(); // 7
        char c = nom.charAt(2); // 'q'
        int posA = nom.indexOf('a'); // 1
        int posA2 = nom.lastIndexOf('a'); // 6
        String tros1 = nom.substring(3); // "uita"
        String tros2 = nom.substring(2, 5); // "qui"
        String majuscules = nom.toUpperCase(); // "PAQUITA"
        String minuscules = nom.toLowerCase(); // "paquita"
        String nom2 = nom.replace('a', 'e'); // "Pequite"
        String nomComplet = nom + " " + "Perez"; // Paquita Perez
        String nomComplet2 = nom.concat(" Perez"); // Paquita Perez

        // 9) Arrays

        String[] germans = {"Pau", "Pep", "Paco"};
        germans[1] = "Joselu";  // Canvia 'Pep' per 'Joselu'

        String[] fills = new String[5];
        for(int i=0; i<fills.length; i++){
            fills[i] = "Fill " + i;
        }

        int[][] a = {
                {2, 5, 6, 8},
                {1, 0, 7, 3},
                {0, 5, 1, 4}
        };

        int numFiles = a.length; // 3
        int numColumnes = a[0].length; // 4

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){

            }
        }

        faCosa();
        int valorRetorna = retornaCosa();

    }

    // 10) Funcions (declaració, cridada, paràmetres)

    public static void faCosa(){ }

    public static int retornaCosa(){ return 0; }

    public static void funcioAmbParametres(int param1, char param2){ }

    public static void funcioRecursiva1(){
        
    }


}
