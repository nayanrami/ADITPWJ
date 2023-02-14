interface Library {
    public void issueBook(Book Book);

    public void retriveBook(Book book);

    public class Book {
        public void m2() {
            System.out.println("M2 Called..");
        }
    }
}

class LibraryDemo implements Library {

    @Override
    public void issueBook(Library.Book Book) {

    }

    @Override
    public void retriveBook(Library.Book book) {

    }

}

public class Demo1 {
    public static void main(String[] args) {

        LibraryDemo demo = new LibraryDemo();
        demo.issueBook(new Library.Book());

        Library.Book book = new Library.Book();
        book.m2();

    }
}
