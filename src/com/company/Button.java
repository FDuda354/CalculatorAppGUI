package com.company;

import javax.swing.*;

public class Button extends JButton
{

    public Button(String title,int x,int y,int width,int height)
    {super(title);
        this.setBounds(x, y, width, height);
        this.setVisible(true);
      //  this.setText(title);
        this.setFocusable(false);
//
    }

}
