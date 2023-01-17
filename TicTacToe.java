import java.util.*;
import java.awt.event.MouseEvent;
/**
 * Ch.4 HW: Draw a tic-tac-toe board
 *
 * @author Parastoo Toosi
 * @October 1, 2022
 */
public class TicTacToe
{
    public static void printQuadrant()
    {
        Draw scr1 = new Draw();
        scr1.setTitle("Tic-tac toe board by Parastoo");
        //Draw the x-axis
        scr1.line(0, 0.75,   1.0, 0.75);
        //Draw the second y-axis
        scr1.line(0.3, 0.01,   0.3, 1.5);
        //Draw the second x-axis
        scr1.line(0.01, 0.35,   1.5, 0.35);
        //Draw the third y-axis
        scr1.line(0.7,1.0,  0.7,0);
        double x;
        double y;
        int count = 0;
        int click;
        for (int i = 0; count < 5000; count++)
        {
            scr1.pause(150);
            x = scr1.mouseX();
            y = scr1.mouseY();
            if(scr1.isMousePressed())
            {
                count++;
                if (count%2 == 0)
                {
                    scr1.picture(x,y, "cross.png",0.1,0.1);
                }
                else if (count%2 !=0)
                {
                    scr1.picture(x,y,"O.png" ,0.2, 0.3);
                    //System.out.println("%d: %0.2f %0.2f %n", count,x,y);
                }
                    
                }
            }
        }
    }
