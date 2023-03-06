//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private int oldX = 0;
	private int oldY = 0;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		//add code
		this (x, y, 0);
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super(x, y);
		speed = s;
	}

	public void setSpeed(int s)
	{
	   //add code
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
		if(oldX >= 0 && oldY >= 0)
		{
			window.setColor(Color.black);
        	window.fillRect(oldX, oldY, 5, 5);
		}
		window.setColor(Color.yellow);
        window.fillRect(getX(), getY(), 5, 5);
	}		
	
	public void move( String direction )
	{
		oldX = getX();
		oldY = getY();
		//add code to draw the ammo
		if (direction.equals("LEFT")) {
			setX(getX() - getSpeed());  
		}
		if (direction.equals("RIGHT")) {
			setX(getX() + getSpeed());
		}
		if (direction.equals("UP")) {
			setY(getY() - getSpeed());
		}
		if (direction.equals("DOWN")) {
			setY(getY() + getSpeed());
		}
	}

	public String toString()
	{
		return "";
	}
}
