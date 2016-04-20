/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.awt.Graphics;

/**
 *
 * @author Jon
 */

    public class Player extends Person
    {
        private int dx;
        private int dy;

        public Player(String fName, String lName, int age, int dx, int dy)
        {
            super(fName, lName, age);
            this.dx = 0;
            this.dy = 0;
            this.setBounds(200, 50, 30, 30);
        }

        public void move() {
            this.x += dx;
            this.y += dy;
        }

        public void setDx(int dx) {
            this.dx = dx;
        }

        public void setDy(int dy) {
            this.dy = dy;
        }

        public void paintComponent(Graphics g) {
            move();
            g.drawRect(x, y, 30, 30);
}
}
