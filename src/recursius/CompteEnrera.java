package recursius;

public class CompteEnrera {

    public static void main(String[] args) {
        compteEnrera(10);
    }

    public static void compteEnrera(int n){
        if(n==0){
            System.out.print("BOOOOOOM!!!!");
        }
        else {
            System.out.print(n +", ");
            compteEnrera(n-1);
        }
    }
}
