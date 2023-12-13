package org.bank.front;

import javax.swing.*;

public class HistoryGUI extends JFrame {
    CreateReturnButton createReturnButton = new CreateReturnButton();
    HistoryGUI(){
        setTitle("history");
        setSize(450,550);
        setLocationRelativeTo(null);

        //JButton
        JButton returnB = createReturnButton.create();
        add(returnB);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void showFrame() {
        setVisible(true);
    }
    public void hideFrame() {
        setVisible(false);
    }
}
