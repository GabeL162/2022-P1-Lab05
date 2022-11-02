// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int x1;
        int y1 = 640;
        int x2 = 990;
        int y2 = 630;
        g.drawRect(10,10,width,height);

        //draw bottom right
        for(x1 = 10; x1 < 990; x1+=14){
            g.drawLine(x1,y1,x2,y2);
            y2 -= 9;
        }

        //draw bottom left
        x2 = 10;
        y1 = 640;
        y2 = 630;
        for(x1 = 990; x1 > 10; x1-=14){
            g.drawLine(x1, y1, x2, y2);
            y2 -= 9;
        }
        //Draw top left
        x2 = 10;
        y1 = 10;
        y2 = 10;
        for(x1 = 990; x1 > 10; x1-=14){
            g.drawLine(x1, y1, x2, y2);
            y2 += 9;
        }
        //Draw top right
        x2 = 990;
        y1 = 10;
        y2 = 10;
        for(x1 = 10; x1 < 990; x1+=14){
            g.drawLine(x1, y1, x2, y2);
            y2 += 9;
        }

        }
    }
}

