package com.nanye.Java8;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nandaye on 2016/1/20.
 */
public class SwiingTest extends JFrame {
    private JLabel label;
    private JLabel showlabel;
    private JButton button;
    private JPanel panel;
    private JTextField textField;
    private JTextArea textArea;
    public SwiingTest() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("This is a Swing Window");
        this.setResizable(false);
        this.setBounds(500, 300, 300, 270);
        init();
    }

    private void init() {
        panel=new JPanel(new GridLayout(2,3));
        label=new JLabel("输入信息");
        showlabel=new JLabel("信息显示");
        button=new JButton("提交");
        textField=new JTextField(20);
        button.addActionListener(event->{
            textArea.setText(textField.getText().trim());
        });//lambda表达式
        textArea = new JTextArea(3, 10);
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(showlabel);
        panel.add(textArea);
        this.add(panel);
    }

    public static void main(String[] args) {
        SwiingTest swTest=new SwiingTest();
    }
}
