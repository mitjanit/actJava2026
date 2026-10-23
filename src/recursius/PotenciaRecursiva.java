package recursius;

public class PotenciaRecursiva {

    public static void main(String[] args) {
        System.out.printf("%d elevat a %d és %d.%n", 2, 4, potenciaR(2, 4));
        System.out.printf("%d elevat a %d és %d.", 2, 3, potenciaR2(2, 3));
    }

    public static int potenciaR(int b, int e){
        if(e==0){
            return 1;
        }
        else {
            return b * potenciaR(b, e-1);
        }
    }

    public static int potenciaR2(int b, int e){
        if(e==0){
            return 1;
        }
        else if(e%2==0){
            return potenciaR2(b, e/2)*potenciaR2(b, e/2);
        }
        else{
            return potenciaR2(b, e/2)*potenciaR2(b, e/2)*b;
        }
    }
}
