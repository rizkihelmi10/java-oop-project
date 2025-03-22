// ## *Requirements*
// - *Book*
//   - Attributes: bookId, title, author, availableCopies
//   - Methods: borrowBook(), returnBook(), toString()

package book;

public class Book {
    private int bookId;
    private String title;
    private String author;
    public int availableCopies;

    public Book(int bookId, String title, String author, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public void borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    public void returnBook() {
        availableCopies++;
        System.out.println("Book returned successfully.");
    }

    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Available Copies: "
                + availableCopies;
    }

}
