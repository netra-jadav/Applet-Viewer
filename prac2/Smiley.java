import java.awt.*;
import java.applet.*;

public class Smiley extends Applet
{
	/*
		<applet code="Smiley.java" width="500" height="500">
		</applet>
	*/
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(80,70,150,150);
		
		g.setColor(Color.black);
		g.fillOval(120,120,15,15);
		g.fillOval(170,120,15,15);
		
		g.setColor(Color.red);
		g.fillArc(130,160,50,20,180,180);

	}
}