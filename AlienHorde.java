//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			aliens.add(new Alien(400, 300));
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (int i = 0; i < aliens.size(); i++) {
			if (aliens.get(i).getIsDead()) {
				continue;
			}
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		for (int i = 0; i < aliens.size(); i++) {
			if (aliens.get(i).getX() > 700) {
				aliens.get(i).move("LEFT");
			} 
			if (aliens.get(i).getX() < 100) {
				aliens.get(i).move("RIGHT");
			}
		}
	}

	public void removeDeadOnes(Bullets shots)
	{
		for (int i = shots.getList().size() - 1; i >= 0; i--) {
			for (int j = 0; j < aliens.size(); j++) {
				if (shots.getList().get(i).getX() >= aliens.get(j).getX() && shots.getList().get(i).getX() <= aliens.get(j).getX() + aliens.get(j).getWidth() && 
				shots.getList().get(i).getY() >= aliens.get(j).getY() && shots.getList().get(i).getY() <= aliens.get(j).getY() + aliens.get(j).getHeight() && !aliens.get(j).getIsDead()) {
					shots.getList().remove(i);
					aliens.get(j).setIsDead(true);
					aliens.add(new Alien( (int) (Math.random() * 600) + 100, 100));
					break;
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
