package arrays;

public class ExexemplesArrays {

    public static void main(String[] args) {

        String[] noms = {"Paco", "Pep", "Jose", "Maria"};
        int[] edats = {23, 18, 45};

        noms[0] = "Paquito";
        edats[0] = 24;
        edats[1] += 5;

        System.out.printf("%s té %d.", noms[1], edats[1]);
        //System.out.print(noms);

        // Imprimir ascendentment l'array
        for(int i=0; i<noms.length; i++){
            System.out.println(noms[i] + "\t");
        }
        System.out.println();

        // Imprimir descendentment l'array
        for(int i=noms.length-1; i>=0; i--){
            System.out.println(noms[i] + "\t");
        }

        // noms[22] = "Pep";  // ArrayIndexOutOfBoundsException

        imprimirArray(noms);
        imprimirArray(edats);

        System.out.println("Suma: " + sumaArray(edats));
        System.out.println("Mitjana: " + mitjanaArray(edats));
        System.out.println("Màxim: " + maximArray(edats));
    }
    public static void imprimirArray(String [] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("[%d]: %s%n", i, array[i]);
        }
    }
    public static void imprimirArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.printf("[%d]: %s%n", i, array[i]);
        }
    }

    public static int sumaArray(int[] array){
        int total = 0;
        for(int i=0; i<array.length; i++){
            total += array[i];
        }
        return total;
    }

    public static float mitjanaArray(int[] array){
        float total = 0;
        for(int i=0; i<array.length; i++){
            total += array[i];
        }
        return total / array.length;
    }

    public static float mitjanaArray2(int[] array){
        return sumaArray(array) / (float) array.length;
    }

    public static int maximArray(int[] array){
        int max = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static boolean totsZeros(int[] array){
        for(int i=0; i<array.length; i++){
            if(array[i]!=0){
                return false;
            }
        }
        return true;
    }
}
