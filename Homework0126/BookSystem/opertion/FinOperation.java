package Homework0126.BookSystem.opertion;
import Homework0126.BookSystem.BookList;
import java.util.Scanner;

public class FinOperation implements IOperation{
    //实现查找某本书籍的信息。
    @Override
    public void work(BookList bookList){
        System.out.println("查阅书籍！");
        // 让用户输入书名, 来进行查找
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的书名: ");
        String name = scanner.next();
        // 循环遍历书籍列表
        for (int i = 0; i < bookList.getSize(); i++) {
            // 此处不使用 equals, 而是使用 contains.比如输入一个“西”，就可以查到“西游记”
            if (bookList.getBook(i).getName().contains(name)) {
                System.out.println(bookList.getBook(i));
            }
        }
    }
}
