package arrays;

public class FuncionsArrays {

    public static void main(String[] args) {
        ExemplesArrays.imprimirArray(numsEntre(1, 6));
        System.out.println();
        int[] copia = copiarArray(numsEntre(2, 8));
        ExemplesArrays.imprimirArray(copia);
        System.out.println();
        ExemplesArrays.imprimirArray(reverseArray(copia));
    }

    public static int[] numsEntre(int a, int b){
        int[] array = new int[b-a+1];  // 1) Crea array de llargada adequada
        for(int i=0; i<array.length; i++){  //2) Emplenar caselles
            array[i] = a + i;
        }
        return array;  // 3) Retorna l'array
    }

    public static int[] copiarArray(int[] nums){
        int[] array = new int[nums.length];
        for(int i=0; i<array.length; i++){
            array[i] = nums[i];
        }
        return array;
    }

    public static int[] reverseArray(int[] nums){
        int[] array = new int[nums.length];
        for(int i=0; i<array.length; i++){
            array[i] = nums[nums.length - 1 - i];
        }
        return array;
    }

    public static int[] subArray(int[] nums, int a, int b){
        int[] array = new int[b-a+1];
        for(int i=0; i<array.length; i++){
            array[i] = nums[a+i];
        }
        return array;
    }
}
