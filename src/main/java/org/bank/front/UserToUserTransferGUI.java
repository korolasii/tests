package org.bank.front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserToUserTransferGUI extends JFrame {
    private GenerationGUI generationGUI;
    private EconomicalTransferGUI economicalTransferGUI;
    CreateJTextField createJTextField = new CreateJTextField();
    CreateReturnButton createReturnButton = new CreateReturnButton();
    String nameUser1;
    String nameUser2;
    String nameUser3;
    String nameUser4;
    UserToUserTransferGUI(){
        setTitle("UserToUserTransferGUI");
        int width = 450;
        int height = 550;
        setSize(width,height);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //JTextField
        add(createJTextField.create("UserToUser",72,20));

        //JButton
        JButton returnB = createReturnButton.create();
        add(returnB);
        returnB.addActionListener(new UserToUserTransferGUI.ReturnButtonActionListener());

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
        user1B.addActionListener(new UserToUserTransferGUI.ChoooseUserButtonListener());
        user2B.addActionListener(new UserToUserTransferGUI.ChoooseUserButtonListener());
        user3B.addActionListener(new UserToUserTransferGUI.ChoooseUserButtonListener());

        //images
        GUIFon fon = new GUIFon();
        fon.setBounds(0,0,450,550);

        add(returnB);
        add(user1B);
        add(user2B);
        add(user3B);
        add(user4B);
        add(fon);
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
                generationGUI = new GenerationGUI();
                generationGUI.showFrame();
            }
        }
    }
    private class ChoooseUserButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            economicalTransferGUI = new EconomicalTransferGUI(e.getActionCommand());
            economicalTransferGUI.showFrame();
        }
    }
}
