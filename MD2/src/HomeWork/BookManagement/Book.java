package HomeWork.BookManagement;

public class Book {
    private int id = 1;
    private static int idNumber = 1;
    private String name;
    private String createTime;
    private String author;
    private String language;
    private int quantity;

    public Book() {
    }

    public Book(String name, String createTime, String author, String language, int quantity) {
        this.id = idNumber++;
        this.name = name;
        this.createTime = createTime;
        this.author = author;
        this.language = language;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
