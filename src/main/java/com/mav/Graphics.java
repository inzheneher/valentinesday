package com.mav;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graphics extends Frame {

    private int x = 25;
    private int y = 43;
    private int w = 50;
    private int h = 50;

    public Graphics(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
    }

    public void paint(java.awt.Graphics graphics) {
        graphics.setColor(Color.RED);
        graphics.fillOval(x, y, w, h);
        graphics.fillOval(x + 30, y, w, h);
        graphics.drawLine(25, 70, 65, 100);
        graphics.drawLine(65, 100, 105, 70);
    }

}
