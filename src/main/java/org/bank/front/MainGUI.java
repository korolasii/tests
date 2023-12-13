package org.bank.front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame {
    private TransactionGUI transactionGUI;
    private BalanceGUI balanceGUI;
    private UserChooseGUI userChooseGUI;
    CreateJTextField createJTextField = new CreateJTextField();
    CreateReturnButton createReturnButton = new CreateReturnButton();
    JTextField userNameTXT = new JTextField();
    MainGUI(){
        setTitle("MainGUI");
        int width = 450;
        int height = 550;
        setSize(width,height);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        //JTextField
        add(createJTextField.create("Bank System",72,5));

        Font userFont = new Font(userNameTXT.getFont().getName(), Font.PLAIN, 32);
        userNameTXT.setFont(userFont);
        userNameTXT.setOpaque(false);
        userNameTXT.setEditable(false);
        userNameTXT.setBorder(null);
        userNameTXT.setForeground(Color.WHITE);
        userNameTXT.setBounds(15,100,450,50);

        //images
        GUIFon fon = new GUIFon();
        fon.setBounds(0,0,450,550);

        //JButton
        JButton balanceB = new JButton("balance");
        balanceB.setBounds(0,387,225,75);
        balanceB.setBackground(Color.WHITE);

        JButton transactionB = new JButton("transaction");
        transactionB.setBounds(225,387,225,75);
        transactionB.setBackground(Color.WHITE);

        JButton returnB = createReturnButton.create();
        add(returnB);

        //action listener
        returnB.addActionListener(new ReturnButtonListener());
        balanceB.addActionListener(new BalanceButtonListener());
        transactionB.addActionListener(new TransactionButtonListener());

        //adding
        add(userNameTXT);
        add(transactionB);
        add(returnB);
        add(balanceB);
        add(fon);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void showFrame() {
        setVisible(true);
    }
    public void hideFrame() {
        setVisible(false);
    }
    private class ReturnButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if ("return".equals(e.getActionCommand())) {
                dispose();
                userChooseGUI = new UserChooseGUI();
                userChooseGUI.showFrame();
            }
        }
    }
    private class BalanceButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if ("balance".equals(e.getActionCommand())){
                dispose();
                balanceGUI = new BalanceGUI();
                balanceGUI.showFrame();
            }
        }
    }
    private class TransactionButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if ("transaction".equals(e.getActionCommand())){
                dispose();
                transactionGUI = new TransactionGUI(MainGUI.this);
                transactionGUI.showFrame();
            }
        }
    }
}
