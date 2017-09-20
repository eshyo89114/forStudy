package JFrameDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorDemo {
    JFrame calcFrame;
    JTextField textFrame;
    JButton[] calcButtons;
    private JButton clear;

    public CalculatorDemo() {
        calcFrame = new JFrame("Calc ver1");
        textFrame = new JTextField(15);
        clear = new JButton("clear");
        calcButtons = new JButton[16];

        String str = "789+456-123*0.=/";
        for (int i = 0; i < calcButtons.length; i++) {
            calcButtons[i] = new JButton(str.charAt(i) + "");
        }
        init();
        setFont();
    }

    private void init() {
        calcFrame.setLayout(new BorderLayout());
        JPanel textPanel = new JPanel();
        JPanel buttonPanel = new JPanel();

        textPanel.setLayout(new FlowLayout());
        buttonPanel.setLayout(new GridLayout(4, 4));

        textPanel.add(textFrame);
        textPanel.add(clear);

        for (int i = 0; i < calcButtons.length; i++) {
            buttonPanel.add(calcButtons[i]);
            calcButtons[i].addActionListener(new ButClick());
        }

        calcFrame.add(textPanel, BorderLayout.NORTH);
        calcFrame.add(buttonPanel, BorderLayout.CENTER);

        calcFrame.setVisible(true);
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcFrame.setSize(300, 300);
        calcFrame.setLocation(500, 270);
    }

    private void setFont() {

    }

    public static void main(String[] args) {
        CalculatorDemo cal = new CalculatorDemo();
        cal.init();
    }

    double result = 1;
    double number;
    double temp;
    String operate;
    String str = "";

    class ButClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            str = str + ((JButton) e.getSource()).getText();
            textFrame.setText(str);
        }
    }
}
