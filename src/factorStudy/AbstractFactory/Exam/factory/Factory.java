package factorStudy.AbstractFactory.Exam.factory;


import factorStudy.AbstractFactory.Exam.listfactory.ListFactory;
import factorStudy.AbstractFactory.Exam.tablefactory.TableFactory;

public abstract class Factory {
    public static Factory getFactory(String classname){
        Factory factory = null;
//        try{
//            factory = (Factory)Class.forName(classname).newInstance();
//        }catch (ClassNotFoundException e){
//            System.err.println("没有找到 " + classname + "类。");
//        }catch(Exception e){
//            e.printStackTrace();
//        }
        if(classname.equals("ListFactory")){
            factory = new ListFactory();
        }
        if(classname.equals("TableFactory")){
            factory = new TableFactory();
        }

        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
    public Page createYahoo(){
        Link link = createLink("Yahoo!","http://www.yahoo.co.jp");
        Page page = createPage("Yahoo!","Yahoo!");
        page.add(link);
        return page;
    }
}
