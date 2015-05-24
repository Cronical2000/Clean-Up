package Neu;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Bgr extends JPanel {
	private static final long serialVersionUID = -742725498355401127L;
	Image bild1;

	// Image wird geladen

	public Bgr() {

		try {
			bild1 = ImageIO.read(getClass().getResource("test.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Image wird gepaintet

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.drawImage(bild1, 0, 0, getWidth(), getHeight(), this);
	}
}