package JFrameDemo;

import javax.swing.*;

public class Demo1 {
    public static void main(String[] args){
        JFrame frame = new JFrame("demo1");
        frame.setSize(300,300);
        frame.setLocation(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("this is a test");

        frame.add(label);

        frame.setVisible(true);
    }
}
