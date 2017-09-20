package factorStudy.Bridge.examDemo2;

public class Main {
    public static void main(String[] args){

        RandomDisplay d2 = new RandomDisplay(new StringDisplayImpl("RadomDisplay"));

        TxtDisplay txt = new TxtDisplay(new TxtDisplayImpl("a.txt"));
        RandomDisplay txt2 = new RandomDisplay(new TxtDisplayImpl("a.txt"));

        d2.display();
        d2.randomDisplay(7);

        txt.display();
        txt.txtDisplay();

        txt2.randomDisplay(10);


    }
}
