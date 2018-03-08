package laboratori3.apartat2;

import java.util.Scanner;

public class GeneradorAcronims {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introdueix una sèrie de paraules:");
        String input = lector.nextLine();
        String aux = "";

        String[] paraules = input.split(" ");

        for (int i = 0; i < paraules.length; i++) {
            aux = aux + paraules[i].charAt(0);
        }

        String output = aux.toUpperCase();
        System.out.println(output);
    }
}
