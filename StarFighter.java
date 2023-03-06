//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import javax.swing.JFrame;
import java.awt.Component;

public class StarFighter extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public StarFighter()
	{
		super("STARFIGHTER");
		setSize(WIDTH,HEIGHT);

		OuterSpace theGame = new OuterSpace();
		theGame.setSize(WIDTH, HEIGHT);
		((Component)theGame).setFocusable(true);

		getContentPane().add(theGame);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 

	public static void main( String args[] )
	{
		StarFighter run = new StarFighter();
	}
}