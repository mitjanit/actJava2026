package recursius;

public class Producte {

    public static void main(String[] args) {
        System.out.printf("El producte de %d per %d és %d.%n", 4, 3, producte(4, 3));
        System.out.printf("El producte de %d per %d és %d.%n", 4, 3, producteR(4, 3));
    }

    public static int producte(int a, int b){
        int p = 0;
        while(b>=1){
            p = p + a;
            b--;
        }
        return p;
    }

    public static int producteR(int a, int b){
        if(b==1){ return a; }
        else {    return a + producteR(a, b-1); }
    }
}
