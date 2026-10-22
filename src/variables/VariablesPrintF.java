package variables;

public class VariablesPrintF {

    public static void main(String[] args) {

        String nom = "Toni", llinatge = "Ramirez";
        int edat = 49;
        float altura = 1.82f;
        char grup = 'A';
        boolean majorEdat = true;

        System.out.printf("Hola!%nSom en %s %s.%nTenc %d anys.%n", nom, llinatge, edat);
        System.out.printf("Medeixo %f metres i tenc grup sanguini %c.%n", altura, grup);
        System.out.printf("Som major d'edat? %b", majorEdat);
    }
}
