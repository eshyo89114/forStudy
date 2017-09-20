package factorStudy.Bridge.examDemo2;

public class TxtDisplay extends Display {

    public TxtDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void txtDisplay(){
        System.out.println("Use txtDisplay");
        open();
        print();
        close();
    }
}
