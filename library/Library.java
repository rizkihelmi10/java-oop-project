// *Library*
// - Attributes: books (List<Book>), members (List<Member>)
// - Methods: addBook(Book book), registerMember(Member member), findBookByTitle(String title), displayAvailableBooks()

package library;

import java.util.ArrayList;
import java.util.List;
import book.Book;
import member.Member;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayAvailableBooks() {
        System.out.println("\n=== Available Books ===");
        for (Book book : books) {
            if (book.getAvailableCopies() > 0) {
                System.out.println(book);
            }
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Member> getMembers() {
        return members;
    }
}
