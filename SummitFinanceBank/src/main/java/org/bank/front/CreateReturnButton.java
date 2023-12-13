package org.bank.front;

import javax.swing.*;
import java.awt.*;

public class CreateReturnButton {
    public JButton create(){
        JButton returnB = new JButton("return");
        returnB.setBounds(0,462,450,50);
        returnB.setBackground(Color.WHITE);

        return returnB;
    }
}
