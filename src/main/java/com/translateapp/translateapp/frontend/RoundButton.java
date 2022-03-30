package com.translateapp.translateapp.frontend;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;


class RoundButton implements Border 
    {
        private int r;
        RoundButton(int r) {
            this.r = r;
        }
        public Insets getBorderInsets(Component c) {
            return new Insets(this.r+1, this.r+1, this.r+2, this.r);
        }
        public boolean isBorderOpaque() {
            return true;
        }
        public void paintBorder(Component c, Graphics g, int x, int y, 
        int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, r, r);
        }
    }