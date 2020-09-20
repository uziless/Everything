public class BookTest {
    public static void main(String[] args) {
        Book d1 = new Book(1840, 2, "Alice in wonderland");
        Book d2 = new Book(3000, 3 , "Crime and punishment");
        Book d3 = new Book(4);
        d3.setPages(4000);


        d1.infoBook();
        d2.infoBook();
        d3.infoBook();

    }
}
