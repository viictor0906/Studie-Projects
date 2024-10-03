package Studies.POO_Guanabara.Book;

public class Book {
    public String book_name;
    public String autor;
    public String editor;
    public String type;
    private int pag;
    private float price;
    protected boolean book_closed;

    public void status() {
        System.out.println("Book Name: " + this.book_name);
        System.out.println("Autor: " + this.autor);
        System.out.println("Editor: " + this.editor);
        System.out.println("Type: " + this.type);
        System.out.println("Number Pages: " + this.pag);
        System.out.println("Price: " + this.price);
        System.out.println("Closed? " + this.book_closed);
    }

    void num_info() {
        this.pag = 911;
        this.price = 111.50f;
    }
    
    void read() {
        if (this.book_closed == true) {
            System.out.println("Please, open this book for me look.");
        } 
        else {
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