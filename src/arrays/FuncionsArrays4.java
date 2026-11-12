package arrays;

public class FuncionsArrays4 {

    public static void main(String[] args) {

        int[][] a = { {2, 7, 8, 0},
                      {1, 0, 4, 3},
                      {0, 0, 5, 1}};

        int[][] b = {{3, 1, 2, 5},
                     {0, 2, 1, 9},
                     {1, 3, 0, 2}};

        int[][] suma = sumaArray2D(a, b);
        ExemplesArrays2D.imprimirArray2DFiles(suma);

        System.out.println();
        ExemplesArrays2D.imprimirArray2DFiles(producteEscalar(2, b));

        System.out.println();
        System.out.printf("Són iguals els arrays? %b.%n", igualsArray2D(a, b));
        
        System.out.printf("Màxim de l'array 2D A: %d.%n", maximArray2D(a));
        System.out.printf("Màxim de l'array 2D B: %d.%n", maximArray2D(b));

    }

    public static int[][] sumaArray2D(int[][] a, int[][] b){
        int[][] array = new int[a.length][a[0].length];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                array[i][j] = a[i][j] + b[i][j];
            }
        }
        return array;
    }

    public static int[][] producteEscalar(int k, int[][] a){
        int[][] array = new int[a.length][a[0].length];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                array[i][j] = k * a[i][j];
            }
        }
        return array;
    }

    public static boolean igualsArray2D(int[][] a, int[][] b){
        if(a.length != b.length || a[0].length != b[0].length){
            return false;
        }
        else {
            for(int i=0; i<a.length; i++){
                for(int j=0; j<a[0].length; j++){
                    if(a[i][j] != b[i][j]){
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static int maximArray2D(int[][] a){
        int maxim = a[0][0];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(a[i][j]>maxim) {
                    maxim = a[i][j];
                }
            }
        }
        return maxim;
    }
}
