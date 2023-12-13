package org.bank.front;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GUIFon extends JPanel {
    BufferedImage image;
    GUIFon(){
        try {
            image = ImageIO.read(new File("res\\fon.jpg"));
        } catch (IOException e){
            System.out.println("null");
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image!=null) {
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
        }
    }
}
