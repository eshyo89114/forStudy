package factorStudy.Bridge.examDemo1;

public class RandomDisplay extends Display {

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    void randomDisplay(int times){
        int max = (int)(Math.random()*times);
        open();
        for(int i= 0;i< max;i++){
            print();
        }
        close();
    }
}
