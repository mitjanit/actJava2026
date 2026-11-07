package arrays;

public class FuncionsArrays3 {

    public static void main(String[] args) {

        int[] a = {3, 7, 1, 9, 4, 6};

        System.out.println("Extend d'Array (versió 1): ");
        ExemplesArrays.imprimirArray(extendArray(a));

        System.out.println("\nExtend d'Array (versió 2): ");
        ExemplesArrays.imprimirArray(extendArray2(a));
    }


    public static int[] extendArray(int[] nums){
        int minim = ExemplesArrays.minimArray(nums);
        int maxim = ExemplesArrays.maximArray(nums);
        int[] array = {minim, maxim};
        return array;
    }


    public static int[] extendArray2(int[] nums){
        int minim = nums[0];
        int maxim = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] < minim){
                minim = nums[i];
            }
            if(nums[i] > maxim){
                maxim = nums[i];
            }
        }
        int[] array = {minim, maxim};
        return array;
    }
}
