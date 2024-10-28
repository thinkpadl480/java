class Book {
    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private double fileSize; // in MB

    public EBook(String title, String author, double fileSize) {
        super(title, author); // Call to the parent class constructor
        this.fileSize = fileSize;
    }

    public void printDetails() {
        super.printDetails(); // Call to the parent class method
        System.out.println("File Size: " + fileSize + " MB");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        EBook ebook = new EBook("Java Programming", "John Doe", 1.5);
        ebook.printDetails();
    }
}
