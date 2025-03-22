// - *Member*
//   - Attributes: memberId, name, borrowedBooks (List<Book>)
//   - Methods: borrowBook(Book book), returnBook(Book book), toString()

package member;

import java.util.List;
import book.Book;

public class Member {
    protected int memberId;
    protected String name;
    protected List<Book> borrowedBooks;

    public Member(int memberId, String name, List<Book> borrowedBooks) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.getAvailableCopies() > 0) {
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

    public void displayInfo() {
        System.out.println("Member ID: " + memberId + ", Name: " + name);
        System.out.println("Borrowed Books: " + borrowedBooks.size());
    }

}
