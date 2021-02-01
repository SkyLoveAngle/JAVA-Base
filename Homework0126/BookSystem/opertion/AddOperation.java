package Homework0126.BookSystem.opertion;
import Homework0126.BookSystem.Book;
import Homework0126.BookSystem.BookList;
import java.util.Scanner;

public class AddOperation implements IOperation{
    //实现增加某本书籍的信息。
    @Override
    public void work(BookList bookList){
        System.out.println("即将执行增加书籍操作！（请按提示操作）");

        System.out.println("请输入新的书籍的名称: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("请输入新的书籍的作者: ");
        String author = scanner.next();

        System.out.println("请输入新的书籍的价格: ");
        double price = scanner.nextDouble();

        System.out.println("请输入新的书籍的类别: ");
        String type = scanner.next();

        Book newBook = new Book(name, author, price, type);
        // 把这本新的书放到 BookList 的末尾即可。
        int curSize = bookList.getSize();
        //调用set方法，在BookList数组末尾进行插入新书的信息
        bookList.setBook(curSize, newBook);
        //每插入一本新书，将BookList当前容量进行增加，以便下一次增加。
        bookList.setSize(curSize + 1);

        System.out.println("新增书籍成功!");
    }
}
