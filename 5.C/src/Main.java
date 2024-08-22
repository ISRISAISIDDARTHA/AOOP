public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Alibaba & the 40 thieves", "F. Scott Fitzgerald", "1234567890");
        Member member1 = new Member("Alice", "M001");

        library.addBook(book1);
        library.registerMember(member1);

        library.borrowBook("M001", "1234567890");
        library.returnBook("M001", "1234567890");
    }
}
