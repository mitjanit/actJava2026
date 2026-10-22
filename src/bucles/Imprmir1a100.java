package bucles;

// ACT 14 - Imprimir els números de l'1 al 100

public class Imprmir1a100 {

    public static void main(String[] args) {
        // For
        for(int i=1; i<=100; i=i+1){
            System.out.print(i + ", ");
        }
        System.out.println();
        // While
        int i = 1;
        while(i<=100){
            System.out.print(i + ", ");
            i = i + 1;
        }
        System.out.println();
        // Do-while
        int j = 1;
        do {
            System.out.print(j + ", ");
            j = j + 1;
        }while(j<=100);
    }
}
