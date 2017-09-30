package threadDemo;
//using implements Runnable

public class runDemo implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        runDemo demo = new runDemo();
        Thread thread = new Thread(demo);
        thread.start();
    }
}
