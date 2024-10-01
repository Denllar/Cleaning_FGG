package org.example;

import javax.swing.JFrame;
import java.awt.*;

public class JFrameApp extends JFrame
{
    public JFrameApp()
    {
        setBounds(100, 100, 500, 500);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add( new JPanelApp());
        setVisible(true);
        setBackground(Color.orange);
    }
}