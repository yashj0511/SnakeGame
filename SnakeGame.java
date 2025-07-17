package snakegame;

import javax.swing.JFrame;

public class SnakeGame extends JFrame
{

	SnakeGame()
	{
		//setLocation(700,400);
		super("Snake Game");
		add(new Board());
		pack();		//refresh the frame
		
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	public static void main(String[] args) 
	{
		
		new SnakeGame();
		
	}
}
