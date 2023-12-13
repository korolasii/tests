package org.bank.front;

import org.bank.back.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BalanceGUI extends JFrame {
    private MainGUI mainGUI;
    CreateJTextField createJTextField = new CreateJTextField();
     BalanceGUI(String name) {
        setTitle("BalanceGUI");
        int width = 450;
        int height = 150;
        setSize(width, height);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Person person = new Person();
        person.name = name;

         System.out.println(person.name);
         System.out.println(name);


        //JTextField
         JTextField txt = createJTextField.create("Balance: " + person.balance(),24,0);
         txt.setForeground(Color.BLACK);
         add(txt);

        //button
        JButton returnB = new JButton("return");
        returnB.addActionListener(new ReturnButtonActionListener());
        returnB.setPreferredSize(new Dimension(350,50));
        returnB.setBackground(Color.WHITE);

        add(returnB, BorderLayout.SOUTH);
    }
    public void showFrame() {
        setVisible(true);
    }
    public void hideFrame() {
        setVisible(false);
    }
    private class ReturnButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if ("return".equals(e.getActionCommand())){
                dispose();
                mainGUI = new MainGUI();
                mainGUI.showFrame();
            }
        }
    }
}
