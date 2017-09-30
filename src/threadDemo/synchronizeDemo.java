package threadDemo;

public class synchronizeDemo {
    public double money = 2000;
    public static void main(String[] args){
        synchronizeDemo thread1 = new synchronizeDemo();
        thread1.synchronizeHandle();
    }

    public void synchronizeHandle(){
        threadMaker threadHusband = new threadMaker("husband",15000);
        threadMaker threadWife = new threadMaker("Wife",14000);
        threadHusband.start();
        threadWife.start();
    }

    class threadMaker extends Thread{
        private double money_t;
        String name;

        public threadMaker(String name,double money){
            this.name = name;
            this.money_t = money;
        }

        public void run(){
            if(money > money_t){
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                money = money - money_t;
                System.out.println(name +"done!");
            }
        }
    }
}
