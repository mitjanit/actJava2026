package funcions;

public class PasPrametres {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("N (main 1): " +  n);
        sumaUn(n);
        System.out.println("N (main 2): " +  n);
    }

    public static void sumaUn(int n){
        System.out.println("N (funció 1): " +  n);
        n = n + 1;
        System.out.println("N (funció 2): " +  n);
    }
}
