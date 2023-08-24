
public class Main {
    public static void main(String[] args) {
        Author author = new Author("John Bruno Valderman", "valbruno77@gmail.com", true);
        Book book = new Book("War and Piece", author, 10, 10000);

        System.out.println(book.toString());
    }
}