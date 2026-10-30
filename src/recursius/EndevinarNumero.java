package recursius;

public class EndevinarNumero {

    public static int numero = 35;

    public static void main(String[] args) {
        endivinar(1, 100);
        endivinarR(1, 100);
    }

    public static void endivinar(int bot, int top){
        int mid;
        do {
            mid = (bot + top) / 2;
            if(numero>mid){
                bot = mid;
            }
            else if(numero<mid){
                top = mid;
            }
        } while(numero!=mid);

        System.out.println("El número és "+ mid);
    }

    public static void endivinarR(int bot, int top){
        int mid = (bot + top)/2;
        if(mid==numero){
            System.out.println("El número és "+ mid);
        }
        else if(numero<mid){
            endivinarR(bot, mid);
        }
        else if(numero>mid){
            endivinarR(mid, top);
        }
    }
}
