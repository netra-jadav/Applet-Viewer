import java.awt.*;
import java.applet.*;

public class ChessBoard extends Applet
{
	/*
		<applet code="ChessBoard.java" width="500" height="500">
		</applet>
	*/
	public void paint(Graphics g)
	{
		int x=50,y=40,i,j;
			for(i=0;i<8;i++)
			{
				for(j=0;j<8;j++)
				{
					if((j%2==0)==(i%2==0))
					{
						g.fillRect(x,y,40,40);
					}
					else
					{
							g.drawRect(x,y,40,40);
					}
					x+=40;
				}
				x=50;
				y+=40;
			}
	}
}