package Homework0124.ZhiBoKe;

public class Cat extends Animal implements IRunning{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(){
        System.out.println(name+"用四条腿在跑！");
    }
}
