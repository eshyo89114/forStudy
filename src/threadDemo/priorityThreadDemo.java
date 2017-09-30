package threadDemo;

public class priorityThreadDemo extends Thread {
    public priorityThreadDemo(String name){
        super(name);
    }

    public void run(){
        for(int i=0;i<50 ;i++){
            System.out.println(getName() + i);
        }
    }

    public static void main(String[] args){
        priorityThreadDemo thread1 = new priorityThreadDemo("thread1-MAX:");
        thread1.setPriority(MAX_PRIORITY);
        thread1.start();
        priorityThreadDemo thread2 = new priorityThreadDemo("thread2-MIN:");
        thread2.setPriority(MIN_PRIORITY);
        thread2.start();
    }
}
