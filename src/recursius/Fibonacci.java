package recursius;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.printf("Fibonacci de %d és %d.", 7, fibo(7));
    }

    public static int fibo(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return fibo(n-2) + fibo(n-1);
        }
    }
}
