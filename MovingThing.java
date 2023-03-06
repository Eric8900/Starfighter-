//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public abstract class MovingThing implements Moveable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	public MovingThing()
	{
		xPos = 10;
		yPos = 10;
		width = 10;
		height = 10;
	}

	public MovingThing(int x, int y)
	{
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
	}

	public MovingThing(int x, int y, int w, int h)
	{
		//add code here
		xPos = x;
		yPos = y;
		width = w;
		height = h;
	}

	public void setPos( int x, int y)
	{
		//add code here
		xPos = x;
		yPos = y;
	}

	public void setX(int x)
	{
		//add code here
		xPos = x;
	}

	public void setY(int y)
	{
		//add code here
		yPos = y;
	}

	public int getX()
	{
		return xPos;   //finish this method
	}

	public int getY()
	{
		return yPos;  //finish this method
	}

	public void setWidth(int w)
	{
		//add code here
		width = w;
	}

	public void setHeight(int h)
	{
		//add code here
		height = h;
	}

	public int getWidth()
	{
		return width;  //finish this method
	}

	public int getHeight()
	{
		return height;  //finish this method
	}

	public abstract void move(String direction);
	public abstract void draw(Graphics window);

	public String toString()
	{
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight();
	}
}