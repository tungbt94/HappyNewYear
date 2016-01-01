package eandd.tungbt94.model;

import java.awt.Graphics2D;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import eandd.tungbt94.view.*;

public class Snow {
	private Image img;
	private int x;
	private int y;
	private int orient;

	public Snow(Random rand) {
		img = new ImageIcon(getClass().getResource("/Image/snow.png"))
				.getImage();
		x = rand.nextInt(GUI.DIMENSION.width);
		y = rand.nextInt(GUI.DIMENSION.height);
		orient = rand.nextInt(2) - 1;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void fall() {
		if (y > GUI.DIMENSION.height) {
			y = -img.getWidth(null);
		} else {
			y += 3;
		}

		switch (orient) {
		case 1:
			x += 2;
			break;
		case -1:
			x -= 2;
			break;
		default:
			x = x;
		}
	}

	public void draw(Graphics2D g2d) {
		g2d.drawImage(img, x, y, null);
	}
}
