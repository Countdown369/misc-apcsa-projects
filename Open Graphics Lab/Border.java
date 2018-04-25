import java.awt.*;
import javax.swing.*;
public class Border
{
   public static void drawWhite(Graphics g)
   {
       g.setColor(new Color(238,238,238));
       int[] x4 = {556,556,340,300};
       int[] y4 = {244,284,462,462};
       g.fillPolygon(x4,y4,4);
   }
   public static void drawCorner(Graphics g)
   {
       g.setColor(new Color(238,238,238));
       int[] x5 = {486,556,556};
       int[] y5 = {100,100,170};
       g.fillPolygon(x5,y5,3);
   }
   public static void drawBlackBorder(Graphics g)
   {
       g.setColor(Color.black);
       g.fillRect(170,70,416,30);
       g.fillRect(556,70,30,422);
       g.fillRect(170,70,30,422);
       g.fillRect(170,462,416,30);
   }
}