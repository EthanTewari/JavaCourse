package pack2;

public class CollegeLibrary extends Library {
    private String college;

    public CollegeLibrary(String college, String name, int bookCount) {
        super(name, bookCount);
        this.college = college;
    }

    public void lendBook(String title, int stdId) {
        boolean found = false;
        for (String book : books) {
            if (book.equals(title)) {
                found = true;
                break;
            }

        }
        if (found) {
            System.out.println(title + " was lent to " + stdId);
        } else {

            System.out.println(title + "not available");

        }
    }

    public static void main(String[] args) {
        CollegeLibrary cl = new CollegeLibrary("ABC", "Mishra Ji", 20);
        cl.addbook(0, "Legion");
        cl.addbook(1, "Natraj");
        cl.addbook(2, "KhooniDarinda");
        cl.addbook(3, "maut se takkar");
        cl.showBook();
        cl.lendBook("KhooniDarinda", 2021);
    }
}
