package bucles;

public class ExempleContinue2 {

    public static void main(String[] args) {

        for(float i=10; i>=-10; i--){
            if(i==0){
                continue;
            }
            System.out.printf("%f : %f %n", i, 1/i);
        }
    }
}
