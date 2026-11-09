package arrays;

public class ExemplesArrays2D {

    public static void main(String[] args) {

        float [][] notes = {
                {5.5f,      7,      3},
                {7.5f,      6.4f,   3},
                {9.5f,      7.4f,   3},
        };

        // Imprimeix array 2D per files
        imprimirArray2DFiles(notes);

        System.out.println();

        // Imprimeix array 2D per columnes
        imprimirArray2DColumnes(notes);

        System.out.println();

        // Imprimeix diagonal array 2D
        imprimirDiagonalArray2D(notes);
    }

    public static void imprimirArray2DFiles(float[][] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("[%d]:\t", i);
            for(int j=0; j<array[0].length; j++){
                System.out.printf("%f\t", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void imprimirArray2DColumnes(float[][] array){
        for(int j=0; j<array[0].length; j++){
            System.out.printf("[%d]:\t", j);
            for(int i=0; i<array.length; i++){
                System.out.printf("%f\t", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void imprimirDiagonalArray2D(float[][] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%f\t", array[i][i]);
        }
    }
}
