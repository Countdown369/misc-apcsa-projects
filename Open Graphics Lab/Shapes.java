import java.awt.*;
import javax.swing.*;
public class Shapes
{
   public static void drawBack(Graphics g)
   {
       g.setColor(new Color(188,188,188));
       g.fillRect(200,100,356,362);
   }
   public static void drawCircle(Graphics g)
   {
       g.setColor(new Color(119,164,143));
       g.fillOval(256,128,128,128);
       g.setColor(new Color(167,192,171));
       g.fillOval(270,140,50,50);
   }
   public static void drawSquare(Graphics g)
   {
       g.setColor(new Color(77,125,173));
       int[] x = {400,500,500,450,400};
       int[] y = {250,250,300,350,350};
       g.fillPolygon(x,y,5);
       g.setColor(new Color(112,168,224));
       g.fillRect(410, 260, 28, 28);
   }
   public static void drawTriangle(Graphics g)
   {
       g.setColor(new Color(180,94,141));
       int[] x2 = {250,250,390};
       int[] y2 = {420,280,420};
       g.fillPolygon(x2,y2,3);
       g.setColor(new Color(202,80,101));
       int[] x3 = {250,250,390,390};
       int[] y3 = {290,280,410,420};
       g.fillPolygon(x3,y3,4);
   }
}