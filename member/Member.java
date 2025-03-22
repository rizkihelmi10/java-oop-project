// - *Member*
//   - Attributes: memberId, name, borrowedBooks (List<Book>)
//   - Methods: borrowBook(Book book), returnBook(Book book), toString()

package member;

import java.util.List;
import book.Book;

public class Member {
    private int memberId;
    private String name;
    private List<Book> borrowedBooks;

    public void borrowBook(Book book) {
        if (book.availableCopies > 0) {
            borrowedBooks.add(book);
            book.borrowBook();
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("You did not borrow this book.");
        }
    }

    public String toString() {
        return "Member ID: " + memberId + ", Name: " + name;
    }

}
