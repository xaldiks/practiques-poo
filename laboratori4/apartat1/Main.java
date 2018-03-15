package laboratori4.apartat1;

public class Main {

  public static void main(String args[]) {
    Main program = new Main();
    program.start();
  }

  public void start() {
    //PAS B: Atributs + constructor declarats
    ComplexNumber c1 = new ComplexNumber(1.0,2.0);
    ComplexNumber c2 = new ComplexNumber(2.0,-3.0);

    //PAS C: Constant ZERO declarada
    ComplexNumber zero = ComplexNumber.ZERO;

    //PAS D: Mètodes accessors declarats
    System.out.println("Hem creat el Nombre Complex C1:");
    System.out.println("\t Part real = " + c1.getReal());
    System.out.println("\t Part imaginaria = " + c1.getImaginary());
    System.out.println("\nHem creat el Nombre Complex C2:");
    System.out.println("\t Part real = " + c2.getReal());
    System.out.println("\t Part imaginaria = " + c2.getImaginary());

    //PAS E: Suma declarada
    System.out.println("\nOperació de suma (C1 + ZERO):");
    ComplexNumber res = c1.add(ComplexNumber.ZERO);
    System.out.println("\t Part real = " + res.getReal());
    System.out.println("\t Part imaginaria = " + res.getImaginary());
    System.out.println("\nOperació de suma (C1 + C2):");
    res = c1.add(c2);
    System.out.println("\t Part real = " + res.getReal());
    System.out.println("\t Part imaginaria = " + res.getImaginary());

    //PAS F: toString declarat
    System.out.println("\nDarrera suma realitzada: ");
    System.out.print("(" + c1 + ") + (" + c2 + ") = (" + res + ")");
  }


}

