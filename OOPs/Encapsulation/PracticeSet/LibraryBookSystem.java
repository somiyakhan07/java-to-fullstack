// Library Book System** – Create `issueBook()` and `returnBook()` methods. 
// A book should not be issued again if it is already issued. 
// After the book is returned, it should become available for issuing again.

class Book { // create book class
    private String bookTitle; // private variables
    private String author;
    private boolean isAvailable;

    public Book(String bookTitle, String author) { //Parameterized constructor
        this.bookTitle = bookTitle;
        this.author = author;
        this.isAvailable = true;
    }

    public String getBookTitle() { // fetch book title
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) { // set book title in private variable
        this.bookTitle = bookTitle;
    }

    public String getAuthor() { // fetch author name
        return author;
    }

    public void setAuthor(String author) { // set author name in private variable
        this.author = author;
    }

    public boolean isAvailable() { // fetch book status
        return isAvailable;
    }

    public void issueBook() { // issued book method
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book issued successful");
        } else {
            System.out.println("Book is already issued");
        }
    }

    public void returnBook() { // returned book method
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned successfully");
        } else {
            System.out.println("Book is already available");
        }
    }

}

public class LibraryBookSystem { // main class
    public static void main(String[] args) { // main method
        Book b1 = new Book("Doraemon", "mira"); // create book object b1
        System.out.println("Book Title: "+ b1.getBookTitle()); // diplay book title 
        System.out.println("Author Name: "+ b1.getAuthor()); // display author name
        System.out.println("Book Status: " + b1.isAvailable()); // display book status
        b1.issueBook(); // display issued book 
        b1.returnBook(); // display returned book
        System.out.println("Book Status After Return: " + b1.isAvailable());
    }

}

/* output:
Book Title: Doraemon
Author Name: mira
Book Status: true
Book issue is successful
Book returned successfully
Book Status After Return: true
 */