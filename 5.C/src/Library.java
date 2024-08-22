import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;
    private Notification notificationService;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.notificationService = new EmailNotification();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public boolean borrowBook(String memberId, String isbn) {
        Member member = findMember(memberId);
        Book book = findBook(isbn);
        if (member != null && book != null && member.borrowBook(book)) {
            notificationService.notify(member.getName() + " borrowed " + book.getTitle());
            return true;
        }
        return false;
    }

    public boolean returnBook(String memberId, String isbn) {
        Member member = findMember(memberId);
        Book book = findBook(isbn);
        if (member != null && book != null && member.returnBook(book)) {
            notificationService.notify(member.getName() + " returned " + book.getTitle());
            return true;
        }
        return false;
    }

    private Book findBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    private Member findMember(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }
}
