package arrays;

public class ArrayPrimers {

    public static void main(String[] args) {
        int[] primers = arrayPrimers(10);
        ExemplesArrays.imprimirArray(primers);
    }

    public static int[] arrayPrimers(int quants){
        int[] array = new int[quants];
        int n = 2;
        int trobats = 0;
        while(trobats < quants){
            while(!esPrimer(n)){
                n++;
            }
            array[trobats] = n;
            trobats++;
            n++;
        }
        return array;
    }

    public static boolean esPrimer(int n){
        int x = n - 1;
        while(n % x != 0){
            x--;
        }
        return (x==1);
    }
}
