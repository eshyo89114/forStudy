package factorStudy.Bridge.Demo;

public class Main {
    public static void main(String[] args){
        Display d1 = new Display(new StringDisplayImpl("Hell fuck this woman!!!"));
        Display d2 = new CountDisplay((new StringDisplayImpl("fuck this woman!!!!")));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Go hell Qian!!!!"));

        d1.display();
        d2.display();
        d3.multiDisplay(10);
    }
}
