package factorStudy.AbstractFactory.Exam.listfactory;

import factorStudy.AbstractFactory.Exam.factory.Factory;
import factorStudy.AbstractFactory.Exam.factory.Link;
import factorStudy.AbstractFactory.Exam.factory.Page;
import factorStudy.AbstractFactory.Exam.factory.Tray;

public class ListFactory extends Factory {

    public Link createLink(String caption, String url){
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
