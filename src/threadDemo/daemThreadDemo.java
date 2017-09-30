package threadDemo;

public class daemThreadDemo extends Thread {
    public static void main(String[] args){
        daemThreadDemo thread = new daemThreadDemo();
        thread.setDaemon(true);
        thread.start();
        for(int i= 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"========"+i);
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("End main");
    }

    public void run(){
        try{
            while(true) {
                System.out.println(getName());
            }
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
