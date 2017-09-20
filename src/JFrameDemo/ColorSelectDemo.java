package JFrameDemo;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ColorSelectDemo {
    private JFrame frame;
    private JTextArea colorArea;

    private JSlider sliderRed,sliderGreen,sliderBlue;
    private JLabel labelRed,labelGreen,labelBlue,labelRGB;
    private JTextField jtfRed,jtfGreen,jtfBlue;

    public ColorSelectDemo(){
        frame = new JFrame("Color Select Demo");
        labelBlue = new JLabel("B:");
        labelRed = new JLabel("R:");
        labelGreen = new JLabel("G:");
        labelRGB = new JLabel("RGB编码:#7F7F7F");

        sliderRed = new JSlider(0,255,127);
        sliderGreen = new JSlider(0,255,127);
        sliderBlue = new JSlider(0,255,127);

        jtfRed = new JTextField("127");
        jtfGreen = new JTextField("127");
        jtfBlue = new JTextField("127");

        jtfRed.setEditable(false);
        jtfGreen.setEditable(false);
        jtfBlue.setEditable(false);

        colorArea = new JTextArea(7,10);
        colorArea.setEditable(false);
        colorArea.setBackground(new Color(127,127,127));
        init();
        addEventHandler();
    }

    public void init(){
        JPanel rPanel = new JPanel();
        rPanel.add(labelRed);
        rPanel.add(sliderRed);
        rPanel.add(jtfRed);

        JPanel gPanel = new JPanel();
        gPanel.add(labelGreen);
        gPanel.add(sliderGreen);
        gPanel.add(jtfGreen);


        JPanel bPanel = new JPanel();
        bPanel.add(labelBlue);
        bPanel.add(sliderBlue);
        bPanel.add(jtfBlue);

        JPanel setPanel = new JPanel();
        setPanel.setLayout(new GridLayout(3,1,3,15));
        setPanel.add(rPanel);
        setPanel.add(gPanel);
        setPanel.add(bPanel);

        JPanel colorPanel = new JPanel();
        colorPanel.setLayout(new BorderLayout());
        colorPanel.add(colorArea,BorderLayout.CENTER);
        colorPanel.add(labelRGB,BorderLayout.SOUTH);

        frame.setLayout(new FlowLayout(5));
        frame.add(setPanel);
        frame.add(colorPanel);

    }

    public void addEventHandler(){
        ChangeListener lis = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int r = sliderRed.getValue();
                int g = sliderGreen.getValue();
                int b = sliderBlue.getValue();

                jtfRed.setText(String.format("%03d",r));
                jtfGreen.setText(String.format("%03d",g));
                jtfBlue.setText(String.format("%03d",b));

                Color color = new Color(r,g,b);
                colorArea.setBackground(color);
                String codeRGB = toHex(r)+toHex(g)+toHex(b);
                labelRGB.setText("RGB编码:"+"#"+codeRGB.toUpperCase());
            }
        };
        sliderRed.addChangeListener(lis);
        sliderGreen.addChangeListener(lis);
        sliderBlue.addChangeListener(lis);
    }

    private String toHex(int num){
        String hexStr = Integer.toHexString(num);
        if(hexStr.length()<2){
            return "0"+hexStr;
        }
        return hexStr;
    }

    public void show(){
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public static void main(String[] args){
        (new ColorSelectDemo()).show();
    }

}
