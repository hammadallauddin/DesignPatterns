package com.test.hammad;

import java.awt.Color;
import java.awt.Graphics;

public class MyRect {

	private Color color;

	public MyRect(Color color) {
		super();
		this.color = color;
	}

	public void draw(Graphics g, int x, int y, int x2, int y2) {
		g.setColor(color);
		g.fillRect(x, y, x2, y2);
	}

}
