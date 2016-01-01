package eandd.tungbt94.view;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import eandd.tungbt94.control.*;
import eandd.tungbt94.model.*;

public class DisplayPanel extends JPanel implements Runnable {

    private ChongChongControl chongChongControl;
    private SnowControl snowControl;
    private JLabel lbKhauHieu0;
    private JLabel lbKhauHieu1;
    private JLabel lbKhauHieu2;
    private JLabel lbKhauHieu3;
    private JLabel lbKhauHieu4;
    private JLabel lbKhauHieu5;
    private JLabel lbKhauHieu6;
    private JLabel lbKhauHieu7;
    private JLabel lbKhauHieu8;
    private JLabel lbKhauHieu9;
    private JLabel lbKhauHieu10;
    private JLabel lbKhauHieu11;
    private JLabel lbKhauHieu12;
    private JLabel lbKhauHieu13;
    private JLabel lbKhauHieu14;
    private Thread thread;
    private SoundControl soundControl;

    public DisplayPanel() {
        setLayout(null);
        setBackground(new Color(0, 255, 0, 0));
        setOpaque(false);
        initObject();
    }

    public void initObject() {
        chongChongControl = new ChongChongControl();
        snowControl = new SnowControl();

        soundControl = new SoundControl(new Sound("hpny.wav"));
        soundControl.getMusic().loop(Clip.LOOP_CONTINUOUSLY).play();

        Font font = new Font("Tahoma", Font.BOLD, 30);
//        lbKhauHieu0 = new JLabel("DANH DỰ VÀ ĐAM MÊ CỦA TÔI");
//        lbKhauHieu0.setBounds(550, 150, 500, 50);
//        lbKhauHieu0.setFont(font);
//        lbKhauHieu0.setForeground(Color.RED);
//        lbKhauHieu0.setOpaque(false);

        lbKhauHieu0 = new JLabel("DANH");
        lbKhauHieu0.setBounds(550, 150, 500, 50);
        lbKhauHieu0.setFont(font);
        lbKhauHieu0.setForeground(Color.RED);
        lbKhauHieu0.setOpaque(false);

        lbKhauHieu1 = new JLabel("DỰ");
        lbKhauHieu1.setBounds(650, 150, 500, 50);
        lbKhauHieu1.setFont(font);
        lbKhauHieu1.setForeground(Color.RED);
        lbKhauHieu1.setOpaque(false);

        lbKhauHieu2 = new JLabel("VÀ");
        lbKhauHieu2.setBounds(710, 150, 500, 50);
        lbKhauHieu2.setFont(font);
        lbKhauHieu2.setForeground(Color.RED);
        lbKhauHieu2.setOpaque(false);

        lbKhauHieu3 = new JLabel("ĐAM");
        lbKhauHieu3.setBounds(760, 150, 500, 50);
        lbKhauHieu3.setFont(font);
        lbKhauHieu3.setForeground(Color.RED);
        lbKhauHieu3.setOpaque(false);

        lbKhauHieu4 = new JLabel("MÊ");
        lbKhauHieu4.setBounds(840, 150, 500, 50);
        lbKhauHieu4.setFont(font);
        lbKhauHieu4.setForeground(Color.RED);
        lbKhauHieu4.setOpaque(false);

        lbKhauHieu5 = new JLabel("CỦA");
        lbKhauHieu5.setBounds(895, 150, 500, 50);
        lbKhauHieu5.setFont(font);
        lbKhauHieu5.setForeground(Color.RED);
        lbKhauHieu5.setOpaque(false);

        lbKhauHieu6 = new JLabel("TÔI");
        lbKhauHieu6.setBounds(965, 150, 500, 50);
        lbKhauHieu6.setFont(font);
        lbKhauHieu6.setForeground(Color.RED);
        lbKhauHieu6.setOpaque(false);

        lbKhauHieu7 = new JLabel("MANG");
        lbKhauHieu7.setBounds(600, 200, 800, 50);
        lbKhauHieu7.setFont(font);
        lbKhauHieu7.setForeground(Color.RED);
        lbKhauHieu7.setOpaque(false);

        lbKhauHieu8 = new JLabel("TÊN");
        lbKhauHieu8.setBounds(700, 200, 800, 50);
        lbKhauHieu8.setFont(font);
        lbKhauHieu8.setForeground(Color.RED);
        lbKhauHieu8.setOpaque(false);

        lbKhauHieu9 = new JLabel("NHIỆT");
        lbKhauHieu9.setBounds(770, 200, 800, 50);
        lbKhauHieu9.setFont(font);
        lbKhauHieu9.setForeground(Color.RED);
        lbKhauHieu9.setOpaque(false);

        lbKhauHieu10 = new JLabel("HUYẾT");
        lbKhauHieu10.setBounds(875, 200, 800, 50);
        lbKhauHieu10.setFont(font);
        lbKhauHieu10.setForeground(Color.RED);
        lbKhauHieu10.setOpaque(false);

        lbKhauHieu11 = new JLabel("VÀ");
        lbKhauHieu11.setBounds(985, 200, 800, 50);
        lbKhauHieu11.setFont(font);
        lbKhauHieu11.setForeground(Color.RED);
        lbKhauHieu11.setOpaque(false);

        lbKhauHieu12 = new JLabel("SỰ");
        lbKhauHieu12.setBounds(1035, 200, 800, 50);
        lbKhauHieu12.setFont(font);
        lbKhauHieu12.setForeground(Color.RED);
        lbKhauHieu12.setOpaque(false);

        lbKhauHieu13 = new JLabel("CỐNG");
        lbKhauHieu13.setBounds(1090, 200, 800, 50);
        lbKhauHieu13.setFont(font);
        lbKhauHieu13.setForeground(Color.RED);
        lbKhauHieu13.setOpaque(false);

        lbKhauHieu14 = new JLabel("HIẾN");
        lbKhauHieu14.setBounds(1185, 200, 800, 50);
        lbKhauHieu14.setFont(font);
        lbKhauHieu14.setForeground(Color.RED);
        lbKhauHieu14.setOpaque(false);

        thread = new Thread(this);
        thread.start();
        setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
        g2d.setColor(getBackground());
        g2d.fill(getBounds());
        chongChongControl.draw(g2d);
        snowControl.draw(g2d);
    }

