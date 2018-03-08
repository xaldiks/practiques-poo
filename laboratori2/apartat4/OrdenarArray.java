package laboratori2.apartat4;

public class OrdenarArray {
    public static void main (String args[]) {
        int longitud = 10;
        int cont = 0;
        long num = System.nanoTime()%20+1;
        long[] arrayEnters = new long[longitud];
        long aux;

        for (int i = 0; i < longitud; i++) {
            arrayEnters[i] = System.nanoTime()%20+1;
            if (arrayEnters[i] > num) cont++;
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
    }
}
