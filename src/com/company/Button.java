package com.company;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton
{

    public Button(String title,int x,int y,int width,int height)
    {super(title);
        this.setBounds(x, y, width, height);
        this.setBackground(Color.WHITE);
        this.setFont(new java.awt.Font("Avenir Next", Font.BOLD, 40));
        this.setVisible(true);
        this.setFocusable(false);
//
    }

}
