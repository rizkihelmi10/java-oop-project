// *StaffMember*
//   - Inherits from Member
//   - Additional Attributes: position (e.g., Librarian, Assistant)
//   - Override borrowBook() to allow staff to borrow more books than regular members.

package member;

import java.util.List;

import book.Book;

public class StaffMember extends Member {
    private String position;

    public StaffMember(int memberId, String name, String position, List<Book> borrowedBooks) {
        super(memberId, name, borrowedBooks);
        this.position = position;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.getAvailableCopies() > 0) {
            borrowedBooks.add(book);
            book.borrowBook();
            System.out.println("Book borrowed successfully by staff member.");
        } else if (position.equals("Librarian")) {
            borrowedBooks.add(book);
            book.borrowBook();
            System.out.println("Book borrowed by librarian with special privileges.");
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return super.toString() + ", Position: " + position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
