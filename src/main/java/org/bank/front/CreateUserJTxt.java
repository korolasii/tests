package org.bank.front;

import javax.swing.*;
import java.awt.*;

public class CreateUserJTxt {
    public JTextField create(String txt, int size, int x) {
        JTextField jTextField = new JTextField();
        jTextField.setText("To: "+txt);
        jTextField.setBounds(x, 100, 450, 50);
        Font userFont = new Font(jTextField.getFont().getName(), Font.PLAIN, size);
        jTextField.setFont(userFont);
        jTextField.setOpaque(false);
        jTextField.setEditable(false);
        jTextField.setBorder(null);
        jTextField.setForeground(Color.WHITE);

        return jTextField;
    }
}
