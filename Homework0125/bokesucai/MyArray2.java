package Homework0125.bokesucai;

public class MyArray2<E> {
//public class MyArray2<E extends Animal> {
    //extends对当前泛型类型加上了一个限制


    //泛型版本，实现刚才的数组封装
    //类名后面就需要加上<E>泛型参数。<>表示当前这个类是一个泛型类。
    //E相当于是一个形参，表示某一种具体的类型，会在实例化的时候确定E具体是哪一种类型。
    private E[] data = null;
    private  int size =0;
    private  int capacity =10;

    public MyArray2(){
        //由于E这种类型那个不确定，无法直接创建E的实例，下面这种写法是错误的，编译不会通过。
       // data = new E[capacity];
        //创建Object类型的数组，因为Object类型是所有类型的父类，无论E是哪个类型，
        //然后再强制类型转换成了E()类型。
        data =(E[])new Object[capacity];
    }

    //add()方法的参数也是一个E类型的引用，会根据前面的E进行具体确定。
    public void add(E data){
        if(size>=capacity){
            return;
        }
        this.data[size++] = data;
    }
    //
    public E get(int index){
        return this.data[index];
    }

    public static void main(String[] args) {
        //此处创建了一个泛型实例，具体类型为String类型。
        MyArray2<String> myArray2 = new MyArray2<String>();
        myArray2.add("Hello");
        myArray2.add("World");
        //此时我们进行获取元素的时候就不需要进行元素转换了。
        String str = myArray2.get(0);

        MyArray2<Integer> myArray3 = new MyArray2<>();
        myArray3.add(10);
        myArray3.add(20);
        Integer ret =myArray3.get(0);

       // MyArray2<Animal> a1=;
    }
}
