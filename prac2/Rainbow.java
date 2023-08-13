import java.awt.*;
import java.applet.*;

public class Rainbow extends Applet
{
	/*
		<applet code="Rainbow.java" width=500 height=500 align=center>
		</applet>
	*/
	public void paint(Graphics g)
	{
		g.setColor(new Color(128,0,128));
		g.fillArc(80,90,500,450,0,180);
		
		g.setColor(new Color(64,0,128));
		g.fillArc(95,100,470,430,0,180);
		
		g.setColor(Color.blue);
		g.fillArc(110,110,440,410,0,180);
		
		g.setColor(Color.green);
		g.fillArc(125,120,410,390,0,180);
		
		g.setColor(Color.yellow);
		g.fillArc(140,130,380,370,0,180);
		
		g.setColor(Color.orange);
		g.fillArc(155,140,350,350,0,180);
		
		g.setColor(Color.red);
		g.fillArc(170,150,320,330,0,180);
		
		g.setColor(Color.white);
		g.fillArc(185,160,290,310,0,180);
	}
}