package laboratori5.utils;

public class Book {
    private String name;
    private String author;
    private String isbn;

    public Book (String name, String author, String isbn){
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }
    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String toString() {
        String output = "Títol: " + this.name + "; Autor: " + this.author + "; ISBN: " + this.isbn;
        return output;
    }
}
