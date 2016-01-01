package eandd.tungbt94.control;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;
public class ChongChongControl {
	private Image imgChongChong;
    private int width;
    private int height;
    private int angle;
    private AffineTransform at;

    public ChongChongControl() {
        imgChongChong = new ImageIcon(getClass().getResource("/Image/logo.png")).getImage();
        width = imgChongChong.getWidth(null);
        height = imgChongChong.getHeight(null);
        angle = 10;
        at = AffineTransform.getTranslateInstance(20, 20);
    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(imgChongChong,at, null);
    }
    
    public AffineTransform rotate(){
        at.rotate(Math.toRadians(angle),width/2,height/2);
        return at;
    }	
}
