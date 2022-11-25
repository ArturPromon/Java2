package com.company;
//Abstract window toolkit
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainApp2 extends JFrame {
    private JButton button = new JButton("Click");
    private JTextField input = new JTextField("Write sth...");
    private JLabel label = new JLabel("Input:");
    private JRadioButton radio1 = new JRadioButton("1");
    private JRadioButton radio2 = new JRadioButton("2");
    private JCheckBox check = new JCheckBox("Check", false);

    public MainApp2(){
        super("Game");
        this.setBounds(0,0,400,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,3,3,2));
        container.add(label);
        container.add(input);
        Font myfont = new Font("Arial", Font.BOLD, 45);
        label.setFont(myfont);
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        container.add(radio1);
        container.add(radio2);
        radio1.setSelected(true);
        container.add(check);
        button.addActionListener(new ButtonListener());
        container.add(button);
    }

    class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button pressed\n";
            message += "Text is " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Radio1 " + "selected \n" : "Radio2" + " selected\n");
            message += "Checkbox: " + (check.isSelected()? "checked " +" status\n": "unchecked " + " status\n");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);

        }
    }
}
