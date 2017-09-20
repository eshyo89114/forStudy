package factorStudy.AbstractFactory.Exam.listfactory;

import factorStudy.AbstractFactory.Exam.factory.Item;
import factorStudy.AbstractFactory.Exam.factory.Page;

import java.util.Iterator;

public class ListPage extends Page {

    public ListPage(String title, String author){
        super(title,author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><meta charset=\"UTF-8\"><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<u1>\n");
        Iterator it = content.iterator();
        while (it.hasNext()){
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</u1>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
