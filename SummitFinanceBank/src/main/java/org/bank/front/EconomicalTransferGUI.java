package org.bank.front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EconomicalTransferGUI extends JFrame {
    private CommerceTransferGUI commerceTransferGUI;
    CreateJTextField createJTextField;
    CreateUserJTxt createUserJTxt;
    CreateReturnButton createReturnButton = new CreateReturnButton();
    EconomicalTransferGUI(String name){
        setTitle("EconomicalTransferGUI");
        int width = 450;
        int height = 550;
        setSize(width,height);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //JTextField
        createJTextField = new CreateJTextField();
        add(createJTextField.create("Select",80,100));

        //images
        GUIFon fon = new GUIFon();
        fon.setBounds(0,0,450,550);


        //JButton
        JButton returnB = createReturnButton.create();
        add(returnB);
        returnB.addActionListener(new EconomicalTransferGUI.ReturnButtonActionListener());

        JButton oneDollar = new JButton("1$");
        JButton threeDollar = new JButton("3$");
        JButton fiveDollar = new JButton("5$");
        JButton tenDollar = new JButton("10$");
        JButton fifteenDollar = new JButton("15$");
        JButton twentyFiveDollar = new JButton("25$");
        JButton fiftyDollar = new JButton("50$");
        JButton hundredDollar = new JButton("100$");
        JButton twoHundredDollar = new JButton("200$");
        JButton fiveHundredDollar = new JButton("500$");

        fifteenDollar.setBounds(0,402,225,60);
        tenDollar.setBounds(0,342,225,60);
        fiveDollar.setBounds(0,282,225,60);
        threeDollar.setBounds(0,222,225,60);
        oneDollar.setBounds(0,162,225,60);
        fiveHundredDollar.setBounds(225,402,225,60);
        twoHundredDollar.setBounds(225,342,225,60);
        hundredDollar.setBounds(225,282,225,60);
        fiftyDollar.setBounds(225,222,225,60);
        twentyFiveDollar.setBounds(225,162,225,60);

        fifteenDollar.setBackground(Color.WHITE);
        tenDollar.setBackground(Color.WHITE);
        fiveDollar.setBackground(Color.WHITE);
        threeDollar.setBackground(Color.WHITE);
        oneDollar.setBackground(Color.WHITE);
        fiveHundredDollar.setBackground(Color.WHITE);
        twoHundredDollar.setBackground(Color.WHITE);
        hundredDollar.setBackground(Color.WHITE);
        fiftyDollar.setBackground(Color.WHITE);
        twentyFiveDollar.setBackground(Color.WHITE);

        //actionListener
        fifteenDollar.addActionListener(new EconomicalTransferGUI.ButtonsActionListener());
        tenDollar.addActionListener(new EconomicalTransferGUI.ButtonsActionListener());
        fiveDollar.addActionListener(new EconomicalTransferGUI.ButtonsActionListener());
        threeDollar.addActionListener(new EconomicalTransferGUI.ButtonsActionListener());
        oneDollar.addActionListener(new EconomicalTransferGUI.ButtonsActionListener());
        fiveHundredDollar.addActionListener(new EconomicalTransferGUI.ButtonsActionListener());
        twoHundredDollar.addActionListener(new EconomicalTransferGUI.ButtonsActionListener());
        hundredDollar.addActionListener(new EconomicalTransferGUI.ButtonsActionListener());
        fiftyDollar.addActionListener(new EconomicalTransferGUI.ButtonsActionListener());
        twentyFiveDollar.addActionListener(new EconomicalTransferGUI.ButtonsActionListener());

        //adding
        if (name != null){
            createUserJTxt = new CreateUserJTxt();
            add(createUserJTxt.create(name,32,15));
        }

        add(returnB);
        add(fifteenDollar);
        add(tenDollar);
        add(fiveDollar);
        add(threeDollar);
        add(oneDollar);
        add(fiveHundredDollar);
        add(twoHundredDollar);
        add(hundredDollar);
        add(fiftyDollar);
        add(twentyFiveDollar);
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
                commerceTransferGUI = new CommerceTransferGUI();
                commerceTransferGUI.showFrame();
            }
        }
    }
    private class ButtonsActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //сюда писать то, что будет происходить с деньгами
        }
    }
}
