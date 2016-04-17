/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import views.ClockPanel;
import views.TestFrame;
import views.Floor;

/**
 *
 * @author brianwest
 */
public class FrameTester {

    private final TestFrame frame;

    private JButton auBon;
    private JButton floor;
    private JButton meetingRoom;

    private ClockPanel clock;

    public FrameTester() {
        frame = new TestFrame();
        frame.setLocationRelativeTo(null);
        setup();
        refreshPane();
    }

    public FrameTester(JPanel panel) {
        frame = new TestFrame();
        frame.getContentPane().add(panel);
        panel.setFocusable(true);
        panel.requestFocusInWindow();
    }

    private void setup(){
        frame.setLayout(new GridLayout(1, 2));

        auBon = new JButton("Au Bon Pain");
        floor = new JButton("Floor");
        meetingRoom = new JButton("MeetingRoom");

        frame.add(auBon);
        frame.add(floor);
        frame.add(meetingRoom);

        auBon.addActionListener(new PanelSwitcher());
        floor.addActionListener(new PanelSwitcher());
        meetingRoom.addActionListener(new PanelSwitcher());
    }

    private void refreshPane() {
        frame.revalidate();
        frame.repaint();
    }

    private void removeButtons() {
        frame.remove(auBon);
        frame.remove(floor);
        frame.remove(meetingRoom);
    }

    private class PanelSwitcher implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object o = e.getSource();

            if (o == auBon) {
                try {
                    ABPController c = new ABPController();
                } catch (Exception ex) {
                    System.err.println(ex);
                }
            }

            if (o == floor) {
                removeButtons();
                Floor floorPanel = new Floor("test_floor");
                frame.getContentPane().add(floorPanel);
                floorPanel.setFocusable(true);
                floorPanel.requestFocusInWindow();
                refreshPane();
            }

            if (o == meetingRoom) {
                try {
                    MRController m = new MRController();
                } catch (Exception ex) {
                    System.err.println(ex);
                }
            }

        }
    }
}
