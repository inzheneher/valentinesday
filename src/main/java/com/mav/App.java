package com.mav;

import java.awt.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Graphics graphics = new Graphics(25, 43, 50, 50);
        graphics.setSize(new Dimension(200, 200));
        graphics.setTitle("Graphic Demo");
        graphics.setVisible(true);
    }
}
