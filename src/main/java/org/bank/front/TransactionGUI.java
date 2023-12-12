package org.bank.front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransactionGUI extends JFrame {
    CreateJTextField createJTextField = new CreateJTextField();
    private MainGUI mainGUI;
    private GenerationGUI generationGUI;
    private HistoryGUI historyGUI;
    CreateReturnButton createReturnButton = new CreateReturnButton();
    TransactionGUI(MainGUI mainGUI){
        this.mainGUI = mainGUI;

        setTitle("TransactionGUI");
        int width = 450;
        int height = 550;
        setSize(width,height);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //JButton
        JButton returnB = createReturnButton.create();
        add(returnB);

        JButton historyB = new JButton("history");
        historyB.setBounds(0,387,225,75);
        historyB.setBackground(Color.WHITE);

        JButton generationB = new JButton("generation");
        generationB.setBounds(225,387,225,75);
        generationB.setBackground(Color.WHITE);

        //images
        GUIFon fon = new GUIFon();
        fon.setBounds(0,0,450,550);

        //JTextField
        add(createJTextField.create("Transaction",82,0));

        //actionListener
        returnB.addActionListener(new ReturnButtonActionListener());
        historyB.addActionListener(new HistoryButtonActionListener());
        generationB.addActionListener(new GenerationButtonActionListener());

        //add
        add(historyB);
        add(generationB);
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
                mainGUI.showFrame();
            }
        }
    }
    private class HistoryButtonActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if ("history".equals(e.getActionCommand())){
                dispose();
                historyGUI = new HistoryGUI();
                historyGUI.showFrame();
            }
        }
    }
    private class GenerationButtonActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if ("generation".equals(e.getActionCommand())){
                dispose();
                generationGUI = new GenerationGUI();
                generationGUI.showFrame();
            }
        }
    }
}
