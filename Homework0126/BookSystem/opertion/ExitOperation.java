package Homework0126.BookSystem.opertion;
import Homework0126.BookSystem.BookList;

public class ExitOperation implements IOperation {
    //实现退出系统操作。
    @Override
    public void work(BookList bookList) {
        System.out.println("感谢使用，您已成功退出系统！");
        // 通过这里的 exit 方法就可以直接结束当前程序(结束了当前 jvm 对应的 java 进程)。
        System.exit(0);
        //此处参数0表示进程的退出码，进程正常执行完毕就使用0，非正常退出用非0值。
    }
}
