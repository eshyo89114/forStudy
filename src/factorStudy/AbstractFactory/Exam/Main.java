package factorStudy.AbstractFactory.Exam;

import factorStudy.AbstractFactory.Exam.factory.Factory;
import factorStudy.AbstractFactory.Exam.factory.Page;
import factorStudy.AbstractFactory.Exam.listfactory.ListFactory;


public class Main {
    public static void main(String[] args){
        Factory factory = new ListFactory();
        Page yahoo = factory.createYahoo();
        yahoo.output();
    }
}
