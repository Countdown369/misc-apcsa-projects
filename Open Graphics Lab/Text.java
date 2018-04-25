import java.awt.*;
import javax.swing.*;
public class Text
{
   public static void drawNum(Graphics g)
   {
       g.setColor(Color.black);
       
       g.fillRect(170,510,30,60);
       g.fillRect(200,540,60,30);
       g.fillRect(230,510,30,90);
       
       g.fillRect(290,510,30,90);
       g.fillRect(350,510,30,90);
       g.fillRect(290,510,90,30);
       g.fillRect(290,570,90,30);
       
       g.fillRect(170+240,510,30,60);
       g.fillRect(200+240,540,60,30);
       g.fillRect(230+240,510,30,90);
   }
   public static void drawWord(Graphics g)
   {
       g.setColor(Color.black);
       
       g.fillRect(170,630,30,150);
       g.fillRect(200,630,60,30);
       g.fillRect(200,630+120,60,30);
       g.fillRect(200,630+60,30,30);
       
       g.fillRect(290,630,90,30);
       g.fillRect(290,690,60,30);
       g.fillRect(290,660,30,120);
       g.fillRect(350,630,30,120);
       g.fillRect(380,750,30,30);
       
       g.fillRect(290+150,630,90,30);
       g.fillRect(290+150,690,60,30);
       g.fillRect(290+150,660,30,120);
       g.fillRect(350+150,630,30,120);
       g.fillRect(380+150,750,30,30);
       
       g.fillRect(590,630,90,30);
       g.fillRect(590,750,90,30);
       g.fillRect(590,630,30,150);
       g.fillRect(650,630,30,150);
              
       g.fillRect(290+420,630,90,30);
       g.fillRect(290+420,690,60,30);
       g.fillRect(290+420,660,30,120);
       g.fillRect(350+420,630,30,120);
       g.fillRect(380+420,750,30,30);
   }
   }
