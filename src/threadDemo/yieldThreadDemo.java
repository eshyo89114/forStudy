package threadDemo;

public class yieldThreadDemo extends Thread{
    public yieldThreadDemo(String name){
        super(name);
    }

    public void run(){
        for(int i = 0;i<50;i++){
            System.out.println(getName()+i);
            if(i == 20){
                Thread.yield();
            }
        }
    }

    public static void main(String[] args){
        yieldThreadDemo thread1= new yieldThreadDemo("thread1:");
        thread1.start();
        yieldThreadDemo thread2 = new yieldThreadDemo("thread2:");
        thread2.start();
    }
}
