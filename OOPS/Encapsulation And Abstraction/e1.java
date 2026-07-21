class Author {
    private String name;
    private String email;
    private char gender;
    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQtyInStock() {
        return qtyInStock;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}
public class e1 {
    public static void main(String[] args) {
        Author author = new Author(
                "J.K. Rowling",
                "jkrowling@gmail.com",
                'F');
        Book book = new Book(
                "Harry Potter",
                author,
                499.99,
                50);
        System.out.println("Book Name : " + book.getName());
        System.out.println("Author Name : " + book.getAuthor().getName());
        System.out.println("Author Email : " + book.getAuthor().getEmail());
        System.out.println("Author Gender : " + book.getAuthor().getGender());
        System.out.println("Price : " + book.getPrice());
        System.out.println("Quantity in Stock : " + book.getQtyInStock());
    }
}
