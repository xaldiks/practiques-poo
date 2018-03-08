package laboratori3.extra;

import java.util.Scanner;

public class EndevinarParaula {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int comptador = 1;

        String secreta = "patata";
        System.out.println("Introdueix la teva deducció:");
        String input = lector.nextLine();

        while (!input.equalsIgnoreCase(secreta)) {
            if (input.compareToIgnoreCase(secreta) > 0) {
                System.out.println("La paraula secreta és més petita.");
            }
            else if (input.compareToIgnoreCase(secreta) < 0) {
                System.out.println("La paraula secreta és més gran.");
            }
            input = lector.nextLine();
            comptador++;
        }
        System.out.println("Enhorabona! Has encertat la paraula amb " + comptador + " intents.");
    }
}
