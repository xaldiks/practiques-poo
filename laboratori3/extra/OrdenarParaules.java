package laboratori3.extra;

import java.util.Scanner;

public class OrdenarParaules {
    public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix les paraules a ordenar:");
        String input = lector.nextLine();
        String[] paraulesIn = input.split(" ");
        String aux;

        for (int i = 0; i < paraulesIn.length; i++) {
            for (int j = 0; j < paraulesIn.length; j++) {
                if (paraulesIn[i].compareToIgnoreCase(paraulesIn[j]) < 0) {
                    aux = paraulesIn[i];
                    paraulesIn[i] = paraulesIn[j];
                    paraulesIn[j] = aux;
                }
            }

        }

        for (int i = 0; i < paraulesIn.length; i++) {
            System.out.println(paraulesIn[i]);
        }
    }
}
