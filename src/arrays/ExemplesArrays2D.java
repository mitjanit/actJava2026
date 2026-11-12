package arrays;

public class ExemplesArrays2D {

    public static void main(String[] args) {

        float [][] notes = {
                {5.5f,      7,      8},
                {7.5f,      6.4f,   1},
                {9.5f,      7.4f,   3},
        };

        // Imprimeix array 2D per files
        imprimirArray2DFiles(notes);

        System.out.println();

        // Imprimeix array 2D per columnes
        imprimirArray2DColumnes(notes);

        System.out.println();

        // Imprimeix diagonal descendent array 2D
        imprimirDiagonalArray2Ddesc(notes);

        System.out.println();

        // Imprimeix diagonal ascendent array 2D
        imprimirDiagonalArray2Dasc(notes);
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

    public static void imprimirArray2DFiles(int[][] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("[%d]:\t", i);
            for(int j=0; j<array[0].length; j++){
                System.out.printf("%d\t", array[i][j]);
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

    public static void imprimirDiagonalArray2Ddesc(float[][] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%f\t", array[i][i]);
        }
    }

    public static void imprimirDiagonalArray2Dasc(float[][] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("%f\t", array[array.length - 1 - i][i]);
        }
    }

    public static void imprimirDiagonalArray2Dasc1(float[][] array){
        for(int i=array.length - 1, j=0; j<array.length; i--, j++){
            System.out.printf("%f\t", array[i][j]);
        }
    }
}
