package factorStudy.AbstractFactory.Exam.tablefactory;

import factorStudy.AbstractFactory.Exam.factory.Factory;
import factorStudy.AbstractFactory.Exam.factory.Link;
import factorStudy.AbstractFactory.Exam.factory.Page;
import factorStudy.AbstractFactory.Exam.factory.Tray;
import factorStudy.AbstractFactory.Exam.listfactory.ListPage;

public class TableFactory extends Factory {
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
