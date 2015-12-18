package main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4810618286807932601L;
	
	
	public Window(int width, int height, String title, Game game) {
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		//makes x button work
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//can we resize window?
		frame.setResizable(false);
		//starts in middle of screen
		frame.setLocationRelativeTo(null);
		//adds game into frame
		frame.add(game);
		frame.setVisible(true);
		
	}


}
