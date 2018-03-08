package laboratori2.extra;

public class OrdenarArray {
    public static void main (String args[]) {
        int longitud = 75;
        int cont = 0;
        int afegeix = 0;
        long num = System.nanoTime()%30+1;
        long random;
        long[] arrayEnters = new long[longitud];
        long aux;

        while (afegeix < longitud) {
            random = (System.nanoTime()%30) + 1;
            if (random % 2 != 0) {
                arrayEnters[afegeix] = random;
                if (arrayEnters[afegeix] > num) cont++;
                afegeix++;
            }
        }

        System.out.print("Array inicial: [");
        for (int i = 0; i < arrayEnters.length - 1; i++) {
            System.out.print(arrayEnters[i] + ", ");
        }
        System.out.println(arrayEnters[arrayEnters.length - 1] + "]");

        for (int i = 0; i < arrayEnters.length; i++) {
            for (int j = 0; j < arrayEnters.length; j++) {
                if (arrayEnters[i] < arrayEnters[j]) {
                    aux = arrayEnters[i];
                    arrayEnters[i] = arrayEnters[j];
                    arrayEnters[j] = aux;

                }
            }
        }

        System.out.print("Array ordenat: [");
        for (int i = 0; i < arrayEnters.length - 1; i++) {
            System.out.print(arrayEnters[i] + ", ");
        }
        System.out.println(arrayEnters[arrayEnters.length - 1] + "]");
        System.out.println("Hi ha " + cont + " números més grans que " + num);
        System.out.println("Mínim: " + arrayEnters[0]);
        System.out.println("Màxim: " + arrayEnters[longitud - 1]);
        System.out.println("Mediana: " + arrayEnters[longitud / 2 + 1]);
        // Moda
        // Mitjana
        // Comparar
    }
}
