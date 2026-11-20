package tresenratlla;

import java.util.Scanner;

public class TresEnRatlla {


    public enum VALOR {BUIDA, CERCLE, CREU};
    public static VALOR[][] tauler;

    public enum RESULTAT {EN_JOC, GUANYADOR_A, GUANYADOR_B, EMPAT};
    public static RESULTAT resultat;

    public enum TORN {JUGADOR_A, JUGADOR_B};
    public static TORN torn;
    public static int numTirades;

    public static final int DIMENSIO = 3;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        inicialitzaPartida();
        mostrarTauler(tauler);
        while(!partidaAcabada()){
            ferTirada(input, torn, tauler);
            mostrarTauler(tauler);
            resultat = comprovaResultat(tauler);
            torn = canviarTorn(torn);
        }
        mostrarResultat(resultat);
    }

    public static void inicialitzaPartida(){
        tauler = new VALOR[DIMENSIO][DIMENSIO];
        for(int i=0; i<tauler.length; i++){
            for(int j=0; j<tauler[0].length; j++){
                tauler[i][j] = VALOR.BUIDA;
            }
        }
        resultat = RESULTAT.EN_JOC;
        torn = TORN.JUGADOR_A;
        numTirades = 0;
    }

    public static void mostrarTauler(VALOR[][] t){
        for(int i=0; i<t.length; i++){
            for(int j=0; j<t[0].length; j++){
                System.out.print("|");
                switch(t[i][j]){
                    case BUIDA : System.out.print(" "); break;
                    case CERCLE: System.out.print("O"); break;
                    case CREU: System.out.print("X"); break;
                }
                if(j == t[0].length-1){
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

    public static boolean partidaAcabada(){
        return (numTirades == tauler.length * tauler.length ||
                resultat != RESULTAT.EN_JOC);
    }

    public static void ferTirada(Scanner input, TORN torn, VALOR[][] t){
        int f, c;
        System.out.println("JUGADOR: " + torn);
        do {
            f= demanar("Indica la fila: ", input);
            c = demanar("Indica la Columna: ", input);
        } while(!tiradaValida(f, c, tauler));

        tauler[f][c] = (torn==TORN.JUGADOR_A)? VALOR.CREU : VALOR.CERCLE;
        numTirades++;
    }

    public static int demanar(String missatge, Scanner input){
        System.out.print(missatge);
        return input.nextInt();
    }

    public static boolean tiradaValida(int f, int c, VALOR[][] t){
        return (f>=0 && f<t.length &&
                c>=0 && c<t.length &&
                t[f][c]==VALOR.BUIDA);
    }

    public static RESULTAT comprovaResultat(VALOR[][] t){

        boolean guanyaF = false;
        for(int f=0; f<t.length; f++) {
            boolean b = true;
            for(int c=0; c<t.length-1; c++) {
                b = b && (t[f][c] == t[f][c+1] &&
                          t[f][c] != VALOR.BUIDA);
            }
            guanyaF = b || guanyaF;
        }


        boolean guanyaC = false;
        for(int c=0; c<t.length; c++) {
            boolean b = true;
            for(int f=0; f<t.length-1; f++){
                b = b && (t[f][c] == t[f+1][c] &&
                          t[f][c] != VALOR.BUIDA);
            }
            guanyaC = b || guanyaC;
        }

        boolean bDD = true;
        for(int i=0; i<t.length; i++){
            bDD = bDD && (t[i][i] == t[0][0] && t[i][i] != VALOR.BUIDA);
        }
        boolean guanyaDD = bDD;


        boolean bDA = true;
        for(int c=0, f = t.length-1; c<t.length; c++, f--){
            bDA = bDA && (t[f][c]==t[f-1][c+1] && t[f][c] != VALOR.BUIDA);
        }
        boolean guanyaDA = bDA;

        if(guanyaF || guanyaC || guanyaDD || guanyaDA) {
            return (torn==TORN.JUGADOR_A) ? RESULTAT.GUANYADOR_A : RESULTAT.GUANYADOR_B;
        }
        else if(numTirades == tauler.length * tauler.length){
            return RESULTAT.EMPAT;
        }
        else {
            return RESULTAT.EN_JOC;
        }
    }

    public static TORN canviarTorn(TORN torn){
        if(torn == TORN.JUGADOR_A) {
            return TORN.JUGADOR_B;
        }
        else {
            return TORN.JUGADOR_A;
        }
    }

    public static void mostrarResultat(RESULTAT r){
        if(r == RESULTAT.EMPAT){
            System.out.println("La partida acaba en EMPAT.");
        }
        else if(r== RESULTAT.GUANYADOR_A){
            System.out.println("El guanyador de la partida és A.");
        }
        else if(r== RESULTAT.GUANYADOR_B){
            System.out.println("El guanyador de la partida és B.");
        }
    }
}
