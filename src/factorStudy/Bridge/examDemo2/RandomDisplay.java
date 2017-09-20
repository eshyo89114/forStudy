package factorStudy.Bridge.examDemo2;

public class RandomDisplay extends Display {

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    void randomDisplay(int times){
        System.out.println("Use randomDisplay");
        int max = (int)(Math.random()*times);
        open();
        for(int i= 0;i< max;i++){
            print();
        }
        close();
    }
}
