package pack2;

public class Library {
    private int bookCount;
    public String[] books = new String[100];
    public String librarian;

    public Library(String name, int count) {
        bookCount = count;
        librarian = name;
    }

    protected void addbook(int pos, String title) {
        books[pos] = title;

    }

    protected void showBook() {
        System.out.println("The Library has following books");
        for (String book : books) {
            if (book != null)
                System.out.println(">>" + book);
        }
    }

}
