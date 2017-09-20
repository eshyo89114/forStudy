package factorStudy.AbstractFactory.Demo.listfactory;

import factorStudy.AbstractFactory.Demo.factory.Factory;
import factorStudy.AbstractFactory.Demo.factory.Link;
import factorStudy.AbstractFactory.Demo.factory.Tray;
import factorStudy.AbstractFactory.Demo.factory.Page;

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
