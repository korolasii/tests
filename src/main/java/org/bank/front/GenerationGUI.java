package org.bank.front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GenerationGUI extends JFrame {
    private TransactionGUI transactionGUI;
    private CommerceTransferGUI commerceTransferGUI;
    private UserToUserTransferGUI userToUserTransferGUI;
    CreateJTextField createJTextField = new CreateJTextField();
    CreateReturnButton createReturnButton = new CreateReturnButton();
    GenerationGUI(){
        setTitle("GenerationGUI");
        int width = 450;
        int height = 550;
        setSize(width,height);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //JTextField
        add(createJTextField.create("Generation",88,0));

        //JButton
        JButton returnB = createReturnButton.create();
        add(returnB);
        returnB.addActionListener(new GenerationGUI.ReturnButtonActionListener());

        JButton transferB = new JButton("money transfer");
        JButton commerceB = new JButton("commerce transfer");
        transferB.setBackground(Color.WHITE);
        commerceB.setBackground(Color.WHITE);
        transferB.setBounds(0,387,225,75);
        commerceB.setBounds(225,387,225,75);

        //actionListener
        commerceB.addActionListener(new GenerationGUI.CommerceTransferButtonActionListener());
        transferB.addActionListener(new GenerationGUI.UserToUserTransferButtonActionListener());

        //images
        GUIFon fon = new GUIFon();
        fon.setBounds(0,0,450,550);

        add(commerceB);
        add(transferB);
        add(returnB);
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
                transactionGUI = new TransactionGUI(new MainGUI());
                transactionGUI.showFrame();
            }
        }
    }
    private class CommerceTransferButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if ("commerce transfer".equals(e.getActionCommand())){
                dispose();
                commerceTransferGUI = new CommerceTransferGUI();
                commerceTransferGUI.showFrame();
            }
        }
    }
    private class UserToUserTransferButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if ("money transfer".equals(e.getActionCommand())){
                dispose();
                userToUserTransferGUI = new UserToUserTransferGUI();
                userToUserTransferGUI.showFrame();
            }
        }
    }
}
