package com.test.hammad;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlyWeightTest extends JFrame {

	private static final long serialVersionUID = 2356501872892303871L;

	JButton startDrawing;

	int width = 1750;
	int height = 150;

	Color[] shapeColor = { Color.orange, Color.pink, Color.yellow, Color.blue };

	public static void main(String[] args) {
		new FlyWeightTest();
	}

	public FlyWeightTest() {

		this.setSize(width, height);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Flyweight Test");

		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new BorderLayout());

		JPanel drawingPanel = new JPanel();
		startDrawing = new JButton("Draw Stuff");

		contentPanel.add(drawingPanel, BorderLayout.CENTER);
		contentPanel.add(startDrawing, BorderLayout.SOUTH);

		startDrawing.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Graphics g = drawingPanel.getGraphics();
				long startTime = System.currentTimeMillis();

				for (int i = 0; i < 1000000; i++) {
//					g.setColor(getRandColor());
//					g.fillRect(getRandX(), getRandY(), getRandX(), getRandY());

					// Below are the good codes
					MyRect rect = RectFactory.getRect(getRandColor());
					rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
				}

				long endTime = System.currentTimeMillis();

				System.out.print("\nThat took : " + (endTime - startTime));
			}
		});

		this.add(contentPanel);
		this.setVisible(true);
	}

	private Color getRandColor() {
		Random randNum = new Random();
		int randInt = randNum.nextInt(3);
		return shapeColor[randInt];
	}

	private int getRandX() {
		return (int) (Math.random() * width);
	}

	private int getRandY() {
		return (int) (Math.random() * height);
	}
}
