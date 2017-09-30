package threadDemo;
//using extends Thread

public class threadDemo1 extends Thread {
    public void run (){
        for(int i=0;i<1000;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        threadDemo1 demo = new threadDemo1();
        demo.start();
    }
}
