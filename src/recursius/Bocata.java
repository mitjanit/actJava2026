package recursius;

public class Bocata {

    public static void main(String[] args) {
        String bocata = "Bocatademortadela";
        menjar(bocata);
    }

    public static String mossegar(String s){
        int n = (int)(Math.random() * 3 + 1);
        return s.substring(0, n);
    }

    public static boolean esTragable(String s){
        return s.length() <=4;
    }

    public static void tragar(String s){
        System.out.print(s);
        System.out.println(" Ñam!!");
    }

    public static String llevar(String b, String t){
        return b.replaceFirst(t, "");
    }

    public static void menjar(String bocata){
        if(esTragable(bocata)){
            tragar(bocata);
        }
        else {
            String boci = mossegar(bocata);
            String resta =llevar(bocata, boci);
            menjar(boci);
            menjar(resta);
        }
    }
}
