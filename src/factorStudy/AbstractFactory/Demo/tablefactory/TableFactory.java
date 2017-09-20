package factorStudy.AbstractFactory.Demo.tablefactory;

import factorStudy.AbstractFactory.Demo.factory.Factory;
import factorStudy.AbstractFactory.Demo.factory.Link;
import factorStudy.AbstractFactory.Demo.factory.Page;
import factorStudy.AbstractFactory.Demo.factory.Tray;

public class TableFactory extends Factory{
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
