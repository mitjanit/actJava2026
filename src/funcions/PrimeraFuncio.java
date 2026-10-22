package funcions;

public class PrimeraFuncio {

    public static void main(String[] args) {
        imprimirNumeros();
        imprimirNumerosFins(5);
        imprimirNumerosDesdeFins(5, 10);
    }

    public static void imprimirNumeros(){
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }

    public static void imprimirNumerosFins(int n){
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }

    public static void imprimirNumerosDesdeFins(int a, int b){
        for(int i=a; i<=b; i++){
            System.out.println(i);
        }
    }
}
