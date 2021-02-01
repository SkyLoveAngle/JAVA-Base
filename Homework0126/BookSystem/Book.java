package Homework0126.BookSystem;

//Book类用来表示一本书的信息。
//这些信息通过Book类的属性来说明。
public class Book {
    //为了实现好封装效果，原则是，能够用private修饰尽量使用private。
    private String name;
    private String author;
    private double price;
    private String type;
    private boolean isBorrowed = false;

    //使用构造方法针对这些私有成员进行初始化。
    public Book(String name, String author, double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    //此处如果不重写toString方法的话，此时println的时候调用的是Object类的toString，
    // 这会使得打印出的内容是一个hashcode
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }

    public String getName() {
        return name;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}