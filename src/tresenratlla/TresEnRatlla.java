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
    }

    public static void inicialitzaPartida(){
        tauler = new VALOR[3][3];
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
        return false;
    }

    public static void ferTirada(Scanner input, TORN torn, VALOR[][] t){
        int f, c;
        do {
            System.out.print("Indica la fila: ");
            f = input.nextInt();
            System.out.print("Indica la Columna: ");
            c = input.nextInt();
        } while(!tiradaValida(f, c, tauler));

        tauler[f][c] = (torn==TORN.JUGADOR_A)? VALOR.CREU : VALOR.CERCLE;
        numTirades++;
    }

    public static boolean tiradaValida(int f, int c, VALOR[][] t){
        return (f>=0 && f<3 &&
                c>=0 && c<3 &&
                t[f][c]==VALOR.BUIDA);
    }

    public static RESULTAT comprovaResultat(VALOR[][] t){
        return RESULTAT.EN_JOC;
    }
    public static TORN canviarTorn(TORN torn){
        return TORN.JUGADOR_A;
    }
}