    @Override
    public void run() {
        int time = 0;
        while (GUI.ISRUNNING) {
            try {
                thread.sleep(200);
                chongChongControl.rotate();
                snowControl.fall();

            } catch (InterruptedException ex) {
                Logger.getLogger(DisplayPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            switch (time) {
                case 0:
                    add(lbKhauHieu0);
                    break;
                case 1:
                    add(lbKhauHieu1);
                    break;
                case 2:
                    add(lbKhauHieu2);
                    break;
                case 3:
                    add(lbKhauHieu3);
                    break;
                case 4:
                    add(lbKhauHieu4);
                    break;
                case 5:
                    add(lbKhauHieu5);
                    break;
                case 6:
                    add(lbKhauHieu6);
                    break;
                case 7:
                    add(lbKhauHieu7);
                    break;
                case 8:
                    add(lbKhauHieu8);
                    break;
                case 9:
                    add(lbKhauHieu9);
                    break;
                case 10:
                    add(lbKhauHieu10);
                    break;
                case 11:
                    add(lbKhauHieu11);
                    break;
                case 12:
                    add(lbKhauHieu12);
                    break;
                case 13:
                    add(lbKhauHieu13);
                    break;
                case 14:
                    add(lbKhauHieu14);
                    break;
                case 15:
                    remove(lbKhauHieu0);
                    remove(lbKhauHieu1);
                    remove(lbKhauHieu2);
                    remove(lbKhauHieu3);
                    remove(lbKhauHieu4);
                    remove(lbKhauHieu5);
                    remove(lbKhauHieu6);
                    remove(lbKhauHieu7);
                    remove(lbKhauHieu8);
                    remove(lbKhauHieu9);
                    remove(lbKhauHieu10);
                    remove(lbKhauHieu11);
                    remove(lbKhauHieu12);
                    remove(lbKhauHieu13);
                    remove(lbKhauHieu14);
                case 16:
                    break;
                default:
                    time = -1;
            }

            time++;
            repaint();
        }
    }

}