# *Java OOP Exercise: Library Management System*

## *Objective*
Build a simple *Library Management System* using *Object-Oriented Programming (OOP) principles* in Java. This system should allow users to manage books, members, and basic library operations.

---

## *Requirements*
- *Book*
  - Attributes: bookId, title, author, availableCopies
  - Methods: borrowBook(), returnBook(), toString()

- *Member*
  - Attributes: memberId, name, borrowedBooks (List<Book>)
  - Methods: borrowBook(Book book), returnBook(Book book), toString()

- *Library*
  - Attributes: books (List<Book>), members (List<Member>)
  - Methods: addBook(Book book), registerMember(Member member), findBookByTitle(String title), displayAvailableBooks()

---

- *StaffMember*
  - Inherits from Member
  - Additional Attributes: position (e.g., Librarian, Assistant)
  - Override borrowBook() to allow staff to borrow more books than regular members.

---

- *Person*
  - Attributes: id, name
  - Abstract Method: displayInfo()
- *Borrowable (Interface)*
  - Method: borrowBook(Book book), returnBook(Book book)

Member and StaffMember should implement Borrowable.

---

### *4. Implementation Details*
- Create a *main program* (LibraryApp.java) where:
  1. Books and members are added to the library.
  2. A member borrows and returns a book.
  3. The system displays available books.
  4. Staff members have special borrowing privileges.

---

### *Bonus Challenge*
- Implement *Exception Handling* for cases like:
  - Borrowing a book that is not available.
  - Returning a book not borrowed.  