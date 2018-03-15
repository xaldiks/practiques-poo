package laboratori3.apartat1;

import java.util.Scanner;

public class InverteixCadena {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String input, aux, output;

        System.out.println("Introdueix el text a invertir:");
        input = lector.nextLine();
        aux = input.toLowerCase();
        output = "";

        for (int i = input.length()-1; i >= 0; i--) {
            output = output + aux.charAt(i);
        }
        System.out.println(output);
    }
}
