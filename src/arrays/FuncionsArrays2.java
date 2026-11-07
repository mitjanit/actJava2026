package arrays;

public class FuncionsArrays2 {

    public static void main(String[] args) {
        int[] a = {3, 6, 8, 9};
        int[] b = {2, 1, 0, 3};

        ordenaArrayAsc(b);
        ExemplesArrays.imprimirArray(a);

        System.out.printf("Són iguals els arrays? %b.%n", sonIguals(a, b));

        ExemplesArrays.imprimirArray(sumaArrays(a, b));
        System.out.println();
        ExemplesArrays.imprimirArray(juntarArrays(a, b));
        System.out.println();
        ExemplesArrays.imprimirArray(zipArrays(a, b));
    }

    public static boolean sonIguals(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        else {
            for(int i=0; i<a.length; i++){
                if(a[i] != b[i]){
                    return false;
                }
            }
            return true;
        }
    }

    public static int[] sumaArrays(int[] a, int[] b){
        int[] array = new int[a.length];
        for(int i=0; i<array.length; i++){
            array[i] = a[i] + b[i];
        }
        return array;
    }

    public static int[] juntarArrays(int[] a, int[] b){
        int[] array = new int[a.length + b.length];
        for(int i=0; i<array.length; i++){
            if(i<a.length){
                array[i] = a[i];
            }
            else {
                array[i] = b[i - a.length];
            }
        }
        return array;
    }

    public static int[] zipArrays(int[] a, int[] b){
        int[] array = new int[a.length + b.length];
        for(int i=0; i<array.length; i++){
            if(i%2==0){
                array[i] = a[i/2];
            }
            else {
                array[i] = b[i/2];
            }
        }
        return array;
    }

    public static void ordenaArrayAsc(int[] a){
        boolean canvis;
        do {
            canvis = false;
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    canvis = true;
                }
            }
        }while(canvis);
    }
}
