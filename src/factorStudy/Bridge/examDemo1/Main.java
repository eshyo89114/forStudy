package factorStudy.Bridge.examDemo1;

public class Main {
    public static void main(String[] args){
        Display d1 = new RandomDisplay(new StringDisplayImpl("Hell fuck this woman!!!"));
        RandomDisplay d2 = new RandomDisplay(new StringDisplayImpl("fuck Qian!!!"));

        d1.display();
        d2.display();
        d2.randomDisplay(7);


    }
}
