package recursius;

public class NumAs {

    public static void main(String[] args) {
        String s = "Abracadabra";
        System.out.printf("Num As de %s és %d.%n", s, numAs(s));
        System.out.printf("Num As de %s és %d.%n", s, numAsR(s));
    }

    public static int numAs(String s){
        int n = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='a'){
                n++;
            }
        }
        return n;
    }

    public static int numAsR(String s){
        if(s.length()==1 && (s.charAt(0)=='A'|| s.charAt(0)=='a')){
            return 1;
        }
        else if(s.length()==1 && (s.charAt(0)!='A' || s.charAt(0)=='a')){
            return 0;
        }
        else {
            String primera = String.valueOf(s.charAt(0));
            String subparaula = s.substring(1);
            return numAs(primera) + numAs(subparaula);
        }
    }
}
