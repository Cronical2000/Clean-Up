package com.cronical.window;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

	private static final long serialVersionUID = -5077463680590079107L;

	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();

	public int nepBreite = screenSize.width;
	public int nepHoehe = screenSize.height;

	public Window() {
		super("Clean Up");
		setSize(960, 540);
		setLocation(nepBreite / 2 - nepBreite / 4, nepHoehe / 2 - nepHoehe / 4);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(5, 5));
		setVisible(true);
	}

}
