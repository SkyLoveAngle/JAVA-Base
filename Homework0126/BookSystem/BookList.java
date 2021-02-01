package Homework0126.BookSystem;
//通过这个类我们可以将多个Book对象组织起来。
public class BookList {
    //创建一个Book类型数组用来存放Book对象。
    //此处的100相当于BookList的capacity（最大容量）。
    private Book[] books = new Book[100];
    //size代表当前BooList中书籍的数量。
    private int size = 0;

    //如果用private修饰构造方法，那么此时在类的外部就无法new这个类的实例了。
    public BookList() {
        books[0] = new Book("《三国演义》", "罗贯中", 80, "古典小说");
        books[1] = new Book("《西游记》", "吴承恩", 90, "古典小说");
        books[2] = new Book("《水浒传》", "施耐庵", 100, "古典小说");
        books[3] = new Book("《红楼梦》", "曹雪芹", 110, "古典小说");
        size = 4;
    }

    //后面我们需要针对其中的某一本书进行操作。
    //获取一本书的方法。
    public Book getBook(int index) {
        return books[index];
    }

    //设置一本书的相关信息的方法。
    public void setBook(int index, Book book) {
        books[index] = book;
    }


    // 使用 alt + insert 也能生成 getter 和 setter 方法
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //虽然有些代码成员是private修饰的，但是不意味着外部就完全不能用，我们可以通过
    //调用public修饰的方法来间接地获取/操作这样的属性。
    //getter和setter方法就是这样的作用。
}
