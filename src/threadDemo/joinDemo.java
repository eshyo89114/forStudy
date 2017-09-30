package threadDemo;

public class joinDemo extends Thread {
    public joinDemo(String name){
        super(name);
    }

    public void run(){
        for(int i = 0;i<100;i++){
            System.out.println(getName()+":"+i);
        }
    }

    public static void main(String[] args){
        for(int i = 0;i<100;i++){
            if(i==20){
                joinDemo demo = new joinDemo("被join线程");
                try{
                    demo.start();
                    demo.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

            System.out.print(Thread.currentThread().getName()+";"+i);
        }
    }
}
