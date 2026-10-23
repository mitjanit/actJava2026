package funcions;

public class PasParametres2 {

    public static void main(String[] args) {
        String s = "hola";
        System.out.println("S (main 1): " + s);
        majuscules(s);
        System.out.println("S (main 2): " + s);
    }

    public static void majuscules(String s){
        System.out.println("S (funció 1): " + s);
        s = s.toUpperCase();
        System.out.println("S (funció 2): " + s);
    }
}
