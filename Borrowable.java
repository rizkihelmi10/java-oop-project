// - *Borrowable (Interface)*
//   - Method: borrowBook(Book book), returnBook(Book book)

import book.Book;

public class Borrowable {
    public void borrowBook(Book book) {
        if (book.getAvailableCopies() > 0) {
            book.borrowBook();
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    public void returnBook(Book book) {
        book.returnBook();
        System.out.println("Book returned successfully.");
    }

}
