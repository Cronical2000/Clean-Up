package com.cronical.start;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.cronical.actions.RunProcess;

public class MouseListener extends MouseAdapter {

	Icon icon1 = new ImageIcon("gut2.png");
	JLabel[] array = new JLabel[2];
	JLabel label1, label2;

	public MouseListener() {

		LabelArray();

	}

	public void LabelArray() {

		label1 = new JLabel(icon1);
		label1.setBounds(40, 40, 170, 30);
		label1.addMouseListener(this);
		label2 = new JLabel(icon1);
		label2.addMouseListener(this);
		array[0] = label1;
		array[1] = label2;

	}

	public void mouseClicked(MouseEvent e) {

		for (int i = 0; i < array.length; i++) {

			if (e.getSource().equals(array[0])) {

				RunProcess Prozess1 = new RunProcess();
				Prozess1.Prozess();
			}

		}
	}
}
