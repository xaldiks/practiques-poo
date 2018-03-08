package laboratori3.apartat3;

import java.util.Scanner;

public class TractarString {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ordre> ");
        String input = lector.nextLine();
        String[] paraules = input.split(" ");

        while (!input.equalsIgnoreCase("fi")) {

            if (paraules[0].equalsIgnoreCase("mida") && paraules.length == 2) {
                System.out.println(paraules[1].length());
            } else if (paraules[0].equalsIgnoreCase("maj") && paraules.length == 2) {
                System.out.println(paraules[1].toUpperCase());
            } else if (paraules[0].equalsIgnoreCase("min") && paraules.length == 2) {
                System.out.println(paraules[1].toLowerCase());
            } else if (paraules[0].equalsIgnoreCase("cmp") && paraules.length == 3) {
                if (paraules[1].compareTo(paraules[2]) < 0) {
                    System.out.println("La paraula " + paraules[1] + " apareix abans en un diccionari.");
                } else if (paraules[1].compareTo(paraules[2]) > 0) {
                    System.out.println("La paraula " + paraules[2] + " apareix abans en un diccionari.");
                } else {
                    System.out.println("Has introduït la mateixa paraula!");
                }
            } else {
                System.out.println("Ordre no vàlida.");
            }
            System.out.print("Ordre> ");
            input = lector.nextLine();
            paraules = input.split(" ");
        }
    }
}
