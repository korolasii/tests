package org.bank.front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommerceTransferGUI extends JFrame {
    private GenerationGUI generationGUI;
    private EconomicalTransferGUI economicalTransferGUI;
    private RichTransferGUI richTransferGUI;
    CreateJTextField createJTextField = new CreateJTextField();
    CreateReturnButton createReturnButton = new CreateReturnButton();
    CommerceTransferGUI(){
        setTitle("CommerceTransferGUI");
        int width = 450;
        int height = 550;
        setSize(width,height);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //JTextField
        add(createJTextField.create("Commerce",80,20));

        //JButton
        JButton returnB = createReturnButton.create();
        add(returnB);
        returnB.addActionListener(new CommerceTransferGUI.ReturnButtonActionListener());

            //economical markets:
        JButton marketB = new JButton("super market");
        JButton buildStoreB = new JButton("build store");
        JButton restaurantB = new JButton("restaurant");
        JButton caffeB = new JButton("caffe");
        JButton gameStoreB = new JButton("game store");

        gameStoreB.setBounds(0,402,225,60);
        caffeB.setBounds(0,342,225,60);
        restaurantB.setBounds(0,282,225,60);
        buildStoreB.setBounds(0,222,225,60);
        marketB.setBounds(0,162,225,60);

        gameStoreB.setBackground(Color.WHITE);
        caffeB.setBackground(Color.WHITE);
        restaurantB.setBackground(Color.WHITE);
        buildStoreB.setBackground(Color.WHITE);
        marketB.setBackground(Color.WHITE);
            //rich stores:
        JButton carStoreB = new JButton("car store");
        JButton houseStoreB = new JButton("house store");
        JButton boatStoreB = new JButton("boat store");
        JButton planeStoreB = new JButton("plane store");
        JButton militaryStoreB = new JButton("military store");

        militaryStoreB.setBounds(225,402,225,60);
        planeStoreB.setBounds(225,342,225,60);
        boatStoreB.setBounds(225,282,225,60);
        houseStoreB.setBounds(225,222,225,60);
        carStoreB.setBounds(225,162,225,60);

        militaryStoreB.setBackground(Color.WHITE);
        planeStoreB.setBackground(Color.WHITE);
        boatStoreB.setBackground(Color.WHITE);
        houseStoreB.setBackground(Color.WHITE);
        carStoreB.setBackground(Color.WHITE);
        //actionListener
            //economical markets:
        marketB.addActionListener(new CommerceTransferGUI.EconomicalStoresActionListener());
        buildStoreB.addActionListener(new CommerceTransferGUI.EconomicalStoresActionListener());
        restaurantB.addActionListener(new CommerceTransferGUI.EconomicalStoresActionListener());
        caffeB.addActionListener(new CommerceTransferGUI.EconomicalStoresActionListener());
        gameStoreB.addActionListener(new CommerceTransferGUI.EconomicalStoresActionListener());
            //rich stores:
        carStoreB.addActionListener(new CommerceTransferGUI.RichStoresActionListener());
        houseStoreB.addActionListener(new CommerceTransferGUI.RichStoresActionListener());
        boatStoreB.addActionListener(new CommerceTransferGUI.RichStoresActionListener());
        planeStoreB.addActionListener(new CommerceTransferGUI.RichStoresActionListener());
        militaryStoreB.addActionListener(new CommerceTransferGUI.RichStoresActionListener());

        //images
        GUIFon fon = new GUIFon();
        fon.setBounds(0,0,450,550);

        //adding
        //economical markets:
        add(marketB);
        add(buildStoreB);
        add(restaurantB);
        add(caffeB);
        add(gameStoreB);
        //rich stores:
        add(carStoreB);
        add(houseStoreB);
        add(boatStoreB);
        add(planeStoreB);
        add(militaryStoreB);

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
                generationGUI = new GenerationGUI();
                generationGUI.showFrame();
            }
        }
    }
    private class EconomicalStoresActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            economicalTransferGUI = new EconomicalTransferGUI(null);
            economicalTransferGUI.showFrame();
        }
    }
    private class RichStoresActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            richTransferGUI = new RichTransferGUI();
            richTransferGUI.showFrame();
        }
    }
}
