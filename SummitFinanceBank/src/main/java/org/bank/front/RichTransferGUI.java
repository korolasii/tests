package org.bank.front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RichTransferGUI extends JFrame {
    private CommerceTransferGUI commerceTransferGUI;
    CreateJTextField createJTextField = new CreateJTextField();
    CreateReturnButton createReturnButton = new CreateReturnButton();
    RichTransferGUI(){
        setTitle("RichTransferGUI");
        int width = 450;
        int height = 550;
        setSize(width,height);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //JTextField
        add(createJTextField.create("Select",80,100));

        //images
        GUIFon fon = new GUIFon();
        fon.setBounds(0,0,450,550);

        //JButton
        JButton returnB = createReturnButton.create();
        add(returnB);
        returnB.addActionListener(new RichTransferGUI.ReturnButtonActionListener());

        JButton twoHundredThousandDollar = new JButton("200000$");
        JButton oneHundredThousandDollar = new JButton("100000$");
        JButton fiftyThousandDollar = new JButton("50000$");
        JButton twentyFiveThousandDollar = new JButton("25000$");
        JButton fifteenThousandDollar = new JButton("15000$");
        JButton tenThousandDollar = new JButton("10000$");
        JButton fiveThousandDollar = new JButton("5000$");
        JButton twoThousandDollar = new JButton("2000$");
        JButton oneThousandDollar = new JButton("1000$");
        JButton fiveHundredDollar = new JButton("500$");

        tenThousandDollar.setBounds(0,402,225,60);
        fiveThousandDollar.setBounds(0,342,225,60);
        twoThousandDollar.setBounds(0,282,225,60);
        oneThousandDollar.setBounds(0,222,225,60);
        fiveHundredDollar.setBounds(0,162,225,60);
        twoHundredThousandDollar.setBounds(225,402,225,60);
        oneHundredThousandDollar.setBounds(225,342,225,60);
        fiftyThousandDollar.setBounds(225,282,225,60);
        twentyFiveThousandDollar.setBounds(225,222,225,60);
        fifteenThousandDollar.setBounds(225,162,225,60);

        fifteenThousandDollar.setBackground(Color.WHITE);
        twentyFiveThousandDollar.setBackground(Color.WHITE);
        fiftyThousandDollar.setBackground(Color.WHITE);
        oneHundredThousandDollar.setBackground(Color.WHITE);
        twoHundredThousandDollar.setBackground(Color.WHITE);
        fiveHundredDollar.setBackground(Color.WHITE);
        oneThousandDollar.setBackground(Color.WHITE);
        twoThousandDollar.setBackground(Color.WHITE);
        fiveThousandDollar.setBackground(Color.WHITE);
        tenThousandDollar.setBackground(Color.WHITE);

        //actionListener
        fifteenThousandDollar.addActionListener(new RichTransferGUI.ButtonsActionListener());
        twentyFiveThousandDollar.addActionListener(new RichTransferGUI.ButtonsActionListener());
        fiftyThousandDollar.addActionListener(new RichTransferGUI.ButtonsActionListener());
        oneHundredThousandDollar.addActionListener(new RichTransferGUI.ButtonsActionListener());
        twoHundredThousandDollar.addActionListener(new RichTransferGUI.ButtonsActionListener());
        fiveHundredDollar.addActionListener(new RichTransferGUI.ButtonsActionListener());
        oneThousandDollar.addActionListener(new RichTransferGUI.ButtonsActionListener());
        twoThousandDollar.addActionListener(new RichTransferGUI.ButtonsActionListener());
        fiveThousandDollar.addActionListener(new RichTransferGUI.ButtonsActionListener());
        tenThousandDollar.addActionListener(new RichTransferGUI.ButtonsActionListener());

        //adding
        add(returnB);
        add(fifteenThousandDollar);
        add(twentyFiveThousandDollar);
        add(fiftyThousandDollar);
        add(oneHundredThousandDollar);
        add(twoHundredThousandDollar);
        add(fiveHundredDollar);
        add(oneThousandDollar);
        add(twoThousandDollar);
        add(fiveThousandDollar);
        add(tenThousandDollar);
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
