constoverloading
class Book {
    String title;
    String author;
    int pages;

    Book() {
        title = "Unknown";
        author = "Unknown";
        pages = 0;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }
}

public class constoverloading {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Java Basics", "John Doe");
        Book book3 = new Book("Advanced Java", "Jane Doe", 400);

        book1.display();
        book2.display();
        book3.display();
    }
}
