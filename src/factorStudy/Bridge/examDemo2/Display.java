package factorStudy.Bridge.examDemo2;

public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl){
        this.impl = impl;
    }

    public void open(){
        impl.rawOpen();
    }

    public void print(){
        impl.rawPrint();
    }

    public void close(){
        impl.rawClose();
    }

    public final void display(){
        System.out.println("Use Display");
        open();
        print();
        close();
    }
}
