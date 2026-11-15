package arrays;

public class EstadistiquesArray2D {

    public static void main(String[] args) {

        int[][] a = {
                {2, 6, 8, 9},
                {1, 4, 6, 8},
                {0, 2, 1, 7}
        };

        int[][] b = {
                {2, 6, 8, 9, 2, 5, 1},
                {1, 4, 6, 8, 10, 3, 7}
        };

        System.out.println("Estadístiques d'A (min, max, avg): ");
        ExemplesArrays.imprimirArray(estadistiques(a));

        System.out.println("Estadístiques de B (min, max, avg): ");
        ExemplesArrays.imprimirArray(estadistiques(b));
    }

    public static float[] estadistiques(int[][] a){
        float maxim = a[0][0];
        float minim = a[0][0];
        float mitjana = 0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(a[i][j] > maxim){
                    maxim = a[i][j];
                }
                if(a[i][j] < minim){
                    minim = a[i][j];
                }
                mitjana += a[i][j];
            }
        }
        mitjana /= (a.length*a[0].length);

        float[] array = {minim, maxim, mitjana};
        return array;
    }
}
