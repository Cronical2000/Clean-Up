package Neu;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class CleanUpFenster extends JFrame implements ActionListener, MouseListener {
	private static final long serialVersionUID = 5562652871750363884L;

	//Definiere Variablen ausserhalb Konstruktor

	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	Image icon1;
	Image icon2;
	Image icon3;

	JLabel label;
	Bgr panel1;

	JLabel[] array = new JLabel[2];
	JLabel label1, label2;

	//Hauptfenster wird erstellt

	public CleanUpFenster() {
		try {
			icon1 = ImageIO.read(getClass().getResource("gut5.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			icon2 = ImageIO.read(getClass().getResource("gut4.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			icon3 = ImageIO.read(getClass().getResource("gut2.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//Setze Hauptfenster Einstellungen

		this.setResizable(false);
		this.setTitle("CleanUp");
		this.setLayout(null);

		//Screendimension

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();

		//Fenstereinstellungen

		setSize(screenSize.width / 2, screenSize.height / 2);
		setLocation(screenSize.width / 2 - screenSize.width / 4, screenSize.height / 2 - screenSize.height / 4);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Panel wird erstellt mit dem Layout null und bgr wird hinzugefügt

		panel1 = new Bgr();
		panel1.setLayout(null);
		panel1.setSize(this.getWidth(), this.getHeight());
		panel1.setLocation(0, 0);
		panel1.setVisible(true);

		//Buttons werden erstellt,icon wird nicht angezeigt

		button1 = new JButton("Prozesse beenden");
		button1.setIcon(new ImageIcon(icon1));
		button1.setForeground(new Color(255, 255, 255, 220));
		button1.setVerticalTextPosition(SwingConstants.CENTER);
		button1.setHorizontalTextPosition(SwingConstants.CENTER);
		button1.setContentAreaFilled(false);
		button1.setBorder(null);

		button2 = new JButton("Windows Temp löschen");
		button2.setIcon(new ImageIcon(icon1));
		button2.setForeground(new Color(255, 255, 255, 220));
		button2.setVerticalTextPosition(SwingConstants.CENTER);
		button2.setHorizontalTextPosition(SwingConstants.CENTER);
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false);

		button3 = new JButton("Firefox Temp löschen");
		button3.setIcon(new ImageIcon(icon1));
		button3.setForeground(new Color(255, 255, 255, 220));
		button3.setVerticalTextPosition(SwingConstants.CENTER);
		button3.setHorizontalTextPosition(SwingConstants.CENTER);
		button3.setContentAreaFilled(false);
		button3.setBorder(null);

		button4 = new JButton("Festplatte defrag");
		button4.setIcon(new ImageIcon(icon1));
		button4.setForeground(new Color(255, 255, 255, 220));
		button4.setVerticalTextPosition(SwingConstants.CENTER);
		button4.setHorizontalTextPosition(SwingConstants.CENTER);
		button4.setContentAreaFilled(false);
		button4.setBorder(null);

		//Label wird erstellt

		label = new JLabel("Bitte klicken Sie auf einen Button", JLabel.CENTER);

		//set Visible für contentpane

		setVisible(true);

		//Label Position setzen

		label.setBounds(0, 0, getWidth(), getContentPane().getHeight() - 150);

		//Button Position setzen

		button1.setBounds(40, 40, 170, 30);
		button2.setBounds(275, 40, 170, 30); //50Pixel Abstand x zum 1. Button
		button3.setBounds(509, 40, 170, 30);
		button4.setBounds(745, 40, 170, 30);

		//Buttons werden MouseListener zugewiesen

		button1.addMouseListener(this);
		button2.addMouseListener(this);
		button3.addMouseListener(this);
		button4.addMouseListener(this);

		//Buttons werden Actionlistener zugewiesen

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);

		//Dem Panel werden die Buttons sowie das Label zugewiesen

		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		panel1.add(label);

		//Setzt das Fenster auf sichtbar und added das Panel

		this.add(panel1);
		this.setVisible(true);
	}

	//Button1 Settings werden eingestellt

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == this.button1) {

			//Objekt der Klasse RunProcess wird erstellt und die Methode Prozess ausgeführt

			RunProcess Prozess1 = new RunProcess();
			Prozess1.Prozess();

			label.setText("Prozesse wurden beendet");
		}

		//Button2 Settings werden eingestellt

		else if (ae.getSource() == this.button2) {

			//Objekt der Klasse Temp wird erstellt und die Methode Templöschen ausgeführt

			WindowsTemp test = new WindowsTemp();
			test.WindowsTemplöschen();

			label.setText("Windows Temp gelöscht");
		}

		else if (ae.getSource() == this.button3) {

			FirefoxTemp FTemp = new FirefoxTemp();
			FTemp.FirefoxTemplöschen();

			label.setText("Firefox Temp wurde gelöscht");
		}

		else if (ae.getSource() == this.button4) {

			DiskDefrag scannen = new DiskDefrag();
			scannen.defrag();

			label.setText("GUI für Defragmentierung gestartet");
		}
	}

	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent ae) {

		if (ae.getSource() == this.button1) {
			button1.setIcon(new ImageIcon(icon3));
		}

		else if (ae.getSource() == this.button2) {

			button2.setIcon(new ImageIcon(icon3));
		}

		else if (ae.getSource() == this.button3) {

			button3.setIcon(new ImageIcon(icon3));
		}

		else if (ae.getSource() == this.button4) {

			button4.setIcon(new ImageIcon(icon3));
		}
	}

	@Override
	public void mouseReleased(MouseEvent ae) {
		if (ae.getSource() == this.button1) {

			button1.setIcon(new ImageIcon(icon1));
		}

		else if (ae.getSource() == this.button2) {

			button2.setIcon(new ImageIcon(icon1));
		} else if (ae.getSource() == this.button3) {

			button3.setIcon(new ImageIcon(icon1));
		} else if (ae.getSource() == this.button4) {

			button4.setIcon(new ImageIcon(icon1));
		}
	}

	@Override
	public void mouseEntered(MouseEvent ae) {
		if (ae.getSource() == this.button1) {
			button1.setIcon(new ImageIcon(icon2));
		}

		else if (ae.getSource() == this.button2) {

			button2.setIcon(new ImageIcon(icon2));
		} else if (ae.getSource() == this.button3) {

			button3.setIcon(new ImageIcon(icon2));
		} else if (ae.getSource() == this.button4) {

			button4.setIcon(new ImageIcon(icon2));
		}
	}

	@Override
	public void mouseExited(MouseEvent ae) {
		if (ae.getSource() == this.button1) {
			button1.setIcon(new ImageIcon(icon1));
		} else if (ae.getSource() == this.button2) {

			button2.setIcon(new ImageIcon(icon1));
		} else if (ae.getSource() == this.button3) {

			button3.setIcon(new ImageIcon(icon1));
		} else if (ae.getSource() == this.button4) {

			button4.setIcon(new ImageIcon(icon1));
		}
	}
}
