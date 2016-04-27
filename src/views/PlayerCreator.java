/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author Adam
 */
public class PlayerCreator extends JFrame{
    private JLabel FirstName;
    private JTextField fNameField;
    private JLabel LastName;
    private JTextField lNameField;
    private JLabel age;
    private JSlider ageSlider;
    private JLabel intelligence;
    private JSlider intelligenceSlider;
    private JLabel atractiveness;
    private JSlider attractSlider; 
    private JLabel charisma;
    private JSlider charismaSlider;
    private JLabel luck;
    private JSlider luckSlider;
    private JButton Start;
    
    PlayerCreator(){
        
   
    FirstName = new JLabel ("First Name");
    
    fNameField = new JTextField();
    
    LastName = new JLabel("Last Name");
    
    lNameField = new JTextField();
    
    age = new JLabel("Age");
    
    ageSlider = new JSlider(20,60,20);
    ageSlider.setMajorTickSpacing(10);
    ageSlider.setMinorTickSpacing(2);
    ageSlider.setPaintTicks(true);
    ageSlider.setPaintLabels(true);
    
    intelligence = new JLabel("Intelligence");
    
    intelligenceSlider = new JSlider(0,10,0);
    intelligenceSlider.setMajorTickSpacing(5);
    intelligenceSlider.setMinorTickSpacing(1);
    intelligenceSlider.setPaintTicks(true);
    intelligenceSlider.setPaintLabels(true);
    
    atractiveness = new JLabel("Attractiveness");
    
    attractSlider = new JSlider(0,10,0);
    attractSlider.setMajorTickSpacing(5);
    attractSlider.setMinorTickSpacing(1);
    attractSlider.setPaintTicks(true);
    attractSlider.setPaintLabels(true);
    
    charisma = new JLabel("Charisma");
    charismaSlider = new JSlider(0,10,0);
    charismaSlider.setMajorTickSpacing(5);
    charismaSlider.setMinorTickSpacing(1);
    charismaSlider.setPaintTicks(true);
    charismaSlider.setPaintLabels(true);
    
    luck = new JLabel("Luck");
    luckSlider = new JSlider(0,10,0);
    luckSlider.setMajorTickSpacing(5);
    luckSlider.setMinorTickSpacing(1);
    luckSlider.setPaintTicks(true);
    luckSlider.setPaintLabels(true);
    
    Start = new JButton("Start");    
    
    
    
    
    
    
    
    
    
    }
    
    
}
