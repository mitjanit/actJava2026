package funcions;

public class FuncionsAmbRetorn {

    public static void main(String[] args) {

        int resultat = sumaDosNumeros(3, 7);
        System.out.println("Suma: " + resultat);

        float preu = afegirIVA(100);
        System.out.println("Preu amb IVA: " + preu);

        float preu2 = afegirIVA2(100, 17);
        System.out.println("Preu amb IVA (17%): " + preu2);

        String nom = "paco";
        System.out.printf("El nom %s en majúscules és %s.", nom, enMajuscules(nom));
    }

    public static int sumaDosNumeros(int a, int b){
        int s = a + b;
        return s;
    }

    public static float afegirIVA(float p){
        float pIva = p * 1.21f;
        return  pIva;
    }

    public static float afegirIVA2(float p, float iva){
        float pIva = p * (1 + iva / 100);
        return pIva;
    }

    public static boolean esParell(int n){
        if(n%2==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static String enMajuscules(String s){
        return s.toUpperCase();
    }
}
