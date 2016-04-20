/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;


    public class Player extends Person
    {
        private int dx;
        private int dy;
        private Boolean isPlayer;
//        private final Dimension size;
        private Image playerImage;
        private final int playerSize;
        private final int playerSpeed;

        public Player(String fName, String lName, int age)
        {
            super(fName, lName, age);
            this.dx = 0;
            this.dy = 0;
//            this.setBounds(200, 50, 30, 30);
            isPlayer = true;
            this.playerSize = 50;
            this.playerSpeed = 10;
            this.setBounds(0, 50, playerSize, playerSize);  
        }
        
//        public Player(int panelWidth, int panelHeight){
//        
//        this.size = new Dimension(panelWidth, panelHeight);
//        this.skydiverSize = 50;
//        this.skydiverSpeed = 10;
//        this.setBounds(0, 50, skydiverSize, skydiverSize);        
//        Whats the difference between setBounds and Dimension?
//    }

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
            g.setColor(Color.BLUE);
}
        public String getInfo()
        {
            super.getInfo();
            return(", Player: " + this.getIsPlayer());
        }
        public Boolean getIsPlayer() 
        {
            return isPlayer;
        }
        public double getX()
        {
            return this.x;
        }
    
        public double getY(){
            return this.y;
        }

        public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            this.dx = -20;
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            this.dx = 20;
        }
        if(e.getKeyCode() == KeyEvent.VK_UP)
        {
            this.dy = -20;
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            this.dy = 20;
        }
    }
    
    public void keyReleased(KeyEvent e){
        this.dx = 0;
        this.dy = 0;
    }
    
//    public void paintComponent(Graphics g){
//        
//        move();
//        g.setColor(Color.BLUE);
//        g.drawRect(x, y, width, height);
//    }
}
