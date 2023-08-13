import java.awt.*;
import java.applet.*;

public class Home extends Applet
{
	/*
		<applet code="Home.java" width="500" height="500">
		</applet>
	*/
	
	public void paint(Graphics g)
	{
		int x[] = {50,25,125};
		int y[] = {50,100,150};
		
		g.setColor(Color.red);
		g.fillPolygon(x,y,3);
		
		int p[] = {50,160,150,100};
		int q[] = {50,50,150,150};
		
		g.setColor(Color.green);
		g.fillPolygon(p,q,4);
		
		g.setColor(Color.black);
		g.fillRect(25,100,130,80);
		
		g.setColor(Color.yellow);
		g.fillRect(35,120,50,60);
		
		g.setColor(Color.black);
		g.fillOval(45,150,10,20);
	}
}