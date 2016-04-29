/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.FrameTester;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import entities.Player;

/**
 *
 * @author Adam
 */
public class PlayerCreator implements ActionListener {
    
    private JLabel FirstName;
    private JTextField fNameField;
    private JLabel LastName;
    private JTextField lNameField;
    private JLabel age;
    private JSlider ageSlider;
    private JLabel intelligence;
    private JSlider intelligenceSlider;
    private JLabel attractiveness;
    private JSlider attractSlider; 
    private JLabel charisma;
    private JSlider charismaSlider;
    private JLabel luck;
    private JSlider luckSlider;
    private JButton MakePlayer;
    private Player Player1;
    private FrameTester Tester;
    private TestFrame Frame;
    private JButton Reset;
    
    PlayerCreator(){
    Frame  = new TestFrame();
    
    Frame.setLayout(new GridLayout(9,2));
   
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
    
    attractiveness = new JLabel("Attractiveness");
    
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
    
    MakePlayer = new JButton("Create Player");
    Reset = new JButton("Reset");
    
    Frame.add(FirstName);
    Frame.add(fNameField);
    Frame.add(LastName);
    Frame.add(lNameField);
    Frame.add(age);
    Frame.add(ageSlider);
    Frame.add(intelligence);
    Frame.add(intelligenceSlider);
    Frame.add(attractiveness);
    Frame.add(attractSlider);
    Frame.add(charisma);
    Frame.add(charismaSlider);
    Frame.add(luck);
    Frame.add(luckSlider);
    Frame.add(MakePlayer);
    Frame.add(Reset);
    
    Frame.repaint();
    Frame.revalidate();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        
        if(o == MakePlayer)
            Player1 = new Player(fNameField.getText(),
                                 lNameField.getText(),
                                 ageSlider.getValue(),
                                 intelligenceSlider.getValue(),
                                 luckSlider.getValue(),
                                 attractSlider.getValue(),
                                 charismaSlider.getValue());
            System.out.println("test");
            Tester = new FrameTester(Player1);
            Frame.dispose();
               
        if(o == Reset)
            fNameField.setText("");
            lNameField.setText("");
            ageSlider.setValue(20);
            intelligenceSlider.setValue(0);
            attractSlider.setValue(0);
            luckSlider.setValue(0);
            charismaSlider.setValue(0);
            Frame.repaint();
            System.out.println("Test");
            
        
    }
        
    public Player getPlayer1() {
        return Player1;
    }

   
    
    
}
