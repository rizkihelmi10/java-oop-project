import java.util.ArrayList;
import java.util.List;
import book.Book;
import member.Member;
import member.StaffMember;
import library.Library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book(1, "Buku Pintar Islam", "Khalid", 3);
        Book book2 = new Book(2, "Hadist-hadist pilihan", "Mizan", 2);
        Book book3 = new Book(3, "Algoritma", "Unpas Programming", 1);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        List<Book> Naruto = new ArrayList<>();
        Naruto.add(book1);
        Naruto.add(book2);
        List<Book> Sasuke = new ArrayList<>();
        Sasuke.add(book3);
        List<Book> Rin = new ArrayList<>();
        Rin.add(book3);
        Member member1 = new Member(101, "Naruto", Naruto);
        Member member2 = new Member(102, "Sasuke", Sasuke);
        StaffMember staff1 = new StaffMember(103, "Rin", "Librarian", Rin);
        ;

        library.registerMember(member1);
        library.registerMember(member2);
        library.registerMember(staff1);

        System.out.println("Initial Library State:");
        library.displayAvailableBooks();

        System.out.println("\n=== Borrowing Operations ===");
        member1.borrowBook(book1);
        member2.borrowBook(book2);

        library.displayAvailableBooks();

        System.out.println("\n=== Returning Operations ===");
        member1.returnBook(book1);

        library.displayAvailableBooks();

        System.out.println("\n=== Staff Borrowing Privileges ===");
        staff1.borrowBook(book3);

        member2.borrowBook(book3);

        // Display member information
        System.out.println("\n=== Member Information ===");
        member1.displayInfo();
        member2.displayInfo();
        staff1.displayInfo();
    }
}
