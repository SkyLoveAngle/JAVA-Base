package Homework0126.BookSystem.opertion;
import Homework0126.BookSystem.BookList;

public class DisplayOperation implements IOperation {
    //显示书籍列表
    @Override
    public void work(BookList bookList) {
        System.out.println("显示书籍列表！");
        for (int i = 0; i < bookList.getSize(); i++) {
            System.out.println(bookList.getBook(i));
        }
    }
}
