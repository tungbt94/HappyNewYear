package eandd.tungbt94.view;	
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI extends JFrame {

    public static final boolean ISRUNNING = true;
    public static Dimension DIMENSION;
    private DisplayPanel displayPanel;
    private Image icon;

    public GUI() {
        icon = new ImageIcon(getClass().getResource("/Image/E&DIcon.jpg")).getImage();
        setIconImage(icon);
        DIMENSION = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(DIMENSION.width, DIMENSION.height);
        setLayout(new CardLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("happy new year");
        setLocationRelativeTo(null);
        displayPanel = new DisplayPanel();
        add(displayPanel);

        setUndecorated(true);
        setBackground(new Color(0, 255, 0, 0));

        setVisible(true);
    }

}