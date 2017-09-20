package factorStudy.AbstractFactory.Exam.factory;

public abstract class Link extends Item {

    protected String url;

    public Link(String caption, String url){
        super(caption);
        this.url = url;
    }
}
