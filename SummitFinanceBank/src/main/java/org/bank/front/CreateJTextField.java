package org.bank.front;

import javax.swing.*;
import java.awt.*;

public class CreateJTextField {
    public JTextField create(String txt, int size, int x){
        JTextField jTextField = new JTextField();
        jTextField.setText(txt);
        Font txtFont = new Font(jTextField.getFont().getName(), Font.PLAIN, size);
        jTextField.setFont(txtFont);
        jTextField.setBounds(x,0,450,100);
        jTextField.setOpaque(false);
        jTextField.setEditable(false);
        jTextField.setBorder(null);
        jTextField.setForeground(Color.WHITE);

        return jTextField;
    }
}
