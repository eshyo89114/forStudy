package ioDemo.FileEncryptorDemo;


import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileEncryptor extends JFrame {

    JFrame frame;
    JLabel topLabel;//选择加密/解密的文件
    JFileChooser fileChooser;
    JLabel keyLabel;//输入加密/解密算子（0-255）
    JTextField jtfKey;//算子输入框
    JCheckBox reWriterBox;//覆盖原文件
    JButton cryptButton,cancelButton;//解密/加密，取消

    private void init(){
        frame = new JFrame("ENCRYPT/DECRYPT");

        frame.setSize(new Dimension(800,700));
        frame.setResizable(false);
        frame.setLocation(600,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fileChooser = new JFileChooser();
        fileChooser.setControlButtonsAreShown(false);

        topLabel = new JLabel("选择加密/解密的文件");
        keyLabel = new JLabel("输入加密/解密算子（0-255）");

        jtfKey = new JTextField(12);

        reWriterBox = new JCheckBox("覆盖原文件");

        cryptButton = new JButton("解密/加密");
        cancelButton = new JButton("取消");
    }

    private void setFrameLayout(){

        JPanel borderPanel = new JPanel(new BorderLayout(3,1));
        borderPanel.add(topLabel,BorderLayout.NORTH);
        borderPanel.add(fileChooser,BorderLayout.CENTER);


        JPanel checkPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        checkPanel.add(keyLabel);
        checkPanel.add(jtfKey);
        checkPanel.add(reWriterBox);


        borderPanel.add(checkPanel,BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(cryptButton);
        buttonPanel.add(cancelButton);


        JPanel allInPanel = new JPanel();
        allInPanel.setLayout(new BorderLayout());
        allInPanel.add(borderPanel,BorderLayout.CENTER);
        allInPanel.add(buttonPanel,BorderLayout.SOUTH);


        frame.add(allInPanel);
        frame.setVisible(true);
    }

    private void setEvent(){
        cryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    handler();
                    messageFinal();
                }catch (Exception err){
                    err.printStackTrace();
                }
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void handler(){
        boolean reWrite=reWriterBox.isSelected();
        if(!jtfKey.getText().equals("")) {
            Encode encode = new Encode(fileChooser.getSelectedFile(), Integer.parseInt(jtfKey.getText()), reWrite);
            encode.start();
        }
    }

    private void messageFinal(){
        final JDialog dialog = new JDialog(FileEncryptor.this,"加密成功");
        dialog.add(new JLabel("文件加密成功！"),BorderLayout.NORTH);
        JButton jbOk = new JButton("确定");
        dialog.add(jbOk,BorderLayout.SOUTH);
        jbOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });

        dialog.setLocationRelativeTo(FileEncryptor.this);
        dialog.setSize(300,200);
        dialog.setVisible(true);

    }

    public void run(){
        init();
        setFrameLayout();
        setEvent();
        handler();
    }
}
