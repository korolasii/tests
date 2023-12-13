package org.bank.front;

import org.bank.back.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserChooseGUI extends JFrame {
    private MainGUI mainGUI;
    CreateJTextField createJTextField = new CreateJTextField();
    String nameUser1;
    String nameUser2;
    String nameUser3;
    String nameUser4;
    public static Person person = new Person();
    public UserChooseGUI(){
        setTitle("UserChooseGUI");
        int width = 450;
        int height = 550;
        setSize(width,height);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //JTextField
        add(createJTextField.create("Welcome",102,3));

        //JButton
        JButton exitB = new JButton("exit");
        exitB.setBounds(0,462,450,50);
        exitB.setBackground(Color.WHITE);

        nameUser1 = "Alex";
        nameUser2 = "Misha";
        nameUser3 = "Denis";
        nameUser4 = "...";
        JButton user1B = new JButton(nameUser1);
        JButton user2B = new JButton(nameUser2);
        JButton user3B = new JButton(nameUser3);
        JButton user4B = new JButton(nameUser4);
        user1B.setBounds(0,312,225,75);
        user2B.setBounds(225,312,225,75);
        user3B.setBounds(0,387,225,75);
        user4B.setBounds(225,387,225,75);
        user1B.setBackground(Color.WHITE);
        user2B.setBackground(Color.WHITE);
        user3B.setBackground(Color.WHITE);
        user4B.setBackground(Color.WHITE);


        //action listener
        exitB.addActionListener(new UserChooseGUI.ExitButtonListener());
        user1B.addActionListener(new UserChooseGUI.ChoooseUserButtonListener());
        user2B.addActionListener(new UserChooseGUI.ChoooseUserButtonListener());
        user3B.addActionListener(new UserChooseGUI.ChoooseUserButtonListener());

        //images
        GUIFon fon = new GUIFon();
        fon.setBounds(0,0,450,550);

        add(user1B);
        add(user2B);
        add(user3B);
        add(user4B);
        add(exitB);
        add(fon);
    }
    public void showFrame() {
        setVisible(true);
    }
    public void hideFrame() {
        setVisible(false);
    }
    private static class ExitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if ("exit".equals(e.getActionCommand())) {
                System.exit(130);
            }
        }
    }
    private class ChoooseUserButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            mainGUI = new MainGUI();
            mainGUI.showFrame();
            mainGUI.userNameTXT.setText("Account: "+e.getActionCommand());
            person.name = e.getActionCommand();
        }
    }
}
