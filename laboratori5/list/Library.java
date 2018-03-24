package laboratori5.list;

import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import laboratori5.utils.Book;

public class Library {

  private Scanner lector = new Scanner(System.in);

  public static void main (String[] args) {
    Library programa = new Library();
    programa.start();
  }

  public void start() {
    boolean executar = true;

    //FER: Per evitar confusions, poseu un títol dient el contenidor usat i declarar-lo.
    System.out.println("Biblioteca amb ArrayList.");
    ArrayList<Book> llibres = new ArrayList<Book>();

    while (executar) {
      String text = llegirText("Comanda> ");
      String[] comanda = text.split(" ");
      switch(comanda.length) {
        case 1:
          if ("fi".equalsIgnoreCase(comanda[0])) {
            executar = false;
          } else if ("alta".equalsIgnoreCase(comanda[0])) {
            String nom = llegirText("Nom: ");
            String autor = llegirText("Autor: ");
            String isbn = llegirText("ISBN: ");

            //FER: Afegir l'element al contenidor

            llibres.add(new Book(nom,autor,isbn));

            //Els atributs del llibre ja estan a "nom", "autor" i "isbn"
            

            System.out.println("Alta finalitzada.");

          } else if ("llista".equalsIgnoreCase(comanda[0])) {

            //FER: Mostrar tots els elements per pantalla
              Iterator<Book> it = llibres.iterator();
              while (it.hasNext()) {
                  Book b = it.next();
                  System.out.println(b);

              }

          } else {
            System.out.println("Comanda incorrecta.");
          }
          break;
        case 2:
          if ("cerca".equalsIgnoreCase(comanda[0])) {
              for (Book b:llibres) {
                  if (b.getIsbn().equalsIgnoreCase(comanda[1])) {
                      System.out.println(b);
                  }

              }

            //FER: Cerca l'element i mostrar-lo per pantalla

            //Recordar que l'ISBN escrit pel teclat ja està a "comanda[1]"

          } else {
            System.out.println("Comanda incorrecta.");
          }
          break;
        default:
          System.out.println("Comanda incorrecta.");
      }
    }
    System.out.println("Programa finalitzat");
  }

  /** Llegeix una línia de text des del teclat, garantint que no s'escriu
   * una línia simplement en blanc (ha de tenir algun caràcter vàlid).
   *
   * @param msg Missatge que es mostra a l'usuari
   * @return Text llegit
   */
  private String llegirText(String msg) {
    String text = null;
    while (text == null) {
      System.out.print(msg);
      text = lector.nextLine();
      text = text.trim();
      if (text.matches("[ ]*")) {
        System.out.println("No has escrit res.");
        text = null;
      }
    }
    return text;
  }

}
