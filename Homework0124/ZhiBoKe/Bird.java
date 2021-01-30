package Homework0124.ZhiBoKe;

public class Bird extends Animal implements IRunning ,IFlying{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void run(){
        System.out.println(name+"用两条腿在跑！");
    }

    @Override
    public void fly(){
        System.out.println(name+"正在飞！");
    }
}
