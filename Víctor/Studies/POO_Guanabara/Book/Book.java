package Víctor.Studies.POO_Guanabara.Book;

public class Book {
    String Book_Name;
    String Autor;
    String Editor;
    String Type;
    int pag;
    float price;
    boolean book_closed;

    void status() {
        System.out.println("Book name: " + this.Book_Name);
        System.out.println("Autor: " + this.Autor);
        System.out.println("Editor: " + this.Editor);
        System.out.println("Type: " + this.Type);
        System.out.println("Number pages: " + this.pag);
        System.out.println("Price: " + this.price);
        System.out.println("Closed? " + this.book_closed);
    }

    void read(){
        if (this.book_closed == true) {
            System.out.println("Please, open this book for me look.");
        } else {
            System.out.println("Great book, i buy.");
        }
    }

    void closed() {
        this.book_closed = true;
    }

    void open() {
        this.book_closed = false;
    }
}
