package myTools;

import javax.swing.*;
import java.awt.*;

public class printToWindow{
    private static JTextArea textArea;
    private static JFrame window;
    private  static  JScrollPane scrollPane;



    public  printToWindow(String title){
        window = new JFrame(title);
        init();
    }

    public printToWindow(){
        window = new JFrame("WindowPrint");
        init();
    }
    private void init(){

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        textArea = new JTextArea("",20,50);
        textArea.setFont(new Font("宋体",Font.PLAIN,22));
        textArea.setEditable(false);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVisible(true);

        window.add(scrollPane);
        window.pack();
        window.setVisible(true);
    }

    private static void fresh(){
        window.setVisible(true);
    }

    public static void println(String string){
        textArea.append(string+"\n");
        fresh();
    }

    public static void print(String string){
        textArea.append(string);
        fresh();
    }
}
