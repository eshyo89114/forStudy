package JFrameDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseEventDemo {
    private JFrame frame;
    private JLabel label;
    private JTextArea textField;

    public MouseEventDemo(){
        frame = new JFrame("MouseEventDemo");
        label = new JLabel();
        textField = new JTextArea(30,40);

        frame.setLayout(new BorderLayout(1,1));
        frame.add(label,BorderLayout.NORTH);
        frame.add(textField,BorderLayout.CENTER);

        label.setPreferredSize(new Dimension(300,50));
        label.setFont(new Font("宋体",Font.PLAIN,30));
        textField.setPreferredSize(new Dimension(300,100));
        textField.setFont(new Font("宋体",Font.PLAIN,30));

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void addEventhandler(){
        textField.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String str = null;
                switch (e.getButton()){
                    case MouseEvent.BUTTON1:str = "左";break;
                    case MouseEvent.BUTTON2:str = "中";break;
                    case MouseEvent.BUTTON3:str = "右";break;
                }
                textField.append("鼠标"+str+"键被单击"+(e.getX()+", "+e.getY())+"\n");
            }
            public void mouseEntered(MouseEvent e){
                textField.append("鼠标进入！\n");
            }

            public void mouseExited(MouseEvent e){
                textField.append("鼠标移出！\n");
            }

            public void mouseMoved(MouseEvent e){
            }
        });

        textField.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                label.setText("X: "+e.getX()+", Y: "+e.getY());
            }
        });
    }

    public static void main(String[] args){
        MouseEventDemo ME =new MouseEventDemo();
        ME.addEventhandler();
    }
}
